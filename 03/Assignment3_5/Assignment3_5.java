class Person
{
    private String name; // ���O
    private int age; // �N��i0 �ȏ�j
    private char gender; // ���ʁiF or M�j
    public void setName(String n){// ���O��ݒ�
        name=n;
    }
    public String getName(){// ���O���擾
        return name;
    } 
    public void setAge(int a){// �N���ݒ�
        age=a;
    }
    public int getAge(){// �N����擾
        return age;
    }
    public void setGender(char g){// ���ʂ�ݒ�
        gender=g;
    }
    public char getGender(){// ���ʂ��擾
        return gender;
    }
}
class Assignment3_5
{
    public static void main(String[] args){
        Person p1=new Person();
        //�l��ݒ�
        p1.setName("��V�x");
        p1.setAge(19);
        p1.setGender('�j');  
        //�l���擾
        System.out.println( p1.getName());
        System.out.println( p1.getAge() );
        System.out.println( p1.getGender());
       
       
       
        
    }
}