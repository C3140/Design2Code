/*
 * blanco Framework
 * Copyright (C) 2004-2005 IGA Tosiki
 * 
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 */
package blanco.csv.task;

import java.io.File;
import java.io.IOException;

import javax.xml.transform.TransformerException;

import blanco.csv.BlancoCsvConstants;
import blanco.csv.BlancoCsvMeta2Xml;
import blanco.csv.BlancoCsvXml2JavaClass;
import blanco.csv.resourcebundle.BlancoCsvResourceBundle;
import blanco.csv.task.valueobject.BlancoCsvProcessInput;

public class BlancoCsvProcessImpl implements BlancoCsvProcess {
    private final BlancoCsvResourceBundle fBundle = new BlancoCsvResourceBundle();

    /**
     * �N���X���C���X�^���X�����ď��������s����ۂ̃G���g���|�C���g�ł��B
     * 
     * @param input
     *            �����̓��̓p�����[�^�B
     * @return �����̎��s���ʁB
     * @throws IOException
     *             ���o�͗�O�����������ꍇ�B
     * @throws IllegalArgumentException
     *             ���͒l�ɕs�������������ꍇ�B
     */
    public int execute(final BlancoCsvProcessInput input) throws IOException,
            IllegalArgumentException {
        try {
            final File blancoTmpDirectory = new File(input.getTmpdir()
                    + BlancoCsvConstants.TARGET_SUBDIRECTORY);
            blancoTmpDirectory.mkdirs();

            final File fileMetadir = new File(input.getMetadir());
            if (fileMetadir.exists() == false) {
                throw new IllegalArgumentException(fBundle
                        .getAnttaskErr001(input.getMetadir()));
            }

            new BlancoCsvMeta2Xml().processDirectory(fileMetadir, input
                    .getTmpdir()
                    + BlancoCsvConstants.TARGET_SUBDIRECTORY);

            final File tempValueObjectFolder = new File(input.getTmpdir()
                    + BlancoCsvConstants.TARGET_SUBDIRECTORY
                    + BlancoCsvConstants.VALUE_OBJECT_DIRECTORY);
            tempValueObjectFolder.mkdirs();

            final File[] fileTmp = blancoTmpDirectory.listFiles();
            for (int index = 0; index < fileTmp.length; index++) {
                if (fileTmp[index].getName().endsWith(".xml")) {
                    final BlancoCsvXml2JavaClass xml2source = new BlancoCsvXml2JavaClass();
                    xml2source.setEncoding(input.getEncoding());
                    xml2source.process(fileTmp[index], input
                            .getRuntimepackage(), tempValueObjectFolder,
                            new File(input.getTargetdir()));
                }
            }

            return BlancoCsvBatchProcess.END_SUCCESS;
        } catch (TransformerException e) {
            throw new IOException("XML�ϊ��̉ߒ��ŗ�O���������܂���: " + e.toString());
        }
    }

    /**
     * {@inheritDoc}
     */
    public boolean progress(final String argProgressMessage) {
        System.out.println(argProgressMessage);
        return false;
    }
}
