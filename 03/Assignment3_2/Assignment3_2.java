class EvenInt

{
    private int num;//

    public void setInt(int i){
        if(i%2==0){
            num=i;
            System.out.println("値を"+num+"に設定しました。");
        }else{
            System.out.println("偶数ではないので設定できませんでした。");
        }
    }
    public int getInt(){
        return num;
    }


}
class Assignment3_2
{
    public static void main(String[] args){
        EvenInt ei=new EvenInt();
        ei.setInt(12); // 偶数を設定します
        System.out.println(ei.getInt()); // 結果を表示します
        ei.setInt(15); // 奇数を設定してみます
        System.out.println(ei.getInt()); // 結果を表示します
    }
}