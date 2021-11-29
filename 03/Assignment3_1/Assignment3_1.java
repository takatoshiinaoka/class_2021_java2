class Score
{
    private int point;//得点

    //得点設定メソッド
    public void setPoint(int p){//値を検査して0~100であれば代入します
        if(0<=p&&p<=100){
            point=p;
            System.out.println("[得点を"+point+"点に設定しました]");
        }else{
            System.out.println("[得点を設定できませんでした]");
        }
    }

    //現設定値取得メソッド
    public int getPoint(){//現在の値を戻り値として返します
        return point;
    }


}
class Assignment3_1{
    public static void main(String[] args){
        Score sc=new Score();
        sc.setPoint(90); // 90 点を設定します
        System.out.println(sc.getPoint()); // 得点を表示します
        sc.setPoint(-10); // -10 点を設定してみます
        System.out.println(sc.getPoint()); //得点を表示します
    }
}