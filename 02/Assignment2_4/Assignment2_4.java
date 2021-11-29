// （ここにクラス MyCalc の宣言を記述します）
class MyCalc
{
    //フィールド：
    int num1; // 値 1（被加数、被減数、被乗数、被除数）
    int num2; // 値 2（加数、減数、乗数、除数）

    // メソッド：
    void setValue(int n1, int n2){ // 2 つの値を設定します
        num1=n1;
        num2=n2;
    }
    void dispValue(){// 現在の値を表示します
        System.out.println(num1+"と"+num2+"が設定されています。");
    } 
    int addition(){// 加算を計算してその値を返します
        return num1+num2;
    } 
    int subtraction(){// 減算を計算してその値を返します
        return num1-num2;
    } 
    int multiplication(){// 掛算を計算してその値を返します
        return num1*num2;
    } 
    double division(){// 割算を計算してその値を返します
        return (double)num1/(double)num2;
    } 
}
class Assignment2_4
{
    public static void main(String[] args)
    {
        MyCalc mc = new MyCalc();

        // 値として 5 と 2 を指定します
        mc.setValue(5,2);
        mc.dispValue();

        // 四則演算を行います
        System.out.println("加算すると、"+mc.addition()+"です。");
        System.out.println("減算すると、"+mc.subtraction()+"です。");
        System.out.println("乗算すると、"+mc.multiplication()+"です。");
        System.out.println("除算すると、"+mc.division()+"です。");
    }
}