import java.io.*;
class Assignment5_4{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double a=0,b=0;
        System.out.println("aのb乗を求めます");
        System.out.println("実数aの値を入力してください");
        String str1 =br.readLine();
        a=Double.parseDouble(str1);
        System.out.println("実数bの値を入力してください");
        String str2 =br.readLine();
        b=Double.parseDouble(str2);
        
        System.out.println(a+" の"+b+" 乗は"+Math.pow(a,b)+"です");

    }
}