import java.io.*;
class Assignment5_6{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("氏名を入力してください。");
        System.out.println("氏名と名前の間は半角スペースを入れてください。");
        String str =br.readLine();
        int n=str.indexOf(' ');
        System.out.println(n);
        if(n<0)n=str.indexOf('　');
        System.out.println("苗字は「"+str.substring(0,n)+"」、名前は「"+str.substring(n+1)+"」ですね？");

    }
}