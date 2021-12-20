import java.io.*;

class TwoToPowerOf extends Thread{
    public void run(){
        int n=0;
        for(int i=0;i<=30;i++){
            if(i==0){n=1;}
            else{
                n*=2;
                System.out.println("2^"+i+"="+n);
            } 
        }   
    }
}

class Assignment11_1{
    public static void main(String[] args){
        // 新しいスレッドを起動
        TwoToPowerOf ttp=new TwoToPowerOf();
        ttp.start();
        // メインスレッドはここで終ります
        System.out.println("結果をお待ちください。");
    }
}