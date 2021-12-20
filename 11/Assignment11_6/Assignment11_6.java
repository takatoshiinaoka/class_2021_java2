import java.io.*;

class Sum extends Thread{
    // 総計を求める範囲と刻み幅
    private int from;
    private int to;
    private int skip;
    // 総計
    private int sum;
    // 各種値をコンストラクタで設定
    public Sum(int f, int t, int s){
        from=f;
        to=t;
        skip=s;
    }
    // 総計の計算を実行
    public void run(){
        sum=0;
        for(int i=from;i<=to;i+=skip)
        sum += i;
    }
    // 総計の取得
    public int getSum(){
        return sum;
    }
}

class Assignment11_6{
    public static void main(String[] args){
        Sum thread1=new Sum(2,100,2);
        Sum thread2=new Sum(1,100,2);
        thread1.start();
        thread2.start();

        //for(int i=0;i<100;i++){}
        
        System.out.println("[結果発表]");
        System.out.println("奇数の合計 "+ thread1.getSum());
        System.out.println("偶数の合計 "+ thread2.getSum());
        System.out.println("総　　　計 "+(thread1.getSum()+thread2.getSum()) );
    }
}
