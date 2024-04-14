interface Printable4 {
    void print(String doc);
}

class SimplePrinter implements Printable4 {
    @Override
    public void print(String doc) {
        System.out.println(doc);
    }
}

class MultiPrinter extends SimplePrinter {
    @Override
    public void print(String doc) {
        super.print("Start of multi...");
        super.print(doc);
        super.print("End of multi...");
    }
}

public class InterfaceInstanceOf {
    public static void main(String[] args) {
        Printable4 prn1 = new SimplePrinter();
        Printable4 prn2 = new MultiPrinter();

        // Printable4를 직접 혹은 간접적으로 구현한 경우 true
        if (prn1 instanceof Printable4) {
            prn1.print("This is a simple printer.");
        }
        if (prn2 instanceof Printable4) {
            prn2.print("This is a multi printer.");
        }
    }
}
