import java.io.*;
class review2
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("上底を入力してください");
        int up=Integer.parseInt(br.readLine());
        System.out.println("下底を入力してください");
        int down=Integer.parseInt(br.readLine());
        System.out.println("高さを入力してください");
        int high=Integer.parseInt(br.readLine());

        System.out.println((double)((up+down)*high)/2.0);

    }
}