class Triangle
{
    private double height; // ����
    private double base; // ���
    public Triangle(double h,double b){
        height=h;
        base=b;
    }
    public void setHeight(double h){ // �����̐ݒ�
        height = h;
    }
    public void setBase(double b){ // ��ӂ̐ݒ�
        base = b;
    }
    public double getArea(){ // �ʐς̌v�Z
        return(height*base/2.0);
    }
}
class Assignment4_1
{
    public static void main(String[] args){
        // ���̂悤�ɏ����ݒ肪������
        Triangle tr;
        tr = new Triangle(10.5, 2.5);
        System.out.println("�O�p�`�̖ʐς�"+tr.getArea()+"�ł�");
    }
}