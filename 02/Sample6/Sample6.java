class Car{
    int num;
    double gas;

    int getNum(){
        System.out.println("�i���o�[�𒲂ׂ܂����B");
        return num;
    }
    double getGus(){
        System.out.println("�K�\�����ʂ𒲂ׂ܂����B");
        return gas;
    }
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
class Sample6{
    public static void main(String[] args){
        Car car1;
        car1 = new Car();
        car1.setNumGas(1234,20.5);

        int number=car1.getNum();
        double gasoline=car1.getGus();

        System.out.println("�T���v������Ԃ𒲂ׂ��Ƃ���");   
        System.out.println("�i���o�[��"+number+"�K�\�����ʂ�"+gasoline+"�ł����B");       
    }
}