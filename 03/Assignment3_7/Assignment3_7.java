// �i�����ɃN���X USB �̐錾���L�q���܂��j
class USB
{
    private int capacity; // �e�ʁiGB�j
    public void setCap(int c){ // �e�ʂ̐ݒ�i���͒l�� 0 �ȏ�̏ꍇ�̂ݐݒ肵�܂��j
        if(0<=c){
            capacity=c;
            System.out.println("�e�ʂ�"+capacity+"�ɐݒ肵�܂����B");
        }else{
            System.out.println("�e�ʂ�ݒ�ł��܂���ł����B");
        }
    }
    public int getCap(){ // �e�ʂ̎擾
        return capacity; 
    }
}
class Assignment3_7
{
    public static void main(String[] args){
        USB ToteBag = new USB();
        // �e�ʃf�[�^�̐ݒ�ƕ\��
        ToteBag.setCap(16);
        System.out.println("USB ������("+ToteBag.getCap()+"GB)");
        // �e�ʃf�[�^�̐ݒ�ƕ\���i�ُ�Ȓl��ݒ�j
        ToteBag.setCap(-32);
        System.out.println("USB ������("+ToteBag.getCap()+"GB)");
    }
}