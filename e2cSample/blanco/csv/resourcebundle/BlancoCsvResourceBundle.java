/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.csv.resourcebundle;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * blancoCsv�̊�{�I�ȃ��b�Z�[�W���\�[�X��~���܂��B
 *
 * ���\�[�X�o���h����`: [BlancoCsv]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsv]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoCsvResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsv");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsv]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoCsvResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsv", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsv]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoCsvResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsv", locale, loader);
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
     * bundle[BlancoCsv], key[METAFILE_DISPLAYNAME]
     *
     * [�t�@�C����`��(CSV)] (ja)<br>
     *
     * @return key[METAFILE_DISPLAYNAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMetafileDisplayname() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`��(CSV)";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("METAFILE_DISPLAYNAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsv], key[META2XML.ELEMENT_COMMON]
     *
     * [blancocsv-common] (ja)<br>
     *
     * @return key[META2XML.ELEMENT_COMMON]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMeta2xmlElementCommon() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "blancocsv-common";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.ELEMENT_COMMON");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsv], key[META2XML.ELEMENT_LIST]
     *
     * [blancocsv-fieldList] (ja)<br>
     *
     * @return key[META2XML.ELEMENT_LIST]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getMeta2xmlElementList() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "blancocsv-fieldList";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("META2XML.ELEMENT_LIST");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsv], key[CSV_READER.ERR001]
     *
     * [{0}�̏������ɂ����ĕs���ȏI�[�����m���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_READER.ERR001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvReaderErr001(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ����ĕs���ȏI�[�����m���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR001");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR002]
     *
     * [{0}�̏������ɂ�����MIN����({1})�����Z���l[&quot; + tokenString + &quot;]�����m���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_READER.ERR002]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvReaderErr002(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ�����MIN����({1})�����Z���l[\" + tokenString + \"]�����m���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR002");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR003]
     *
     * [{0}�̏������ɂ�����MAX����({1})���������l[&quot; + tokenString + &quot;]�����m���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_READER.ERR003]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvReaderErr003(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ�����MAX����({1})���������l[\" + tokenString + \"]�����m���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR003");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR004]
     *
     * [{0}�̏������ɂ����Đ��l(int)�Ƃ��Ă͉�͂ł��Ȃ�����[&quot; + tokenString + &quot;]�����m���܂����B:] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_READER.ERR004]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvReaderErr004(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ����Đ��l(int)�Ƃ��Ă͉�͂ł��Ȃ�����[\" + tokenString + \"]�����m���܂����B:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR004");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR005]
     *
     * [{0}�̏������ɂ����Đ��l(long)�Ƃ��Ă͉�͂ł��Ȃ�����[&quot; + tokenString + &quot;]�����m���܂����B:] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_READER.ERR005]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvReaderErr005(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ����Đ��l(long)�Ƃ��Ă͉�͂ł��Ȃ�����[\" + tokenString + \"]�����m���܂����B:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR005");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR006]
     *
     * [{0}�̏������ɂ����ė^����ꂽ�`��[&quot; + fSimpleDateFormat{1}.toPattern() + &quot;]�ł͉�͂ł��Ȃ�������[&quot; + tokenString + &quot;]�����m���܂����B:] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_READER.ERR006]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvReaderErr006(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ����ė^����ꂽ�`��[\" + fSimpleDateFormat{1}.toPattern() + \"]�ł͉�͂ł��Ȃ�������[\" + tokenString + \"]�����m���܂����B:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR006");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR007]
     *
     * [{0}�̏������ɂ����Đ��l(decimal)�Ƃ��Ă͉�͂ł��Ȃ�����[&quot; + tokenString + &quot;]�����m���܂����B:] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_READER.ERR007]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvReaderErr007(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ����Đ��l(decimal)�Ƃ��Ă͉�͂ł��Ȃ�����[\" + tokenString + \"]�����m���܂����B:";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR007");
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
     * bundle[BlancoCsv], key[CSV_READER.ERR008]
     *
     * [{0}�̏������ɂ����ĕK�{���ڂɒl�������Ă��Ȃ����Ƃ����m���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_READER.ERR008]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvReaderErr008(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ����ĕK�{���ڂɒl�������Ă��Ȃ����Ƃ����m���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_READER.ERR008");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR001]
     *
     * [{0}�̏������ɂ�����MIN����({1})�����Z���l[&quot; + writeToken + &quot;]�����m���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_WRITER.ERR001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvWriterErr001(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ�����MIN����({1})�����Z���l[\" + writeToken + \"]�����m���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR001");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR002]
     *
     * [{0}�̏������ɂ�����MAX����({1})���������l[&quot; + writeToken + &quot;]�����m���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_WRITER.ERR002]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvWriterErr002(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ�����MAX����({1})���������l[\" + writeToken + \"]�����m���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR002");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR003]
     *
     * [{0}�̏������ɂ����ăf�[�^��[&quot; + writeToken + &quot;]�ɍ��ڂ̃f���~�^[{1}]���܂܂�邱�Ƃ����m���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_WRITER.ERR003]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvWriterErr003(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ����ăf�[�^��[\" + writeToken + \"]�ɍ��ڂ̃f���~�^[{1}]���܂܂�邱�Ƃ����m���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR003");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR004]
     *
     * [{0}�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_WRITER.ERR004]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvWriterErr004(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR004");
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
     * bundle[BlancoCsv], key[CSV_WRITER.ERR005]
     *
     * [{0}�̏������ɂ����ĕK�{���ڂɒ���0�̕����񂪗^�����Ă��邱�Ƃ����m���܂����B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[CSV_WRITER.ERR005]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getCsvWriterErr005(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "{0}�̏������ɂ����ĕK�{���ڂɒ���0�̕����񂪗^�����Ă��邱�Ƃ����m���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CSV_WRITER.ERR005");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR001]
     *
     * [�t�@�C����`��(CSV) �t�@�C����`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr001(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`��(CSV) �t�@�C����`ID[{0}]�̃p�b�P�[�W�����w�肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR001");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR002]
     *
     * [�t�@�C����`��(CSV) �t�@�C����`ID[{0}]�̃f���~�^���w�肳��Ă��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR002]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr002(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`��(CSV) �t�@�C����`ID[{0}]�̃f���~�^���w�肳��Ă��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR002");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR003]
     *
     * [�t�@�C����`��(CSV) �t�@�C����`ID[{0}]�́u�f���~�^�v���u�C�ӎw��v�ɐݒ肷��ꍇ�ɂ́A�u�C�ӎw��f���~�^�����v���w�肷��K�v������܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR003]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr003(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`��(CSV) �t�@�C����`ID[{0}]�́u�f���~�^�v���u�C�ӎw��v�ɐݒ肷��ꍇ�ɂ́A�u�C�ӎw��f���~�^�����v���w�肷��K�v������܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR003");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR004]
     *
     * [�t�@�C����`ID[{0}] ����[{1}]�́u�^�v���w�肳��Ă��܂���B�u�^�v���w�肵�Ă��������B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR004]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr004(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`ID[{0}] ����[{1}]�́u�^�v���w�肳��Ă��܂���B�u�^�v���w�肵�Ă��������B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR004");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR005]
     *
     * [�t�@�C����`ID[{0}] ����[{1}]�́u�����^�v�ł����A�u�����v���w�肳��Ă��܂���B�u�����^�v�̏ꍇ�́u�����v���w�肵�Ă��������B\n��: [yyyy/MM/dd HH:mm:ss]�̂悤�Ɏw�肵�܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR005]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr005(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`ID[{0}] ����[{1}]�́u�����^�v�ł����A�u�����v���w�肳��Ă��܂���B�u�����^�v�̏ꍇ�́u�����v���w�肵�Ă��������B\n��: [yyyy/MM/dd HH:mm:ss]�̂悤�Ɏw�肵�܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR005");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR006]
     *
     * [�t�@�C����`ID[{0}] ����[{1}]�́u�����^�v�ł͂���܂��񂪁A�u�����v���w�肳��Ă��܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR006]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr006(final String arg0, final String arg1) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`ID[{0}] ����[{1}]�́u�����^�v�ł͂���܂��񂪁A�u�����v���w�肳��Ă��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR006");
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
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR007]
     *
     * [�t�@�C����`ID[{0}] ����[{1}]�́uMIN���v�ɕ��̒l[{2}]���^�����܂����B0�ȏ�̐����l��ݒ肵�Ă��������B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR007]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr007(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`ID[{0}] ����[{1}]�́uMIN���v�ɕ��̒l[{2}]���^�����܂����B0�ȏ�̐����l��ݒ肵�Ă��������B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR007");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR008]
     *
     * [�t�@�C����`ID[{0}] ����[{1}]�́uMIN���v�ɐ����Ƃ��ď�������Ȃ��l[{2}]���^�����܂����B0�ȏ�̐�����ݒ肵�Ă��������B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR008]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr008(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`ID[{0}] ����[{1}]�́uMIN���v�ɐ����Ƃ��ď�������Ȃ��l[{2}]���^�����܂����B0�ȏ�̐�����ݒ肵�Ă��������B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR008");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR009]
     *
     * [�t�@�C����`ID[{0}] ����[{1}]�́uMAX���v�ɕ��̒l[{2}]���^�����܂����B0�ȏ�̐����l��ݒ肵�Ă��������B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR009]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr009(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`ID[{0}] ����[{1}]�́uMAX���v�ɕ��̒l[{2}]���^�����܂����B0�ȏ�̐����l��ݒ肵�Ă��������B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR009");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR010]
     *
     * [�t�@�C����`ID[{0}] ����[{1}]�́uMAX���v�ɐ����Ƃ��ď�������Ȃ��l[{2}]���^�����܂����B0�ȏ�̐�����ݒ肵�Ă��������B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR010]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr010(final String arg0, final String arg1, final String arg2) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`ID[{0}] ����[{1}]�́uMAX���v�ɐ����Ƃ��ď�������Ȃ��l[{2}]���^�����܂����B0�ȏ�̐�����ݒ肵�Ă��������B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR010");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[XML2JAVACLASS.ERR011]
     *
     * [�t�@�C����`ID[{0}] ����[{1}]�́uMIN���v({2})�ƁuMAX���v({3})�̑召�֌W���s���ł��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg1 �u��������{1}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg2 �u��������{2}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @param arg3 �u��������{3}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[XML2JAVACLASS.ERR011]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getXml2javaclassErr011(final String arg0, final String arg1, final String arg2, final String arg3) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�t�@�C����`ID[{0}] ����[{1}]�́uMIN���v({2})�ƁuMAX���v({3})�̑召�֌W���s���ł��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("XML2JAVACLASS.ERR011");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0, arg1, arg2, arg3}, strbuf, null);
        return strbuf.toString();
    }

    /**
     * bundle[BlancoCsv], key[FIELD_NO]
     *
     * [���ڔԍ�[{0}]] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[FIELD_NO]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getFieldNo(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���ڔԍ�[{0}]";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("FIELD_NO");
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
     * bundle[BlancoCsv], key[NOT_SUPPORTED_TYPE]
     *
     * [// TODO: �x��: �T�|�[�g���Ȃ��^[{0}]���^�����܂����B�������X�L�b�v���܂��B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[NOT_SUPPORTED_TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getNotSupportedType(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// TODO: �x��: �T�|�[�g���Ȃ��^[{0}]���^�����܂����B�������X�L�b�v���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("NOT_SUPPORTED_TYPE");
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
     * bundle[BlancoCsv], key[ANTTASK.ERR001]
     *
     * [���^�f�B���N�g��[{0}]�����݂��܂���B] (ja)<br>
     *
     * @param arg0 �u��������{0}��u������l�Bjava.lang.String�^��^���Ă��������B
     * @return key[ANTTASK.ERR001]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getAnttaskErr001(final String arg0) {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���^�f�B���N�g��[{0}]�����݂��܂���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("ANTTASK.ERR001");
            }
        } catch (MissingResourceException ex) {
        }
        final MessageFormat messageFormat = new MessageFormat(strFormat);
        final StringBuffer strbuf = new StringBuffer();
        // �^����ꂽ���������ɒu���������u�������܂��B
        messageFormat.format(new Object[] {arg0}, strbuf, null);
        return strbuf.toString();
    }
}
