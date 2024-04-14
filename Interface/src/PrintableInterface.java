/*
    클래스가 인터페이스를 상속하는 행위는 '상속'이 아닌 '구현'이라 한다.
    문법 관계는 상속과 동일하지만 본질은 '구현'이기 때문.
        - 구현할 인터페이스를 명시할 때 키워드 implements를 사용함.
        - 한 클래스는 둘 이상의 인터페이스를 동시에 구현할 수 있음.
        - 상속과 구현은 동시에 가능함.
            ex) class Robot extends Machine implemetns Movable, Runnable { ... }
        - 인터페이스 type 대상으로 참조변수의 선언이 가능함.
        - 인터페이스의 추상 메서드와 이를 구현하는 메서드 사이에 오버라이딩 관계가 성립함.
            -> 따라서 어노테이션 @Override 선언 가능.
        - 인터페이스에 존재할 수 있는 메서드에는 추상 메서드, 디폴트 메서드, static 메서드가 있음.
        - 인터페이스를 구현하는 클래스는 인터페이스에 존재하는 모든 추상 메서드를 구현해야 함.
        - 인터페이스 간 상속도 가능하며 인터페이스의 Type 이름을 대상으로 instanceof 연산을 할 수도 있음.

    인터페이스의 사전적 의미는 '연결점' 또는 '접점'으로 둘 사이를 연결하는 매개체를 뜻함.
    실제로 자바의 인터페이스는 그런 역할을 함. ex) 인터페이스를 하나 만들어서 모든 프린터 업체에 제공
*/
interface Printable {
    // 인터페이스의 변수는 반드시 선언과 동시에 값으로 초기화를 해야 함.
    // 모든 변수는 public, static, final이 선언된 것으로 간주됨.
    int PAPER_WIDTH = 70;
    int PAPER_HEIGHT = 120;

    // 인터페이스의 모든 메서드는 public이 선언된 것으로 간주됨.
    void print(String doc);      // 추상 메서드
}

/*
    만약 세계 최초로 컬러 프린터가 개발되었을 때, 기존 인터페이스를 수정한다면 이 인터페이스를 기반으로 개발된 모든 드라이버를 수정해야 함.
    인터페이스의 모든 추상 메서드는 이를 구현하는 클래스에서 모두 완성해야 하므로 추가 메서드가 불필요한 프린터의 드라이버라도 이 메서드를 구현해야 함.
    이러한 상황을 고려하여 자바에서는 인터페이스의 상속을 지원함.

    혹은 상속으로 인한 추가 인터페이스 수가 많아질 경우 디폴트 메서드를 고려해볼 수 있음.
*/
interface ColorPrintable extends Printable {
    void printColor(String doc);
}

class Printer implements Printable {
    @Override
    public void print(String doc) {     // 오버라이딩 관계 성립
        System.out.println(doc);
    }
}

class SPrinterDriver implements ColorPrintable {
    @Override
    public void print(String doc) {
        System.out.println("From Samsung Printer");
        System.out.println(doc);
    }

    @Override
    public void printColor(String doc) {
        System.out.println("From Samsung Color Printer");
        System.out.println(doc);
    }
}

class LPrinterDriver implements Printable {
    @Override
    public void print(String doc) {
        System.out.println("From LG Printer");
        System.out.println(doc);
    }
}

public class PrintableInterface {
    public static void main(String[] args) {
        System.out.println(Printable.PAPER_HEIGHT);
        System.out.println(Printable.PAPER_WIDTH);

        Printable prn = new Printer();      // 인터페이스 type을 대상으로 참조변수 선언이 가능
        prn.print("Hello Java!");

        String myDoc = "This is a report about...";

        ColorPrintable cPrn = new SPrinterDriver();
        cPrn.print(myDoc);
        cPrn.printColor(myDoc);

        prn = new LPrinterDriver();
        prn.print(myDoc);
    }
}