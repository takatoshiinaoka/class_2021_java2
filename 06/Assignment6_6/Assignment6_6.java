//Parkクラス（スーパークラス）
class Park{
    public String park_name; // 名称
    public int park_fee;//料金
    public void show(){
        System.out.println(park_name+"(入場料"+ park_fee +"円)");
    }
    public Park(String name,int fee){
        park_name=name;
        park_fee=fee;
    }
}

// Zooクラス（サブクラス）
class Zoo extends Park{
    public int animal_num; //動物数
    public void print(){
        show();
        System.out.println(animal_num+"種類の動物が待っています♪");
    }
    public Zoo(String n, int f, int a){
        super(n,f);
        animal_num=a;
    }
}

// Gardenクラス（サブクラス）
class Garden extends Park{
    public int plant_num; //植物数
    public void print(){
        show();
        System.out.println(plant_num+"種の植物を観察できます！");
    }
    public Garden(String n, int f, int p){
        super(n,f);
        plant_num=p;
    }
}

// ここへ Park クラスと Zoo クラス、Garden クラスの宣言を書きましょう
class Assignment6_6{
    public static void main(String[] args){
        Zoo myzoo=new Zoo("福岡動物園", 400, 130);
        Garden mygarden=new Garden("鳥取花回廊", 1000, 400);
        myzoo.print();
        mygarden.print();
    }
}
