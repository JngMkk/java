/*
    래퍼 클래스는 이름이 의미하듯이 '감싸는 클래스'.
    그리고 래퍼 클래스가 감싸는 대상은 정수, 실수, 문자와 같은 기본 자료형의 값들임.

    int형 정수나 double형 실수와 같은 기본 자료형의 값들도 인스턴스로 표현해야 하는 경우가 있음.

    public static void showData(Object obj) {
        System.out.println(obj);
    }
    위 메서드는 인스턴스를 인자로 요구함.
    이렇듯 인스턴스의 참조 값을 요구하는 자리에 기본 자료형의 값을 놓아야 하는 경우가 종종 있음.
    이러한 상황에서 필요한 것이 '래퍼 클래스'임.

    Boolean: public Boolean(boolean value)
    Character: public Character(char value)
    Byte: public Byte(byte value)
    Short: public Short(short value)
    Integer: public Integer(int value)
    Long: public Long(long value)
    Float: public Float(float value), public Float(double value)
    Double: public Double(double value)
*/
public class UseWrapperClass {
    public static void showData(Object obj) {
        System.out.println(obj);
    }

    public static void main(String[] args) {
        Integer iInst = new Integer(3);             // 정수 3을 감싸는 래퍼 인스턴스 생성
        showData(iInst);
        showData(new Double(7.15));     // 7.15를 감싸는 래퍼 인스턴스 생성 및 전달
    }
}
