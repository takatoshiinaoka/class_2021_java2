import java.io.*;
// 文房具クラス（スーパークラス）
class Stationery{
    public String whattodo; // 機能
    public void showStationery(){
        System.out.println("機能:"+whattodo);
    }
}
// ボールペンクラス（サブクラス）
class BallpointPen extends Stationery{
    public String color; // 色
    public double size; // 太さ(mm)
    public void showBallpointPen(){
        System.out.println("【ボールペン】");
        showStationery();
        System.out.println("色："+color);
        System.out.println("太さ(mm):"+size);
    }
}
// ノートクラス（サブクラス）
class Notebook extends Stationery{
    public String color; // 色
    public String size; // 太さ(mm)
    public void showNotebook(){
        System.out.println("【ノート】");
        showStationery();
        System.out.println("色："+color);
        System.out.println("サイズ:"+size);
    }
}
class Assignment6_1{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // 作成したサブクラスの動作を確認（ボールペンクラスの場合）
        BallpointPen mypen=new BallpointPen();
        mypen.whattodo="字を書く";
        mypen.color="青";
        mypen.size=0.7;
        mypen.showBallpointPen();
        
        // 作成したサブクラスの動作を確認
        Notebook mynote=new Notebook();
        mynote.whattodo="字や絵を記録";
        mynote.color="赤";
        mynote.size="B5";
        mynote.showNotebook();

    }
}