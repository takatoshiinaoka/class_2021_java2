import java.io.*;
class Assignment5_4{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double a=0,b=0;
        System.out.println("a��b������߂܂�");
        System.out.println("����a�̒l����͂��Ă�������");
        String str1 =br.readLine();
        a=Double.parseDouble(str1);
        System.out.println("����b�̒l����͂��Ă�������");
        String str2 =br.readLine();
        b=Double.parseDouble(str2);
        
        System.out.println(a+" ��"+b+" ���"+Math.pow(a,b)+"�ł�");

    }
}