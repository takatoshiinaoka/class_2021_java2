class Paper
    {
    int width; // ���̕��icm�j
    int height; // ���̍����icm�j
    void setPaper(int w, int h){// �������̒l�� width �� height �ɑ�����܂�
        width=w;
        height=h;
    }
    int getArea(){// ���̖ʐς�߂�l�Ƃ��ĕԂ��܂�
        return width*height;
    }
}
class Assignment2_2{
    public static void main(String[] args){
        Paper mypaper;
        mypaper = new Paper();
        mypaper.setPaper(12, 8);
        System.out.println("�ʐς�"+mypaper.getArea()+"cm^2 �ł�");
    }
}