class Triangle
{
    private double height; // 高さ
    private double base; // 底辺
    public Triangle(double h,double b){
        height=h;
        base=b;
    }
    public void setHeight(double h){ // 高さの設定
        height = h;
    }
    public void setBase(double b){ // 底辺の設定
        base = b;
    }
    public double getArea(){ // 面積の計算
        return(height*base/2.0);
    }
}
class Assignment4_1
{
    public static void main(String[] args){
        // このように初期設定がしたい
        Triangle tr;
        tr = new Triangle(10.5, 2.5);
        System.out.println("三角形の面積は"+tr.getArea()+"です");
    }
}