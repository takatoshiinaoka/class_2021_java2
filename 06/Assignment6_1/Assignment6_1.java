import java.io.*;
// ���[��N���X�i�X�[�p�[�N���X�j
class Stationery{
    public String whattodo; // �@�\
    public void showStationery(){
        System.out.println("�@�\:"+whattodo);
    }
}
// �{�[���y���N���X�i�T�u�N���X�j
class BallpointPen extends Stationery{
    public String color; // �F
    public double size; // ����(mm)
    public void showBallpointPen(){
        System.out.println("�y�{�[���y���z");
        showStationery();
        System.out.println("�F�F"+color);
        System.out.println("����(mm):"+size);
    }
}
// �m�[�g�N���X�i�T�u�N���X�j
class Notebook extends Stationery{
    public String color; // �F
    public String size; // ����(mm)
    public void showNotebook(){
        System.out.println("�y�m�[�g�z");
        showStationery();
        System.out.println("�F�F"+color);
        System.out.println("�T�C�Y:"+size);
    }
}
class Assignment6_1{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // �쐬�����T�u�N���X�̓�����m�F�i�{�[���y���N���X�̏ꍇ�j
        BallpointPen mypen=new BallpointPen();
        mypen.whattodo="��������";
        mypen.color="��";
        mypen.size=0.7;
        mypen.showBallpointPen();
        
        // �쐬�����T�u�N���X�̓�����m�F
        Notebook mynote=new Notebook();
        mynote.whattodo="����G���L�^";
        mynote.color="��";
        mynote.size="B5";
        mynote.showNotebook();

    }
}