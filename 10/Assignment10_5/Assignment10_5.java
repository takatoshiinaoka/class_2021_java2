import java.io.*;
class Assignment10_5{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("H:/class_2021_java2/10/Assignment10_5/score.txt");
            BufferedReader br = new BufferedReader(fr);
            // int n = Integer.parseInt(strn);
            String str= "";
            do{
                str = br.readLine();
                System.out.println(str);
                //sum += Integer.parseInt(str);
                
            }while(str!=null);
        }
        //—áŠOˆ—
        catch(IOException e){
            System.out.println(e+"‚ª‘—o‚³‚ê‚Ü‚µ‚½B");
        }
    }
}