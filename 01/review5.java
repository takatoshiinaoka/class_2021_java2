import java.io.*;
// ƒNƒ‰ƒX Car ‚ÌéŒ¾
class Car
{
    double gas; // ƒKƒ\ƒŠƒ“—Ê‚ğŠi”[‚·‚é
    double mileage; // ”R”ïkm/L
}
class review5
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        Car Audi,Bently;
        Audi=new Car();
        Bently=new Car();
        
        
        System.out.println("Audi‚ÌƒKƒ\ƒŠƒ“—Ê‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        Audi.gas=Double.parseDouble(br.readLine());
        System.out.println("Audi‚Ì”R”ï‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        Audi.mileage=Double.parseDouble(br.readLine());
        System.out.println("Audi‚ÌƒKƒ\ƒŠƒ“—Ê‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        Bently.gas=Double.parseDouble(br.readLine());
        System.out.println("Audi‚Ì”R”ï‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        Bently.mileage=Double.parseDouble(br.readLine());

        System.out.println("Audi‚Ì‘–s‰Â”\‹——£‚Í"+(Audi.gas*Audi.mileage)+"km‚Å‚·");
        System.out.println("Bently‚Ì‘–s‰Â”\‹——£‚Í"+(Bently.gas*Bently.mileage)+"km‚Å‚·");

    }
}