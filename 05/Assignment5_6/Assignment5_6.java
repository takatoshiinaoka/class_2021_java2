import java.io.*;
class Assignment5_6{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("��������͂��Ă��������B");
        System.out.println("�����Ɩ��O�̊Ԃ͔��p�X�y�[�X�����Ă��������B");
        String str =br.readLine();
        int n=str.indexOf(' ');
        System.out.println(n);
        if(n<0)n=str.indexOf('�@');
        System.out.println("�c���́u"+str.substring(0,n)+"�v�A���O�́u"+str.substring(n+1)+"�v�ł��ˁH");

    }
}