/*
 * ���̃\�[�X�R�[�h�� blanco Framework�ɂ�莩����������܂����B
 */
package blanco.csv.valueobject;

import java.util.List;

/**
 * �\����ێ����܂��B
 */
public class BlancoCsvStructure {
    /**
     * �t�@�C����`ID
     *
     * �t�B�[���h: [name]�B
     */
    private String fName;

    /**
     * �p�b�P�[�W��
     *
     * �t�B�[���h: [package]�B
     */
    private String fPackage;

    /**
     * �t�@�C���̐����B
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
     * �f���~�^��ێ����܂��B�f���~�^�́A�f���~�^����єC�ӎw��f���~�^���瓱���o����܂��B
     *
     * �t�B�[���h: [delimiter]�B
     */
    private String fDelimiter;

    /**
     * �t�@�C���̃G���R�[�f�B���O�B
     *
     * �t�B�[���h: [encoding]�B
     */
    private String fEncoding;

    /**
     * CSV�t�@�C���̃^�C�g���s�̏��
     *
     * �t�B�[���h: [titleRow]�B
     * �f�t�H���g: ["no title"]�B
     */
    private String fTitleRow = "no title";

    /**
     * �����^�C���N���X�𐶐����鐶������w�肵�܂��B�p�b�P�[�W�����m�肳�ꂽ��ԂŊi�[����܂��B
     *
     * �t�B�[���h: [runtimePackage]�B
     */
    private String fRuntimePackage;

    /**
     * �t�B�[���h�̃��X�g�B
     *
     * �t�B�[���h: [fieldList]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.csv.valueobject.BlancoCsvFieldStructure>()]�B
     */
    private List<blanco.csv.valueobject.BlancoCsvFieldStructure> fFieldList = new java.util.ArrayList<blanco.csv.valueobject.BlancoCsvFieldStructure>();

    /**
     * �t�B�[���h [name] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�@�C����`ID]�B
     *
     * @param argName �t�B�[���h[name]�ɐݒ肷��l�B
     */
    public void setName(final String argName) {
        fName = argName;
    }

    /**
     * �t�B�[���h [name] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�@�C����`ID]�B
     *
     * @return �t�B�[���h[name]����擾�����l�B
     */
    public String getName() {
        return fName;
    }

    /**
     * �t�B�[���h [package] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W��]�B
     *
     * @param argPackage �t�B�[���h[package]�ɐݒ肷��l�B
     */
    public void setPackage(final String argPackage) {
        fPackage = argPackage;
    }

    /**
     * �t�B�[���h [package] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�p�b�P�[�W��]�B
     *
     * @return �t�B�[���h[package]����擾�����l�B
     */
    public String getPackage() {
        return fPackage;
    }

    /**
     * �t�B�[���h [description] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�@�C���̐����B]�B
     *
     * @param argDescription �t�B�[���h[description]�ɐݒ肷��l�B
     */
    public void setDescription(final String argDescription) {
        fDescription = argDescription;
    }

    /**
     * �t�B�[���h [description] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�@�C���̐����B]�B
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
     * �t�B�[���h [delimiter] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�f���~�^��ێ����܂��B�f���~�^�́A�f���~�^����єC�ӎw��f���~�^���瓱���o����܂��B]�B
     *
     * @param argDelimiter �t�B�[���h[delimiter]�ɐݒ肷��l�B
     */
    public void setDelimiter(final String argDelimiter) {
        fDelimiter = argDelimiter;
    }

    /**
     * �t�B�[���h [delimiter] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�f���~�^��ێ����܂��B�f���~�^�́A�f���~�^����єC�ӎw��f���~�^���瓱���o����܂��B]�B
     *
     * @return �t�B�[���h[delimiter]����擾�����l�B
     */
    public String getDelimiter() {
        return fDelimiter;
    }

    /**
     * �t�B�[���h [encoding] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�@�C���̃G���R�[�f�B���O�B]�B
     *
     * @param argEncoding �t�B�[���h[encoding]�ɐݒ肷��l�B
     */
    public void setEncoding(final String argEncoding) {
        fEncoding = argEncoding;
    }

    /**
     * �t�B�[���h [encoding] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�@�C���̃G���R�[�f�B���O�B]�B
     *
     * @return �t�B�[���h[encoding]����擾�����l�B
     */
    public String getEncoding() {
        return fEncoding;
    }

    /**
     * �t�B�[���h [titleRow] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [CSV�t�@�C���̃^�C�g���s�̏��]�B
     *
     * @param argTitleRow �t�B�[���h[titleRow]�ɐݒ肷��l�B
     */
    public void setTitleRow(final String argTitleRow) {
        fTitleRow = argTitleRow;
    }

    /**
     * �t�B�[���h [titleRow] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [CSV�t�@�C���̃^�C�g���s�̏��]�B
     * �f�t�H���g: ["no title"]�B
     *
     * @return �t�B�[���h[titleRow]����擾�����l�B
     */
    public String getTitleRow() {
        return fTitleRow;
    }

    /**
     * �t�B�[���h [runtimePackage] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�����^�C���N���X�𐶐����鐶������w�肵�܂��B�p�b�P�[�W�����m�肳�ꂽ��ԂŊi�[����܂��B]�B
     *
     * @param argRuntimePackage �t�B�[���h[runtimePackage]�ɐݒ肷��l�B
     */
    public void setRuntimePackage(final String argRuntimePackage) {
        fRuntimePackage = argRuntimePackage;
    }

    /**
     * �t�B�[���h [runtimePackage] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�����^�C���N���X�𐶐����鐶������w�肵�܂��B�p�b�P�[�W�����m�肳�ꂽ��ԂŊi�[����܂��B]�B
     *
     * @return �t�B�[���h[runtimePackage]����擾�����l�B
     */
    public String getRuntimePackage() {
        return fRuntimePackage;
    }

    /**
     * �t�B�[���h [fieldList] �̒l��ݒ肵�܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̃��X�g�B]�B
     *
     * @param argFieldList �t�B�[���h[fieldList]�ɐݒ肷��l�B
     */
    public void setFieldList(final List<blanco.csv.valueobject.BlancoCsvFieldStructure> argFieldList) {
        fFieldList = argFieldList;
    }

    /**
     * �t�B�[���h [fieldList] �̒l���擾���܂��B
     *
     * �t�B�[���h�̐���: [�t�B�[���h�̃��X�g�B]�B
     * �f�t�H���g: [new java.util.ArrayList<blanco.csv.valueobject.BlancoCsvFieldStructure>()]�B
     *
     * @return �t�B�[���h[fieldList]����擾�����l�B
     */
    public List<blanco.csv.valueobject.BlancoCsvFieldStructure> getFieldList() {
        return fFieldList;
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
        buf.append("blanco.csv.valueobject.BlancoCsvStructure[");
        buf.append("name=" + fName);
        buf.append(",package=" + fPackage);
        buf.append(",description=" + fDescription);
        buf.append(",descriptionList=" + fDescriptionList);
        buf.append(",delimiter=" + fDelimiter);
        buf.append(",encoding=" + fEncoding);
        buf.append(",titleRow=" + fTitleRow);
        buf.append(",runtimePackage=" + fRuntimePackage);
        buf.append(",fieldList=" + fFieldList);
        buf.append("]");
        return buf.toString();
    }
}
