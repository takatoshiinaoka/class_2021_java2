import java.io.*;
class review4
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        // �z��ϐ��̐錾
        int[] num; 
        int sum=0;
        double ave=0;
        // �z��v�f�̊m��
        num = new int[8];

        for(int i=0;i<5;i++){
            System.out.println((i+1)+"�Ԗڂ̐�������͂��Ă�������");
            num[i]=Integer.parseInt(br.readLine());
            sum+=num[i];
        }

        // for(int i=0;i<5;i++){
        //     System.out.println(num[i]+" ");
        // }
        
        System.out.println("���v��"+sum+"�ł�");
        System.out.println("���ς�"+(sum/5.0)+"�ł�");

    }
}