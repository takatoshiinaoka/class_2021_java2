class Score
{
    private int point;//���_

    //���_�ݒ胁�\�b�h
    public void setPoint(int p){//�l����������0~100�ł���Α�����܂�
        if(0<=p&&p<=100){
            point=p;
            System.out.println("[���_��"+point+"�_�ɐݒ肵�܂���]");
        }else{
            System.out.println("[���_��ݒ�ł��܂���ł���]");
        }
    }

    //���ݒ�l�擾���\�b�h
    public int getPoint(){//���݂̒l��߂�l�Ƃ��ĕԂ��܂�
        return point;
    }


}
class Assignment3_1{
    public static void main(String[] args){
        Score sc=new Score();
        sc.setPoint(90); // 90 �_��ݒ肵�܂�
        System.out.println(sc.getPoint()); // ���_��\�����܂�
        sc.setPoint(-10); // -10 �_��ݒ肵�Ă݂܂�
        System.out.println(sc.getPoint()); //���_��\�����܂�
    }
}