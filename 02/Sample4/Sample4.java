class Car{
    int num;
    double gas;

    void setNum(int n){
        num=n;
        System.out.println("�i���o�[��"+num+"�ɂ��܂����B");
    }
    void setGas(double g){
        gas=g;
        System.out.println("�K�\�����̗ʂ�"+gas+"�ɂ��܂����B");
    }
    void show(){
        System.out.println("�Ԃ̃i���o�[��"+num+"�ł��B");
        System.out.println("�K�\�����ʂ�"+gas+"�ł��B");
    }
}
class Sample4{
    public static void main(String[] args){
        Car car1;
        car1 = new Car();

        car1.setNum(1234);
        car1.setGas(20.5);
    }
}