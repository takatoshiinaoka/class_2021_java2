// �i�����ɃN���X MyCalc �̐錾���L�q���܂��j
class MyCalc
{
    //�t�B�[���h�F
    int num1; // �l 1�i������A�팸���A��搔�A�폜���j
    int num2; // �l 2�i�����A�����A�搔�A�����j

    // ���\�b�h�F
    void setValue(int n1, int n2){ // 2 �̒l��ݒ肵�܂�
        num1=n1;
        num2=n2;
    }
    void dispValue(){// ���݂̒l��\�����܂�
        System.out.println(num1+"��"+num2+"���ݒ肳��Ă��܂��B");
    } 
    int addition(){// ���Z���v�Z���Ă��̒l��Ԃ��܂�
        return num1+num2;
    } 
    int subtraction(){// ���Z���v�Z���Ă��̒l��Ԃ��܂�
        return num1-num2;
    } 
    int multiplication(){// �|�Z���v�Z���Ă��̒l��Ԃ��܂�
        return num1*num2;
    } 
    double division(){// ���Z���v�Z���Ă��̒l��Ԃ��܂�
        return (double)num1/(double)num2;
    } 
}
class Assignment2_4
{
    public static void main(String[] args)
    {
        MyCalc mc = new MyCalc();

        // �l�Ƃ��� 5 �� 2 ���w�肵�܂�
        mc.setValue(5,2);
        mc.dispValue();

        // �l�����Z���s���܂�
        System.out.println("���Z����ƁA"+mc.addition()+"�ł��B");
        System.out.println("���Z����ƁA"+mc.subtraction()+"�ł��B");
        System.out.println("��Z����ƁA"+mc.multiplication()+"�ł��B");
        System.out.println("���Z����ƁA"+mc.division()+"�ł��B");
    }
}