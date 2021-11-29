class Person
{
    private String name; // 名前
    private int age; // 年齢（0 以上）
    private char gender; // 性別（F or M）
    public void  setData(String n){// 名前を設定
        name=n;
    }
    public String getName(){// 名前を取得
        return name;
    } 
    public void setData(int a){// 年齢を設定
        age=a;
    }
    public int getAge(){// 年齢を取得
        return age;
    }
    public void setData(char g){// 性別を設定
        gender=g;
    }
    public char getGender(){// 性別を取得
        return gender;
    }
}
class Assignment3_6
{
    public static void main(String[] args){
        Person p1=new Person();
        //値を設定
        p1.setData("稲岡天駿");
        p1.setData(19);
        p1.setData('男');  
        //値を取得
        System.out.println( p1.getName());
        System.out.println( p1.getAge() );
        System.out.println( p1.getGender());
       
       
       
        
    }
}