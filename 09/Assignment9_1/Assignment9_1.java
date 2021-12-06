class Assignment9_1{
    public static void main(String[] args){
        try{
            int[] ary;
            // 例外 NegativeArraySizeException が発生
            ary=new int[-5];
        }
        catch(NegativeArraySizeException e){
            System.out.println("配列要素数の指定は負です");
        }
    }
}