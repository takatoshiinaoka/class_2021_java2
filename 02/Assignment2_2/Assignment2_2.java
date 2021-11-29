class Paper
    {
    int width; // 紙の幅（cm）
    int height; // 紙の高さ（cm）
    void setPaper(int w, int h){// 仮引数の値を width と height に代入します
        width=w;
        height=h;
    }
    int getArea(){// 紙の面積を戻り値として返します
        return width*height;
    }
}
class Assignment2_2{
    public static void main(String[] args){
        Paper mypaper;
        mypaper = new Paper();
        mypaper.setPaper(12, 8);
        System.out.println("面積は"+mypaper.getArea()+"cm^2 です");
    }
}