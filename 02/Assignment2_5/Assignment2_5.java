// �i�����ɃN���X Window �̐錾���L�q���܂��j
class Window
{
    // �t�B�[���h�F
    String title; // �E�B���h�E�^�C�g��
    int width; // �E�B���h�E�̃T�C�Y�i�����s�N�Z���j
    int height; // �E�B���h�E�̃T�C�Y�i�c���s�N�Z���j
    // ���\�b�h�F
    void setTitle(String t){// �E�B���h�E�^�C�g����ݒ肵�܂�
        title=t;
    } 
    void setWidth(int w){// �E�B���h�E�̃T�C�Y�i���j��ݒ肵�܂�
        width=w;
    } 
    void setHeight(int h){// �E�B���h�E�̃T�C�Y�i�c�j��ݒ肵�܂�
        height=h;
    } 
    void showWindow(){// �E�B���h�E����\�����܂�
        System.out.println("�E�B���h�E["+title+"]("+width+"�~"+height+")");
    } 

}
class Assignment2_5
{
    public static void main(String[] args){
        // �I�u�W�F�N�g�̐���
        Window win=new Window();
        // �^�C�g���ƃT�C�Y�̐ݒ�
        win.setTitle("CPad for Java");
        win.setWidth(1024);
        win.setHeight(768);
        // �E�B���h�E���̕\��
        win.showWindow();
    }
}