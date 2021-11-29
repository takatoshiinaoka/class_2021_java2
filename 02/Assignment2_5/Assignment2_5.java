// （ここにクラス Window の宣言を記述します）
class Window
{
    // フィールド：
    String title; // ウィンドウタイトル
    int width; // ウィンドウのサイズ（横幅ピクセル）
    int height; // ウィンドウのサイズ（縦幅ピクセル）
    // メソッド：
    void setTitle(String t){// ウィンドウタイトルを設定します
        title=t;
    } 
    void setWidth(int w){// ウィンドウのサイズ（横）を設定します
        width=w;
    } 
    void setHeight(int h){// ウィンドウのサイズ（縦）を設定します
        height=h;
    } 
    void showWindow(){// ウィンドウ情報を表示します
        System.out.println("ウィンドウ["+title+"]("+width+"×"+height+")");
    } 

}
class Assignment2_5
{
    public static void main(String[] args){
        // オブジェクトの生成
        Window win=new Window();
        // タイトルとサイズの設定
        win.setTitle("CPad for Java");
        win.setWidth(1024);
        win.setHeight(768);
        // ウィンドウ情報の表示
        win.showWindow();
    }
}