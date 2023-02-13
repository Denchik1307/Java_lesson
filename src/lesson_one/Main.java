package lesson_one;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println(MyCalc.factorial(4));
        System.out.println(MyCalc.triangleDigit(9));
        System.out.println(MyCalc.calc(9, 5,"+"));
        System.out.println(MyCalc.calc(9, 5,"-"));
        System.out.println(MyCalc.calc(9, 0,"/"));
        System.out.println(MyCalc.calc(9, 5,"*"));
    }
}

abstract class MyCalc {
    public static int factorial(int a) {
        int res = 1;
        while (a > 1) {
            res *= a;
            a--;
        }
        return res;
    }

    public static int triangleDigit(int n) {
        return (int) (0.5 * n * (n + 1));
    }

    public static float calc(float num1, float num2, String sign) {
        float res = 0f;
        String plus = "+", minus = "-", delimiter = "/", multiple = "*";
        try {
            if (Objects.equals(sign, plus)) res = num1 + num2;
            if (Objects.equals(sign, minus)) res = num1 - num2;
            if (Objects.equals(sign, multiple)) res = num1 * num2;
            if (Objects.equals(sign, delimiter)) res = num1 / num2;
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            return -1f;
        }

        return res;
    }
}

