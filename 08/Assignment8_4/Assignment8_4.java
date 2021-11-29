// Operation インタフェース （※この宣言には手を加えないこと）
interface Operation{
    int getNumOfOperands(); // オペランドの数を返します
    void setOperands(double[] values); // オペランドを設定します
    String getExpression(); // 設定したオペランドで式を生成します
    double getAnswer(); // 設定したオペランドで式の結果を返します
}
// 距離演算子クラス（演算子インタフェース実装例 1）
class Distance implements Operation{
    private double x1, y1, x2, y2;
    public int getNumOfOperands(){
        return(4);
    }
    public void setOperands(double[] values){
        x1=values[0]; y1=values[1];
        x2=values[2]; y2=values[3];
    }
    public String getExpression(){
        return("座標("+x1+","+y1+")と座標("+x2+","+y2+")間の距離?");
    }
    public double getAnswer(){
        return(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
    }
}
// 加算演算子クラス（演算子インタフェース実装例 2）
class Addition implements Operation{
    private double n1, n2;
    public int getNumOfOperands(){
        return(2);
    }
    public void setOperands(double[] values){
        n1=values[0]; n2=values[1];
    }
    public String getExpression(){
        return(n1+"+"+n2+"?");
    }
    public double getAnswer(){
        return(n1+n2);
    }
}
// 円面積クラス（演算子インタフェース実装　オリジナル）
class Area_of_a_circle implements Operation{
    private double n1;
    public int getNumOfOperands(){
        return(1);
    }
    public void setOperands(double[] values){
        n1=values[0];
    }
    public String getExpression(){
        return("π×"+n1+"^2?");
    }
    public double getAnswer(){
        return(Math.PI*n1*n1);
    }
}

// 問題生成クラス （※この宣言には手を加えないこと）
final class PrintQuestion{
    // 演算子インタフェースを実装したクラスのオブジェクト用い、
    // 乱数でオペランドを与えながら問題を作成します
    public static void prtWithRand(Operation op){
        double[] values=new double[op.getNumOfOperands()];
        for(int i=0;i<values.length;i++)
            values[i]=(int)(Math.random()*10);
        op.setOperands(values);
        System.out.println("Q."+op.getExpression());
        System.out.println("A."+op.getAnswer());
        System.out.println();
    }
    // 演算子インタフェースを実装したクラスのオブジェクト用い、
    // 与えられたオペランドで問題を作成します
    public static void prtWithValues(Operation op, double[] values){
        op.setOperands(values);
        System.out.println("Q."+op.getExpression());
        System.out.println("A."+op.getAnswer());
        System.out.println();
    }
}

class Assignment8_4{
    public static void main(String[] args){
        Distance dis=new Distance();
        Addition add=new Addition();
        Area_of_a_circle Aoac=new Area_of_a_circle();
        PrintQuestion.prtWithRand(dis);
        PrintQuestion.prtWithRand(add);
        PrintQuestion.prtWithRand(Aoac);
    }
}