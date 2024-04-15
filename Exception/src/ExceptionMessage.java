/*
    자바의 최상위 클래스인 java.lang.Object를 제외하고 예외 클래스의 최상위 클래스는 java.lang.Throwable
    이 클래스에는 발생한 예외의 정보를 알 수 있는 메서드가 정의되어 있음.

    public String getMessage(): 예외의 원인을 담고 있는 문자열을 반환
    public void printStackTrace(): 예외가 발생한 위치와 호출된 메서드의 정보를 출력
*/

public class ExceptionMessage {
    public static void md1(int n) {
        md2(n, 0);
    }

    public static void md2(int n1, int n2) {
        int r = n1 / n2;        // 예외 발생 지점
    }

    public static void main(String[] args) {
        md1(3);
        System.out.println("Bye");
    }
}

/*
    메서드 호출 흐름: main -> md1 -> md2

    예외는 md2에서 발생. 그런데 md2에서 해당 예외를 처리하지 않은 경우 가상머신은 md2를 호출한 md1에게 예외처리의 책임을 넘김.
    그런데 md1도 예외처리를 하지 않은 경우 main에게 책임을 넘김.
    예외처리의 책임이 넘어가면 예외처리의 책임을 넘긴 메서드의 호출은 종료가 됨.
    main 조차 예외처리를 하지 않으면 가상머신이 대신 예외를 처리함. (예외 메시지 출력과 프로그램 종료)

    Exception in thread "main" java.lang.ArithmeticException: / by zero
        -> 0으로 나누기 연산을 하여 ArithmeticException이 발생하였음.
	at ExceptionMessage.md2(ExceptionMessage.java:15)
	    -> md2에서 예외가 시작되었음.
	at ExceptionMessage.md1(ExceptionMessage.java:11)
	    -> md1으로 예외가 넘어갔음.
	at ExceptionMessage.main(ExceptionMessage.java:19)
	    -> main으로까지 예외가 넘어갔음.

	ArithmeticException: RuntimeException 상속
*/