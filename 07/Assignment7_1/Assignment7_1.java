class A{
    private int x;

    public A(int a){
        x=a;
    }
    public void show(){
    System.out.println(x);
    }
}
class B extends A{
    private int y;

    public B(int a, int b){
        super(a);
        y=b;
    }
    public void show(){
    super.show();
    System.out.println(y);
    }
}

class Assignment7_1{
    public static void main(String[] args){
        A a=new B(10,20);
        a.show();
    }
}
