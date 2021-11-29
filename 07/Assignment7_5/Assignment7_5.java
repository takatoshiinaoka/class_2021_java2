// スーパークラス Gadget
class Gadget{
    private String name; // 製品名
    private int price; // 価格

    //private String price =　Integer.toString(price);

    public Gadget(String n, int p){
        name=n;
        price=p;
    }
    public String toString(){
        return name+"/￥"+price;
    }
    public void show(){
        System.out.println("製品名："+name+"、価格："+price+"円");
    }
}

// サブクラス Mp3Player
class Mp3Player extends Gadget{
    private int memory; // 容量 GB
    public Mp3Player(String n, int p, int m){
        super(n, p); // スーパークラスのコンストラクタを呼ぶ
        memory = m;
    }
    public String toString(){
        String str= super.toString()+"/"+memory+"GB";
        return str;
    }
    public void show(){
        System.out.println("[MP3Player]");
        super.show(); // 継承されたメソッドを使用
        System.out.println("メモリ："+memory+"GB");
    }
}

// サブクラス Mobile
class Mobile extends Gadget{
    private String number; // 番号
    public Mobile (String n, int p, String num){
        super(n, p); // スーパークラスのコンストラクタを呼ぶ
        number = num;
    }
    public String toString(){
        String str=super.toString()+"/#"+number;
        return str;
    }
    public void show(){
        System.out.println("[Mobile]");
        super.show(); // 継承されたメソッドを使用
        System.out.println("番号："+number);
    }
}

class Assignment7_5{
    public static void main(String[] args){
        //要件1
        System.out.println("要件1");
        Gadget g=new Mp3Player("NW-A35", 20800, 16);
        g.show();
        System.out.println();
        //要件2 Mobile
        System.out.println("要件2 Mobile");
        Mobile m=new Mobile("iPhone7Plus", 82300, "092-111-4321");
        System.out.println(m.toString());
        System.out.println();
        //要件2 MpPlayer
        System.out.println("要件2 MpPlayer");
        System.out.println(g.toString());
    }
}