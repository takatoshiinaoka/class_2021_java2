import java.io.*;
class review1
{
    public static void main(String[] args)throws IOException
    {
        System.out.println("整数を入力してください");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int num=Integer.parseInt(br.readLine());
        System.out.println(num);

    }
}