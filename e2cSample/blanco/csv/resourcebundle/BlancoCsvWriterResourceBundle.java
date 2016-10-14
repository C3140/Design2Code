/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.csv.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * XXXXXXXXCsvWriter�N���X�̃\�[�X�R�[�h�����̂��߂̃��\�[�X�o���h���ł��B
 *
 * ���\�[�X�o���h����`: [BlancoCsvWriter]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvWriterResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvWriterResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvWriter]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoCsvWriterResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvWriter");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvWriterResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvWriter]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoCsvWriterResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvWriter", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvWriterResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvWriter]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoCsvWriterResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvWriter", locale, loader);
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
     * bundle[BlancoCsvWriter], key[PACKAGE.PREFIX]
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
     * bundle[BlancoCsvWriter], key[CLASS_NAME.SUFFIX]
     *
     * [CsvWriter] (ja)<br>
     *
     * @return key[CLASS_NAME.SUFFIX]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClassNameSuffix() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "CsvWriter";
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
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.01]
     *
     * [�t�@�C����`[{0}]�̃��C�^�N���X�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CLASSCOMMENT.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`[{0}]�̃��C�^�N���X�B";
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
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.02]
     *
     * [���̃N���X��blancoCsv�t�@�C����`�����玩���������ꂽ���C�^�N���X�ł��B&lt;br&gt;] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̃N���X��blancoCsv�t�@�C����`�����玩���������ꂽ���C�^�N���X�ł��B<br>";
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
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.03.CASE01]
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
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.03.CASE02]
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
     * bundle[BlancoCsvWriter], key[CLASSCOMMENT.04]
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
     * bundle[BlancoCsvWriter], key[ADDUSINGTYPE.01.SUFFIX]
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
     * bundle[BlancoCsvWriter], key[FIELD.WRITER.TYPE]
     *
     * [java.io.BufferedWriter] (ja)<br>
     *
     * @return key[FIELD.WRITER.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldWriterType() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.BufferedWriter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.WRITER.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.WRITER.NAME]
     *
     * [fWriter] (ja)<br>
     *
     * @return key[FIELD.WRITER.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldWriterName() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "fWriter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.WRITER.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.WRITER.JAVADOC.01]
     *
     * [���C�^�I�u�W�F�N�g�B] (ja)<br>
     *
     * @return key[FIELD.WRITER.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldWriterJavadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���C�^�I�u�W�F�N�g�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.WRITER.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.WRITER.JAVADOC.02]
     *
     * [CSV�����Ŋ֘A�Â�����A���ۂɏo�͂��s�����C�^�B] (ja)<br>
     *
     * @return key[FIELD.WRITER.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldWriterJavadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "CSV�����Ŋ֘A�Â�����A���ۂɏo�͂��s�����C�^�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD.WRITER.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.TYPE]
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
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.NAME]
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
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.JAVADOC.01]
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
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.JAVADOC.02]
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
     * bundle[BlancoCsvWriter], key[FIELD.LINE_COUNTER.DEFAULT]
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
     * bundle[BlancoCsvWriter], key[FIELD.SIMPLE_DATE_FORMAT.TYPE]
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
     * bundle[BlancoCsvWriter], key[FIELD.SIMPLE_DATE_FORMAT.NAME.PREFIX]
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
     * bundle[BlancoCsvWriter], key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01]
     *
     * [����[{0}]�̏������݂̍ۂɗ��p����t�H�[�}�b�^�[�B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldSimpleDateFormatJavadoc01(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "����[{0}]�̏������݂̍ۂɗ��p����t�H�[�}�b�^�[�B";
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
     * bundle[BlancoCsvWriter], key[FIELD.SIMPLE_DATE_FORMAT.JAVADOC.02]
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
     * bundle[BlancoCsvWriter], key[CONSTRUCTOR.01.JAVADOC.01]
     *
     * [CSV���C�^�N���X�̃R���X�g���N�^�B] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Javadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "CSV���C�^�N���X�̃R���X�g���N�^�B";
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
     * bundle[BlancoCsvWriter], key[CONSTRUCTOR.01.JAVADOC.02]
     *
     * [�^����ꂽ���C�^�Ɗ֘A�Â��܂��B] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Javadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^����ꂽ���C�^�Ɗ֘A�Â��܂��B";
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
     * bundle[BlancoCsvWriter], key[CONSTRUCTOR.01.ARG.01.TYPE]
     *
     * [java.io.BufferedWriter] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Arg01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.BufferedWriter";
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
     * bundle[BlancoCsvWriter], key[CONSTRUCTOR.01.ARG.01.JAVADOC.01]
     *
     * [�֘A�Â��郉�C�^�B] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Arg01Javadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â��郉�C�^�B";
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
     * bundle[BlancoCsvWriter], key[WRITETITLE.JAVADOC.01]
     *
     * [CSV�t�@�C���̃^�C�g���s�������o���܂��B] (ja)<br>
     *
     * @return key[WRITETITLE.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWritetitleJavadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "CSV�t�@�C���̃^�C�g���s�������o���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITETITLE.JAVADOC.02]
     *
     * [�^�C�g���̓f���~�^�ŋ�؂��Ȃ��烉�C�^�ɏo�͂���A�Ō�ɉ��s�R�[�h���t�^����܂��B&lt;br&gt;] (ja)<br>
     *
     * @return key[WRITETITLE.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWritetitleJavadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^�C�g���̓f���~�^�ŋ�؂��Ȃ��烉�C�^�ɏo�͂���A�Ō�ɉ��s�R�[�h���t�^����܂��B<br>";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITETITLE.JAVADOC.03]
     *
     * [�^�C�g���̓_�u���N�I�[�e�[�V�����ň͂܂�܂��B] (ja)<br>
     *
     * @return key[WRITETITLE.JAVADOC.03]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWritetitleJavadoc03() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^�C�g���̓_�u���N�I�[�e�[�V�����ň͂܂�܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.JAVADOC.03");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITETITLE.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[WRITETITLE.THROWS.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWritetitleThrows01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITETITLE.THROWS.01.JAVADOC]
     *
     * [�֘A�Â���ꂽ���C�^�o�͂̍ۂɗ�O�����������ꍇ�B] (ja)<br>
     *
     * @return key[WRITETITLE.THROWS.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWritetitleThrows01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���C�^�o�͂̍ۂɗ�O�����������ꍇ�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITETITLE.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.JAVADOC.01]
     *
     * [�^����ꂽ��s�������o���܂��B] (ja)<br>
     *
     * @return key[WRITERECORD.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWriterecordJavadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^����ꂽ��s�������o���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.JAVADOC.02]
     *
     * [�f�[�^�̓f���~�^�ŋ�؂��Ȃ��烉�C�^�ɏo�͂���A�Ō�ɉ��s�R�[�h���t�^����܂��B] (ja)<br>
     *
     * @return key[WRITERECORD.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWriterecordJavadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�f�[�^�̓f���~�^�ŋ�؂��Ȃ��烉�C�^�ɏo�͂���A�Ō�ɉ��s�R�[�h���t�^����܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.ARG.01.JAVADOC]
     *
     * [���R�[�h�I�u�W�F�N�g�B] (ja)<br>
     *
     * @return key[WRITERECORD.ARG.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWriterecordArg01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���R�[�h�I�u�W�F�N�g�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.ARG.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.THROWS.01.JAVADOC]
     *
     * [�^����ꂽ���R�[�h���̍��ڒl���s���ȏꍇ�ȂǁB] (ja)<br>
     *
     * @return key[WRITERECORD.THROWS.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWriterecordThrows01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^����ꂽ���R�[�h���̍��ڒl���s���ȏꍇ�ȂǁB";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.THROWS.02.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[WRITERECORD.THROWS.02.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWriterecordThrows02Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.THROWS.02.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.THROWS.02.JAVADOC]
     *
     * [�֘A�Â���ꂽ���C�^�o�͂̍ۂɗ�O�����������ꍇ�B] (ja)<br>
     *
     * @return key[WRITERECORD.THROWS.02.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWriterecordThrows02Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���C�^�o�͂̍ۂɗ�O�����������ꍇ�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.THROWS.02.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.LINE.01]
     *
     * [// {0}���ږ�[{1}]] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[WRITERECORD.LINE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWriterecordLine01(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// {0}���ږ�[{1}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.LINE.01");
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
     * bundle[BlancoCsvWriter], key[WRITERECORD.LINE.02]
     *
     * [// �_�u���N�I�[�g�����t���ŏ����o�����s���܂��B] (ja)<br>
     *
     * @return key[WRITERECORD.LINE.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWriterecordLine02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �_�u���N�I�[�g�����t���ŏ����o�����s���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[WRITERECORD.LINE.03]
     *
     * [// �Ō�ɉ��s�R�[�h���t�^����܂��B] (ja)<br>
     *
     * @return key[WRITERECORD.LINE.03]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getWriterecordLine03() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �Ō�ɉ��s�R�[�h���t�^����܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("WRITERECORD.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FLUSH.JAVADOC.01]
     *
     * [���̃��C�^���t���b�V�����܂��B] (ja)<br>
     *
     * @return key[FLUSH.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFlushJavadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̃��C�^���t���b�V�����܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FLUSH.JAVADOC.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FLUSH.JAVADOC.02]
     *
     * [�֘A�Â���ꂽ���C�^�ɑ΂��Ă�flush()���Ăяo���܂��B] (ja)<br>
     *
     * @return key[FLUSH.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFlushJavadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���C�^�ɑ΂��Ă�flush()���Ăяo���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FLUSH.JAVADOC.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FLUSH.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[FLUSH.THROWS.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFlushThrows01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FLUSH.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[FLUSH.THROWS.01.JAVADOC]
     *
     * [�֘A�Â���ꂽ���C�^��flush()�Ɏ��s�����ꍇ�B] (ja)<br>
     *
     * @return key[FLUSH.THROWS.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFlushThrows01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���C�^��flush()�Ɏ��s�����ꍇ�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FLUSH.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvWriter], key[CLOSE.JAVADOC.01]
     *
     * [���̃��C�^����܂��B] (ja)<br>
     *
     * @return key[CLOSE.JAVADOC.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCloseJavadoc01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̃��C�^����܂��B";
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
     * bundle[BlancoCsvWriter], key[CLOSE.JAVADOC.02]
     *
     * [�֘A�Â���ꂽ���C�^�ɑ΂��Ă�close()���Ăяo���܂��B] (ja)<br>
     *
     * @return key[CLOSE.JAVADOC.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCloseJavadoc02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���C�^�ɑ΂��Ă�close()���Ăяo���܂��B";
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
     * bundle[BlancoCsvWriter], key[CLOSE.THROWS.01.TYPE]
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
     * bundle[BlancoCsvWriter], key[CLOSE.THROWS.01.JAVADOC]
     *
     * [�֘A�Â���ꂽ���C�^��close()�Ɏ��s�����ꍇ�B] (ja)<br>
     *
     * @return key[CLOSE.THROWS.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCloseThrows01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽ���C�^��close()�Ɏ��s�����ꍇ�B";
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
     * bundle[BlancoCsvWriter], key[GETLOCATIONSTRING.LINE.01]
     *
     * [�o��&quot; + (fLineCounter + 1) + &quot;�s�� {0}���ږځB{1}���ږ�[{2}]] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[GETLOCATIONSTRING.LINE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGetlocationstringLine01(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�o��\" + (fLineCounter + 1) + \"�s�� {0}���ږځB{1}���ږ�[{2}]";
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
