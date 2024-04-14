/*
    마커 인터페이스는 클래스에 특별한 표식을 다는 용도로 사용됨.
    마커 인터페이스에는 아무런 메서드도 존재하지 않는 경우가 많음.
*/
interface Upper {}
interface Lower {}
interface Printable5 {
    String getContents();
}

class Report implements Printable5, Upper {
    String cons;

    Report(String cons) {
        this.cons = cons;
    }

    @Override
    public String getContents() {
        return this.cons;
    }
}

class Printer5 {
    public void printContents(Printable5 doc) {
        if (doc instanceof Upper) {
            System.out.println((doc.getContents()).toUpperCase());
        } else if (doc instanceof Lower) {
            System.out.println((doc.getContents()).toLowerCase());
        } else {
            System.out.println(doc.getContents());
        }
    }
}

public class MarkerInterface {
    public static void main(String[] args) {
        Printer5 prn = new Printer5();
        Report doc = new Report("Simple Funny News.");
        prn.printContents(doc);
    }
}
