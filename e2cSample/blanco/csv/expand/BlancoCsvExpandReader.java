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
import java.util.List;

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgField;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoJavaSourceUtil;
import blanco.commons.util.BlancoNameAdjuster;
import blanco.commons.util.BlancoStringUtil;
import blanco.csv.resourcebundle.BlancoCsvReaderResourceBundle;
import blanco.csv.resourcebundle.BlancoCsvResourceBundle;
import blanco.csv.resourcebundle.BlancoCsvRuntimeUtilResourceBundle;
import blanco.csv.valueobject.BlancoCsvFieldStructure;
import blanco.csv.valueobject.BlancoCsvStructure;

public class BlancoCsvExpandReader {
    /**
     * �����I�ɗ��p����blancoCg�p�t�@�N�g���B
     */
    private BlancoCgObjectFactory fCgFactory = null;

    /**
     * �����I�ɗ��p����blancoCg�p�\�[�X�t�@�C�����B
     */
    private BlancoCgSourceFile fCgSourceFile = null;

    /**
     * �����I�ɗ��p����blancoCg�p�N���X���B
     */
    private BlancoCgClass fCgClass = null;

    final BlancoCsvResourceBundle bundle = new BlancoCsvResourceBundle();

    final BlancoCsvReaderResourceBundle fBundleReader = new BlancoCsvReaderResourceBundle();

    final BlancoCsvRuntimeUtilResourceBundle fBundleUtil = new BlancoCsvRuntimeUtilResourceBundle();

    /**
     * ������������\�[�X�t�@�C���̕����G���R�[�f�B���O�B
     */
    private String fEncoding = null;

    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    public void expand(final BlancoCsvStructure processStructure,
            final File directoryTarget) {

        final String className = BlancoNameAdjuster
                .toClassName(processStructure.getName())
                + fBundleReader.getClassNameSuffix();
        final String classNameblancoCsvIOException = processStructure
                .getRuntimePackage()
                + fBundleReader.getAddusingtype01Suffix();

        // �]���ƌ݊������������邽�߁A/main�T�u�t�H���_�ɏo�͂��܂��B
        final File fileBlancoMain = new File(directoryTarget.getAbsolutePath()
                + "/main");

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(processStructure
                .getPackage()
                + fBundleReader.getPackagePrefix(),
                "���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B");
        fCgSourceFile.setEncoding(fEncoding);
        fCgClass = fCgFactory.createClass(className, BlancoStringUtil
                .null2Blank(fBundleReader.getClasscomment01(processStructure
                        .getName()
                        + (processStructure.getDescription() == null ? "" : "/"
                                + processStructure.getDescription()))));
        fCgSourceFile.getClassList().add(fCgClass);

        fCgSourceFile.getImportList().add(classNameblancoCsvIOException);

        fCgClass.getLangDoc().getDescriptionList().add(
                fBundleReader.getClasscomment02());
        if (processStructure.getEncoding() == null) {
            fCgClass.getLangDoc().getDescriptionList().add(
                    fBundleReader.getClasscomment03Case01());
        } else {
            fCgClass.getLangDoc().getDescriptionList().add(
                    fBundleReader.getClasscomment03Case02(processStructure
                            .getEncoding()));
        }
        fCgClass.getLangDoc().getDescriptionList().add(
                fBundleReader.getClasscomment04());

        {
            final BlancoCgField field = fCgFactory.createField(fBundleReader
                    .getFieldReaderName(), fBundleReader.getFieldReaderType(),
                    fBundleReader.getFieldReaderJavadoc01());
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
            field.getLangDoc().getDescriptionList().add(
                    fBundleReader.getFieldReaderJavadoc02());
        }

        {
            final BlancoCgField field = fCgFactory.createField(fBundleReader
                    .getFieldLineCounterName(), fBundleReader
                    .getFieldLineCounterType(), fBundleReader
                    .getFieldLineCounterJavadoc01());
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
            field.getLangDoc().getDescriptionList().add(
                    fBundleReader.getFieldLineCounterJavadoc02());
            field.setDefault(fBundleReader.getFieldLineCounterDefault());
        }

        {
            final BlancoCgField field = fCgFactory.createField("fLine",
                    "java.lang.String", "���ݏ������̍s�f�[�^�B");
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
        }

        {
            final BlancoCgField field = fCgFactory.createField("fLineReader",
                    "java.io.StringReader", "���ݏ������̍s�̂��߂̃��[�_�B");
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
        }

        if (processStructure.getTitleRow().equals("title with quote")
                || processStructure.getTitleRow().equals("title without quote")) {
            final BlancoCgField field = fCgFactory.createField(
                    "fIsTitleProcessed", "boolean", "�^�C�g���s���������ꂽ���ǂ����B");
            fCgClass.getFieldList().add(field);
            field.setAccess("protected");
            field.setDefault("false");
        }

        // �u�����v�Ή�
        for (int indexField = 0; indexField < processStructure.getFieldList()
                .size(); indexField++) {
            final BlancoCsvFieldStructure fieldStructure = (BlancoCsvFieldStructure) processStructure
                    .getFieldList().get(indexField);

            if (fieldStructure.getType().equals("java.util.Date")) {
                final BlancoCgField field = fCgFactory
                        .createField(
                                fBundleReader
                                        .getFieldSimpleDateFormatNamePrefix()
                                        + BlancoNameAdjuster
                                                .toClassName(fieldStructure
                                                        .getName()),
                                fBundleReader.getFieldSimpleDateFormatType(),
                                fBundleReader
                                        .getFieldSimpleDateFormatJavadoc01(fieldStructure
                                                .getName()));
                fCgClass.getFieldList().add(field);
                field.setAccess("protected");
                field.getLangDoc().getDescriptionList().add(
                        fBundleReader.getFieldSimpleDateFormatJavadoc02());
            }
        }

        {
            // �R���X�g���N�^
            final BlancoCgMethod method = fCgFactory.createMethod(className,
                    fBundleReader.getConstructor01Javadoc01());
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);

            // �u�����v�Ή�
            method.getLineList().add("init();");
        }

        {
            // �R���X�g���N�^
            final BlancoCgMethod method = fCgFactory.createMethod(className,
                    fBundleReader.getConstructor01Javadoc01());
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);
            method.getLangDoc().getDescriptionList().add(
                    fBundleReader.getConstructor01Javadoc02());
            method.getParameterList().add(
                    fCgFactory.createParameter("arg", fBundleReader
                            .getConstructor01Arg01Type(), fBundleReader
                            .getConstructor01Arg01Javadoc01()));

            // ���\�b�h�̎���
            method.getLineList().add("fReader = arg;");

            // �u�����v�Ή�
            method.getLineList().add("init();");
        }

        {
            // init���\�b�h
            final BlancoCgMethod method = fCgFactory.createMethod("init",
                    "�������������Ȃ��܂��B");
            fCgClass.getMethodList().add(method);
            method.setAccess("protected");

            // �u�����v�Ή�
            for (int indexField = 0; indexField < processStructure
                    .getFieldList().size(); indexField++) {
                final BlancoCsvFieldStructure field = (BlancoCsvFieldStructure) processStructure
                        .getFieldList().get(indexField);

                if (field.getType().equals("java.util.Date")) {
                    method
                            .getLineList()
                            .add(
                                    fBundleReader
                                            .getFieldSimpleDateFormatNamePrefix()
                                            + BlancoNameAdjuster
                                                    .toClassName(field
                                                            .getName())
                                            + " = new SimpleDateFormat("
                                            + (field.getFormat() == null ? "\"yyyy/MM/dd\""
                                                    : "\"" + field.getFormat()
                                                            + "\"") + ");");
                    method.getLineList().add("// ���t/������͂������ɂ����Ȃ��܂��B");
                    method
                            .getLineList()
                            .add(
                                    fBundleReader
                                            .getFieldSimpleDateFormatNamePrefix()
                                            + BlancoNameAdjuster
                                                    .toClassName(field
                                                            .getName())
                                            + ".setLenient(false);");
                }
            }
        }

        final String recordClassName = processStructure.getPackage()
                + ".record."
                + BlancoNameAdjuster.toClassName(processStructure.getName())
                + "CsvRecord";

        // ���\�b�h�̃V�O�j�`���w��
        {
            final BlancoCgMethod method = fCgFactory.createMethod("readRecord",
                    fBundleReader.getReadrecordJavadoc());
            fCgClass.getMethodList().add(method);
            method.setReturn(fCgFactory.createReturn(recordClassName,
                    fBundleReader.getReadrecordReturnJavadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(classNameblancoCsvIOException,
                            fBundleReader.getReadrecordThrows01Javadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(fBundleReader
                            .getReadrecordThrows02Type(), fBundleReader
                            .getReadrecordThrows02Javadoc()));

            // ���\�b�h�̎���
            method.getLineList().add("if (fReader == null) {");
            method
                    .getLineList()
                    .add(
                            "throw new IllegalArgumentException(\"["
                                    + processStructure.getName()
                                    + "] ���[�_���ݒ肳��Ă��Ȃ���ԂŃ��\�b�h[readRecord]���Ăяo����܂����B����͋�����܂���B���[�_���Z�b�g���Ă���Ăт����Ă��������B\");");
            method.getLineList().add("}");
            method.getLineList().add("");

            if (processStructure.getTitleRow().equals("title with quote")
                    || processStructure.getTitleRow().equals(
                            "title without quote")) {
                method.getLineList().add("if (fIsTitleProcessed == false) {");
                method.getLineList().add("// �^�C�g���s��ǂݔ�΂��B");
                method.getLineList().add("fReader.readLine();");
                method.getLineList().add("fIsTitleProcessed = true;");
                method.getLineList().add("}");
                method.getLineList().add("");
            }

            method.getLineList().add("fLine = fReader.readLine();");
            method.getLineList().add("if (fLine == null) {");
            method.getLineList().add(fBundleReader.getReadrecordLine03());
            method.getLineList().add("return null;");
            method.getLineList().add("}");
            method.getLineList().add("fLineCounter++;");
            method.getLineList().add(
                    fBundleReader.getReadrecordLine07(BlancoNameAdjuster
                            .toClassName(processStructure.getName())));
            fCgSourceFile.getImportList().add("java.io.StringReader");
            method.getLineList().add("fLineReader = new StringReader(fLine);");
            method.getLineList().add("String tokenString = null;");

            for (int indexField = 0; indexField < processStructure
                    .getFieldList().size(); indexField++) {
                final BlancoCsvFieldStructure field = (BlancoCsvFieldStructure) processStructure
                        .getFieldList().get(indexField);

                method.getLineList().add("");
                method
                        .getLineList()
                        .add(
                                (fBundleReader
                                        .getReadrecordLine12(
                                                (field.getNo() == null ? ""
                                                        : bundle
                                                                .getFieldNo(field
                                                                        .getNo())),
                                                field.getName()
                                                        + (field
                                                                .getDescription() == null ? ""
                                                                : "/"
                                                                        + BlancoJavaSourceUtil
                                                                                .escapeStringAsJavaSource(field
                                                                                        .getDescription())))));
                // �uBlancoCsvRuntimeUtil�v�̓C���|�[�g���Ȃ��Ȃ�܂����B
                // fCgSourceFile.getImportList().add(
                // processStructure.getRuntimePackage()
                // + ".util.BlancoCsvRuntimeUtil");

                if (field.getType().endsWith("(quote)")) {
                    // ������̃N�I�[�g�t�B
                    method.getLineList().add(
                            fBundleReader.getReadrecordLine21());
                    method.getLineList().add(
                            fBundleReader.getReadrecordLine22Case01(
                                    processStructure.getDelimiter(),
                                    (indexField == processStructure
                                            .getFieldList().size() - 1 ? "true"
                                            : "false")));
                } else {
                    method.getLineList().add(
                            fBundleReader.getReadrecordLine22Case02(
                                    processStructure.getDelimiter(),
                                    (indexField == processStructure
                                            .getFieldList().size() - 1 ? "true"
                                            : "false")));
                }
                method.getLineList().add("if (tokenString == null) {");
                method.getLineList().add(
                        "throw new BlancoCsvIOException(\""
                                + bundle.getCsvReaderErr001(getLocationString(
                                        indexField, field.getNo(), field
                                                .getName(),
                                        BlancoJavaSourceUtil
                                                .escapeStringAsJavaSource(field
                                                        .getDescription())))
                                + "\");");
                method.getLineList().add("}");

                final String encodingString = (processStructure.getEncoding() == null ? ""
                        : "\"" + processStructure.getEncoding() + "\"");
                if (field.getRequired()) {
                    method.getLineList().add("// �K�{���ځB");
                    method.getLineList()
                            .add("if (tokenString.length() == 0) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr008(getLocationString(
                                                            indexField,
                                                            field.getNo(),
                                                            field.getName(),
                                                            BlancoJavaSourceUtil
                                                                    .escapeStringAsJavaSource(field
                                                                            .getDescription())))
                                            + "\");");
                    method.getLineList().add("}");
                } else {
                    method.getLineList().add("// �C�Ӎ��ځB");
                    method.getLineList()
                            .add("if (tokenString.length() == 0) {");
                    if (field.getType().startsWith("java.lang.String")) {
                        method
                                .getLineList()
                                .add(
                                        "// �K�{���ڂł͂Ȃ������񍀖ڂɒ���0�̒l���ǂݍ��܂ꂽ�ꍇ�ɂ́A�ǂݍ��݌�̒l�Ƃ��Ă�����0�̕�����Ƃ��܂��B");
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName()) + "(tokenString);");
                    } else {
                        method
                                .getLineList()
                                .add(
                                        "// �K�{���ڂł͂Ȃ����ڂɒ���0�̒l���ǂݍ��܂ꂽ�ꍇ�ɂ́A�l�Ƃ���null�������܂��B");
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName()) + "(null);");
                    }
                    method.getLineList().add("} else {");
                }
                if (field.getMinLength() != null) {
                    method.getLineList().add(
                            "if (tokenString.getBytes(" + encodingString
                                    + ").length < " + field.getMinLength()
                                    + ") {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr002(
                                                            getLocationString(
                                                                    indexField,
                                                                    field
                                                                            .getNo(),
                                                                    field
                                                                            .getName(),
                                                                    BlancoJavaSourceUtil
                                                                            .escapeStringAsJavaSource(field
                                                                                    .getDescription())),
                                                            field
                                                                    .getMinLength())
                                            + "\");");
                    method.getLineList().add("}");
                }
                if (field.getMaxLength() != null) {
                    method.getLineList().add(
                            "if (tokenString.getBytes(" + encodingString
                                    + ").length > " + field.getMaxLength()
                                    + ") {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr003(
                                                            getLocationString(
                                                                    indexField,
                                                                    field
                                                                            .getNo(),
                                                                    field
                                                                            .getName(),
                                                                    BlancoJavaSourceUtil
                                                                            .escapeStringAsJavaSource(field
                                                                                    .getDescription())),
                                                            field
                                                                    .getMaxLength())
                                            + "\");");
                    method.getLineList().add("}");
                }

                if (field.getType().equals("java.lang.String")
                        || field.getType().equals("java.lang.String(quote)")) {
                    method.getLineList().add(
                            "record.set"
                                    + BlancoNameAdjuster.toClassName(field
                                            .getName()) + "(tokenString);");
                } else if (field.getType().equals("int")) {
                    method.getLineList().add("try {");
                    if (field.getRequired()) {
                        // �K�{�̏ꍇ
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName())
                                        + "(Integer.parseInt(tokenString));");
                    } else {
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName())
                                        + "(new Integer(tokenString));");
                    }
                    method.getLineList().add(
                            "} catch (NumberFormatException ex) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr004(getLocationString(
                                                            indexField,
                                                            field.getNo(),
                                                            field.getName(),
                                                            BlancoJavaSourceUtil
                                                                    .escapeStringAsJavaSource(field
                                                                            .getDescription())))
                                            + "\" + ex.toString(), ex);");
                    method.getLineList().add("}");
                } else if (field.getType().equals("long")) {
                    method.getLineList().add("try {");
                    if (field.getRequired()) {
                        // �K�{�̏ꍇ
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName())
                                        + "(Long.parseLong(tokenString));");
                    } else {
                        method.getLineList().add(
                                "record.set"
                                        + BlancoNameAdjuster.toClassName(field
                                                .getName())
                                        + "(new Long(tokenString));");
                    }
                    method.getLineList().add(
                            "} catch (NumberFormatException ex) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr005(getLocationString(
                                                            indexField,
                                                            field.getNo(),
                                                            field.getName(),
                                                            BlancoJavaSourceUtil
                                                                    .escapeStringAsJavaSource(field
                                                                            .getDescription())))
                                            + "\" + ex.toString(), ex);");
                    method.getLineList().add("}");
                } else if (field.getType().equals("java.util.Date")) {
                    fCgSourceFile.getImportList().add(
                            "java.text.ParseException");
                    method.getLineList().add("try {");
                    method.getLineList().add(
                            "record.set"
                                    + BlancoNameAdjuster.toClassName(field
                                            .getName())
                                    + "(fSimpleDateFormat"
                                    + BlancoNameAdjuster.toClassName(field
                                            .getName())
                                    + ".parse(tokenString));");
                    method.getLineList().add("} catch (ParseException ex) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr006(
                                                            getLocationString(
                                                                    indexField,
                                                                    field
                                                                            .getNo(),
                                                                    field
                                                                            .getName(),
                                                                    BlancoJavaSourceUtil
                                                                            .escapeStringAsJavaSource(field
                                                                                    .getDescription())),
                                                            BlancoNameAdjuster
                                                                    .toClassName(field
                                                                            .getName()))
                                            + "\" + ex.toString(), ex);");
                    method.getLineList().add("}");
                } else if (field.getType().equals("java.math.BigDecimal")) {
                    fCgSourceFile.getImportList().add("java.math.BigDecimal");
                    method.getLineList().add("try {");
                    method.getLineList().add(
                            "record.set"
                                    + BlancoNameAdjuster.toClassName(field
                                            .getName())
                                    + "(new BigDecimal(tokenString));");
                    method.getLineList().add(
                            "} catch (NumberFormatException ex) {");
                    method
                            .getLineList()
                            .add(
                                    "throw new BlancoCsvIOException(\""
                                            + bundle
                                                    .getCsvReaderErr007(getLocationString(
                                                            indexField,
                                                            field.getNo(),
                                                            field.getName(),
                                                            BlancoJavaSourceUtil
                                                                    .escapeStringAsJavaSource(field
                                                                            .getDescription())))
                                            + "\" + ex.toString(), ex);");
                    method.getLineList().add("}");
                } else {
                    method.getLineList().add(
                            bundle.getNotSupportedType(field.getType()));
                }

                if (field.getRequired()) {
                    // �K�{���ځB
                } else {
                    method.getLineList().add("}");
                }
            }

            method.getLineList().add("return record;");
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod("getReader",
                    "CSV�����Ŋ֘A�Â����郊�[�_��Ԃ��܂��B");
            fCgClass.getMethodList().add(method);
            method.setReturn(fCgFactory.createReturn("java.io.BufferedReader",
                    "CSV�����Ŋ֘A�Â����郊�[�_�B"));

            method.getLineList().add("return fReader;");
        }

        {
            // DI�΍�B
            final BlancoCgMethod method = fCgFactory.createMethod("setReader",
                    "CSV�����Ŋ֘A�Â����郊�[�_��ݒ肵�܂��B");
            fCgClass.getMethodList().add(method);
            method.getParameterList().add(
                    fCgFactory.createParameter("argReader",
                            "java.io.BufferedReader", "CSV�����Ŋ֘A�Â����郊�[�_�B"));

            method.getLineList().add("fReader = argReader;");
        }

        // ���\�b�h�̃V�O�j�`���w��
        {
            final BlancoCgMethod method = fCgFactory.createMethod(
                    "getLineCounter", "���ݏ������̍s�J�E���^��Ԃ��܂��B");
            fCgClass.getMethodList().add(method);
            method.setReturn(fCgFactory.createReturn("long", "���ݏ������̍s�J�E���^�B"));

            // ���\�b�h�̎���
            method.getLineList().add("return fLineCounter;");
        }

        // ���\�b�h�̃V�O�j�`���w��
        {
            final BlancoCgMethod method = fCgFactory.createMethod("close",
                    fBundleReader.getCloseJavadoc01());
            fCgClass.getMethodList().add(method);
            method.getLangDoc().getDescriptionList().add(
                    fBundleReader.getCloseJavadoc02());
            method.getThrowList().add(
                    fCgFactory.createException(fBundleReader
                            .getCloseThrows01Type(), fBundleReader
                            .getCloseThrows01Javadoc()));

            // ���\�b�h�̎���
            method.getLineList().add("if (fReader != null) {");
            method.getLineList().add("fReader.close();");
            method.getLineList().add("}");
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod(fBundleUtil
                    .getReadtokenName(), fBundleUtil.getReadtokenJavadoc());
            fCgClass.getMethodList().add(method);
            method.setAccess("protected");

            // ���\�b�h�̃V�O�j�`���w��
            // method.getParameterList().add(
            // fCgFactory.createParameter(fBundleUtil
            // .getReadtokenArg01Name(), fBundleUtil
            // .getReadtokenArg01Type(), fBundleUtil
            // .getReadtokenArg01Javadoc()));
            method.getParameterList().add(
                    fCgFactory.createParameter(fBundleUtil
                            .getReadtokenArg02Name(), fBundleUtil
                            .getReadtokenArg02Type(), fBundleUtil
                            .getReadtokenArg02Javadoc()));
            method.getParameterList().add(
                    fCgFactory.createParameter(fBundleUtil
                            .getReadtokenArg03Name(), fBundleUtil
                            .getReadtokenArg03Type(), fBundleUtil
                            .getReadtokenArg03Javadoc()));
            method.setReturn(fCgFactory.createReturn(fBundleUtil
                    .getReadtokenReturnType(), fBundleUtil
                    .getReadtokenReturnJavadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(classNameblancoCsvIOException,
                            "���ڐ�������Ȃ��ȂǗ^����ꂽ������Ɋւ����O�����������ꍇ�B"));
            method.getThrowList().add(
                    fCgFactory.createException(fBundleUtil
                            .getReadtokenThrows01Type(), fBundleUtil
                            .getReadtokenThrows01Javadoc()));

            // ���\�b�h�̎���
            final List<java.lang.String> lineList = method.getLineList();
            lineList.add(fBundleUtil.getReadtokenLine01());
            lineList.add(fBundleUtil.getReadtokenLine02());
            lineList.add(fBundleUtil.getReadtokenLine03());
            lineList.add(fBundleUtil.getReadtokenLine04());
            lineList.add(fBundleUtil.getReadtokenLine05());
            lineList.add(fBundleUtil.getReadtokenLine06());
            lineList.add(fBundleUtil.getReadtokenLine07());
            lineList.add(fBundleUtil.getReadtokenLine08());
            lineList.add(fBundleUtil.getReadtokenLine09());
            lineList.add(fBundleUtil.getReadtokenLine10());
            lineList.add(fBundleUtil.getReadtokenLine11());
            lineList.add(fBundleUtil.getReadtokenLine12());
            lineList.add(fBundleUtil.getReadtokenLine13());
            lineList.add(fBundleUtil.getReadtokenLine14());
            lineList.add(fBundleUtil.getReadtokenLine15());
            lineList.add(fBundleUtil.getReadtokenLine16());
            lineList.add(fBundleUtil.getReadtokenLine17());
            lineList.add(fBundleUtil.getReadtokenLine18());
            lineList.add(fBundleUtil.getReadtokenLine19());
            lineList.add(fBundleUtil.getReadtokenLine20());
        }

        // ���\�b�h�̃V�O�j�`���w��
        {
            final BlancoCgMethod method = fCgFactory.createMethod(fBundleUtil
                    .getReadtokenwithquoteName(), fBundleUtil
                    .getReadtokenwithquoteJavadoc());
            fCgClass.getMethodList().add(method);
            method.setAccess("protected");

            // method.getParameterList().add(
            // fCgFactory.createParameter(fBundleUtil
            // .getReadtokenwithquoteArg01Name(), fBundleUtil
            // .getReadtokenwithquoteArg01Type(), fBundleUtil
            // .getReadtokenwithquoteArg01Javadoc()));
            method.getParameterList().add(
                    fCgFactory.createParameter(fBundleUtil
                            .getReadtokenwithquoteArg02Name(), fBundleUtil
                            .getReadtokenwithquoteArg02Type(), fBundleUtil
                            .getReadtokenwithquoteArg02Javadoc()));
            method.getParameterList().add(
                    fCgFactory.createParameter(fBundleUtil
                            .getReadtokenwithquoteArg03Name(), fBundleUtil
                            .getReadtokenwithquoteArg03Type(), fBundleUtil
                            .getReadtokenwithquoteArg03Javadoc()));
            method.setReturn(fCgFactory.createReturn(fBundleUtil
                    .getReadtokenwithquoteReturnType(), fBundleUtil
                    .getReadtokenwithquoteReturnJavadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(classNameblancoCsvIOException,
                            "�_�u���N�I�[�g�̕s��v�ȂǗ^����ꂽ������Ɋւ����O�����������ꍇ�B"));
            method.getThrowList().add(
                    fCgFactory.createException(fBundleUtil
                            .getReadtokenwithquoteThrows01Type(), fBundleUtil
                            .getReadtokenwithquoteThrows01Javadoc()));

            // ���\�b�h�̎���
            final List<java.lang.String> lineList = method.getLineList();
            lineList.add(fBundleUtil.getReadtokenwithquoteLine01());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine02());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine03());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine04());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine05());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine06());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine07());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine08());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine09());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine10());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine11());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine12());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine13());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine14());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine15());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine16());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine17());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine18());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine19());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine20());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine21());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine22());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine23());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine24());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine25());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine26());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine27());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine28());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine29());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine30());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine31());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine32());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine33());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine34());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine35());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine36());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine37());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine38());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine39());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine40());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine41());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine42());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine43());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine44());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine45());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine46());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine47());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine48());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine49());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine50());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine51());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine52());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine53());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine54());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine55());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine56());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine57());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine58());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine59());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine60());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine61());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine62());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine63());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine64());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine65());
            lineList.add(fBundleUtil.getReadtokenwithquoteLine66());
        }

        BlancoCgTransformerFactory.getJavaSourceTransformer().transform(
                fCgSourceFile, fileBlancoMain);
    }

    private String getLocationString(int indexField, String fieldNo,
            String fieldName, String fieldDescription) {
        return fBundleReader.getGetlocationstringLine01("" + (indexField + 1),
                (fieldNo == null ? "" : bundle.getFieldNo(fieldNo) + " "),
                fieldName
                        + (fieldDescription == null ? "" : "/"
                                + fieldDescription));
    }
}
