/*
    모든 래퍼 클래스는 java.lang.Number 클래스를 상속함.
    Number 클래스에는 다음 추상 메서드들이 존재함.

    public abstract int intValue()
    public abstract double doubleValue()
    public abstract long longValue()

    따라서 이를 상속하는 Integer, Double과 같은 클래스들은 위의 메서드를 모두 구현하고 있음.
    때문에 어떠한 래퍼 인스턴스를 대상으로도 인스턴스에 저장된 값을 다양한 형태로 반환할 수 있음.
*/

public class NumberMethod {
    public static void main(String[] args) {
        Integer num1 = new Integer(20);
        System.out.println(num1.intValue());
        System.out.println(num1.doubleValue());

        Double num2 = new Double(3.14);
        System.out.println(num2.intValue());
        System.out.println(num2.doubleValue());
    }
}
