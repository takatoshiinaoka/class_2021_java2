import java.io.*;
class review2
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        System.out.println("ã’ê‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        int up=Integer.parseInt(br.readLine());
        System.out.println("‰º’ê‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        int down=Integer.parseInt(br.readLine());
        System.out.println("‚‚³‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢");
        int high=Integer.parseInt(br.readLine());

        System.out.println((double)((up+down)*high)/2.0);

    }
}