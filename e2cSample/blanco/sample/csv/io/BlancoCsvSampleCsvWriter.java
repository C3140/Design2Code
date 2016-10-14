/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.sample.csv.io;

import java.io.BufferedWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

import blanco.sample.csv.record.BlancoCsvSampleCsvRecord;
import blanco.sample.csv.util.BlancoCsvRuntimeUtil;

/**
 * �t�@�C����`[BlancoCsvSample/���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B]�̃��C�^�N���X�B
 *
 * ���̃N���X��blancoCsv�t�@�C����`�����玩���������ꂽ���C�^�N���X�ł��B<br>
 * �@1.�����񒷃`�F�b�N�ɂ́A�f�t�H���g�G���R�[�f�B���O�𗘗p���܂��B<br>
 * �@2.�N���X�̗��p������͕K�� close()���Ăяo���Ă��������B<br>
 */
public class BlancoCsvSampleCsvWriter {
    /**
     * ���C�^�I�u�W�F�N�g�B
     *
     * CSV�����Ŋ֘A�Â�����A���ۂɏo�͂��s�����C�^�B
     */
    protected BufferedWriter fWriter;

    /**
     * ���ݏ������̍s�J�E���^�B
     *
     * ���ݏ������s���Ă���s�̈ʒu�B
     */
    protected long fLineCounter = 0;

    /**
     * �^�C�g���s���������ꂽ���ǂ����B
     */
    protected boolean fIsTitleProcessed = false;

    /**
     * ����[field_5]�̏������݂̍ۂɗ��p����t�H�[�}�b�^�[�B
     *
     * ���C���X�^���X�����Ă������Ƃɂ�胁�����S�~������}�����܂��B
     */
    protected SimpleDateFormat fSimpleDateFormatField5;

    /**
     * ����[field_15]�̏������݂̍ۂɗ��p����t�H�[�}�b�^�[�B
     *
     * ���C���X�^���X�����Ă������Ƃɂ�胁�����S�~������}�����܂��B
     */
    protected SimpleDateFormat fSimpleDateFormatField15;

    /**
     * CSV���C�^�N���X�̃R���X�g���N�^�B
     */
    public BlancoCsvSampleCsvWriter() {
        init();
    }

    /**
     * CSV���C�^�N���X�̃R���X�g���N�^�B
     *
     * �^����ꂽ���C�^�Ɗ֘A�Â��܂��B
     *
     * @param arg �֘A�Â��郉�C�^�B
     */
    public BlancoCsvSampleCsvWriter(final BufferedWriter arg) {
        fWriter = arg;
        init();
    }

    /**
     * �������������Ȃ��܂��B
     */
    protected void init() {
        fSimpleDateFormatField5 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        fSimpleDateFormatField15 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
    }

    /**
     * CSV�t�@�C���̃^�C�g���s�������o���܂��B
     *
     * �^�C�g���̓f���~�^�ŋ�؂��Ȃ��烉�C�^�ɏo�͂���A�Ō�ɉ��s�R�[�h���t�^����܂��B<br>
     * �^�C�g���̓_�u���N�I�[�e�[�V�����ň͂܂�܂��B
     *
     * @throws IOException �֘A�Â���ꂽ���C�^�o�͂̍ۂɗ�O�����������ꍇ�B
     */
    public void writeTitle() throws IOException {
        if (fWriter == null) {
            throw new IllegalArgumentException("[BlancoCsvSample] ���C�^���ݒ肳��Ă��Ȃ���ԂŃ��\�b�h[writeTitle]���Ăяo����܂����B����͋�����܂���B���C�^���Z�b�g���Ă���Ăт����Ă��������B");
        }

        fWriter.write("\"�t�B�[���h1\"");
        fWriter.write(",\"�t�B�[���h2\"");
        fWriter.write(",\"�t�B�[���h3\"");
        fWriter.write(",\"�t�B�[���h4\"");
        fWriter.write(",\"�t�B�[���h5\"");
        fWriter.write(",\"�t�B�[���h6\"");
        fWriter.write(",\"�t�B�[���h11\"");
        fWriter.write(",\"�t�B�[���h12\"");
        fWriter.write(",\"�t�B�[���h13\"");
        fWriter.write(",\"�t�B�[���h14\"");
        fWriter.write(",\"�t�B�[���h15\"");
        fWriter.write(",\"�t�B�[���h16\"");
        fWriter.newLine();
    }

    /**
     * �^����ꂽ��s�������o���܂��B
     *
     * �f�[�^�̓f���~�^�ŋ�؂��Ȃ��烉�C�^�ɏo�͂���A�Ō�ɉ��s�R�[�h���t�^����܂��B
     *
     * @param record ���R�[�h�I�u�W�F�N�g�B
     * @throws BlancoCsvIOException �^����ꂽ���R�[�h���̍��ڒl���s���ȏꍇ�ȂǁB
     * @throws IOException �֘A�Â���ꂽ���C�^�o�͂̍ۂɗ�O�����������ꍇ�B
     */
    public void writeRecord(final BlancoCsvSampleCsvRecord record) throws BlancoCsvIOException, IOException {
        if (fWriter == null) {
            throw new IllegalArgumentException("[BlancoCsvSample] ���C�^���ݒ肳��Ă��Ȃ���ԂŃ��\�b�h[writeRecord]���Ăяo����܂����B����͋�����܂���B���C�^���Z�b�g���Ă���Ăт����Ă��������B");
        }

        if (fIsTitleProcessed == false) {
            // �^�C�g���s���������݁B
            writeTitle();
            fIsTitleProcessed = true;
        }

        String writeToken = null;

        // ���ڔԍ�[1] ���ږ�[field_1/�t�B�[���h1]
        // �C�Ӎ��ڂŕ�����̍��ڂ� null�܂��͒���0�̕����񂪗^����ꂽ�ꍇ�ɂ́A��������l�������Ă��Ȃ����̂Ƃ݂Ȃ��܂��B
        // ���̏ꍇ�ɂ͒����`�F�b�N�͍s���܂���B
        writeToken = record.getField1() == null ? "" : record.getField1();
        if (writeToken.length() > 0) {
            if (writeToken.getBytes().length < 1) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 1���ږځB���ڔԍ�[1] ���ږ�[field_1/�t�B�[���h1]�̏������ɂ�����MIN����(1)�����Z���l[" + writeToken + "]�����m���܂����B");
            }
            if (writeToken.getBytes().length > 10) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 1���ږځB���ڔԍ�[1] ���ږ�[field_1/�t�B�[���h1]�̏������ɂ�����MAX����(10)���������l[" + writeToken + "]�����m���܂����B");
            }
        }
        if (writeToken.indexOf(",") >= 0) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 1���ږځB���ڔԍ�[1] ���ږ�[field_1/�t�B�[���h1]�̏������ɂ����ăf�[�^��[" + writeToken + "]�ɍ��ڂ̃f���~�^[,]���܂܂�邱�Ƃ����m���܂����B");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // ���ڔԍ�[2] ���ږ�[field_2/�t�B�[���h2]
        // �C�Ӎ��ڂŕ�����̍��ڂ� null�܂��͒���0�̕����񂪗^����ꂽ�ꍇ�ɂ́A��������l�������Ă��Ȃ����̂Ƃ݂Ȃ��܂��B
        // ���̏ꍇ�ɂ͒����`�F�b�N�͍s���܂���B
        writeToken = record.getField2() == null ? "" : record.getField2();
        if (writeToken.length() > 0) {
            if (writeToken.getBytes().length < 4) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 2���ږځB���ڔԍ�[2] ���ږ�[field_2/�t�B�[���h2]�̏������ɂ�����MIN����(4)�����Z���l[" + writeToken + "]�����m���܂����B");
            }
            if (writeToken.getBytes().length > 4) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 2���ږځB���ڔԍ�[2] ���ږ�[field_2/�t�B�[���h2]�̏������ɂ�����MAX����(4)���������l[" + writeToken + "]�����m���܂����B");
            }
        }
        // �_�u���N�I�[�g�����t���ŏ����o�����s���܂��B
        fWriter.write(BlancoCsvRuntimeUtil.getTokenWithQuote(writeToken));
        fWriter.write(',');

        // ���ڔԍ�[3] ���ږ�[field_3/�t�B�[���h3]
        if (record.getField3() == null) {
            writeToken = "";
        } else {
            writeToken = String.valueOf(record.getField3());
            if (writeToken.getBytes().length < 1) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 3���ږځB���ڔԍ�[3] ���ږ�[field_3/�t�B�[���h3]�̏������ɂ�����MIN����(1)�����Z���l[" + writeToken + "]�����m���܂����B");
            }
            if (writeToken.getBytes().length > 3) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 3���ږځB���ڔԍ�[3] ���ږ�[field_3/�t�B�[���h3]�̏������ɂ�����MAX����(3)���������l[" + writeToken + "]�����m���܂����B");
            }
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // ���ڔԍ�[4] ���ږ�[field_4/�t�B�[���h4]
        if (record.getField4() == null) {
            writeToken = "";
        } else {
            writeToken = String.valueOf(record.getField4());
            if (writeToken.getBytes().length < 1) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 4���ږځB���ڔԍ�[4] ���ږ�[field_4/�t�B�[���h4]�̏������ɂ�����MIN����(1)�����Z���l[" + writeToken + "]�����m���܂����B");
            }
            if (writeToken.getBytes().length > 3) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 4���ږځB���ڔԍ�[4] ���ږ�[field_4/�t�B�[���h4]�̏������ɂ�����MAX����(3)���������l[" + writeToken + "]�����m���܂����B");
            }
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // ���ڔԍ�[5] ���ږ�[field_5/�t�B�[���h5]
        if (record.getField5() == null) {
            writeToken = "";
        } else {
            writeToken = fSimpleDateFormatField5.format(record.getField5());
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // ���ڔԍ�[6] ���ږ�[field_6/�t�B�[���h6]
        if (record.getField6() == null) {
            writeToken = "";
        } else {
            writeToken = record.getField6() == null ? "" : record.getField6().toString();
            if (writeToken.getBytes().length < 1) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 6���ږځB���ڔԍ�[6] ���ږ�[field_6/�t�B�[���h6]�̏������ɂ�����MIN����(1)�����Z���l[" + writeToken + "]�����m���܂����B");
            }
            if (writeToken.getBytes().length > 3) {
                throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 6���ږځB���ڔԍ�[6] ���ږ�[field_6/�t�B�[���h6]�̏������ɂ�����MAX����(3)���������l[" + writeToken + "]�����m���܂����B");
            }
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // ���ڔԍ�[7] ���ږ�[field_11/�t�B�[���h11]
        if (record.getField11() == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 7���ږځB���ڔԍ�[7] ���ږ�[field_11/�t�B�[���h11]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        if (record.getField11().length() == 0) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 7���ږځB���ڔԍ�[7] ���ږ�[field_11/�t�B�[���h11]�̏������ɂ����ĕK�{���ڂɒ���0�̕����񂪗^�����Ă��邱�Ƃ����m���܂����B");
        }
        writeToken = record.getField11();
        if (writeToken == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 7���ږځB���ڔԍ�[7] ���ږ�[field_11/�t�B�[���h11]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        if (writeToken.indexOf(",") >= 0) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 7���ږځB���ڔԍ�[7] ���ږ�[field_11/�t�B�[���h11]�̏������ɂ����ăf�[�^��[" + writeToken + "]�ɍ��ڂ̃f���~�^[,]���܂܂�邱�Ƃ����m���܂����B");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // ���ڔԍ�[8] ���ږ�[field_12/�t�B�[���h12]
        if (record.getField12() == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 8���ږځB���ڔԍ�[8] ���ږ�[field_12/�t�B�[���h12]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        if (record.getField12().length() == 0) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 8���ږځB���ڔԍ�[8] ���ږ�[field_12/�t�B�[���h12]�̏������ɂ����ĕK�{���ڂɒ���0�̕����񂪗^�����Ă��邱�Ƃ����m���܂����B");
        }
        writeToken = record.getField12();
        if (writeToken == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 8���ږځB���ڔԍ�[8] ���ږ�[field_12/�t�B�[���h12]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        // �_�u���N�I�[�g�����t���ŏ����o�����s���܂��B
        fWriter.write(BlancoCsvRuntimeUtil.getTokenWithQuote(writeToken));
        fWriter.write(',');

        // ���ڔԍ�[9] ���ږ�[field_13/�t�B�[���h13]
        writeToken = String.valueOf(record.getField13());
        if (writeToken == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 9���ږځB���ڔԍ�[9] ���ږ�[field_13/�t�B�[���h13]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // ���ڔԍ�[10] ���ږ�[field_14/�t�B�[���h14]
        writeToken = String.valueOf(record.getField14());
        if (writeToken == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 10���ږځB���ڔԍ�[10] ���ږ�[field_14/�t�B�[���h14]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // ���ڔԍ�[11] ���ږ�[field_15/�t�B�[���h15]
        if (record.getField15() == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 11���ږځB���ڔԍ�[11] ���ږ�[field_15/�t�B�[���h15]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        writeToken = fSimpleDateFormatField15.format(record.getField15());
        if (writeToken == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 11���ږځB���ڔԍ�[11] ���ږ�[field_15/�t�B�[���h15]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        fWriter.write(writeToken);
        fWriter.write(',');

        // ���ڔԍ�[12] ���ږ�[field_16/�t�B�[���h16]
        if (record.getField16() == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 12���ږځB���ڔԍ�[12] ���ږ�[field_16/�t�B�[���h16]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        writeToken = record.getField16().toString();
        if (writeToken == null) {
            throw new BlancoCsvIOException("�o��" + (fLineCounter + 1) + "�s�� 12���ږځB���ڔԍ�[12] ���ږ�[field_16/�t�B�[���h16]�̏������ɂ����ĕK�{���ڂ�null���^�����Ă��邱�Ƃ����m���܂����B");
        }
        fWriter.write(writeToken);

        // �Ō�ɉ��s�R�[�h���t�^����܂��B
        fWriter.newLine();
        fLineCounter++;
    }

    /**
     * CSV�����Ŋ֘A�Â����郉�C�^��Ԃ��܂��B
     *
     * @return CSV�����Ŋ֘A�Â����郉�C�^�B
     */
    public BufferedWriter getWriter() {
        return fWriter;
    }

    /**
     * CSV�����Ŋ֘A�Â����郉�C�^��ݒ肵�܂��B
     *
     * @param argWriter CSV�����Ŋ֘A�Â����郉�C�^�B
     */
    public void setWriter(final BufferedWriter argWriter) {
        fWriter = argWriter;
    }

    /**
     * ���ݏ������̍s�J�E���^��Ԃ��܂��B
     *
     * @return ���ݏ������̍s�J�E���^�B
     */
    public long getLineCounter() {
        return fLineCounter;
    }

    /**
     * ���̃��C�^���t���b�V�����܂��B
     *
     * �֘A�Â���ꂽ���C�^�ɑ΂��Ă�flush()���Ăяo���܂��B
     *
     * @throws IOException �֘A�Â���ꂽ���C�^��flush()�Ɏ��s�����ꍇ�B
     */
    public void flush() throws IOException {
        if (fWriter != null) {
            fWriter.flush();
        }
    }

    /**
     * ���̃��C�^����܂��B
     *
     * �֘A�Â���ꂽ���C�^�ɑ΂��Ă�close()���Ăяo���܂��B
     *
     * @throws IOException �֘A�Â���ꂽ���C�^��close()�Ɏ��s�����ꍇ�B
     */
    public void close() throws IOException {
        if (fWriter != null) {
            if (fIsTitleProcessed == false) {
                // �^�C�g���s���������݁B
                writeTitle();
                fIsTitleProcessed = true;
            }

            fWriter.close();
        }
    }
}
