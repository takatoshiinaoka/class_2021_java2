class Triangle
{
    private double height; // ‚‚³
    private double base; // ’ê•Ó
    public Triangle(double h,double b){
        height=h;
        base=b;
    }
    public void setHeight(double h){ // ‚‚³‚Ìİ’è
        height = h;
    }
    public void setBase(double b){ // ’ê•Ó‚Ìİ’è
        base = b;
    }
    public double getArea(){ // –ÊÏ‚ÌŒvZ
        return(height*base/2.0);
    }
}
class Assignment4_1
{
    public static void main(String[] args){
        // ‚±‚Ì‚æ‚¤‚É‰Šúİ’è‚ª‚µ‚½‚¢
        Triangle tr;
        tr = new Triangle(10.5, 2.5);
        System.out.println("OŠpŒ`‚Ì–ÊÏ‚Í"+tr.getArea()+"‚Å‚·");
    }
}