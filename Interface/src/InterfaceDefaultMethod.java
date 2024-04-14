interface Printable2 {
    void print(String doc);

    // 디폴트 메서드
    // 자체로 완전한 메서드.
    // 따라서 이를 구현하는 클래스가 오버라이딩 하지 않아도 됨.
    default void printColor(String doc) {}
}

class Prn731Drv implements Printable2 {
    @Override
    public void print(String doc) {
        System.out.println("From MD-731 printer");
        System.out.println(doc);
    }
}

class Prn909Drv implements Printable2 {
    @Override
    public void print(String doc) {
        System.out.println("From MD-909 black & white ver");
        System.out.println(doc);
    }

    @Override
    public void printColor(String doc) {
        System.out.println("From MD-909 Color ver");
        System.out.println(doc);
    }
}

public class InterfaceDefaultMethod {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        Printable2 prn1 = new Prn731Drv();
        Printable2 prn2 = new Prn909Drv();
        prn1.print(myDoc);
        prn2.print(myDoc);
        prn2.printColor(myDoc);
    }
}
