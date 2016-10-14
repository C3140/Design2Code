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

import blanco.cg.BlancoCgObjectFactory;
import blanco.cg.transformer.BlancoCgTransformerFactory;
import blanco.cg.valueobject.BlancoCgClass;
import blanco.cg.valueobject.BlancoCgMethod;
import blanco.cg.valueobject.BlancoCgSourceFile;
import blanco.commons.util.BlancoStringUtil;
import blanco.csv.resourcebundle.BlancoCsvIOExceptionResourceBundle;
import blanco.csv.valueobject.BlancoCsvStructure;

public class BlancoCsvExpandIOException {
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

    private final BlancoCsvIOExceptionResourceBundle bundle = new BlancoCsvIOExceptionResourceBundle();

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
                + bundle.getPackagePrefix(),
                "���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B");
        fCgSourceFile.setEncoding(fEncoding);
        fCgClass = fCgFactory.createClass(bundle.getClassName(),
                BlancoStringUtil.null2Blank(bundle.getClasscomment01()));
        fCgSourceFile.getClassList().add(fCgClass);
        fCgClass.getExtendClassList().add(
                fCgFactory.createType(bundle.getSuperclassName()));
        fCgClass.getLangDoc().getDescriptionList().add(
                bundle.getClasscomment02());

        // �V���A��ID�̌x����}���B
        fCgClass.getAnnotationList().add("SuppressWarnings(\"serial\")");

        {
            final BlancoCgMethod method = fCgFactory.createMethod(bundle
                    .getClassName(), "���b�Z�[�W�𔺂�blancoCsv��O�N���X�𐶐����܂��B");
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);
            method.getParameterList().add(
                    fCgFactory.createParameter("message", bundle
                            .getConstructor01Arg01Type(), "���b�Z�[�W�B"));
            method.getLineList().add(bundle.getConstructor01Line01());
        }

        {
            final BlancoCgMethod method = fCgFactory.createMethod(bundle
                    .getClassName(), "���b�Z�[�W����ь����𔺂�blancoCsv��O�N���X�𐶐����܂��B");
            fCgClass.getMethodList().add(method);
            method.setConstructor(true);
            method.getParameterList().add(
                    fCgFactory.createParameter("message", bundle
                            .getConstructor01Arg01Type(), "���b�Z�[�W�B"));
            method.getParameterList().add(
                    fCgFactory.createParameter("argCause",
                            "java.lang.Throwable", "�����ƂȂ��O�I�u�W�F�N�g�B"));
            method.getLineList().add("super(message, argCause);");
        }

        BlancoCgTransformerFactory.getJavaSourceTransformer().transform(
                fCgSourceFile, fileBlancoMain);
    }
}
