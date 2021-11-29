import java.io.*;
class Assignment5_4{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        double a=0,b=0;
        System.out.println("a‚Ìbæ‚ğ‹‚ß‚Ü‚·");
        System.out.println("À”a‚Ì’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        String str1 =br.readLine();
        a=Double.parseDouble(str1);
        System.out.println("À”b‚Ì’l‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        String str2 =br.readLine();
        b=Double.parseDouble(str2);
        
        System.out.println(a+" ‚Ì"+b+" æ‚Í"+Math.pow(a,b)+"‚Å‚·");

    }
}