/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.csv.task;

import java.io.IOException;

import blanco.csv.task.valueobject.BlancoCsvProcessInput;

/**
 * �o�b�`�����N���X [BlancoCsvBatchProcess]�B
 *
 * <P>�o�b�`�����̌Ăяo����B</P>
 * <code>
 * java -classpath (�N���X�p�X) blanco.csv.task.BlancoCsvBatchProcess -help
 * </code>
 */
public class BlancoCsvBatchProcess {
    /**
     * ����I���B
     */
    public static final int END_SUCCESS = 0;

    /**
     * ���ُ͈�I���B�����I��java.lang.IllegalArgumentException�����������ꍇ�B
     */
    public static final int END_ILLEGAL_ARGUMENT_EXCEPTION = 7;

    /**
     * ���o�͗�O�I���B�����I��java.io.IOException�����������ꍇ�B
     */
    public static final int END_IO_EXCEPTION = 8;

    /**
     * �ُ�I���B�o�b�`�̏����J�n�Ɏ��s�����ꍇ�A����ѓ����I��java.lang.Error�܂���java.lang.RuntimeException�����������ꍇ�B
     */
    public static final int END_ERROR = 9;

    /**
     * �R�}���h���C��������s���ꂽ�ۂ̃G���g���|�C���g�ł��B
     *
     * @param args �R���\�[����������p���ꂽ�����B
     */
    public static final void main(final String[] args) {
        final BlancoCsvBatchProcess batchProcess = new BlancoCsvBatchProcess();

        // �o�b�`�����̈����B
        final BlancoCsvProcessInput input = new BlancoCsvProcessInput();

        boolean isNeedUsage = false;
        boolean isFieldMetadirProcessed = false;

        // �R�}���h���C�������̉�͂������Ȃ��܂��B
        for (int index = 0; index < args.length; index++) {
            String arg = args[index];
            if (arg.startsWith("-verbose=")) {
                input.setVerbose(Boolean.valueOf(arg.substring(9)).booleanValue());
            } else if (arg.startsWith("-metadir=")) {
                input.setMetadir(arg.substring(9));
                isFieldMetadirProcessed = true;
            } else if (arg.startsWith("-targetdir=")) {
                input.setTargetdir(arg.substring(11));
            } else if (arg.startsWith("-tmpdir=")) {
                input.setTmpdir(arg.substring(8));
            } else if (arg.startsWith("-encoding=")) {
                input.setEncoding(arg.substring(10));
            } else if (arg.startsWith("-runtimepackage=")) {
                input.setRuntimepackage(arg.substring(16));
            } else if (arg.equals("-?") || arg.equals("-help")) {
                usage();
                System.exit(END_SUCCESS);
            } else {
                System.out.println("BlancoCsvBatchProcess: ���̓p�����[�^[" + arg + "]�͖�������܂����B");
                isNeedUsage = true;
            }
        }

        if (isNeedUsage) {
            usage();
        }

        if( isFieldMetadirProcessed == false) {
            System.out.println("BlancoCsvBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[metadir]�ɒl���ݒ肳��Ă��܂���B");
            System.exit(END_ILLEGAL_ARGUMENT_EXCEPTION);
        }

        int retCode = batchProcess.execute(input);

        // �I���R�[�h��߂��܂��B
        // �����ӁFSystem.exit()���Ăяo���Ă���_�ɒ��ӂ��Ă��������B
        System.exit(retCode);
    }

    /**
     * ��̓I�ȃo�b�`�������e���L�q���邽�߂̃��\�b�h�ł��B
     *
     * ���̃��\�b�h�Ɏ��ۂ̏������e���L�q���܂��B
     *
     * @param input �o�b�`�����̓��̓p�����[�^�B
     * @return �o�b�`�����̏I���R�[�h�BEND_SUCCESS, END_ILLEGAL_ARGUMENT_EXCEPTION, END_IO_EXCEPTION, END_ERROR �̂����ꂩ�̒l��߂��܂��B
     * @throws IOException ���o�͗�O�����������ꍇ�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    public int process(final BlancoCsvProcessInput input) throws IOException, IllegalArgumentException {
        // ���̓p�����[�^���`�F�b�N���܂��B
        validateInput(input);

        // ���̉ӏ��ŃR���p�C���G���[����������ꍇ�ABlancoCsvProcess�C���^�t�F�[�X���������� blanco.csv.task�p�b�P�[�W�� BlancoCsvProcessImpl�N���X���쐬���邱�Ƃɂ������ł���ꍇ������܂��B
        final BlancoCsvProcess process = new BlancoCsvProcessImpl();

        // �����̖{�̂����s���܂��B
        final int retCode = process.execute(input);

        return retCode;
    }

    /**
     * �N���X���C���X�^���X�����ăo�b�`�����s����ۂ̃G���g���|�C���g�ł��B
     *
     * ���̃��\�b�h�͉��L�̎d�l��񋟂��܂��B
     * <ul>
     * <li>���\�b�h�̓��̓p�����[�^�̓��e�`�F�b�N�B
     * <li>IllegalArgumentException, RuntimeException, Error�Ȃǂ̗�O��catch���Ė߂�l�ւƕϊ��B
     * </ul>
     *
     * @param input �o�b�`�����̓��̓p�����[�^�B
     * @return �o�b�`�����̏I���R�[�h�BEND_SUCCESS, END_ILLEGAL_ARGUMENT_EXCEPTION, END_IO_EXCEPTION, END_ERROR �̂����ꂩ�̒l��߂��܂��B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    public final int execute(final BlancoCsvProcessInput input) throws IllegalArgumentException {
        try {
            // �o�b�`�����̖{�̂����s���܂��B
            int retCode = process(input);

            return retCode;
        } catch (IllegalArgumentException ex) {
            System.out.println("BlancoCsvBatchProcess: ���͗�O���������܂����B�o�b�`�����𒆒f���܂��B:" + ex.toString());
            // ���ُ͈�I���B
            return END_ILLEGAL_ARGUMENT_EXCEPTION;
        } catch (IOException ex) {
            System.out.println("BlancoCsvBatchProcess: ���o�͗�O���������܂����B�o�b�`�����𒆒f���܂��B:" + ex.toString());
            // ���ُ͈�I���B
            return END_IO_EXCEPTION;
        } catch (RuntimeException ex) {
            System.out.println("BlancoCsvBatchProcess: �����^�C����O���������܂����B�o�b�`�����𒆒f���܂��B:" + ex.toString());
            ex.printStackTrace();
            // �ُ�I���B
            return END_ERROR;
        } catch (Error er) {
            System.out.println("BlancoCsvBatchProcess: �����^�C���G���[���������܂����B�o�b�`�����𒆒f���܂��B:" + er.toString());
            er.printStackTrace();
            // �ُ�I���B
            return END_ERROR;
        }
    }

    /**
     * ���̃o�b�`�����N���X�̎g�����̐�����W���o�͂Ɏ������߂̃��\�b�h�ł��B
     */
    public static final void usage() {
        System.out.println("BlancoCsvBatchProcess: Usage:");
        System.out.println("  java blanco.csv.task.BlancoCsvBatchProcess -verbose=�l1 -metadir=�l2 -targetdir=�l3 -tmpdir=�l4 -encoding=�l5 -runtimepackage=�l6");
        System.out.println("    -verbose");
        System.out.println("      ����[verbose���[�h�œ��삳���邩�ǂ����B]");
        System.out.println("      �^[�^�U]");
        System.out.println("      �f�t�H���g�l[false]");
        System.out.println("    -metadir");
        System.out.println("      ����[���^�t�@�C�����i�[�����f�B���N�g�����w�肵�܂��B]");
        System.out.println("      �^[������]");
        System.out.println("      �K�{�p�����[�^");
        System.out.println("    -targetdir");
        System.out.println("      ����[�o�͐�t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ̓J�����g������blanco��p���܂��B]");
        System.out.println("      �^[������]");
        System.out.println("      �f�t�H���g�l[blanco]");
        System.out.println("    -tmpdir");
        System.out.println("      ����[�e���|�����t�H���_���w�肵�܂��B���w��̏ꍇ�ɂ́A�J�����g������tmp��p���܂��B]");
        System.out.println("      �^[������]");
        System.out.println("      �f�t�H���g�l[tmp]");
        System.out.println("    -encoding");
        System.out.println("      ����[������������\�[�X�t�@�C���̕����G���R�[�f�B���O���w�肵�܂��B]");
        System.out.println("      �^[������]");
        System.out.println("    -runtimepackage");
        System.out.println("      ����[�����^�C���N���X�𐶐����鐶������w�肵�܂��B���w��̏ꍇ�ɂ� �t�@�C����`��(CSV)�̒l����ɐ�������܂��B]");
        System.out.println("      �^[������]");
        System.out.println("    -? , -help");
        System.out.println("      ����[�g������\�����܂��B]");
    }

    /**
     * ���̃o�b�`�����N���X�̓��̓p�����[�^�̑Ó����`�F�b�N�����{���邽�߂̃��\�b�h�ł��B
     *
     * @param input �o�b�`�����̓��̓p�����[�^�B
     * @throws IllegalArgumentException ���͒l�ɕs�������������ꍇ�B
     */
    public void validateInput(final BlancoCsvProcessInput input) throws IllegalArgumentException {
        if (input == null) {
            throw new IllegalArgumentException("BlancoBatchProcessBatchProcess: �����J�n���s�B���̓p�����[�^[input]��null���^�����܂����B");
        }
        if (input.getMetadir() == null) {
            throw new IllegalArgumentException("BlancoCsvBatchProcess: �����J�n���s�B���̓p�����[�^[input]�̕K�{�t�B�[���h�l[metadir]�ɒl���ݒ肳��Ă��܂���B");
        }
    }
}
