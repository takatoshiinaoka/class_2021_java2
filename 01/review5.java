import java.io.*;
// クラス Car の宣言
class Car
{
    double gas; // ガソリン量を格納する
    double mileage; // 燃費km/L
}
class review5
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Car Audi,Bently;
        Audi=new Car();
        Bently=new Car();
        
        
        System.out.println("Audiのガソリン量を入力してください");
        Audi.gas=Double.parseDouble(br.readLine());
        System.out.println("Audiの燃費を入力してください");
        Audi.mileage=Double.parseDouble(br.readLine());
        System.out.println("Audiのガソリン量を入力してください");
        Bently.gas=Double.parseDouble(br.readLine());
        System.out.println("Audiの燃費を入力してください");
        Bently.mileage=Double.parseDouble(br.readLine());

        System.out.println("Audiの走行可能距離は"+(Audi.gas*Audi.mileage)+"kmです");
        System.out.println("Bentlyの走行可能距離は"+(Bently.gas*Bently.mileage)+"kmです");

    }
}