class Assignment9_1{
    public static void main(String[] args){
        try{
            int[] ary;
            // ��O NegativeArraySizeException ������
            ary=new int[-5];
        }
        catch(NegativeArraySizeException e){
            System.out.println("�z��v�f���̎w��͕��ł�");
        }
    }
}