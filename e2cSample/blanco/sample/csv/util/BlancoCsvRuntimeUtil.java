/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ���Ď�����������Ă��܂��B
 */
package blanco.sample.csv.util;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

/**
 * blancoCsv�ŗ��p������s�����[�e�B���e�B�N���X
 *
 * ���̃t�@�C����blancoIg�ɂ�莩����������Ă��܂��B
 */
public class BlancoCsvRuntimeUtil {
    /**
     * �_�u���N�I�[�g�G�X�P�[�v�����t���̕�������擾���܂�
     *
     * @param value �����o������������
     * @return �_�u���N�I�[�g�G�X�P�[�v�����t���̕�����
     * @throws IOException ���o�͗�O�Ȃǂ����������ꍇ�B
     */
    public static String getTokenWithQuote(final String value) throws IOException {
        final StringWriter writer = new StringWriter();
        writer.write("\"");

        final StringReader reader = new StringReader(value);
        for (;;) {
            final int iRead = reader.read();
            if (iRead < 0) {
                // �I�[�ɓ��B�B
                break;
            }
            if (iRead == '\"') {
                // �_�u���N�I�[�g�͓�d�ŏ����o���܂��B
                writer.write("\"\"");
            } else {
                writer.write((char) iRead);
            }
        }

        writer.write("\"");
        writer.close();
        return writer.toString();
    }
}
