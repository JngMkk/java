class Board {}
class PBoard extends Board {}

public class ClassCastException {
    public static void main(String[] args) {
        Board pbd1 = new PBoard();
        PBoard pbd2 = (PBoard)pbd1;

        System.out.println("--");

        Board ebd1 = new Board();
        PBoard ebd2 = (PBoard)ebd1;     // Exception (허용할 수 없는 형 변환)

        /*
            Exception in thread "main" java.lang.ClassCastException: class Board cannot be cast to class PBoard (Board and PBoard are in unnamed module of loader 'app')
	            at ClassCastException.main(ClassCastException.java:12)

	        ClassCastException: RuntimeException 상속
        */
    }
}
