//���炷
class Car{
    private int num;
    private double gas;
    public Car(){
        num=0;
        gas=0.0;
        System.out.println("�Ԃ��쐬���܂����B");
    }
    public void show(){
        System.out.println("�Ԃ̃i���o�[��"+num+"�ł��B");
        System.out.println("�K�\�����ʂ�"+gas+"�ł��B");
    }
}

class Sample4_1{
        public static void main(String[] args){
            Car car1 = new Car();
            car1.show();
        }
    }