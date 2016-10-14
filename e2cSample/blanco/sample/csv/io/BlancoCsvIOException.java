/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.sample.csv.io;

/**
 * blancoCsv�����������N���X�����s���ɔ��������O�N���X�ł��B
 *
 * �^�E���`�F�b�N�̌��ʂ��ُ�ł������ꍇ�Ȃǂɂ��̗�O�͔������܂��B
 */
@SuppressWarnings("serial")
public class BlancoCsvIOException extends Exception {
    /**
     * ���b�Z�[�W�𔺂�blancoCsv��O�N���X�𐶐����܂��B
     *
     * @param message ���b�Z�[�W�B
     */
    public BlancoCsvIOException(final String message) {
        super(message);
    }

    /**
     * ���b�Z�[�W����ь����𔺂�blancoCsv��O�N���X�𐶐����܂��B
     *
     * @param message ���b�Z�[�W�B
     * @param argCause �����ƂȂ��O�I�u�W�F�N�g�B
     */
    public BlancoCsvIOException(final String message, final Throwable argCause) {
        super(message, argCause);
    }
}
