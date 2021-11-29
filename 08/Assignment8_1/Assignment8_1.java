//// Module インタフェース（※この宣言には手を加えないこと）
interface Module{
    // PC 部品のカテゴリ名を文字列として返します "CPU"，"マウス"など
    String getCategory();
    // PC 部品の情報を表示します CPU では製造者、速度など
    void showInfor();
}
// ハードディスククラス（例）
class HardDrive implements Module{ // インタフェースの実装
    private String name;
    private int capacity;
    HardDrive(String n, int c){
        name=n;
        capacity=c;
    }
    public String getCategory(){
        return "HardDrive";
    }
    public void showInfor(){
        System.out.println(name+", "+capacity+"GB");
    }
}
// マウス
class Mouse implements Module{ // インタフェースの実装
    private String name;
    private String maker;
    private String type;//有線、無線など
    private String color;//色
    Mouse(String n, String t,String c,String m){
        name=n;
        maker=m;
        type=t;
        color=c;
    }
    public String getCategory(){
        return "Mouse";
    }
    public void showInfor(){
        System.out.println(name+", "+maker+", "+type+", "+color);
    }
}
// メモリ
class Memory implements Module{ // インタフェースの実装
    private String name;
    private String maker;
    private int capacity;
    private String size;//デスクトップ用かラップトップ用か
    Memory(String n, String m,int c,String s){
        name=n;
        maker=m;
        capacity=c;
        size=s;
    }
    public String getCategory(){
        return "Memory";
    }
    public void showInfor(){
        System.out.println(name+", "+maker+", "+capacity+"GB"+size);
    }
}