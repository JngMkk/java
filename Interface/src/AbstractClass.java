abstract class House {
    public void methodOne() {
        System.out.println("Method One");
    }
    public void methodTwo() {}
}

class myHouse extends House {
    @Override
    public void methodTwo() {
        System.out.println("Method Two");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        House h = new myHouse();
        h.methodOne();
        h.methodTwo();
    }
}
