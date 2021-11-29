class OverLoadTest
{
    private int i;
    private double d;
    private String s;
    public void setValue(int n){
        i=n;
    }
    public void setValue(double n){
        d=n;
    }
    public void setValue(String n){
        s=n;
    }
    public void dispValue(){
        System.out.println("int="+i+", double="+d+", String="+s);
    }
}
class Assignment3_3
{
    public static void main(String[] args){
        OverLoadTest olt=new OverLoadTest();
        //olt.setInt(10);
        //olt.setDouble(12.5);
        //olt.setString("Hello");
        //olt.dispValue();
        // 次のようにアクセスしたい！！
        olt.setValue(10);
        olt.setValue(12.5);
        olt.setValue("OverLoad");
        olt.dispValue();
    }
}