//// Module �C���^�t�F�[�X�i�����̐錾�ɂ͎�������Ȃ����Ɓj
interface Module{
    // PC ���i�̃J�e�S�����𕶎���Ƃ��ĕԂ��܂� "CPU"�C"�}�E�X"�Ȃ�
    String getCategory();
    // PC ���i�̏���\�����܂� CPU �ł͐����ҁA���x�Ȃ�
    void showInfor();
}
// �n�[�h�f�B�X�N�N���X�i��j
class HardDrive implements Module{ // �C���^�t�F�[�X�̎���
    private String name;
    private int capacity;
    HardDrive(String n, int c){
        name=n;
        capacity=c;
    }
    public String getCategory(){
        return "HardDrive";
    }
    public void showInfor(){
        System.out.println(name+", "+capacity+"GB");
    }
}
// �}�E�X
class Mouse implements Module{ // �C���^�t�F�[�X�̎���
    private String name;
    private String maker;
    private String type;//�L���A�����Ȃ�
    private String color;//�F
    Mouse(String n, String t,String c,String m){
        name=n;
        maker=m;
        type=t;
        color=c;
    }
    public String getCategory(){
        return "Mouse";
    }
    public void showInfor(){
        System.out.println(name+", "+maker+", "+type+", "+color);
    }
}
// ������
class Memory implements Module{ // �C���^�t�F�[�X�̎���
    private String name;
    private String maker;
    private int capacity;
    private String size;//�f�X�N�g�b�v�p�����b�v�g�b�v�p��
    Memory(String n, String m,int c,String s){
        name=n;
        maker=m;
        capacity=c;
        size=s;
    }
    public String getCategory(){
        return "Memory";
    }
    public void showInfor(){
        System.out.println(name+", "+maker+", "+capacity+"GB"+size);
    }
}