// 연산자 instanceof는 참조변수가 참조하는 인스턴스의 클래스나 참조하는 인스턴스가 상속하는 클래스를 묻는 연산자임.

class C {
}

class CheeseC extends C {
}

class StrawberryCheeseC extends CheeseC {
}

public class InstanceOf {
    public static void main(String[] args) {
        C c = new StrawberryCheeseC();

        if (c instanceof C) {
            System.out.println("케익 인스턴스 or");
            System.out.println("케익 상속하는 인스턴스\n");
        }
        if (c instanceof CheeseC) {
            System.out.println("치즈케익 인스턴스 or");
            System.out.println("치즈케익 상속하는 인스턴스\n");
        }
        if (c instanceof StrawberryCheeseC) {
            System.out.println("딸기치즈케익 인스턴스 or");
            System.out.println("딸기치즈케익 상속하는 인스턴스");
        }
    }
}
