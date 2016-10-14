/*
 * blancoCsv Copyright (C) 2005 Tosiki Iga
 * 
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 */
package blanco.csv.expand;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import blanco.commons.util.BlancoNameAdjuster;
import blanco.csv.valueobject.BlancoCsvFieldStructure;
import blanco.csv.valueobject.BlancoCsvStructure;
import blanco.valueobject.BlancoValueObjectXml2JavaClass;
import blanco.valueobject.valueobject.BlancoValueObjectClassStructure;
import blanco.valueobject.valueobject.BlancoValueObjectFieldStructure;

public class BlancoCsvExpandRecord {
    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O�B
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * ���R�[�h��W�J���܂��B
     * 
     * @param processStructure
     * @param direcotryValueObjectWork
     * @param directoryTarget
     * @throws IOException
     * @throws TransformerException
     */
    public void expand(final BlancoCsvStructure processStructure,
            final File direcotryValueObjectWork, final File directoryTarget)
            throws IOException, TransformerException {
        final String className = BlancoNameAdjuster
                .toClassName(processStructure.getName())
                + "CsvRecord";
        final String packageName = processStructure.getPackage() + ".record";

        final BlancoValueObjectClassStructure voClass = new BlancoValueObjectClassStructure();
        voClass.setName(className);
        voClass.setPackage(packageName);
        voClass.setDescription("blancoCsv�t�@�C����`������쐬���ꂽ���R�[�h�N���X�B");
        voClass.getDescriptionList().add(
                "�t�@�C����`["
                        + processStructure.getName()
                        + (processStructure.getDescription() == null ? "" : "/"
                                + processStructure.getDescription())
                        + "]�̃��R�[�h�N���X�B");

        for (int indexField = 0; indexField < processStructure.getFieldList()
                .size(); indexField++) {
            final BlancoCsvFieldStructure field = (BlancoCsvFieldStructure) processStructure
                    .getFieldList().get(indexField);

            boolean isQuoted = false;
            String actualType = field.getType();
            if (field.getType().endsWith("(quote)")) {
                // �N�I�[�g�w�肪����ꍇ�ɂ́A�^���̂���(quote)���������܂��B
                actualType = field.getType().substring(0,
                        field.getType().length() - "(quote)".length());
                isQuoted = true;
            }
            if (field.getRequired() == false) {
                // �K�v�ɉ����ă��b�p�[�^�ɑΉ����܂��B
                if (actualType.equals("int")) {
                    actualType = "java.lang.Integer";
                } else if (actualType.equals("long")) {
                    actualType = "java.lang.Long";
                }
            }

            final BlancoValueObjectFieldStructure voField = new BlancoValueObjectFieldStructure();
            voClass.getFieldList().add(voField);

            if (field.getNo() != null) {
                voField.setNo(field.getNo());
            }

            voField.setName(field.getName());
            voField.setType(actualType);

            if (field.getDescription() != null) {
                voField.setDescription(field.getDescription());
            }

            if (field.getNo() != null) {
                voField.getDescriptionList().add("���ڔԍ�: " + field.getNo());
            }
            if (isQuoted) {
                voField.getDescriptionList().add("������̓_�u���N�I�[�g��������ē��o�͂���܂��B");
            }

            if (field.getMinLength() != null) {
                voField.getDescriptionList().add(
                        "MIN����: " + field.getMinLength());
            }
            if (field.getMaxLength() != null) {
                voField.getDescriptionList().add(
                        "MAX����: " + field.getMaxLength());
            }
            if (field.getRequired()) {
                voField.getDescriptionList().add("�K�{����");
            }

            if (field.getDefault() != null) {
                voField.setDefault(field.getDefault());
            }
        }

        final BlancoValueObjectXml2JavaClass xml2source = new BlancoValueObjectXml2JavaClass();
        xml2source.setEncoding(fEncoding);
        xml2source.structure2Source(voClass, directoryTarget);
    }
}
