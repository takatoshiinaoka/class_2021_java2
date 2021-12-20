import java.io.*;

class Sum extends Thread{
    // ���v�����߂�͈͂ƍ��ݕ�
    private int from;
    private int to;
    private int skip;
    // ���v
    private int sum;
    // �e��l���R���X�g���N�^�Őݒ�
    public Sum(int f, int t, int s){
        from=f;
        to=t;
        skip=s;
    }
    // ���v�̌v�Z�����s
    public void run(){
        sum=0;
        for(int i=from;i<=to;i+=skip)
        sum += i;
    }
    // ���v�̎擾
    public int getSum(){
        return sum;
    }
}

class Assignment11_6{
    public static void main(String[] args){
        Sum thread1=new Sum(2,100,2);
        Sum thread2=new Sum(1,100,2);
        thread1.start();
        thread2.start();

        //for(int i=0;i<100;i++){}
        
        System.out.println("[���ʔ��\]");
        System.out.println("��̍��v "+ thread1.getSum());
        System.out.println("�����̍��v "+ thread2.getSum());
        System.out.println("���@�@�@�v "+(thread1.getSum()+thread2.getSum()) );
    }
}
