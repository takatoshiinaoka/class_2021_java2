class EvenInt

{
    private int num;//

    public void setInt(int i){
        if(i%2==0){
            num=i;
            System.out.println("�l��"+num+"�ɐݒ肵�܂����B");
        }else{
            System.out.println("�����ł͂Ȃ��̂Őݒ�ł��܂���ł����B");
        }
    }
    public int getInt(){
        return num;
    }


}
class Assignment3_2
{
    public static void main(String[] args){
        EvenInt ei=new EvenInt();
        ei.setInt(12); // ������ݒ肵�܂�
        System.out.println(ei.getInt()); // ���ʂ�\�����܂�
        ei.setInt(15); // ���ݒ肵�Ă݂܂�
        System.out.println(ei.getInt()); // ���ʂ�\�����܂�
    }
}