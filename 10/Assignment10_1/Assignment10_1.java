import java.io.*;
class Assignment10_1{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("H:/class_2021_java2/10/Assignment10_1/data.txt");
            BufferedReader br = new BufferedReader(fr);
            String strn = br.readLine();
            int n = Integer.parseInt(strn);
            int sum=0;
            for(int i=0;i<n;i++){
                String str = br.readLine();
                //System.out.println(str);
                sum += Integer.parseInt(str);
            }
            System.out.println("合計は"+sum+"です");
        }
        //例外処理
        catch(IOException e){
            System.out.println(e+"が送出されました。");
        }
    }
}