import java.io.*;
class review4
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        // 配列変数の宣言
        int[] num; 
        int sum=0;
        double ave=0;
        // 配列要素の確保
        num = new int[8];

        for(int i=0;i<5;i++){
            System.out.println((i+1)+"番目の数字を入力してください");
            num[i]=Integer.parseInt(br.readLine());
            sum+=num[i];
        }

        // for(int i=0;i<5;i++){
        //     System.out.println(num[i]+" ");
        // }
        
        System.out.println("合計は"+sum+"です");
        System.out.println("平均は"+(sum/5.0)+"です");

    }
}