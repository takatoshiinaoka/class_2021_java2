import java.io.*;
class review3
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int calltime,charge;

        System.out.println("通話時間(分)を入力してください");
        calltime=Integer.parseInt(br.readLine());

        if(calltime<=3){
            charge=(60/3)*calltime;
        }
        else if(calltime<=10){
            charge=(int)(60+(40.0/7.0)*(calltime-3.0));
        }
        else if(calltime<=30){
            charge=100+(20/10)*(calltime-10);
        }
        else{
            charge=120;
        }

        System.out.println("通話料金は"+charge+"円です");

    }
}