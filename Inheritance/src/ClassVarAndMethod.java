/*
    static 선언이 붙는 클래스 변수와 클래스 메소드의 상속
        - 인스턴스의 생성과 상관이 없이 접근 가능
        - 클래스 내부와 외부에서(접근 수준 지시자가 허용하면) 접근이 가능.
        - 클래스 변수와 클래스 메서드가 위치한 클래스 내에서는 직접 접근이 가능.

    즉, 클래스 변수와 클래스 메서드는 인스턴스에 속하지 않는, 딱 하나만 존재하는 변수와 메서드임. 따라서 상속의 대상이 아님.
    하지만, 변수의 이름만으로 하위클래스에서 접근이 가능함.
    즉, 상위 클래스와 마찬가지로 이를 상속하는 하위 클래스에서도 이름만으로 클래스 변수와 클래스 메서드에 접근이 가능함.
    단, 선언된 접근 수준 지시자가 접근을 허용해야 접근이 가능함. 즉, private으로 선언이 되면 접근 불가.
*/

class SuperCLS3 {
    protected static int count = 0;     // protected는 하위 클래스 접근을 허용, private으로 하면 컴파일 오류
    public SuperCLS3() {
        count++;
    }
}

class SubCLS3 extends SuperCLS3 {
    public void showCount() {
        // 상위 클래스에 위치한 클래스 변수 count에 접근
        System.out.println(count);
    }
}

public class ClassVarAndMethod {
    public static void main(String[] args) {
        new SuperCLS3();                        // 1
        new SuperCLS3();                        // 1
        SubCLS3 obj3 = new SubCLS3();           // 1 (부모 클래스 생성자 호출하므로)
        obj3.showCount();
    }
}
