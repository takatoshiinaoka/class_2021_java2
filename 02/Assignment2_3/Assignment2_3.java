class Data
{
    int number;
    void setNum(int i){// �������̒l�� number �ɑ�����܂�
        number=i;
    }
    void dispNum(){// number �ɓ����Ă���l����ʂɕ\�����܂�
        System.out.println(number);
    }
    int getNum(){// number �ɓ����Ă���l��߂�l�Ƃ��ĕԂ��܂�
        return number;
    }
}
class Assignment2_3
    {
        public static void main(String[] args){
        Data d;
        d = new Data();
        d.setNum(7);
        d.dispNum();
        System.out.println(d.getNum());
    }
}


