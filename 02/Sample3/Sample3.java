class Car{
    int num;
    double gas;

    void show(){
        System.out.println("�Ԃ̃i���o�[��"+num+"�ł��B");
        System.out.println("�K�\�����ʂ�"+gas+"�ł��B");
    }
    void showCar(){
        System.out.println("���ꂩ��Ԃ̏���\�����܂��B");
        show();
    }
}
class Sample3{
    public static void main(String[] args){
        Car car1;
        car1 = new Car();

        car1.num=1234;
        car1.gas=20.5;
        
        car1.showCar();
    }
}