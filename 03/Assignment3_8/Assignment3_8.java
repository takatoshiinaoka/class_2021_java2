// （ここにクラス  の宣言を記述します）
class Battery
{
    // フィールド：
    private int level; //充電レベル[%]

    // メソッド：
    public void setLevel(int a){//充電レベルの設定(入力が0以上100以下の場合のみ設定)
        if(0<=a&&a<=100){
            level=a;
            System.out.println("[充電レベルを"+level+"%に設定しました]");
        }else{
            System.out.println("[異常な充電レベル("+level+"%)です]");
            System.out.println("[充電レベルを設定できませんでした]");
        }
        
    }

    public int getLevel(){//充電レベルの取得
        return level;
    }

}
class Assignment3_8
{
    public static void main(String[] args){
        Battery evolta = new Battery();
        // 充電レベルの設定と表示
        evolta.setLevel(80);
        System.out.println("現在の充電レベルは"+evolta.getLevel()+"%です。");
        // 過充電レベルの設定（異常な値を設定）
        evolta.setLevel(102);
        System.out.println("現在の充電レベルは"+evolta.getLevel()+"%です。");
    }
}