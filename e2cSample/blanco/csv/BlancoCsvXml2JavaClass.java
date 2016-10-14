/*
 * blancoCsv Copyright (C) 2005 Tosiki Iga
 * 
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 */
package blanco.csv;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;
import javax.xml.transform.dom.DOMResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import blanco.commons.util.BlancoNameUtil;
import blanco.commons.util.BlancoStringUtil;
import blanco.commons.util.BlancoXmlUtil;
import blanco.csv.expand.BlancoCsvExpandIOException;
import blanco.csv.expand.BlancoCsvExpandReader;
import blanco.csv.expand.BlancoCsvExpandRecord;
import blanco.csv.expand.BlancoCsvExpandRuntimeUtil;
import blanco.csv.expand.BlancoCsvExpandWriter;
import blanco.csv.resourcebundle.BlancoCsvResourceBundle;
import blanco.csv.valueobject.BlancoCsvFieldStructure;
import blanco.csv.valueobject.BlancoCsvStructure;

public class BlancoCsvXml2JavaClass {
    private final BlancoCsvResourceBundle fBundle = new BlancoCsvResourceBundle();

    private String fRuntimePackage = null;

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O�B
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * �^����ꂽ���ԃt�@�C�����A�^����ꂽ���ԃf�B���N�g����p���Ȃ���A�^�[�Q�b�g�f�B���N�g���ɐ������܂��B
     * 
     * @param fileXmlSource
     *            ���ԃt�@�C��
     * @param runtimePackage
     *            �����^�C���p�b�P�[�W�B���w��̏ꍇ�ɂ͒�`���̒l�𗘗p�B
     * @param directoryValueObjectWork
     *            VO�̂��߂̃��[�N�f�B���N�g���B
     * @param directoryBlancoTarget
     *            �\�[�X�R�[�h�o�͐�� blanco �t�H���_�B
     * @throws TransformerException
     *             XML�ϊ���O�����������ꍇ�B
     */
    public void process(final File fileXmlSource, final String runtimePackage,
            final File directoryValueObjectWork,
            final File directoryBlancoTarget) throws TransformerException {
        fRuntimePackage = runtimePackage;

        final DOMResult result = BlancoXmlUtil.transformFile2Dom(fileXmlSource);

        try {
            final Node rootNode = result.getNode();
            if (rootNode instanceof Document) {
                // ���ꂪ����n�B�h�L�������g���[�g���擾
                final Document rootDocument = (Document) rootNode;
                final NodeList listSheet = rootDocument
                        .getElementsByTagName("sheet");
                final int sizeListSheet = listSheet.getLength();
                for (int index = 0; index < sizeListSheet; index++) {
                    final Element elementSheet = (Element) listSheet
                            .item(index);

                    final NodeList listCommon = elementSheet
                            .getElementsByTagName(fBundle
                                    .getMeta2xmlElementCommon());
                    if (listCommon.getLength() == 0) {
                        // blancocsv-common�������ꍇ�ɂ̓X�L�b�v���܂��B
                        continue;
                    }

                    final Element elementCommon = (Element) listCommon.item(0);

                    final BlancoCsvStructure processStructure = new BlancoCsvStructure();

                    processStructure.setName(BlancoXmlUtil.getTextContent(
                            elementCommon, "fileDefinitionId"));
                    if (processStructure.getName() == null) {
                        // �t�@�C����`ID������`�̂��̂͏����X�L�b�v���܂��B
                        continue;
                    }

                    processStructure.setPackage(BlancoXmlUtil.getTextContent(
                            elementCommon, "packageName"));
                    if (processStructure.getPackage() == null) {
                        throw new IllegalArgumentException(fBundle
                                .getXml2javaclassErr001(processStructure
                                        .getName()));
                    }

                    processStructure.setDescription(BlancoXmlUtil
                            .getTextContent(elementCommon, "fileDescription"));
                    if (processStructure.getDescription() != null) {
                        final String[] lines = BlancoNameUtil.splitString(
                                processStructure.getDescription(), '\n');
                        for (int indexLine = 0; indexLine < lines.length; indexLine++) {
                            if (indexLine == 0) {
                                processStructure
                                        .setDescription(lines[indexLine]);
                            } else {
                                // �����s�� description �ɂ��ẮA����𕪊����Ċi�[���܂��B
                                // �Q�s�ڂ���́A�K�؂ɕ����Q�ƃG���R�[�f�B���O�����{����Ă�����̂Ɖ��肵�܂��B
                                processStructure.getDescriptionList().add(
                                        lines[indexLine]);
                            }
                        }
                    }

                    final String csvDelimiter = BlancoXmlUtil.getTextContent(
                            elementCommon, "csvDelimiter");
                    if (csvDelimiter == null) {
                        throw new IllegalArgumentException(fBundle
                                .getXml2javaclassErr002(processStructure
                                        .getName()));
                    }

                    // ��������� CSV�̃f���~�^���m�肳���邽�߂̏����ł��B
                    // �܂���CSV�f���~�^���L�����܂��B
                    processStructure.setDelimiter(csvDelimiter);
                    if (csvDelimiter.equals("option")) {
                        final String optionCsvDelimiter = BlancoXmlUtil
                                .getTextContent(elementCommon,
                                        "optionCsvDelimiter");
                        if (optionCsvDelimiter == null) {
                            throw new IllegalArgumentException(fBundle
                                    .getXml2javaclassErr003(processStructure
                                            .getName()));
                        }

                        // �I�v�V������CSV�f���~�^�������w�肳��Ă���̂ŁA����𗘗p���܂��B
                        processStructure.setDelimiter(optionCsvDelimiter);
                    }

                    // �����^�C���p�b�P�[�W�̊m��B
                    if (fRuntimePackage != null
                            && fRuntimePackage.trim().length() > 0) {
                        // �����^�C���p�b�P�[�W�̎w�肪����ꍇ�ɂ͂���𗘗p���܂��B
                        processStructure.setRuntimePackage(fRuntimePackage);
                    } else {
                        // �����^�C���p�b�P�[�W�̎w�肪�Ȃ��ꍇ�ɂ́A��`����̃p�b�P�[�W���𗘗p���܂��B
                        processStructure.setRuntimePackage(processStructure
                                .getPackage());
                    }

                    processStructure.setEncoding(BlancoXmlUtil.getTextContent(
                            elementCommon, "encoding"));

                    final String titleRow = BlancoXmlUtil.getTextContent(
                            elementCommon, "titleRow");
                    if (titleRow != null) {
                        processStructure.setTitleRow(titleRow);
                    }

                    final NodeList listRow = elementSheet
                            .getElementsByTagName("field");
                    final int sizeListRow = listRow.getLength();
                    for (int indexField = 0; indexField < sizeListRow; indexField++) {
                        final Element elementField = (Element) listRow
                                .item(indexField);

                        final BlancoCsvFieldStructure field = new BlancoCsvFieldStructure();

                        field.setName(BlancoXmlUtil.getTextContent(
                                elementField, "name"));
                        if (field.getName() == null) {
                            continue;
                        }

                        field.setType(BlancoXmlUtil.getTextContent(
                                elementField, "type"));
                        field.setNo(BlancoXmlUtil.getTextContent(elementField,
                                "no"));

                        field.setDescription(BlancoXmlUtil.getTextContent(
                                elementField, "description"));
                        if (field.getDescription() != null) {
                            final String[] lines = BlancoNameUtil.splitString(
                                    field.getDescription(), '\n');
                            for (int indexLine = 0; indexLine < lines.length; indexLine++) {
                                if (indexLine == 0) {
                                    field.setDescription(lines[indexLine]);
                                } else {
                                    // �����s�� description �ɂ��ẮA����𕪊����Ċi�[���܂��B
                                    // �Q�s�ڂ���́A�K�؂ɕ����Q�ƃG���R�[�f�B���O�����{����Ă�����̂Ɖ��肵�܂��B
                                    field.getDescriptionList().add(
                                            lines[indexLine]);
                                }
                            }
                        }

                        field.setRequired(BlancoStringUtil.null2Blank(
                                BlancoXmlUtil.getTextContent(elementField,
                                        "required")).equals("true"));
                        field.setMinLength(BlancoXmlUtil.getTextContent(
                                elementField, "minLength"));
                        field.setMaxLength(BlancoXmlUtil.getTextContent(
                                elementField, "maxLength"));
                        field.setDefault(BlancoXmlUtil.getTextContent(
                                elementField, "default"));
                        field.setFormat(BlancoXmlUtil.getTextContent(
                                elementField, "format"));

                        if (field.getType() == null) {
                            throw new IllegalArgumentException(fBundle
                                    .getXml2javaclassErr004(processStructure
                                            .getName(), field.getName()));
                        }
                        if (field.getType().equals("java.util.Date")) {
                            if (field.getFormat() == null) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr005(
                                                processStructure.getName(),
                                                field.getName()));
                            }
                        } else {
                            if (field.getFormat() != null) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr006(
                                                processStructure.getName(),
                                                field.getName()));
                            }
                        }

                        if (field.getMinLength() != null) {
                            try {
                                if (Integer.parseInt(field.getMinLength()) < 0) {
                                    // 0�ȏ�̐����݂̂��w��\
                                    throw new IllegalArgumentException(fBundle
                                            .getXml2javaclassErr007(
                                                    processStructure.getName(),
                                                    field.getName(), field
                                                            .getMinLength()));
                                }
                            } catch (NumberFormatException ex) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr008(
                                                processStructure.getName(),
                                                field.getName(), field
                                                        .getMinLength()));
                            }
                        }

                        if (field.getMaxLength() != null) {
                            try {
                                if (Integer.parseInt(field.getMaxLength()) < 0) {
                                    // 0�ȏ�̐����݂̂��w��\
                                    throw new IllegalArgumentException(fBundle
                                            .getXml2javaclassErr009(
                                                    processStructure.getName(),
                                                    field.getName(), field
                                                            .getMaxLength()));
                                }
                            } catch (NumberFormatException ex) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr010(
                                                processStructure.getName(),
                                                field.getName(), field
                                                        .getMaxLength()));
                            }
                        }

                        if (field.getMinLength() != null
                                && field.getMaxLength() != null) {
                            // �召�֌W���`�F�b�N�B
                            if (Integer.parseInt(field.getMinLength()) > Integer
                                    .parseInt(field.getMaxLength())) {
                                throw new IllegalArgumentException(fBundle
                                        .getXml2javaclassErr011(
                                                processStructure.getName(),
                                                field.getName(), field
                                                        .getMinLength(), field
                                                        .getMaxLength()));
                            }
                        }

                        processStructure.getFieldList().add(field);
                    }

                    expandSheet(processStructure, elementSheet, elementCommon,
                            directoryValueObjectWork, directoryBlancoTarget);
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * �V�[�g��W�J���܂��B
     * 
     * @param elementSheet
     * @param elementCommon
     * @param directoryValueObjectWork
     * @param directoryTarget
     * @param isGenerateJUnit
     * @throws IOException
     * @throws TransformerException
     */
    private void expandSheet(final BlancoCsvStructure processStructure,
            final Element elementSheet, final Element elementCommon,
            final File directoryValueObjectWork, final File directoryTarget)
            throws IOException, TransformerException {
        // �ŏ��Ƀ��R�[�h����W�J���邱�ƂƂ��܂��B
        // ���R�[�h�̏����̒��ɑÓ����`�F�b�N�Ȃǂ��܂߂邱�ƂƂ��܂��B
        {
            final BlancoCsvExpandRecord expander = new BlancoCsvExpandRecord();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryValueObjectWork,
                    directoryTarget);
        }
        {
            final BlancoCsvExpandReader expander = new BlancoCsvExpandReader();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryTarget);
        }
        {
            final BlancoCsvExpandWriter expander = new BlancoCsvExpandWriter();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryTarget);
        }
        {
            final BlancoCsvExpandIOException expander = new BlancoCsvExpandIOException();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryTarget);
        }
        {
            final BlancoCsvExpandRuntimeUtil expander = new BlancoCsvExpandRuntimeUtil();
            expander.setEncoding(fEncoding);
            expander.expand(processStructure, directoryTarget);
        }
    }
}
