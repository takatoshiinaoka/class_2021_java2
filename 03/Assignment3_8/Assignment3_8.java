// �i�����ɃN���X  �̐錾���L�q���܂��j
class Battery
{
    // �t�B�[���h�F
    private int level; //�[�d���x��[%]

    // ���\�b�h�F
    public void setLevel(int a){//�[�d���x���̐ݒ�(���͂�0�ȏ�100�ȉ��̏ꍇ�̂ݐݒ�)
        if(0<=a&&a<=100){
            level=a;
            System.out.println("[�[�d���x����"+level+"%�ɐݒ肵�܂���]");
        }else{
            System.out.println("[�ُ�ȏ[�d���x��("+level+"%)�ł�]");
            System.out.println("[�[�d���x����ݒ�ł��܂���ł���]");
        }
        
    }

    public int getLevel(){//�[�d���x���̎擾
        return level;
    }

}
class Assignment3_8
{
    public static void main(String[] args){
        Battery evolta = new Battery();
        // �[�d���x���̐ݒ�ƕ\��
        evolta.setLevel(80);
        System.out.println("���݂̏[�d���x����"+evolta.getLevel()+"%�ł��B");
        // �ߏ[�d���x���̐ݒ�i�ُ�Ȓl��ݒ�j
        evolta.setLevel(102);
        System.out.println("���݂̏[�d���x����"+evolta.getLevel()+"%�ł��B");
    }
}