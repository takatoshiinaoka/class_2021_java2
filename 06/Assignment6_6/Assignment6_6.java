//Park�N���X�i�X�[�p�[�N���X�j
class Park{
    public String park_name; // ����
    public int park_fee;//����
    public void show(){
        System.out.println(park_name+"(���ꗿ"+ park_fee +"�~)");
    }
    public Park(String name,int fee){
        park_name=name;
        park_fee=fee;
    }
}

// Zoo�N���X�i�T�u�N���X�j
class Zoo extends Park{
    public int animal_num; //������
    public void print(){
        show();
        System.out.println(animal_num+"��ނ̓������҂��Ă��܂���");
    }
    public Zoo(String n, int f, int a){
        super(n,f);
        animal_num=a;
    }
}

// Garden�N���X�i�T�u�N���X�j
class Garden extends Park{
    public int plant_num; //�A����
    public void print(){
        show();
        System.out.println(plant_num+"��̐A�����ώ@�ł��܂��I");
    }
    public Garden(String n, int f, int p){
        super(n,f);
        plant_num=p;
    }
}

// ������ Park �N���X�� Zoo �N���X�AGarden �N���X�̐錾�������܂��傤
class Assignment6_6{
    public static void main(String[] args){
        Zoo myzoo=new Zoo("����������", 400, 130);
        Garden mygarden=new Garden("����ԉ�L", 1000, 400);
        myzoo.print();
        mygarden.print();
    }
}
