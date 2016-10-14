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
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoStringUtil;
import blanco.csv.resourcebundle.BlancoCsvRuntimeUtilResourceBundle;
import blanco.csv.valueobject.BlancoCsvStructure;

public class BlancoCsvExpandRuntimeUtil {
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

        // �]���ƌ݊������������邽�߁A/main�T�u�t�H���_�ɏo�͂��܂��B
        final File fileBlancoMain = new File(directoryTarget.getAbsolutePath()
                + "/main");

        fCgFactory = BlancoCgObjectFactory.getInstance();
        fCgSourceFile = fCgFactory.createSourceFile(processStructure
                .getRuntimePackage()
                + fBundleUtil.getPackagePrefix(),
                "���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B");
        fCgSourceFile.setEncoding(fEncoding);
        fCgClass = fCgFactory.createClass(fBundleUtil.getClassName(),
                BlancoStringUtil.null2Blank(fBundleUtil.getClasscomment01()));
        fCgSourceFile.getClassList().add(fCgClass);
        fCgClass.getLangDoc().getDescriptionList().add(
                fBundleUtil.getClasscomment02());

        @SuppressWarnings("unused")
        final String classNameblancoCsvIOException = processStructure
                .getRuntimePackage()
                + ".io.BlancoCsvIOException";

        // ���\�b�h�̃V�O�j�`���w��
        {
            final BlancoCgMethod method = fCgFactory.createMethod(fBundleUtil
                    .getGettokenwithquoteName(), fBundleUtil
                    .getGettokenwithquoteJavadoc());
            fCgClass.getMethodList().add(method);
            method.setStatic(true);

            method.getParameterList().add(
                    fCgFactory.createParameter("value", fBundleUtil
                            .getGettokenwithquoteArg01Type(), fBundleUtil
                            .getGettokenwithquoteArg01Javadoc()));
            method.setReturn(fCgFactory.createReturn(fBundleUtil
                    .getGettokenwithquoteReturnType(), fBundleUtil
                    .getGettokenwithquoteReturnJavadoc()));
            method.getThrowList().add(
                    fCgFactory.createException(fBundleUtil
                            .getGettokenwithquoteThrows01Type(), fBundleUtil
                            .getGettokenwithquoteThrows01Javadoc()));

            // ���\�b�h�̎���
            fCgSourceFile.getImportList().add(
                    fBundleUtil.getGettokenwithquoteAddusingtype01());
            fCgSourceFile.getImportList().add(
                    fBundleUtil.getGettokenwithquoteAddusingtype02());

            final List<java.lang.String> lineList = method.getLineList();
            lineList.add(fBundleUtil.getGettokenwithquoteLine01());
            lineList.add(fBundleUtil.getGettokenwithquoteLine02());
            lineList.add(fBundleUtil.getGettokenwithquoteLine03());
            lineList.add(fBundleUtil.getGettokenwithquoteLine04());
            lineList.add(fBundleUtil.getGettokenwithquoteLine05());
            lineList.add(fBundleUtil.getGettokenwithquoteLine06());
            lineList.add(fBundleUtil.getGettokenwithquoteLine07());
            lineList.add(fBundleUtil.getGettokenwithquoteLine08());
            lineList.add(fBundleUtil.getGettokenwithquoteLine09());
            lineList.add(fBundleUtil.getGettokenwithquoteLine10());
            lineList.add(fBundleUtil.getGettokenwithquoteLine11());
            lineList.add(fBundleUtil.getGettokenwithquoteLine12());
            lineList.add(fBundleUtil.getGettokenwithquoteLine13());
            lineList.add(fBundleUtil.getGettokenwithquoteLine14());
            lineList.add(fBundleUtil.getGettokenwithquoteLine15());
            lineList.add(fBundleUtil.getGettokenwithquoteLine16());
            lineList.add(fBundleUtil.getGettokenwithquoteLine17());
            lineList.add(fBundleUtil.getGettokenwithquoteLine18());
            lineList.add(fBundleUtil.getGettokenwithquoteLine19());
            lineList.add(fBundleUtil.getGettokenwithquoteLine20());
            lineList.add(fBundleUtil.getGettokenwithquoteLine21());
        }

        BlancoCgTransformerFactory.getJavaSourceTransformer().transform(
                fCgSourceFile, fileBlancoMain);
    }
}
