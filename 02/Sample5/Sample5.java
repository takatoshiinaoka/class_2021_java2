class Car{
    int num;
    double gas;

    void setNumGas(int n,double g){
        num=n;
        gas=g;
        System.out.println("�Ԃ̃i���o�[��"+num+"�ɃK�\�����̗ʂ�"
        +gas+"�ɂ��܂����B");
    }
    
    void show(){
        System.out.println("�Ԃ̃i���o�[��"+num+"�ł��B");
        System.out.println("�K�\�����ʂ�"+gas+"�ł��B");
    }
}
class Sample5{
    public static void main(String[] args){
        Car car1;
        car1 = new Car();

        int number=1234;
        double gasoline=20.3;
        car1.setNumGas(number,gasoline);
    }
}