import java.io.*;
class Assignment9_5{
    public static void main(String[] args){
        try{
            BufferedReader br;
            br = new BufferedReader(new InputStreamReader(System.in));
            String name;
            System.out.println("名前を入力してください");

            System.in.close();//IOExceptionエラー発生

            name = br.readLine();
            System.out.println("入力された名前は"+name+"です");
        }
        //例外処理
        catch(IOException e){
            System.out.println(e+"が送出されました。");
        }
    }
}