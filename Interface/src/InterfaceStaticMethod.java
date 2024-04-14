interface Printable3 {
    static void printLine(String str) {
        System.out.println(str);
    }

    default void print(String doc) {
        printLine(doc);         // 인터페이스의 static 메서드 호출
    }
}

class Printer3 implements Printable3 {}

public class InterfaceStaticMethod {
    public static void main(String[] args) {
        String myDoc = "This is a report about...";
        Printable3 prn = new Printer3();
        prn.print(myDoc);

        Printable3.printLine("End of line...");
    }
}
