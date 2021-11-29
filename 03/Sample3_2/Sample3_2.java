//車クラス
class Car{
    private int num;
    private double gas;
    public void setNumGas(int n,double g){
        if(g>0&&g<100){
            num=n;
            gas=g;
            System.out.println("ナンバーを"+num+"にガソリンを"+gas+"にしました。");
        }else{
            System.out.println(g+"は正しいガソリン量ではありません。");
            System.out.println("ガソリン量を変更できませんでした。");
        }
    }
    public void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}
class Sample3_2{
    public static void main(String[] atgs){
        Car car1 = new Car();

        //このようなアクセスはできなくなります
        // car1.num=1234;
        // car1.gas=20.5;

        car1.setNumGas(1234,20.5);
        car1.show();
    }
}