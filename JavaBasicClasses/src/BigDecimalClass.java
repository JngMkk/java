import java.math.BigDecimal;

/*
    BigDecimal 클래스는 오차 없는 실수의 표현을 위해 제공되는 클래스.
    실수를 문자열로 전달하여 인스턴스를 생성해야 함.
    실수로 표현할 시 그 순간부터 오차를 지니기 때문.
*/
public class BigDecimalClass {
    public static void main(String[] args) {
        double d1 = 1.6;
        double d2 = 0.1;
        System.out.println("덧셈: " + (d1 + d2));
        System.out.println("곱셈: " + (d1 * d2));

        BigDecimal bd1 = new BigDecimal("1.6");
        BigDecimal bd2 = new BigDecimal("0.1");
        System.out.println("덧셈: " + bd1.add(bd2));
        System.out.println("곱셈: " + bd1.multiply(bd2));
    }
}
