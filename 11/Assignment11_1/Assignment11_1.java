import java.io.*;

class TwoToPowerOf extends Thread{
    public void run(){
        int n=0;
        for(int i=0;i<=30;i++){
            if(i==0){n=1;}
            else{
                n*=2;
                System.out.println("2^"+i+"="+n);
            } 
        }   
    }
}

class Assignment11_1{
    public static void main(String[] args){
        // �V�����X���b�h���N��
        TwoToPowerOf ttp=new TwoToPowerOf();
        ttp.start();
        // ���C���X���b�h�͂����ŏI��܂�
        System.out.println("���ʂ����҂����������B");
    }
}