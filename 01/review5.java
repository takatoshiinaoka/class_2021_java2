import java.io.*;
// �N���X Car �̐錾
class Car
{
    double gas; // �K�\�����ʂ��i�[����
    double mileage; // �R��km/L
}
class review5
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Car Audi,Bently;
        Audi=new Car();
        Bently=new Car();
        
        
        System.out.println("Audi�̃K�\�����ʂ���͂��Ă�������");
        Audi.gas=Double.parseDouble(br.readLine());
        System.out.println("Audi�̔R�����͂��Ă�������");
        Audi.mileage=Double.parseDouble(br.readLine());
        System.out.println("Audi�̃K�\�����ʂ���͂��Ă�������");
        Bently.gas=Double.parseDouble(br.readLine());
        System.out.println("Audi�̔R�����͂��Ă�������");
        Bently.mileage=Double.parseDouble(br.readLine());

        System.out.println("Audi�̑��s�\������"+(Audi.gas*Audi.mileage)+"km�ł�");
        System.out.println("Bently�̑��s�\������"+(Bently.gas*Bently.mileage)+"km�ł�");

    }
}