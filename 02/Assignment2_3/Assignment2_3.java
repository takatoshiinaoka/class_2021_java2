class Data
{
    int number;
    void setNum(int i){// 仮引数の値を number に代入します
        number=i;
    }
    void dispNum(){// number に入っている値を画面に表示します
        System.out.println(number);
    }
    int getNum(){// number に入っている値を戻り値として返します
        return number;
    }
}
class Assignment2_3
    {
        public static void main(String[] args){
        Data d;
        d = new Data();
        d.setNum(7);
        d.dispNum();
        System.out.println(d.getNum());
    }
}


