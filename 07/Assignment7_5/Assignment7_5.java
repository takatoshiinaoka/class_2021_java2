// �X�[�p�[�N���X Gadget
class Gadget{
    private String name; // ���i��
    private int price; // ���i

    //private String price =�@Integer.toString(price);

    public Gadget(String n, int p){
        name=n;
        price=p;
    }
    public String toString(){
        return name+"/��"+price;
    }
    public void show(){
        System.out.println("���i���F"+name+"�A���i�F"+price+"�~");
    }
}

// �T�u�N���X Mp3Player
class Mp3Player extends Gadget{
    private int memory; // �e�� GB
    public Mp3Player(String n, int p, int m){
        super(n, p); // �X�[�p�[�N���X�̃R���X�g���N�^���Ă�
        memory = m;
    }
    public String toString(){
        String str= super.toString()+"/"+memory+"GB";
        return str;
    }
    public void show(){
        System.out.println("[MP3Player]");
        super.show(); // �p�����ꂽ���\�b�h���g�p
        System.out.println("�������F"+memory+"GB");
    }
}

// �T�u�N���X Mobile
class Mobile extends Gadget{
    private String number; // �ԍ�
    public Mobile (String n, int p, String num){
        super(n, p); // �X�[�p�[�N���X�̃R���X�g���N�^���Ă�
        number = num;
    }
    public String toString(){
        String str=super.toString()+"/#"+number;
        return str;
    }
    public void show(){
        System.out.println("[Mobile]");
        super.show(); // �p�����ꂽ���\�b�h���g�p
        System.out.println("�ԍ��F"+number);
    }
}

class Assignment7_5{
    public static void main(String[] args){
        //�v��1
        System.out.println("�v��1");
        Gadget g=new Mp3Player("NW-A35", 20800, 16);
        g.show();
        System.out.println();
        //�v��2 Mobile
        System.out.println("�v��2 Mobile");
        Mobile m=new Mobile("iPhone7Plus", 82300, "092-111-4321");
        System.out.println(m.toString());
        System.out.println();
        //�v��2 MpPlayer
        System.out.println("�v��2 MpPlayer");
        System.out.println(g.toString());
    }
}