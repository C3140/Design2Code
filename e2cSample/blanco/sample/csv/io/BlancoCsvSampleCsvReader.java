/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.sample.csv.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import blanco.sample.csv.record.BlancoCsvSampleCsvRecord;

/**
 * �t�@�C����`[BlancoCsvSample/���̃N���X�͒P�ɃT���v���ł��B���ۂ̓���ɂ͗��p����܂���B]�̃��[�_�N���X�B
 *
 * ���̃N���X��blancoCsv�t�@�C����`�����玩���������ꂽ���[�_�N���X�ł��B<br>
 * �@1.�����񒷃`�F�b�N�ɂ́A�f�t�H���g�G���R�[�f�B���O�𗘗p���܂��B<br>
 * �@2.�N���X�̗��p������͕K�� close()���Ăяo���Ă��������B<br>
 */
public class BlancoCsvSampleCsvReader {
    /**
     * ���[�_�I�u�W�F�N�g
     *
     * CSV�����Ŋ֘A�Â�����A���ۂɓ��͂��s�����[�_�B
     */
    protected BufferedReader fReader;

    /**
     * ���ݏ������̍s�J�E���^�B
     *
     * ���ݏ������s���Ă���s�̈ʒu�B
     */
    protected long fLineCounter = 0;

    /**
     * ���ݏ������̍s�f�[�^�B
     */
    protected String fLine;

    /**
     * ���ݏ������̍s�̂��߂̃��[�_�B
     */
    protected StringReader fLineReader;

    /**
     * �^�C�g���s���������ꂽ���ǂ����B
     */
    protected boolean fIsTitleProcessed = false;

    /**
     * ����[field_5]�̓ǂݍ��݂̍ۂɗ��p����t�H�[�}�b�^�[�B
     *
     * ���C���X�^���X�����Ă������Ƃɂ�胁�����S�~������}�����܂��B
     */
    protected SimpleDateFormat fSimpleDateFormatField5;

    /**
     * ����[field_15]�̓ǂݍ��݂̍ۂɗ��p����t�H�[�}�b�^�[�B
     *
     * ���C���X�^���X�����Ă������Ƃɂ�胁�����S�~������}�����܂��B
     */
    protected SimpleDateFormat fSimpleDateFormatField15;

    /**
     * CSV���[�_�N���X�̃R���X�g���N�^�B
     */
    public BlancoCsvSampleCsvReader() {
        init();
    }

    /**
     * CSV���[�_�N���X�̃R���X�g���N�^�B
     *
     * �^����ꂽ���[�_���֘A�Â��܂��B
     *
     * @param arg �֘A�Â��郊�[�_�B
     */
    public BlancoCsvSampleCsvReader(final BufferedReader arg) {
        fReader = arg;
        init();
    }

    /**
     * �������������Ȃ��܂��B
     */
    protected void init() {
        fSimpleDateFormatField5 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // ���t/������͂������ɂ����Ȃ��܂��B
        fSimpleDateFormatField5.setLenient(false);
        fSimpleDateFormatField15 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        // ���t/������͂������ɂ����Ȃ��܂��B
        fSimpleDateFormatField15.setLenient(false);
    }

    /**
     * �֘A�Â���ꂽ���[�_����A���̈�s��ǂݍ��݂܂��B
     *
     * @return �s�I�u�W�F�N�g��Ԃ��܂��B���[�_���I�[�ɒB���A���͂�s�������ꍇ�ɂ� null��Ԃ��܂��B
     * @throws BlancoCsvIOException ���̓f�[�^���s���ȏꍇ�ȂǁB
     * @throws IOException �֘A�Â���ꂽ���[�_�ŗ�O�����������ꍇ�B
     */
    public BlancoCsvSampleCsvRecord readRecord() throws BlancoCsvIOException, IOException {
        if (fReader == null) {
            throw new IllegalArgumentException("[BlancoCsvSample] ���[�_���ݒ肳��Ă��Ȃ���ԂŃ��\�b�h[readRecord]���Ăяo����܂����B����͋�����܂���B���[�_���Z�b�g���Ă���Ăт����Ă��������B");
        }

        if (fIsTitleProcessed == false) {
            // �^�C�g���s��ǂݔ�΂��B
            fReader.readLine();
            fIsTitleProcessed = true;
        }

        fLine = fReader.readLine();
        if (fLine == null) {
            // �t�@�C���̏I�[�ɓ��B���܂����B
            return null;
        }
        fLineCounter++;
        final BlancoCsvSampleCsvRecord record = new BlancoCsvSampleCsvRecord();
        fLineReader = new StringReader(fLine);
        String tokenString = null;

        // ���ڔԍ�[1]���ږ�[field_1/�t�B�[���h1]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 1���ږځB���ڔԍ�[1] ���ږ�[field_1/�t�B�[���h1]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �C�Ӎ��ځB
        if (tokenString.length() == 0) {
            // �K�{���ڂł͂Ȃ������񍀖ڂɒ���0�̒l���ǂݍ��܂ꂽ�ꍇ�ɂ́A�ǂݍ��݌�̒l�Ƃ��Ă�����0�̕�����Ƃ��܂��B
            record.setField1(tokenString);
        } else {
            if (tokenString.getBytes().length < 1) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 1���ږځB���ڔԍ�[1] ���ږ�[field_1/�t�B�[���h1]�̏������ɂ�����MIN����(1)�����Z���l[" + tokenString + "]�����m���܂����B");
            }
            if (tokenString.getBytes().length > 10) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 1���ږځB���ڔԍ�[1] ���ږ�[field_1/�t�B�[���h1]�̏������ɂ�����MAX����(10)���������l[" + tokenString + "]�����m���܂����B");
            }
            record.setField1(tokenString);
        }

        // ���ڔԍ�[2]���ږ�[field_2/�t�B�[���h2]
        // �N�I�[�g���l�������ǂݍ��݂��s���܂��B
        tokenString = readTokenWithQuote(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 2���ږځB���ڔԍ�[2] ���ږ�[field_2/�t�B�[���h2]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �C�Ӎ��ځB
        if (tokenString.length() == 0) {
            // �K�{���ڂł͂Ȃ������񍀖ڂɒ���0�̒l���ǂݍ��܂ꂽ�ꍇ�ɂ́A�ǂݍ��݌�̒l�Ƃ��Ă�����0�̕�����Ƃ��܂��B
            record.setField2(tokenString);
        } else {
            if (tokenString.getBytes().length < 4) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 2���ږځB���ڔԍ�[2] ���ږ�[field_2/�t�B�[���h2]�̏������ɂ�����MIN����(4)�����Z���l[" + tokenString + "]�����m���܂����B");
            }
            if (tokenString.getBytes().length > 4) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 2���ږځB���ڔԍ�[2] ���ږ�[field_2/�t�B�[���h2]�̏������ɂ�����MAX����(4)���������l[" + tokenString + "]�����m���܂����B");
            }
            record.setField2(tokenString);
        }

        // ���ڔԍ�[3]���ږ�[field_3/�t�B�[���h3]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 3���ږځB���ڔԍ�[3] ���ږ�[field_3/�t�B�[���h3]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �C�Ӎ��ځB
        if (tokenString.length() == 0) {
            // �K�{���ڂł͂Ȃ����ڂɒ���0�̒l���ǂݍ��܂ꂽ�ꍇ�ɂ́A�l�Ƃ���null�������܂��B
            record.setField3(null);
        } else {
            if (tokenString.getBytes().length < 1) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 3���ږځB���ڔԍ�[3] ���ږ�[field_3/�t�B�[���h3]�̏������ɂ�����MIN����(1)�����Z���l[" + tokenString + "]�����m���܂����B");
            }
            if (tokenString.getBytes().length > 3) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 3���ږځB���ڔԍ�[3] ���ږ�[field_3/�t�B�[���h3]�̏������ɂ�����MAX����(3)���������l[" + tokenString + "]�����m���܂����B");
            }
            try {
                record.setField3(new Integer(tokenString));
            } catch (NumberFormatException ex) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 3���ږځB���ڔԍ�[3] ���ږ�[field_3/�t�B�[���h3]�̏������ɂ����Đ��l(int)�Ƃ��Ă͉�͂ł��Ȃ�����[" + tokenString + "]�����m���܂����B:" + ex.toString(), ex);
            }
        }

        // ���ڔԍ�[4]���ږ�[field_4/�t�B�[���h4]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 4���ږځB���ڔԍ�[4] ���ږ�[field_4/�t�B�[���h4]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �C�Ӎ��ځB
        if (tokenString.length() == 0) {
            // �K�{���ڂł͂Ȃ����ڂɒ���0�̒l���ǂݍ��܂ꂽ�ꍇ�ɂ́A�l�Ƃ���null�������܂��B
            record.setField4(null);
        } else {
            if (tokenString.getBytes().length < 1) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 4���ږځB���ڔԍ�[4] ���ږ�[field_4/�t�B�[���h4]�̏������ɂ�����MIN����(1)�����Z���l[" + tokenString + "]�����m���܂����B");
            }
            if (tokenString.getBytes().length > 3) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 4���ږځB���ڔԍ�[4] ���ږ�[field_4/�t�B�[���h4]�̏������ɂ�����MAX����(3)���������l[" + tokenString + "]�����m���܂����B");
            }
            try {
                record.setField4(new Long(tokenString));
            } catch (NumberFormatException ex) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 4���ږځB���ڔԍ�[4] ���ږ�[field_4/�t�B�[���h4]�̏������ɂ����Đ��l(long)�Ƃ��Ă͉�͂ł��Ȃ�����[" + tokenString + "]�����m���܂����B:" + ex.toString(), ex);
            }
        }

        // ���ڔԍ�[5]���ږ�[field_5/�t�B�[���h5]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 5���ږځB���ڔԍ�[5] ���ږ�[field_5/�t�B�[���h5]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �C�Ӎ��ځB
        if (tokenString.length() == 0) {
            // �K�{���ڂł͂Ȃ����ڂɒ���0�̒l���ǂݍ��܂ꂽ�ꍇ�ɂ́A�l�Ƃ���null�������܂��B
            record.setField5(null);
        } else {
            try {
                record.setField5(fSimpleDateFormatField5.parse(tokenString));
            } catch (ParseException ex) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 5���ږځB���ڔԍ�[5] ���ږ�[field_5/�t�B�[���h5]�̏������ɂ����ė^����ꂽ�`��[" + fSimpleDateFormatField5.toPattern() + "]�ł͉�͂ł��Ȃ�������[" + tokenString + "]�����m���܂����B:" + ex.toString(), ex);
            }
        }

        // ���ڔԍ�[6]���ږ�[field_6/�t�B�[���h6]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 6���ږځB���ڔԍ�[6] ���ږ�[field_6/�t�B�[���h6]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �C�Ӎ��ځB
        if (tokenString.length() == 0) {
            // �K�{���ڂł͂Ȃ����ڂɒ���0�̒l���ǂݍ��܂ꂽ�ꍇ�ɂ́A�l�Ƃ���null�������܂��B
            record.setField6(null);
        } else {
            if (tokenString.getBytes().length < 1) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 6���ږځB���ڔԍ�[6] ���ږ�[field_6/�t�B�[���h6]�̏������ɂ�����MIN����(1)�����Z���l[" + tokenString + "]�����m���܂����B");
            }
            if (tokenString.getBytes().length > 3) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 6���ږځB���ڔԍ�[6] ���ږ�[field_6/�t�B�[���h6]�̏������ɂ�����MAX����(3)���������l[" + tokenString + "]�����m���܂����B");
            }
            try {
                record.setField6(new BigDecimal(tokenString));
            } catch (NumberFormatException ex) {
                throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 6���ږځB���ڔԍ�[6] ���ږ�[field_6/�t�B�[���h6]�̏������ɂ����Đ��l(decimal)�Ƃ��Ă͉�͂ł��Ȃ�����[" + tokenString + "]�����m���܂����B:" + ex.toString(), ex);
            }
        }

        // ���ڔԍ�[7]���ږ�[field_11/�t�B�[���h11]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 7���ږځB���ڔԍ�[7] ���ږ�[field_11/�t�B�[���h11]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �K�{���ځB
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 7���ږځB���ڔԍ�[7] ���ږ�[field_11/�t�B�[���h11]�̏������ɂ����ĕK�{���ڂɒl�������Ă��Ȃ����Ƃ����m���܂����B");
        }
        record.setField11(tokenString);

        // ���ڔԍ�[8]���ږ�[field_12/�t�B�[���h12]
        // �N�I�[�g���l�������ǂݍ��݂��s���܂��B
        tokenString = readTokenWithQuote(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 8���ږځB���ڔԍ�[8] ���ږ�[field_12/�t�B�[���h12]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �K�{���ځB
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 8���ږځB���ڔԍ�[8] ���ږ�[field_12/�t�B�[���h12]�̏������ɂ����ĕK�{���ڂɒl�������Ă��Ȃ����Ƃ����m���܂����B");
        }
        record.setField12(tokenString);

        // ���ڔԍ�[9]���ږ�[field_13/�t�B�[���h13]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 9���ږځB���ڔԍ�[9] ���ږ�[field_13/�t�B�[���h13]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �K�{���ځB
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 9���ږځB���ڔԍ�[9] ���ږ�[field_13/�t�B�[���h13]�̏������ɂ����ĕK�{���ڂɒl�������Ă��Ȃ����Ƃ����m���܂����B");
        }
        try {
            record.setField13(Integer.parseInt(tokenString));
        } catch (NumberFormatException ex) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 9���ږځB���ڔԍ�[9] ���ږ�[field_13/�t�B�[���h13]�̏������ɂ����Đ��l(int)�Ƃ��Ă͉�͂ł��Ȃ�����[" + tokenString + "]�����m���܂����B:" + ex.toString(), ex);
        }

        // ���ڔԍ�[10]���ږ�[field_14/�t�B�[���h14]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 10���ږځB���ڔԍ�[10] ���ږ�[field_14/�t�B�[���h14]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �K�{���ځB
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 10���ږځB���ڔԍ�[10] ���ږ�[field_14/�t�B�[���h14]�̏������ɂ����ĕK�{���ڂɒl�������Ă��Ȃ����Ƃ����m���܂����B");
        }
        try {
            record.setField14(Long.parseLong(tokenString));
        } catch (NumberFormatException ex) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 10���ږځB���ڔԍ�[10] ���ږ�[field_14/�t�B�[���h14]�̏������ɂ����Đ��l(long)�Ƃ��Ă͉�͂ł��Ȃ�����[" + tokenString + "]�����m���܂����B:" + ex.toString(), ex);
        }

        // ���ڔԍ�[11]���ږ�[field_15/�t�B�[���h15]
        tokenString = readToken(',', false);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 11���ږځB���ڔԍ�[11] ���ږ�[field_15/�t�B�[���h15]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �K�{���ځB
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 11���ږځB���ڔԍ�[11] ���ږ�[field_15/�t�B�[���h15]�̏������ɂ����ĕK�{���ڂɒl�������Ă��Ȃ����Ƃ����m���܂����B");
        }
        try {
            record.setField15(fSimpleDateFormatField15.parse(tokenString));
        } catch (ParseException ex) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 11���ږځB���ڔԍ�[11] ���ږ�[field_15/�t�B�[���h15]�̏������ɂ����ė^����ꂽ�`��[" + fSimpleDateFormatField15.toPattern() + "]�ł͉�͂ł��Ȃ�������[" + tokenString + "]�����m���܂����B:" + ex.toString(), ex);
        }

        // ���ڔԍ�[12]���ږ�[field_16/�t�B�[���h16]
        tokenString = readToken(',', true);
        if (tokenString == null) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 12���ږځB���ڔԍ�[12] ���ږ�[field_16/�t�B�[���h16]�̏������ɂ����ĕs���ȏI�[�����m���܂����B");
        }
        // �K�{���ځB
        if (tokenString.length() == 0) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 12���ږځB���ڔԍ�[12] ���ږ�[field_16/�t�B�[���h16]�̏������ɂ����ĕK�{���ڂɒl�������Ă��Ȃ����Ƃ����m���܂����B");
        }
        try {
            record.setField16(new BigDecimal(tokenString));
        } catch (NumberFormatException ex) {
            throw new BlancoCsvIOException("����" + fLineCounter + "�s�� 12���ږځB���ڔԍ�[12] ���ږ�[field_16/�t�B�[���h16]�̏������ɂ����Đ��l(decimal)�Ƃ��Ă͉�͂ł��Ȃ�����[" + tokenString + "]�����m���܂����B:" + ex.toString(), ex);
        }
        return record;
    }

    /**
     * CSV�����Ŋ֘A�Â����郊�[�_��Ԃ��܂��B
     *
     * @return CSV�����Ŋ֘A�Â����郊�[�_�B
     */
    public BufferedReader getReader() {
        return fReader;
    }

    /**
     * CSV�����Ŋ֘A�Â����郊�[�_��ݒ肵�܂��B
     *
     * @param argReader CSV�����Ŋ֘A�Â����郊�[�_�B
     */
    public void setReader(final BufferedReader argReader) {
        fReader = argReader;
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
     * ���̃��[�_����܂��B
     *
     * �֘A�Â���ꂽ���[�_�ɑ΂��Ă�close()���Ăяo���܂��B
     *
     * @throws IOException �֘A�Â���ꂽ���[�_��close()�Ɏ��s�����ꍇ�B
     */
    public void close() throws IOException {
        if (fReader != null) {
            fReader.close();
        }
    }

    /**
     * �֘A�Â���ꂽReader���� �^����ꂽ�f���~�^���g���ăg�[�N�������o���܂��B
     *
     * @param delimiter �f���~�^
     * @param isEndOfLine �s�̏I�[�ł���̂��ǂ����t���O
     * @return ���o���ꂽ�g�[�N���B���͂⃊�[�_����̏ꍇ�ɂ�null��Ԃ��܂��B
     * @throws BlancoCsvIOException ���ڐ�������Ȃ��ȂǗ^����ꂽ������Ɋւ����O�����������ꍇ�B
     * @throws IOException ���o�͗�O�����������ꍇ�B
     */
    protected String readToken(final char delimiter, final boolean isEndOfLine) throws BlancoCsvIOException, IOException {
        final StringBuffer buffer = new StringBuffer();
        for (;;) {
            final int iRead = fLineReader.read();
            if (iRead < 0) {
                // �I�[�ɓ��B�B
                if (isEndOfLine == false) {
                    throw new BlancoCsvIOException("�s�̏I�[�łȂ��̂ɂ��ւ�炸�f���~�^�����ꂸ�ɍs���I�����Ă��܂��܂����B");
                }
                break;
            }
            if (iRead == delimiter) {
                if (isEndOfLine) {
                    throw new BlancoCsvIOException("�s�̏I�[�ł���ׂ��ɂ��ւ�炸�f���~�^������܂����B");
                }
                break;
            } else {
                buffer.append((char) iRead);
            }
        }
        return buffer.toString();
    }

    /**
     * �֘A�Â���ꂽReader���� �_�u���N�I�[�g�����t���� �^����ꂽ�f���~�^���g���ăg�[�N�������o���܂��B
     *
     * @param delimiter �f���~�^
     * @param isEndOfLine �s�̏I�[�ł���̂��ǂ����t���O
     * @return ���o���ꂽ�g�[�N���B���͂⃊�[�_����̏ꍇ�ɂ�null��Ԃ��܂��B
     * @throws BlancoCsvIOException �_�u���N�I�[�g�̕s��v�ȂǗ^����ꂽ������Ɋւ����O�����������ꍇ�B
     * @throws IOException ���o�͗�O�����������ꍇ�B
     */
    protected String readTokenWithQuote(final char delimiter, final boolean isEndOfLine) throws BlancoCsvIOException, IOException {
        final StringBuffer buffer = new StringBuffer();
        boolean isStringStarted = false;
        boolean isStringEnded = false;
        for (;;) {
            int iRead = fLineReader.read();
            if (iRead < 0) {
                // �I�[�ɓ��B�B
                if (isStringStarted && isStringEnded == false) {
                    // ���s���o�́B
                    buffer.append('\n');
                    // �_�u���N�I�[�g���B
                    fLine = fReader.readLine();
                    if (fLine == null) {
                        // �_�u���N�I�[�g���ł���̂ɂ�������炸�t�@�C���̏I�[�ɓ��B���܂����B
                        break;
                    } else {
                        fLineReader = new StringReader(fLine);
                        continue;
                    }
                } else if (isEndOfLine == false) {
                    throw new BlancoCsvIOException("�s�̏I�[�łȂ��̂ɂ��ւ�炸�f���~�^�����ꂸ�ɍs���I�����Ă��܂��܂����B");
                }
                break;
            }
            if (isStringStarted == false) {
                if (iRead != '"') {
                    throw new BlancoCsvIOException("�_�u���N�I�[�g�����ŕ����񂪊J�n����܂����B");
                }
                // �_�u���N�I�[�e�[�V�����͓ǂݔ�΂��܂��B
                isStringStarted = true;
            } else if (isStringEnded) {
                if (iRead == delimiter) {
                    // ������I�[�ɓ��B���܂����B
                    if (isEndOfLine) {
                        throw new BlancoCsvIOException("�s�̏I�[�ł���ׂ��ɂ��ւ�炸�f���~�^������܂����B");
                    }
                    break;
                }
                throw new BlancoCsvIOException("�_�u���N�I�[�g�ɂ�镶����I������ɕ����񂪗^�����܂����B");
            } else {
                // �ʏ�̕�����G���A
                if (iRead == '"') {
                    // �_�u���N�I�[�g���d�˂�ꂽ���̂łȂ����ǂ����`�F�b�N���܂��B
                    fLineReader.mark(1);
                    if (fLineReader.read() == '"') {
                        // �G�X�P�[�v���ꂽ�_�u���N�I�[�g
                        // 2�łЂƂȂ̂ŁA�ЂƂ͓ǂݎ̂Ă܂��B
                        buffer.append((char) iRead);
                    } else {
                        // �_�u���N�I�[�g�ɂ��G�X�P�[�v�ł͂���܂���ł����B
                        // ����͏I�[���Ӗ����Ă��܂��B
                        fLineReader.reset();
                        isStringEnded = true;
                    }
                } else {
                    buffer.append((char) iRead);
                }
            }
        }
        if (isStringStarted == false) {
            throw new BlancoCsvIOException("�_�u���N�I�[�g���K�v�ȕ�����ł���̂Ƀ_�u���N�I�[�g�ɂ��J�n������܂���ł����B");
        }
        if (isStringEnded == false) {
            throw new BlancoCsvIOException("�_�u���N�I�[�g���K�v�ȕ�����ł���̂Ƀ_�u���N�I�[�g�ɂ��I��������܂���ł����B");
        }
        return buffer.toString();
    }
}
