/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.sample.csv.record;

import java.math.BigDecimal;
import java.util.Date;

/**
 * blancoCsv�t�@�C����`������쐬���ꂽ���R�[�h�N���X�B
 *
 * �t�@�C����`[BlancoCsvSample2/���̃N���X�͒P�ɃT���v���ł��B�^�u��؂�̃^�C�g���s�����̃T���v���ł��B]�̃��R�[�h�N���X�B
 */
public class BlancoCsvSample2CsvRecord {
    /**
     * �t�B�[���h1
     *
     * ���ڔԍ�: 1
     * MIN����: 1
     * MAX����: 10
     * �t�B�[���h: [field_1]�B
     * �f�t�H���g: [����]�B
     */
    private String fField1 = "����";

    /**
     * �t�B�[���h2
     *
     * ���ڔԍ�: 2
     * ������̓_�u���N�I�[�g��������ē��o�͂���܂��B
     * MIN����: 4
     * MAX����: 4
     * �t�B�[���h: [field_2]�B
     * �f�t�H���g: [�e�X�g]�B
     */
    private String fField2 = "�e�X�g";

    /**
     * �t�B�[���h3
     *
     * ���ڔԍ�: 3
     * MIN����: 1
     * MAX����: 3
     * �t�B�[���h: [field_3]�B
     */
    private Integer fField3;

    /**
     * �t�B�[���h4
     *
     * ���ڔԍ�: 4
     * MIN����: 1
     * MAX����: 3
     * �t�B�[���h: [field_4]�B
     * �f�t�H���g: [10]�B
     */
    private Long fField4 = new Long(10);

    /**
     * �t�B�[���h5
     *
     * ���ڔԍ�: 5
     * �t�B�[���h: [field_5]�B
     */
    private Date fField5;

    /**
     * �t�B�[���h6
     *
     * ���ڔԍ�: 6
     * MIN����: 1
     * MAX����: 3
     * �t�B�[���h: [field_6]�B
     */
    private BigDecimal fField6;

    /**
     * �t�B�[���h11
     *
     * ���ڔԍ�: 7
     * �K�{����
     * �t�B�[���h: [field_11]�B
     */
    private String fField11;

    /**
     * �t�B�[���h12
     *
     * ���ڔԍ�: 8
     * ������̓_�u���N�I�[�g��������ē��o�͂���܂��B
     * �K�{����
     * �t�B�[���h: [field_12]�B
     */
    private String fField12;

    /**
     * �t�B�[���h13
     *
     * ���ڔԍ�: 9
     * �K�{����
     * �t�B�[���h: [field_13]�B
     */
    private int fField13;

    /**
     * �t�B�[���h14
     *
     * ���ڔԍ�: 10
     * �K�{����
     * �t�B�[���h: [field_14]�B
     */
    private long fField14;

    /**
     * �t�B�[���h15
     *
     * ���ڔԍ�: 11
     * �K�{����
     * �t�B�[���h: [field_15]�B
     */
    private Date fField15;

    /**
     * �t�B�[���h16
     *
     * ���ڔԍ�: 12
     * �K�{����
     * �t�B�[���h: [field_16]�B
     */
    private BigDecimal fField16;

    /**
     * �t�B�[���h [field_1] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h1]�B
     * ���ڔԍ�: 1
     * MIN����: 1
     * MAX����: 10
     *
     * @param argField1 �t�B�[���h[field_1]�ɐݒ肷��l�B
     */
    public void setField1(final String argField1) {
        fField1 = argField1;
    }

    /**
     * �t�B�[���h [field_1] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h1]�B
     * ���ڔԍ�: 1
     * MIN����: 1
     * MAX����: 10
     * �f�t�H���g: [����]�B
     *
     * @return �t�B�[���h[field_1]����擾�����l�B
     */
    public String getField1() {
        return fField1;
    }

    /**
     * �t�B�[���h [field_2] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h2]�B
     * ���ڔԍ�: 2
     * ������̓_�u���N�I�[�g��������ē��o�͂���܂��B
     * MIN����: 4
     * MAX����: 4
     *
     * @param argField2 �t�B�[���h[field_2]�ɐݒ肷��l�B
     */
    public void setField2(final String argField2) {
        fField2 = argField2;
    }

    /**
     * �t�B�[���h [field_2] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h2]�B
     * ���ڔԍ�: 2
     * ������̓_�u���N�I�[�g��������ē��o�͂���܂��B
     * MIN����: 4
     * MAX����: 4
     * �f�t�H���g: [�e�X�g]�B
     *
     * @return �t�B�[���h[field_2]����擾�����l�B
     */
    public String getField2() {
        return fField2;
    }

    /**
     * �t�B�[���h [field_3] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h3]�B
     * ���ڔԍ�: 3
     * MIN����: 1
     * MAX����: 3
     *
     * @param argField3 �t�B�[���h[field_3]�ɐݒ肷��l�B
     */
    public void setField3(final Integer argField3) {
        fField3 = argField3;
    }

    /**
     * �t�B�[���h [field_3] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h3]�B
     * ���ڔԍ�: 3
     * MIN����: 1
     * MAX����: 3
     *
     * @return �t�B�[���h[field_3]����擾�����l�B
     */
    public Integer getField3() {
        return fField3;
    }

    /**
     * �t�B�[���h [field_4] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h4]�B
     * ���ڔԍ�: 4
     * MIN����: 1
     * MAX����: 3
     *
     * @param argField4 �t�B�[���h[field_4]�ɐݒ肷��l�B
     */
    public void setField4(final Long argField4) {
        fField4 = argField4;
    }

    /**
     * �t�B�[���h [field_4] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h4]�B
     * ���ڔԍ�: 4
     * MIN����: 1
     * MAX����: 3
     * �f�t�H���g: [10]�B
     *
     * @return �t�B�[���h[field_4]����擾�����l�B
     */
    public Long getField4() {
        return fField4;
    }

    /**
     * �t�B�[���h [field_5] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h5]�B
     * ���ڔԍ�: 5
     *
     * @param argField5 �t�B�[���h[field_5]�ɐݒ肷��l�B
     */
    public void setField5(final Date argField5) {
        fField5 = argField5;
    }

    /**
     * �t�B�[���h [field_5] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h5]�B
     * ���ڔԍ�: 5
     *
     * @return �t�B�[���h[field_5]����擾�����l�B
     */
    public Date getField5() {
        return fField5;
    }

    /**
     * �t�B�[���h [field_6] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h6]�B
     * ���ڔԍ�: 6
     * MIN����: 1
     * MAX����: 3
     *
     * @param argField6 �t�B�[���h[field_6]�ɐݒ肷��l�B
     */
    public void setField6(final BigDecimal argField6) {
        fField6 = argField6;
    }

    /**
     * �t�B�[���h [field_6] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h6]�B
     * ���ڔԍ�: 6
     * MIN����: 1
     * MAX����: 3
     *
     * @return �t�B�[���h[field_6]����擾�����l�B
     */
    public BigDecimal getField6() {
        return fField6;
    }

    /**
     * �t�B�[���h [field_11] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h11]�B
     * ���ڔԍ�: 7
     * �K�{����
     *
     * @param argField11 �t�B�[���h[field_11]�ɐݒ肷��l�B
     */
    public void setField11(final String argField11) {
        fField11 = argField11;
    }

    /**
     * �t�B�[���h [field_11] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h11]�B
     * ���ڔԍ�: 7
     * �K�{����
     *
     * @return �t�B�[���h[field_11]����擾�����l�B
     */
    public String getField11() {
        return fField11;
    }

    /**
     * �t�B�[���h [field_12] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h12]�B
     * ���ڔԍ�: 8
     * ������̓_�u���N�I�[�g��������ē��o�͂���܂��B
     * �K�{����
     *
     * @param argField12 �t�B�[���h[field_12]�ɐݒ肷��l�B
     */
    public void setField12(final String argField12) {
        fField12 = argField12;
    }

    /**
     * �t�B�[���h [field_12] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h12]�B
     * ���ڔԍ�: 8
     * ������̓_�u���N�I�[�g��������ē��o�͂���܂��B
     * �K�{����
     *
     * @return �t�B�[���h[field_12]����擾�����l�B
     */
    public String getField12() {
        return fField12;
    }

    /**
     * �t�B�[���h [field_13] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h13]�B
     * ���ڔԍ�: 9
     * �K�{����
     *
     * @param argField13 �t�B�[���h[field_13]�ɐݒ肷��l�B
     */
    public void setField13(final int argField13) {
        fField13 = argField13;
    }

    /**
     * �t�B�[���h [field_13] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h13]�B
     * ���ڔԍ�: 9
     * �K�{����
     *
     * @return �t�B�[���h[field_13]����擾�����l�B
     */
    public int getField13() {
        return fField13;
    }

    /**
     * �t�B�[���h [field_14] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h14]�B
     * ���ڔԍ�: 10
     * �K�{����
     *
     * @param argField14 �t�B�[���h[field_14]�ɐݒ肷��l�B
     */
    public void setField14(final long argField14) {
        fField14 = argField14;
    }

    /**
     * �t�B�[���h [field_14] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h14]�B
     * ���ڔԍ�: 10
     * �K�{����
     *
     * @return �t�B�[���h[field_14]����擾�����l�B
     */
    public long getField14() {
        return fField14;
    }

    /**
     * �t�B�[���h [field_15] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h15]�B
     * ���ڔԍ�: 11
     * �K�{����
     *
     * @param argField15 �t�B�[���h[field_15]�ɐݒ肷��l�B
     */
    public void setField15(final Date argField15) {
        fField15 = argField15;
    }

    /**
     * �t�B�[���h [field_15] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h15]�B
     * ���ڔԍ�: 11
     * �K�{����
     *
     * @return �t�B�[���h[field_15]����擾�����l�B
     */
    public Date getField15() {
        return fField15;
    }

    /**
     * �t�B�[���h [field_16] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h16]�B
     * ���ڔԍ�: 12
     * �K�{����
     *
     * @param argField16 �t�B�[���h[field_16]�ɐݒ肷��l�B
     */
    public void setField16(final BigDecimal argField16) {
        fField16 = argField16;
    }

    /**
     * �t�B�[���h [field_16] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h16]�B
     * ���ڔԍ�: 12
     * �K�{����
     *
     * @return �t�B�[���h[field_16]����擾�����l�B
     */
    public BigDecimal getField16() {
        return fField16;
    }

    /**
     * ���̃o�����[�I�u�W�F�N�g�̕�����\�����擾���܂��B
     *
     * <P>�g�p��̒���</P>
     * <UL>
     * <LI>�I�u�W�F�N�g�̃V�����[�͈͂̂ݕ����񉻂̏����ΏۂƂȂ�܂��B
     * <LI>�I�u�W�F�N�g���z�Q�Ƃ��Ă���ꍇ�ɂ́A���̃��\�b�h�͎g��Ȃ��ł��������B
     * </UL>
     *
     * @return �o�����[�I�u�W�F�N�g�̕�����\���B
     */
    @Override
    public String toString() {
        final StringBuffer buf = new StringBuffer();
        buf.append("blanco.sample.csv.record.BlancoCsvSample2CsvRecord[");
        buf.append("field_1=" + fField1);
        buf.append(",field_2=" + fField2);
        buf.append(",field_3=" + fField3);
        buf.append(",field_4=" + fField4);
        buf.append(",field_5=" + fField5);
        buf.append(",field_6=" + fField6);
        buf.append(",field_11=" + fField11);
        buf.append(",field_12=" + fField12);
        buf.append(",field_13=" + fField13);
        buf.append(",field_14=" + fField14);
        buf.append(",field_15=" + fField15);
        buf.append(",field_16=" + fField16);
        buf.append("]");
        return buf.toString();
    }
}
