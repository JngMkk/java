/*
    모든 클래스는 Object 클래스를 상속함.

    클래스를 정의할 때 어떤 클래스도 상속하지 않으면 해당 클래스는 java.lang 패키지에 묶여 있는 Object 클래스를 상속하게 됨.
*/

class A {
    // Object 클래스의 toString 메서드를 오버라이딩
    public String toString() {
        System.out.println(super.toString());
        return "My Birthday Cake";
    }
}

class AA extends A {
    public String toString() {
        return "My Brithday Cheese Cake";
    }
}

public class OverridingToString {
    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new AA();

        System.out.println(a1);
        System.out.println();

        System.out.println(a2);
    }
}
