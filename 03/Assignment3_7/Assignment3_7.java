// （ここにクラス USB の宣言を記述します）
class USB
{
    private int capacity; // 容量（GB）
    public void setCap(int c){ // 容量の設定（入力値が 0 以上の場合のみ設定します）
        if(0<=c){
            capacity=c;
            System.out.println("容量を"+capacity+"に設定しました。");
        }else{
            System.out.println("容量を設定できませんでした。");
        }
    }
    public int getCap(){ // 容量の取得
        return capacity; 
    }
}
class Assignment3_7
{
    public static void main(String[] args){
        USB ToteBag = new USB();
        // 容量データの設定と表示
        ToteBag.setCap(16);
        System.out.println("USB メモリ("+ToteBag.getCap()+"GB)");
        // 容量データの設定と表示（異常な値を設定）
        ToteBag.setCap(-32);
        System.out.println("USB メモリ("+ToteBag.getCap()+"GB)");
    }
}