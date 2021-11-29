//車クラス
class Car{
    int num;
    double gas;
    void show(){
        System.out.println("車のナンバーは"+num+"です。");
        System.out.println("ガソリン量は"+gas+"です。");
    }
}
class Sample3_1{
    public static void main(String[] atgs){
        Car car1 = new Car();
        car1.num=1234;
        car1.gas=20.5;

        car1.show();
    }
}