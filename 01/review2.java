import java.io.*;
class review2
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("������͂��Ă�������");
        int up=Integer.parseInt(br.readLine());
        System.out.println("�������͂��Ă�������");
        int down=Integer.parseInt(br.readLine());
        System.out.println("��������͂��Ă�������");
        int high=Integer.parseInt(br.readLine());

        System.out.println((double)((up+down)*high)/2.0);

    }
}