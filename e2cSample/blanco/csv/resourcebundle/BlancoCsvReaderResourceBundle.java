/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.csv.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * XXXXXXXXCsvReader�N���X�̃\�[�X�R�[�h�����̂��߂̃��\�[�X�o���h���ł��B
 *
 * ���\�[�X�o���h����`: [BlancoCsvReader]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvReaderResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvReaderResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvReader]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoCsvReaderResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvReader");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvReaderResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvReader]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoCsvReaderResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvReader", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvReaderResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvReader]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoCsvReaderResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvReader", locale, loader);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g���擾���܂��B
     *
     * @return �����I�ɕێ����Ă��郊�\�[�X�o���h���I�u�W�F�N�g�B
     */
    public ResourceBundle getResourceBundle() {
        return fResourceBundle;
    }

    /**
     * bundle[BlancoCsvReader], key[PACKAGE.PREFIX]
     *
     * [.io] (ja)<br>
     *
     * @return key[PACKAGE.PREFIX]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getPackagePrefix() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = ".io";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("PACKAGE.PREFIX");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CLASS_NAME.SUFFIX]
     *
     * [CsvReader] (ja)<br>
     *
     * @return key[CLASS_NAME.SUFFIX]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClassNameSuffix() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "CsvReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASS_NAME.SUFFIX");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.01]
     *
     * [�t�@�C����`[{0}]�̃��[�_�N���X�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CLASSCOMMENT.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`[{0}]�̃��[�_�N���X�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.02]
     *
     * [���̃N���X��blancoCsv�t�@�C����`�����玩���������ꂽ���[�_�N���X�ł��B&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̃N���X��blancoCsv�t�@�C����`�����玩���������ꂽ���[�_�N���X�ł��B<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.03.CASE01]
     *
     * [�@1.�����񒷃`�F�b�N�ɂ́A�f�t�H���g�G���R�[�f�B���O�𗘗p���܂��B&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.03.CASE01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment03Case01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�@1.�����񒷃`�F�b�N�ɂ́A�f�t�H���g�G���R�[�f�B���O�𗘗p���܂��B<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.03.CASE01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.03.CASE02]
     *
     * [�@1.�����񒷃`�F�b�N�ɂ́A[{0}]�G���R�[�f�B���O�𗘗p���܂��B&lt;br&gt;] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CLASSCOMMENT.03.CASE02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment03Case02(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�@1.�����񒷃`�F�b�N�ɂ́A[{0}]�G���R�[�f�B���O�𗘗p���܂��B<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.03.CASE02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvReader], key[CLASSCOMMENT.04]
     *
     * [�@2.�N���X�̗��p������͕K�� close()���Ăяo���Ă��������B&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.04]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment04() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�@2.�N���X�̗��p������͕K�� close()���Ăяo���Ă��������B<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.04");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[ADDUSINGTYPE.01.SUFFIX]
     *
     * [.io.BlancoCsvIOException] (ja)<br>
     *
     * @return key[ADDUSINGTYPE.01.SUFFIX]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getAddusingtype01Suffix() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = ".io.BlancoCsvIOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ADDUSINGTYPE.01.SUFFIX");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.READER.TYPE]
     *
     * [java.io.BufferedReader] (ja)<br>
     *
     * @return key[FIELD.READER.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldReaderType() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.BufferedReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.READER.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.READER.NAME]
     *
     * [fReader] (ja)<br>
     *
     * @return key[FIELD.READER.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldReaderName() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "fReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.READER.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.READER.JAVADOC.01]
     *
     * [���[�_�I�u�W�F�N�g] (ja)<br>
     *
     * @return key[FIELD.READER.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldReaderJavadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���[�_�I�u�W�F�N�g";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.READER.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.READER.JAVADOC.02]
     *
     * [CSV�����Ŋ֘A�Â�����A���ۂɓ��͂��s�����[�_�B] (ja)<br>
     *
     * @return key[FIELD.READER.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldReaderJavadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "CSV�����Ŋ֘A�Â�����A���ۂɓ��͂��s�����[�_�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.READER.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.TYPE]
     *
     * [long] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldLineCounterType() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "long";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.NAME]
     *
     * [fLineCounter] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldLineCounterName() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "fLineCounter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.JAVADOC.01]
     *
     * [���ݏ������̍s�J�E���^�B] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldLineCounterJavadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���ݏ������̍s�J�E���^�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.JAVADOC.02]
     *
     * [���ݏ������s���Ă���s�̈ʒu�B] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldLineCounterJavadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���ݏ������s���Ă���s�̈ʒu�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.LINE_COUNTER.DEFAULT]
     *
     * [0] (ja)<br>
     *
     * @return key[FIELD.LINE_COUNTER.DEFAULT]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldLineCounterDefault() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "0";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.LINE_COUNTER.DEFAULT");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.SIMPLE_DATE_FORMAT.TYPE]
     *
     * [java.text.SimpleDateFormat] (ja)<br>
     *
     * @return key[FIELD.SIMPLE_DATE_FORMAT.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldSimpleDateFormatType() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.text.SimpleDateFormat";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.SIMPLE_DATE_FORMAT.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.SIMPLE_DATE_FORMAT.NAME.PREFIX]
     *
     * [fSimpleDateFormat] (ja)<br>
     *
     * @return key[FIELD.SIMPLE_DATE_FORMAT.NAME.PREFIX]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldSimpleDateFormatNamePrefix() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "fSimpleDateFormat";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.SIMPLE_DATE_FORMAT.NAME.PREFIX");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01]
     *
     * [����[{0}]�̓ǂݍ��݂̍ۂɗ��p����t�H�[�}�b�^�[�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldSimpleDateFormatJavadoc01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "����[{0}]�̓ǂݍ��݂̍ۂɗ��p����t�H�[�}�b�^�[�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvReader], key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.02]
     *
     * [���C���X�^���X�����Ă������Ƃɂ�胁�����S�~������}�����܂��B] (ja)<br>
     *
     * @return key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldSimpleDateFormatJavadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���C���X�^���X�����Ă������Ƃɂ�胁�����S�~������}�����܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.SIMPLE_DATE_FORMAT.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CONSTRUCTOR.01.JAVADOC.01]
     *
     * [CSV���[�_�N���X�̃R���X�g���N�^�B] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Javadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "CSV���[�_�N���X�̃R���X�g���N�^�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CONSTRUCTOR.01.JAVADOC.02]
     *
     * [�^����ꂽ���[�_���֘A�Â��܂��B] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Javadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^����ꂽ���[�_���֘A�Â��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CONSTRUCTOR.01.ARG.01.TYPE]
     *
     * [java.io.BufferedReader] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Arg01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.BufferedReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.ARG.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CONSTRUCTOR.01.ARG.01.JAVADOC.01]
     *
     * [�֘A�Â��郊�[�_�B] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Arg01Javadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â��郊�[�_�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.ARG.01.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.JAVADOC]
     *
     * [�֘A�Â���ꂽ���[�_����A���̈�s��ǂݍ��݂܂��B] (ja)<br>
     *
     * @return key[READRECORD.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordJavadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���[�_����A���̈�s��ǂݍ��݂܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.RETURN.JAVADOC]
     *
     * [�s�I�u�W�F�N�g��Ԃ��܂��B���[�_���I�[�ɒB���A���͂�s�������ꍇ�ɂ� null��Ԃ��܂��B] (ja)<br>
     *
     * @return key[READRECORD.RETURN.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordReturnJavadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�s�I�u�W�F�N�g��Ԃ��܂��B���[�_���I�[�ɒB���A���͂�s�������ꍇ�ɂ� null��Ԃ��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.RETURN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.THROWS.01.JAVADOC]
     *
     * [���̓f�[�^���s���ȏꍇ�ȂǁB] (ja)<br>
     *
     * @return key[READRECORD.THROWS.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordThrows01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̓f�[�^���s���ȏꍇ�ȂǁB";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.THROWS.02.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[READRECORD.THROWS.02.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordThrows02Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.THROWS.02.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.THROWS.02.JAVADOC]
     *
     * [�֘A�Â���ꂽ���[�_�ŗ�O�����������ꍇ�B] (ja)<br>
     *
     * @return key[READRECORD.THROWS.02.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordThrows02Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���[�_�ŗ�O�����������ꍇ�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.THROWS.02.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.LINE.03]
     *
     * [// �t�@�C���̏I�[�ɓ��B���܂����B] (ja)<br>
     *
     * @return key[READRECORD.LINE.03]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordLine03() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �t�@�C���̏I�[�ɓ��B���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.LINE.07]
     *
     * [final {0}CsvRecord record = new {0}CsvRecord();] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[READRECORD.LINE.07]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordLine07(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "final {0}CsvRecord record = new {0}CsvRecord();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.07");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.LINE.12]
     *
     * [// {0}���ږ�[{1}]] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[READRECORD.LINE.12]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordLine12(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// {0}���ږ�[{1}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.12");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.LINE.21]
     *
     * [// �N�I�[�g���l�������ǂݍ��݂��s���܂��B] (ja)<br>
     *
     * @return key[READRECORD.LINE.21]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordLine21() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �N�I�[�g���l�������ǂݍ��݂��s���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.21");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.LINE.22.CASE01]
     *
     * [tokenString = readTokenWithQuote(''{0}'', {1});] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[READRECORD.LINE.22.CASE01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordLine22Case01(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "tokenString = readTokenWithQuote(''{0}'', {1});";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.22.CASE01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvReader], key[READRECORD.LINE.22.CASE02]
     *
     * [tokenString = readToken(''{0}'', {1});] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[READRECORD.LINE.22.CASE02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadrecordLine22Case02(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "tokenString = readToken(''{0}'', {1});";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READRECORD.LINE.22.CASE02");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsvReader], key[CLOSE.JAVADOC.01]
     *
     * [���̃��[�_����܂��B] (ja)<br>
     *
     * @return key[CLOSE.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCloseJavadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̃��[�_����܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLOSE.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CLOSE.JAVADOC.02]
     *
     * [�֘A�Â���ꂽ���[�_�ɑ΂��Ă�close()���Ăяo���܂��B] (ja)<br>
     *
     * @return key[CLOSE.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCloseJavadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���[�_�ɑ΂��Ă�close()���Ăяo���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLOSE.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CLOSE.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[CLOSE.THROWS.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCloseThrows01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLOSE.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[CLOSE.THROWS.01.JAVADOC]
     *
     * [�֘A�Â���ꂽ���[�_��close()�Ɏ��s�����ꍇ�B] (ja)<br>
     *
     * @return key[CLOSE.THROWS.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCloseThrows01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���[�_��close()�Ɏ��s�����ꍇ�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLOSE.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvReader], key[GETLOCATIONSTRING.LINE.01]
     *
     * [����&quot; + fLineCounter + &quot;�s�� {0}���ږځB{1}���ږ�[{2}]] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[GETLOCATIONSTRING.LINE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGetlocationstringLine01(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "����\" + fLineCounter + \"�s�� {0}���ږځB{1}���ږ�[{2}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETLOCATIONSTRING.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }
}
