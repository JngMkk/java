package Numeric;

public class Numeric {
    public static void main(String[] args) {
        // 숫자형
        byte i = -128;                  // -128 ~ 127
        short j = -32768;               // -32768 ~ 32767
        int x = 10;                     // -2147483648 ~ 2147483647
        int y = 5;
        long z = 898989898989898989L;   // -9223372036854775808 ~ 9223372036854775807
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(z);
        System.out.println(i);
        System.out.println(j);
        System.out.println(7 % 3);
        System.out.println(3 % 7);
        x++;
        y--;
        System.out.println(x);
        System.out.println(y);
        System.out.println(++x);

        int num1 = 11 + 22 + 33;        // 10진수
        int num2 = 0123;                // 8진수
        int num3 = 0x123;               // 16진수
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num2: " + num3);

        // 실수형
        float pi = 3.14F;                           // -3.4 * 10^38 ~ 3.4 * 10^38
        double morePi = 3.14159265358979323846;     // -1.7 * 10^308 ~ 1.7 * 10^308 자바 실수 기본값
        System.out.println(pi);
        System.out.println(morePi);
    }
}
