class Car{
    private int num;
    private double gas;
    public Car(){
        num=0;
        gas=0.0;
        System.out.println("�Ԃ��쐬���܂����B");
    }
    public Car(int n,double g){
        num=n;
        gas=g;
        System.out.println("�i���o�["+num+"�K�\������"+gas+"�̎Ԃ��쐬���܂���");
    }
    public void show(){
        System.out.println("�Ԃ̃i���o�[��"+num+"�ł��B");
        System.out.println("�K�\�����ʂ�"+gas+"�ł��B");
    }
}

class Sample4_2{
    public static void main(String[] args){
        Car car1=new Car();
        car1.show();

        Car car2 =new Car(1234,20.5);
        car2.show();
    }
}