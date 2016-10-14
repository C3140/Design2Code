/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.csv.resourcebundle;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * BlancoCsvIOException�N���X�̃\�[�X�R�[�h�����̂��߂̃��\�[�X�o���h���ł��B
 *
 * ���\�[�X�o���h����`: [BlancoCsvIOException]�B<BR>
 * ���̃N���X�̓��\�[�X�o���h����`�����玩���������ꂽ���\�[�X�o���h���N���X�ł��B<BR>
 * ���m�̃��P�[��<BR>
 * <UL>
 * <LI>ja
 * </UL>
 */
public class BlancoCsvIOExceptionResourceBundle {
    /**
     * ���\�[�X�o���h���I�u�W�F�N�g�B
     *
     * �����I�Ɏ��ۂɓ��͂��s�����\�[�X�o���h�����L�����܂��B
     */
    private ResourceBundle fResourceBundle;

    /**
     * BlancoCsvIOExceptionResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvIOException]�A�f�t�H���g�̃��P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     */
    public BlancoCsvIOExceptionResourceBundle() {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvIOException");
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvIOExceptionResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvIOException]�A�w�肳�ꂽ���P�[���A�Ăяo�����̃N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     */
    public BlancoCsvIOExceptionResourceBundle(final Locale locale) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvIOException", locale);
        } catch (MissingResourceException ex) {
        }
    }

    /**
     * BlancoCsvIOExceptionResourceBundle�N���X�̃R���X�g���N�^�B
     *
     * ��ꖼ[BlancoCsvIOException]�A�w�肳�ꂽ���P�[���A�w�肳�ꂽ�N���X���[�_���g�p���āA���\�[�X�o���h�����擾���܂��B
     *
     * @param locale ���P�[���̎w��
     * @param loader �N���X���[�_�̎w��
     */
    public BlancoCsvIOExceptionResourceBundle(final Locale locale, final ClassLoader loader) {
        try {
            fResourceBundle = ResourceBundle.getBundle("blanco/csv/resourcebundle/BlancoCsvIOException", locale, loader);
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
     * bundle[BlancoCsvIOException], key[PACKAGE.PREFIX]
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
     * bundle[BlancoCsvIOException], key[CLASS_NAME]
     *
     * [BlancoCsvIOException] (ja)<br>
     *
     * @return key[CLASS_NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClassName() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "BlancoCsvIOException";
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
     * bundle[BlancoCsvIOException], key[SUPERCLASS_NAME]
     *
     * [java.lang.Exception] (ja)<br>
     *
     * @return key[SUPERCLASS_NAME]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getSuperclassName() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.lang.Exception";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("SUPERCLASS_NAME");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }

    /**
     * bundle[BlancoCsvIOException], key[CLASSCOMMENT.01]
     *
     * [blancoCsv�����������N���X�����s���ɔ��������O�N���X�ł��B] (ja)<br>
     *
     * @return key[CLASSCOMMENT.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "blancoCsv�����������N���X�����s���ɔ��������O�N���X�ł��B";
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
     * bundle[BlancoCsvIOException], key[CLASSCOMMENT.02]
     *
     * [�^�E���`�F�b�N�̌��ʂ��ُ�ł������ꍇ�Ȃǂɂ��̗�O�͔������܂��B] (ja)<br>
     *
     * @return key[CLASSCOMMENT.02]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getClasscomment02() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "�^�E���`�F�b�N�̌��ʂ��ُ�ł������ꍇ�Ȃǂɂ��̗�O�͔������܂��B";
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
     * bundle[BlancoCsvIOException], key[CONSTRUCTOR.01.ARG.01.TYPE]
     *
     * [java.lang.String] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.ARG.01.TYPE]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Arg01Type() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "java.lang.String";
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
     * bundle[BlancoCsvIOException], key[CONSTRUCTOR.01.LINE.01]
     *
     * [super(message);] (ja)<br>
     *
     * @return key[CONSTRUCTOR.01.LINE.01]�ɑΉ�����l�B�O������ǂݍ��݂��ł��Ȃ��ꍇ�ɂ́A��`���̒l��߂��܂��B�K��null�ȊO�̒l���߂�܂��B
     */
    public String getConstructor01Line01() {
        // �����l�Ƃ��Ē�`���̒l�𗘗p���܂��B
        String strFormat = "super(message);";
        try {
            if (fResourceBundle != null) {
                strFormat = fResourceBundle.getString("CONSTRUCTOR.01.LINE.01");
            }
        } catch (MissingResourceException ex) {
        }
        // �u��������͂ЂƂ�����܂���B
        return strFormat;
    }
}
