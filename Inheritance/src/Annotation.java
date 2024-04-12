class ParentAdder {
    public int add(int a, int b) {
        System.out.println("부모!");
        return a + b;
    }
}

class ChildAdder extends ParentAdder {
    @Override   // 개발자 실수를 방지하기 위해 사용 (자바 컴파일러에게 메시지를 전달하는 목적의 메모)
    public double add(double a, double b) {
        System.out.println("자식!");
        return a + b;
    }
}

public class Annotation {
    public static void main(String[] args) {
        ParentAdder adder = new ChildAdder();
        // annotation 달지 않을 시 오버라이딩 되지 않고 부모 add 메서드 사용
        // 메서드의 매개변수 형과 반환형이 달랐기 때문.
        System.out.println(adder.add(3, 4));
    }
}
