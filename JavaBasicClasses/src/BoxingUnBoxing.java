/*
    값을 인스턴스에 감싸는 행위를 가리켜 'Boxing'이라고 하고, 반대로 저장된 값응ㄹ 꺼내는 행위를 가리켜 'Unboxing'이라고 함.
    Boxing은 인스턴스의 생성을 통해서 이뤄지지만 Unboxing은 래퍼 클래스에 정의된 메서드의 호출을 통해서 이뤄짐.
*/
public class BoxingUnBoxing {
    public static void main(String[] args) {
        Integer iObj = new Integer(10);     // Boxing
        Double dObj = new Double(7.1);      // Boxing
        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        int num1 = iObj.intValue();                 // Unboxing
        double num2 = dObj.doubleValue();           // Unboxing
        System.out.println(num1);
        System.out.println(num2);
        System.out.println();

        // Wrapper Instance 값의 증가 방법
        iObj = new Integer(iObj.intValue() + 10);
        dObj = new Double(dObj.doubleValue() + 1.2);
        System.out.println(iObj);
        System.out.println(dObj);
        System.out.println();

        iObj += 10;
        dObj += 2.2;
        System.out.println(iObj);
        System.out.println(dObj);
    }
}
