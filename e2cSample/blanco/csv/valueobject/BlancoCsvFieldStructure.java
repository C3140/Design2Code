/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.csv.valueobject;

import java.util.List;

/**
 * �t�B�[���h�\����ێ����܂��B
 */
public class BlancoCsvFieldStructure {
    /**
     * �s�ԍ��B
     *
     * �t�B�[���h: [no]�B
     */
    private String fNo;

    /**
     * �t�B�[���h���B
     *
     * �t�B�[���h: [name]�B
     */
    private String fName;

    /**
     * �t�B�[���h�̌^�B
     *
     * �t�B�[���h: [type]�B
     */
    private String fType;

    /**
     * �t�B�[���h�̐����B
     *
     * �t�B�[���h: [description]�B
     */
    private String fDescription;

    /**
     * �N���X�̕⏕�����ł��B�����Q�ƃG���R�[�h�ς݂̒l���i�[���Ă��������B
     *
     * �t�B�[���h: [descriptionList]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     */
    private List<java.lang.String> fDescriptionList = new java.util.ArrayList<java.lang.String>();

    /**
     * �K�{�B
     *
     * �t�B�[���h: [required]�B
     * �f�t�H���g: [false]�B
     */
    private boolean fRequired = false;

    /**
     * �ŏ������B
     *
     * �t�B�[���h: [minLength]�B
     */
    private String fMinLength;

    /**
     * �ő咷���B
     *
     * �t�B�[���h: [maxLength]�B
     */
    private String fMaxLength;

    /**
     * �f�t�H���g�l�B
     *
     * �t�B�[���h: [default]�B
     */
    private String fDefault;

    /**
     * �t�H�[�}�b�g(���K�\��)
     *
     * �t�B�[���h: [format]�B
     */
    private String fFormat;

    /**
     * �t�B�[���h [no] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�s�ԍ��B]�B
     *
     * @param argNo �t�B�[���h[no]�ɐݒ肷��l�B
     */
    public void setNo(final String argNo) {
        fNo = argNo;
    }

    /**
     * �t�B�[���h [no] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�s�ԍ��B]�B
     *
     * @return �t�B�[���h[no]����擾�����l�B
     */
    public String getNo() {
        return fNo;
    }

    /**
     * �t�B�[���h [name] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h���B]�B
     *
     * @param argName �t�B�[���h[name]�ɐݒ肷��l�B
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * �t�B�[���h [name] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h���B]�B
     *
     * @return �t�B�[���h[name]����擾�����l�B
     */
    public String getName() {
        return fName;
    }

    /**
     * �t�B�[���h [type] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̌^�B]�B
     *
     * @param argType �t�B�[���h[type]�ɐݒ肷��l�B
     */
    public void setType(final String argType) {
        fType = argType;
    }

    /**
     * �t�B�[���h [type] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̌^�B]�B
     *
     * @return �t�B�[���h[type]����擾�����l�B
     */
    public String getType() {
        return fType;
    }

    /**
     * �t�B�[���h [description] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̐����B]�B
     *
     * @param argDescription �t�B�[���h[description]�ɐݒ肷��l�B
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * �t�B�[���h [description] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̐����B]�B
     *
     * @return �t�B�[���h[description]����擾�����l�B
     */
    public String getDescription() {
        return fDescription;
    }

    /**
     * �t�B�[���h [descriptionList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�N���X�̕⏕�����ł��B�����Q�ƃG���R�[�h�ς݂̒l���i�[���Ă��������B]�B
     *
     * @param argDescriptionList �t�B�[���h[descriptionList]�ɐݒ肷��l�B
     */
    public void setDescriptionList(final List<java.lang.String> argDescriptionList) {
        fDescriptionList = argDescriptionList;
    }

    /**
     * �t�B�[���h [descriptionList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�N���X�̕⏕�����ł��B�����Q�ƃG���R�[�h�ς݂̒l���i�[���Ă��������B]�B
     * �f�t�H���g: [new java.util.ArrayList<java.lang.String>()]�B
     *
     * @return �t�B�[���h[descriptionList]����擾�����l�B
     */
    public List<java.lang.String> getDescriptionList() {
        return fDescriptionList;
    }

    /**
     * �t�B�[���h [required] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�K�{�B]�B
     *
     * @param argRequired �t�B�[���h[required]�ɐݒ肷��l�B
     */
    public void setRequired(final boolean argRequired) {
        fRequired = argRequired;
    }

    /**
     * �t�B�[���h [required] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�K�{�B]�B
     * �f�t�H���g: [false]�B
     *
     * @return �t�B�[���h[required]����擾�����l�B
     */
    public boolean getRequired() {
        return fRequired;
    }

    /**
     * �t�B�[���h [minLength] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�ŏ������B]�B
     *
     * @param argMinLength �t�B�[���h[minLength]�ɐݒ肷��l�B
     */
    public void setMinLength(final String argMinLength) {
        fMinLength = argMinLength;
    }

    /**
     * �t�B�[���h [minLength] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�ŏ������B]�B
     *
     * @return �t�B�[���h[minLength]����擾�����l�B
     */
    public String getMinLength() {
        return fMinLength;
    }

    /**
     * �t�B�[���h [maxLength] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�ő咷���B]�B
     *
     * @param argMaxLength �t�B�[���h[maxLength]�ɐݒ肷��l�B
     */
    public void setMaxLength(final String argMaxLength) {
        fMaxLength = argMaxLength;
    }

    /**
     * �t�B�[���h [maxLength] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�ő咷���B]�B
     *
     * @return �t�B�[���h[maxLength]����擾�����l�B
     */
    public String getMaxLength() {
        return fMaxLength;
    }

    /**
     * �t�B�[���h [default] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l�B]�B
     *
     * @param argDefault �t�B�[���h[default]�ɐݒ肷��l�B
     */
    public void setDefault(final String argDefault) {
        fDefault = argDefault;
    }

    /**
     * �t�B�[���h [default] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f�t�H���g�l�B]�B
     *
     * @return �t�B�[���h[default]����擾�����l�B
     */
    public String getDefault() {
        return fDefault;
    }

    /**
     * �t�B�[���h [format] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�H�[�}�b�g(���K�\��)]�B
     *
     * @param argFormat �t�B�[���h[format]�ɐݒ肷��l�B
     */
    public void setFormat(final String argFormat) {
        fFormat = argFormat;
    }

    /**
     * �t�B�[���h [format] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�H�[�}�b�g(���K�\��)]�B
     *
     * @return �t�B�[���h[format]����擾�����l�B
     */
    public String getFormat() {
        return fFormat;
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
        buf.append("blanco.csv.valueobject.BlancoCsvFieldStructure[");
        buf.append("no=" + fNo);
        buf.append(",name=" + fName);
        buf.append(",type=" + fType);
        buf.append(",description=" + fDescription);
        buf.append(",descriptionList=" + fDescriptionList);
        buf.append(",required=" + fRequired);
        buf.append(",minLength=" + fMinLength);
        buf.append(",maxLength=" + fMaxLength);
        buf.append(",default=" + fDefault);
        buf.append(",format=" + fFormat);
        buf.append("]");
        return buf.toString();
    }
}
