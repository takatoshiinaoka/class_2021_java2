class Person
{
    private String name; // ���O
    private int age; // �N��i0 �ȏ�j
    private char gender; // ���ʁiF or M�j
    public void  setData(String n){// ���O��ݒ�
        name=n;
    }
    public String getName(){// ���O���擾
        return name;
    } 
    public void setData(int a){// �N���ݒ�
        age=a;
    }
    public int getAge(){// �N����擾
        return age;
    }
    public void setData(char g){// ���ʂ�ݒ�
        gender=g;
    }
    public char getGender(){// ���ʂ��擾
        return gender;
    }
}
class Assignment3_6
{
    public static void main(String[] args){
        Person p1=new Person();
        //�l��ݒ�
        p1.setData("��V�x");
        p1.setData(19);
        p1.setData('�j');  
        //�l���擾
        System.out.println( p1.getName());
        System.out.println( p1.getAge() );
        System.out.println( p1.getGender());
       
       
       
        
    }
}