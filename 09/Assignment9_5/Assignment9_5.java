import java.io.*;
class Assignment9_5{
    public static void main(String[] args){
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            String name;
            System.out.println("���O����͂��Ă�������");

            System.in.close();//IOException�G���[����

            name = br.readLine();
            System.out.println("���͂��ꂽ���O��"+name+"�ł�");
        }
        //��O����
        catch(IOException e){
            System.out.println(e+"�����o����܂����B");
        }
    }
}