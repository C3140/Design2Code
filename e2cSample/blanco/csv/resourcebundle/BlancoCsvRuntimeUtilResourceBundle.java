/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.csv.resourcebundle;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * BlancoCsvRuntimeUtil�N���X�̃\�[�X�R�[�h�����̂��߂̃��\�[�X�o���h���ł��B
 *
 * ���\�[�X�o���h����`: [BlancoCsvRuntimeUtil]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvRuntimeUtilResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvRuntimeUtilResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvRuntimeUtil]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoCsvRuntimeUtilResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvRuntimeUtil");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvRuntimeUtilResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvRuntimeUtil]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoCsvRuntimeUtilResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvRuntimeUtil", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvRuntimeUtilResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvRuntimeUtil]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoCsvRuntimeUtilResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvRuntimeUtil", locale, loader);
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
     * bundle[BlancoCsvRuntimeUtil], key[PACKAGE.PREFIX]
     *
     * [.util] (ja)<br>
     *
     * @return key[PACKAGE.PREFIX]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getPackagePrefix() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = ".util";
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
     * bundle[BlancoCsvRuntimeUtil], key[CLASS_NAME]
     *
     * [BlancoCsvRuntimeUtil] (ja)<br>
     *
     * @return key[CLASS_NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClassName() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "BlancoCsvRuntimeUtil";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASS_NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[CLASSCOMMENT.01]
     *
     * [blancoCsv�ŗ��p������s�����[�e�B���e�B�N���X] (ja)<br>
     *
     * @return key[CLASSCOMMENT.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "blancoCsv�ŗ��p������s�����[�e�B���e�B�N���X";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CLASSCOMMENT.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[CLASSCOMMENT.02]
     *
     * [���̃t�@�C����blancoIg�ɂ�莩����������Ă��܂��B] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���̃t�@�C����blancoIg�ɂ�莩����������Ă��܂��B";
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
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.NAME]
     *
     * [readToken] (ja)<br>
     *
     * @return key[READTOKEN.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenName() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "readToken";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.JAVADOC]
     *
     * [�֘A�Â���ꂽReader���� �^����ꂽ�f���~�^���g���ăg�[�N�������o���܂��B] (ja)<br>
     *
     * @return key[READTOKEN.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenJavadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽReader���� �^����ꂽ�f���~�^���g���ăg�[�N�������o���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKEN.ARG.01.TYPE]
     *
     * [java.io.Reader] (ja)<br>
     *
     * @return key[_READTOKEN.ARG.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenArg01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.Reader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKEN.ARG.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKEN.ARG.01.NAME]
     *
     * [argReader] (ja)<br>
     *
     * @return key[_READTOKEN.ARG.01.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenArg01Name() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "argReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKEN.ARG.01.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKEN.ARG.01.JAVADOC]
     *
     * [�^����ꂽ���[�_] (ja)<br>
     *
     * @return key[_READTOKEN.ARG.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenArg01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^����ꂽ���[�_";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKEN.ARG.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.02.TYPE]
     *
     * [char] (ja)<br>
     *
     * @return key[READTOKEN.ARG.02.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenArg02Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "char";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.02.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.02.NAME]
     *
     * [delimiter] (ja)<br>
     *
     * @return key[READTOKEN.ARG.02.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenArg02Name() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "delimiter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.02.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.02.JAVADOC]
     *
     * [�f���~�^] (ja)<br>
     *
     * @return key[READTOKEN.ARG.02.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenArg02Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�f���~�^";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.02.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.03.TYPE]
     *
     * [boolean] (ja)<br>
     *
     * @return key[READTOKEN.ARG.03.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenArg03Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "boolean";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.03.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.03.NAME]
     *
     * [isEndOfLine] (ja)<br>
     *
     * @return key[READTOKEN.ARG.03.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenArg03Name() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "isEndOfLine";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.03.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.ARG.03.JAVADOC]
     *
     * [�s�̏I�[�ł���̂��ǂ����t���O] (ja)<br>
     *
     * @return key[READTOKEN.ARG.03.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenArg03Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�s�̏I�[�ł���̂��ǂ����t���O";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.ARG.03.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.RETURN.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[READTOKEN.RETURN.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenReturnType() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.lang.String";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.RETURN.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.RETURN.JAVADOC]
     *
     * [���o���ꂽ�g�[�N���B���͂⃊�[�_����̏ꍇ�ɂ�null��Ԃ��܂��B] (ja)<br>
     *
     * @return key[READTOKEN.RETURN.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenReturnJavadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���o���ꂽ�g�[�N���B���͂⃊�[�_����̏ꍇ�ɂ�null��Ԃ��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.RETURN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[READTOKEN.THROWS.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenThrows01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.THROWS.01.JAVADOC]
     *
     * [���o�͗�O�����������ꍇ�B] (ja)<br>
     *
     * @return key[READTOKEN.THROWS.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenThrows01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���o�͗�O�����������ꍇ�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.01]
     *
     * [final StringBuffer buffer = new StringBuffer();] (ja)<br>
     *
     * @return key[READTOKEN.LINE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "final StringBuffer buffer = new StringBuffer();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.02]
     *
     * [for (;;) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "for (;;) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.03]
     *
     * [final int iRead = fLineReader.read();] (ja)<br>
     *
     * @return key[READTOKEN.LINE.03]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine03() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "final int iRead = fLineReader.read();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.04]
     *
     * [if (iRead &lt; 0) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.04]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine04() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (iRead < 0) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.04");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.05]
     *
     * [// �I�[�ɓ��B�B] (ja)<br>
     *
     * @return key[READTOKEN.LINE.05]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine05() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �I�[�ɓ��B�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.05");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.06]
     *
     * [if (isEndOfLine == false) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.06]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine06() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (isEndOfLine == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.06");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.07]
     *
     * [throw new BlancoCsvIOException(&quot;�s�̏I�[�łȂ��̂ɂ��ւ�炸�f���~�^�����ꂸ�ɍs���I�����Ă��܂��܂����B&quot;);] (ja)<br>
     *
     * @return key[READTOKEN.LINE.07]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine07() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "throw new BlancoCsvIOException(\"�s�̏I�[�łȂ��̂ɂ��ւ�炸�f���~�^�����ꂸ�ɍs���I�����Ă��܂��܂����B\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.07");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.08]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.08]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine08() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.08");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.09]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKEN.LINE.09]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine09() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.09");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.10]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.10]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine10() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.10");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.11]
     *
     * [if (iRead == delimiter) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.11]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine11() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (iRead == delimiter) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.11");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.12]
     *
     * [if (isEndOfLine) {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.12]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine12() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (isEndOfLine) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.12");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.13]
     *
     * [throw new BlancoCsvIOException(&quot;�s�̏I�[�ł���ׂ��ɂ��ւ�炸�f���~�^������܂����B&quot;);] (ja)<br>
     *
     * @return key[READTOKEN.LINE.13]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine13() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "throw new BlancoCsvIOException(\"�s�̏I�[�ł���ׂ��ɂ��ւ�炸�f���~�^������܂����B\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.13");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.14]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.14]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine14() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.14");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.15]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKEN.LINE.15]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine15() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.15");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.16]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKEN.LINE.16]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine16() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.16");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.17]
     *
     * [buffer.append((char) iRead);] (ja)<br>
     *
     * @return key[READTOKEN.LINE.17]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine17() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "buffer.append((char) iRead);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.17");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.18]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.18]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine18() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.18");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.19]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKEN.LINE.19]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine19() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.19");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKEN.LINE.20]
     *
     * [return buffer.toString();] (ja)<br>
     *
     * @return key[READTOKEN.LINE.20]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenLine20() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "return buffer.toString();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKEN.LINE.20");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.NAME]
     *
     * [readTokenWithQuote] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteName() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "readTokenWithQuote";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.JAVADOC]
     *
     * [�֘A�Â���ꂽReader���� �_�u���N�I�[�g�����t���� �^����ꂽ�f���~�^���g���ăg�[�N�������o���܂��B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteJavadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�֘A�Â���ꂽReader���� �_�u���N�I�[�g�����t���� �^����ꂽ�f���~�^���g���ăg�[�N�������o���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKENWITHQUOTE.ARG.01.TYPE]
     *
     * [java.io.Reader] (ja)<br>
     *
     * @return key[_READTOKENWITHQUOTE.ARG.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteArg01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.Reader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKENWITHQUOTE.ARG.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKENWITHQUOTE.ARG.01.NAME]
     *
     * [argReader] (ja)<br>
     *
     * @return key[_READTOKENWITHQUOTE.ARG.01.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteArg01Name() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "argReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKENWITHQUOTE.ARG.01.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[_READTOKENWITHQUOTE.ARG.01.JAVADOC]
     *
     * [�^����ꂽ���[�_] (ja)<br>
     *
     * @return key[_READTOKENWITHQUOTE.ARG.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteArg01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^����ꂽ���[�_";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("_READTOKENWITHQUOTE.ARG.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.02.TYPE]
     *
     * [char] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.02.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteArg02Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "char";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.02.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.02.NAME]
     *
     * [delimiter] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.02.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteArg02Name() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "delimiter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.02.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.02.JAVADOC]
     *
     * [�f���~�^] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.02.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteArg02Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�f���~�^";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.02.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.03.TYPE]
     *
     * [boolean] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.03.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteArg03Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "boolean";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.03.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.03.NAME]
     *
     * [isEndOfLine] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.03.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteArg03Name() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "isEndOfLine";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.03.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.ARG.03.JAVADOC]
     *
     * [�s�̏I�[�ł���̂��ǂ����t���O] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.ARG.03.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteArg03Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�s�̏I�[�ł���̂��ǂ����t���O";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.ARG.03.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.RETURN.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.RETURN.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteReturnType() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.lang.String";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.RETURN.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.RETURN.JAVADOC]
     *
     * [���o���ꂽ�g�[�N���B���͂⃊�[�_����̏ꍇ�ɂ�null��Ԃ��܂��B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.RETURN.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteReturnJavadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���o���ꂽ�g�[�N���B���͂⃊�[�_����̏ꍇ�ɂ�null��Ԃ��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.RETURN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.THROWS.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteThrows01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.THROWS.01.JAVADOC]
     *
     * [���o�͗�O�����������ꍇ�B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.THROWS.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteThrows01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���o�͗�O�����������ꍇ�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.01]
     *
     * [final StringBuffer buffer = new StringBuffer();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "final StringBuffer buffer = new StringBuffer();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.02]
     *
     * [boolean isStringStarted = false;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "boolean isStringStarted = false;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.03]
     *
     * [boolean isStringEnded = false;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.03]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine03() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "boolean isStringEnded = false;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.04]
     *
     * [for (;;) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.04]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine04() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "for (;;) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.04");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.05]
     *
     * [int iRead = fLineReader.read();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.05]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine05() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "int iRead = fLineReader.read();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.05");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.06]
     *
     * [if (iRead &lt; 0) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.06]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine06() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (iRead < 0) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.06");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.07]
     *
     * [// �I�[�ɓ��B�B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.07]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine07() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �I�[�ɓ��B�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.07");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.08]
     *
     * [if (isStringStarted &amp;&amp; isStringEnded == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.08]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine08() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (isStringStarted && isStringEnded == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.08");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.09]
     *
     * [// ���s���o�́B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.09]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine09() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// ���s���o�́B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.09");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.10]
     *
     * [buffer.append('\n');] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.10]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine10() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "buffer.append('\\n');";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.10");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.11]
     *
     * [// �_�u���N�I�[�g���B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.11]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine11() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �_�u���N�I�[�g���B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.11");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.12]
     *
     * [fLine = fReader.readLine();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.12]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine12() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "fLine = fReader.readLine();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.12");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.13]
     *
     * [if (fLine == null) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.13]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine13() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (fLine == null) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.13");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.14]
     *
     * [// �_�u���N�I�[�g���ł���̂ɂ�������炸�t�@�C���̏I�[�ɓ��B���܂����B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.14]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine14() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �_�u���N�I�[�g���ł���̂ɂ�������炸�t�@�C���̏I�[�ɓ��B���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.14");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.15]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.15]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine15() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.15");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.16]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.16]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine16() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.16");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.17]
     *
     * [fLineReader = new StringReader(fLine);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.17]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine17() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "fLineReader = new StringReader(fLine);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.17");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.18]
     *
     * [continue;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.18]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine18() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "continue;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.18");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.19]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.19]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine19() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.19");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.20]
     *
     * [} else if (isEndOfLine == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.20]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine20() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "} else if (isEndOfLine == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.20");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.21]
     *
     * [    throw new BlancoCsvIOException(&quot;�s�̏I�[�łȂ��̂ɂ��ւ�炸�f���~�^�����ꂸ�ɍs���I�����Ă��܂��܂����B&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.21]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine21() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "    throw new BlancoCsvIOException(\"�s�̏I�[�łȂ��̂ɂ��ւ�炸�f���~�^�����ꂸ�ɍs���I�����Ă��܂��܂����B\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.21");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.22]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.22]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine22() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.22");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.23]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.23]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine23() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.23");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.24]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.24]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine24() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.24");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.25]
     *
     * [if (isStringStarted == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.25]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine25() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (isStringStarted == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.25");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.26]
     *
     * [if (iRead != '&quot;') {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.26]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine26() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (iRead != '\"') {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.26");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.27]
     *
     * [throw new BlancoCsvIOException(&quot;�_�u���N�I�[�g�����ŕ����񂪊J�n����܂����B&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.27]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine27() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "throw new BlancoCsvIOException(\"�_�u���N�I�[�g�����ŕ����񂪊J�n����܂����B\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.27");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.28]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.28]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine28() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.28");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.29]
     *
     * [// �_�u���N�I�[�e�[�V�����͓ǂݔ�΂��܂��B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.29]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine29() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �_�u���N�I�[�e�[�V�����͓ǂݔ�΂��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.29");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.30]
     *
     * [isStringStarted = true;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.30]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine30() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "isStringStarted = true;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.30");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.31]
     *
     * [} else if (isStringEnded) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.31]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine31() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "} else if (isStringEnded) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.31");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.32]
     *
     * [if (iRead == delimiter) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.32]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine32() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (iRead == delimiter) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.32");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.33]
     *
     * [// ������I�[�ɓ��B���܂����B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.33]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine33() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// ������I�[�ɓ��B���܂����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.33");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.34]
     *
     * [if (isEndOfLine) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.34]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine34() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (isEndOfLine) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.34");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.35]
     *
     * [    throw new BlancoCsvIOException(&quot;�s�̏I�[�ł���ׂ��ɂ��ւ�炸�f���~�^������܂����B&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.35]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine35() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "    throw new BlancoCsvIOException(\"�s�̏I�[�ł���ׂ��ɂ��ւ�炸�f���~�^������܂����B\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.35");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.36]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.36]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine36() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.36");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.37]
     *
     * [break;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.37]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine37() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.37");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.38]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.38]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine38() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.38");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.39]
     *
     * [throw new BlancoCsvIOException(&quot;�_�u���N�I�[�g�ɂ�镶����I������ɕ����񂪗^�����܂����B&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.39]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine39() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "throw new BlancoCsvIOException(\"�_�u���N�I�[�g�ɂ�镶����I������ɕ����񂪗^�����܂����B\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.39");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.40]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.40]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine40() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.40");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.41]
     *
     * [// �ʏ�̕�����G���A] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.41]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine41() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �ʏ�̕�����G���A";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.41");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.42]
     *
     * [if (iRead == '&quot;') {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.42]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine42() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (iRead == '\"') {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.42");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.43]
     *
     * [// �_�u���N�I�[�g���d�˂�ꂽ���̂łȂ����ǂ����`�F�b�N���܂��B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.43]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine43() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �_�u���N�I�[�g���d�˂�ꂽ���̂łȂ����ǂ����`�F�b�N���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.43");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.44]
     *
     * [fLineReader.mark(1);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.44]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine44() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "fLineReader.mark(1);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.44");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.45]
     *
     * [if (fLineReader.read() == '&quot;') {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.45]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine45() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (fLineReader.read() == '\"') {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.45");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.46]
     *
     * [// �G�X�P�[�v���ꂽ�_�u���N�I�[�g] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.46]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine46() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �G�X�P�[�v���ꂽ�_�u���N�I�[�g";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.46");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.47]
     *
     * [// 2�łЂƂȂ̂ŁA�ЂƂ͓ǂݎ̂Ă܂��B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.47]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine47() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// 2�łЂƂȂ̂ŁA�ЂƂ͓ǂݎ̂Ă܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.47");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.48]
     *
     * [buffer.append((char) iRead);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.48]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine48() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "buffer.append((char) iRead);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.48");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.49]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.49]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine49() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.49");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.50]
     *
     * [// �_�u���N�I�[�g�ɂ��G�X�P�[�v�ł͂���܂���ł����B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.50]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine50() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �_�u���N�I�[�g�ɂ��G�X�P�[�v�ł͂���܂���ł����B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.50");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.51]
     *
     * [// ����͏I�[���Ӗ����Ă��܂��B] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.51]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine51() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// ����͏I�[���Ӗ����Ă��܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.51");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.52]
     *
     * [fLineReader.reset();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.52]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine52() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "fLineReader.reset();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.52");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.53]
     *
     * [isStringEnded = true;] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.53]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine53() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "isStringEnded = true;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.53");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.54]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.54]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine54() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.54");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.55]
     *
     * [} else {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.55]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine55() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.55");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.56]
     *
     * [buffer.append((char) iRead);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.56]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine56() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "buffer.append((char) iRead);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.56");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.57]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.57]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine57() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.57");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.58]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.58]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine58() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.58");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.59]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.59]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine59() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.59");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.60]
     *
     * [if (isStringStarted == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.60]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine60() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (isStringStarted == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.60");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.61]
     *
     * [throw new BlancoCsvIOException(&quot;�_�u���N�I�[�g���K�v�ȕ�����ł���̂Ƀ_�u���N�I�[�g�ɂ��J�n������܂���ł����B&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.61]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine61() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "throw new BlancoCsvIOException(\"�_�u���N�I�[�g���K�v�ȕ�����ł���̂Ƀ_�u���N�I�[�g�ɂ��J�n������܂���ł����B\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.61");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.62]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.62]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine62() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.62");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.63]
     *
     * [if (isStringEnded == false) {] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.63]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine63() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (isStringEnded == false) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.63");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.64]
     *
     * [throw new BlancoCsvIOException(&quot;�_�u���N�I�[�g���K�v�ȕ�����ł���̂Ƀ_�u���N�I�[�g�ɂ��I��������܂���ł����B&quot;);] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.64]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine64() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "throw new BlancoCsvIOException(\"�_�u���N�I�[�g���K�v�ȕ�����ł���̂Ƀ_�u���N�I�[�g�ɂ��I��������܂���ł����B\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.64");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.65]
     *
     * [}] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.65]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine65() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.65");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[READTOKENWITHQUOTE.LINE.66]
     *
     * [return buffer.toString();] (ja)<br>
     *
     * @return key[READTOKENWITHQUOTE.LINE.66]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getReadtokenwithquoteLine66() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "return buffer.toString();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("READTOKENWITHQUOTE.LINE.66");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.NAME]
     *
     * [getTokenWithQuote] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteName() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "getTokenWithQuote";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.JAVADOC]
     *
     * [�_�u���N�I�[�g�G�X�P�[�v�����t���̕�������擾���܂�] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteJavadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�_�u���N�I�[�g�G�X�P�[�v�����t���̕�������擾���܂�";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.ARG.01.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.ARG.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteArg01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.lang.String";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.ARG.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.ARG.01.JAVADOC]
     *
     * [�����o������������] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.ARG.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteArg01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�����o������������";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.ARG.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.RETURN.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.RETURN.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteReturnType() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.lang.String";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.RETURN.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.RETURN.JAVADOC]
     *
     * [�_�u���N�I�[�g�G�X�P�[�v�����t���̕�����] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.RETURN.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteReturnJavadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�_�u���N�I�[�g�G�X�P�[�v�����t���̕�����";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.RETURN.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.THROWS.01.TYPE]
     *
     * [java.io.IOException] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.THROWS.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteThrows01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.IOException";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.THROWS.01.TYPE");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.THROWS.01.JAVADOC]
     *
     * [���o�͗�O�Ȃǂ����������ꍇ�B] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.THROWS.01.JAVADOC]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteThrows01Javadoc() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "���o�͗�O�Ȃǂ����������ꍇ�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.THROWS.01.JAVADOC");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.ADDUSINGTYPE.01]
     *
     * [java.io.StringWriter] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.ADDUSINGTYPE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteAddusingtype01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.StringWriter";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.ADDUSINGTYPE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.ADDUSINGTYPE.02]
     *
     * [java.io.StringReader] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.ADDUSINGTYPE.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteAddusingtype02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.io.StringReader";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.ADDUSINGTYPE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.01]
     *
     * [final StringWriter writer = new StringWriter();] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "final StringWriter writer = new StringWriter();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.02]
     *
     * [writer.write(&quot;\&quot;&quot;);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "writer.write(\"\\\"\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.02");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.03]
     *
     * [] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.03]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine03() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.03");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.04]
     *
     * [final StringReader reader = new StringReader(value);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.04]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine04() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "final StringReader reader = new StringReader(value);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.04");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.05]
     *
     * [for (;;) {] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.05]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine05() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "for (;;) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.05");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.06]
     *
     * [final int iRead = reader.read();] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.06]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine06() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "final int iRead = reader.read();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.06");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.07]
     *
     * [if (iRead &lt; 0) {] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.07]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine07() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (iRead < 0) {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.07");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.08]
     *
     * [// �I�[�ɓ��B�B] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.08]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine08() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �I�[�ɓ��B�B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.08");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.09]
     *
     * [break;] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.09]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine09() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "break;";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.09");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.10]
     *
     * [}] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.10]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine10() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.10");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.11]
     *
     * [if (iRead == '\&quot;') {] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.11]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine11() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "if (iRead == '\\\"') {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.11");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.12]
     *
     * [// �_�u���N�I�[�g�͓�d�ŏ����o���܂��B] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.12]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine12() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "// �_�u���N�I�[�g�͓�d�ŏ����o���܂��B";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.12");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.13]
     *
     * [writer.write(&quot;\&quot;\&quot;&quot;);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.13]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine13() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "writer.write(\"\\\"\\\"\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.13");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.14]
     *
     * [} else {] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.14]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine14() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "} else {";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.14");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.15]
     *
     * [writer.write((char) iRead);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.15]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine15() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "writer.write((char) iRead);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.15");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.16]
     *
     * [}] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.16]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine16() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.16");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.17]
     *
     * [}] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.17]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine17() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "}";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.17");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.18]
     *
     * [] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.18]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine18() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.18");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.19]
     *
     * [writer.write(&quot;\&quot;&quot;);] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.19]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine19() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "writer.write(\"\\\"\");";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.19");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.20]
     *
     * [writer.close();] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.20]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine20() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "writer.close();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.20");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvRuntimeUtil], key[GETTOKENWITHQUOTE.LINE.21]
     *
     * [return writer.toString();] (ja)<br>
     *
     * @return key[GETTOKENWITHQUOTE.LINE.21]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getGettokenwithquoteLine21() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "return writer.toString();";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("GETTOKENWITHQUOTE.LINE.21");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }
}
