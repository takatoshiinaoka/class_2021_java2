// Operation �C���^�t�F�[�X �i�����̐錾�ɂ͎�������Ȃ����Ɓj
interface Operation{
    int getNumOfOperands(); // �I�y�����h�̐���Ԃ��܂�
    void setOperands(double[] values); // �I�y�����h��ݒ肵�܂�
    String getExpression(); // �ݒ肵���I�y�����h�Ŏ��𐶐����܂�
    double getAnswer(); // �ݒ肵���I�y�����h�Ŏ��̌��ʂ�Ԃ��܂�
}
// �������Z�q�N���X�i���Z�q�C���^�t�F�[�X������ 1�j
class Distance implements Operation{
    private double x1, y1, x2, y2;
    public int getNumOfOperands(){
        return(4);
    }
    public void setOperands(double[] values){
        x1=values[0]; y1=values[1];
        x2=values[2]; y2=values[3];
    }
    public String getExpression(){
        return("���W("+x1+","+y1+")�ƍ��W("+x2+","+y2+")�Ԃ̋���?");
    }
    public double getAnswer(){
        return(Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2)));
    }
}
// ���Z���Z�q�N���X�i���Z�q�C���^�t�F�[�X������ 2�j
class Addition implements Operation{
    private double n1, n2;
    public int getNumOfOperands(){
        return(2);
    }
    public void setOperands(double[] values){
        n1=values[0]; n2=values[1];
    }
    public String getExpression(){
        return(n1+"+"+n2+"?");
    }
    public double getAnswer(){
        return(n1+n2);
    }
}
// �~�ʐσN���X�i���Z�q�C���^�t�F�[�X�����@�I���W�i���j
class Area_of_a_circle implements Operation{
    private double n1;
    public int getNumOfOperands(){
        return(1);
    }
    public void setOperands(double[] values){
        n1=values[0];
    }
    public String getExpression(){
        return("�΁~"+n1+"^2?");
    }
    public double getAnswer(){
        return(Math.PI*n1*n1);
    }
}

// ��萶���N���X �i�����̐錾�ɂ͎�������Ȃ����Ɓj
final class PrintQuestion{
    // ���Z�q�C���^�t�F�[�X�����������N���X�̃I�u�W�F�N�g�p���A
    // �����ŃI�y�����h��^���Ȃ�������쐬���܂�
    public static void prtWithRand(Operation op){
        double[] values=new double[op.getNumOfOperands()];
        for(int i=0;i<values.length;i++)
            values[i]=(int)(Math.random()*10);
        op.setOperands(values);
        System.out.println("Q."+op.getExpression());
        System.out.println("A."+op.getAnswer());
        System.out.println();
    }
    // ���Z�q�C���^�t�F�[�X�����������N���X�̃I�u�W�F�N�g�p���A
    // �^����ꂽ�I�y�����h�Ŗ����쐬���܂�
    public static void prtWithValues(Operation op, double[] values){
        op.setOperands(values);
        System.out.println("Q."+op.getExpression());
        System.out.println("A."+op.getAnswer());
        System.out.println();
    }
}

class Assignment8_4{
    public static void main(String[] args){
        Distance dis=new Distance();
        Addition add=new Addition();
        Area_of_a_circle Aoac=new Area_of_a_circle();
        PrintQuestion.prtWithRand(dis);
        PrintQuestion.prtWithRand(add);
        PrintQuestion.prtWithRand(Aoac);
    }
}