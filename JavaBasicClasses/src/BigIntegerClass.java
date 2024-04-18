import java.math.BigInteger;

/*
    int와 같은 정수 자료형은 표현할 수 있는 값의 크기에 한계가 있다는 문제점이 있음.
    그리고 double과 같은 실수 자라ㅛ형은 오차 없는 값의 표현이 불가능하다는 문제점이 있음.
    그래서 이러한 문제점의 해결을 목적으로 BigInteger 클래스와 BigDecimal 클래스가 정의되었음.

    - 덧셈: public BigInteger add(BigInteger val)
    - 뺄셈: public BigInteger subtract(BigInteger val)
    - 곱셈: public BigInteger multiply(BigInteger val)
    - 나눗셈의 몫: public BigInteger divide(BigInteger val)
    - 나눗셈의 나머지: public BigInteger remainder(BigInteger val)

    그리고 연산으로 인하여 그 값이 int형 또는 long형으로 표현이 가능한 수준에 이르면,
    다음 메서드 호출을 통해 인스턴스에 저장된 값을 int형 또는 long형으로 얻을 수 있음.

    public long longValueExact()
    public int intValueExact()

    단, 저장된 값이 long형 또는 int형 정수로 표현이 불가능한 상황에서 위의 메서드를 호출하면 ArithmeticException 예외가 발생함.
*/
public class BigIntegerClass {
    public static void main(String[] args) {
        // long형으로 표현 가능한 값의 크기 출력
        System.out.println("long 최대 정수: " + Long.MAX_VALUE);
        System.out.println("long 최소 정수: " + Long.MIN_VALUE);
        System.out.println();

        System.out.println("int 최대 정수: " + Integer.MAX_VALUE);
        System.out.println("int 최소 정수: " + Integer.MIN_VALUE);
        System.out.println();

        // 매우 큰 수를 BigInteger 인스턴스로 표현
        BigInteger b1 = new BigInteger("100000000000000000000");
        BigInteger b2 = new BigInteger("-99999999999999999999");

        BigInteger r1 = b1.add(b2);
        System.out.println(r1);
        BigInteger r2 = b1.multiply(b2);
        System.out.println(r2);
        System.out.println();

        int num = r1.intValueExact();
        System.out.println(num);
    }
}
