/*
    Java 특징
        - 객체 지향적
            : 원시 자료형(숫자(int, float, long 등)나 논리값(true, false))을 제외하면 거의 모두 객체로 구성됨.
            : 실제로 자바는 Object 클래스에서 모든 클래스를 파생함.
        - 인터프리터 언어
            : 컴파일 언어인 동시에 인터프리터 언어.
            : 자바는 먼저 텍스트 소스를 컴파일하여 이진 파일(클래스 파일)로 만든 다음, 자바 런타임이 이 클래스 파일을 인터프리트하면서 실행.
            : 이진 파일을 만듦으로써 컴파일 언어에 가까운 속도와 함께 시스템의 독립성을 얻음.
        - 포인터 연산을 지원하지 않음
            : 이는 잘못된 주소를 가리킬 가능성을 사전에 없앰.
            : 자바의 모든 메모리 접근을 자바 시스템이 관리하고 제한하며, 또한 예외 처리까지 하므로 시스템이 붕괴될 우려가 없음.
        - 정적 타입
            : 자료형 타입에 매우 민감함.
            : 컴파일만 되면 실행할 때 오류 발생률이 다른 언어에 비해 낮음.
        - 플랫폼 독립적
            : 자바의 실행 파일은 이진 코드(클래스)이므로 자바 런타임을 설치한 시스템에서는 어디서나 실행할 수 있음.
            : 즉, 자바로 작성한 프로그램이라면 운영체제와 상관없이 어디서든 실행할 수 있다는 뜻.
            : 왜냐하면, 자바 프로그램은 가상 머신으로 실행되기 때문.
        - 멀티 스레드 지원
            : 프로그램 단위가 같은 스레드를 동시에 수행할 수 있음.
            : 멀티 CPU 시스템에서 효율이 높음.
        - 동적
            : 자바 인터페이스를 이용하면 모듈을 갱신할 때 다른 모듈까지 모두 갱신할 필요가 없음.
            : 인터페이스가 인스턴스 변수와 도구의 실행문을 모두 배제하고 객체 간의 상호 작용을 정의하기 때문.

    Java 코드 구조

        // 클래스명은 소스 파일의 이름과 같아야 함.
        public class 클래스명 {
            // 메서드 블럭
            [public|private|protected] [static] (리턴 자료형|void) 메서드명1(입력 자료형 매개변수, ...) {
                statement;
                ...
            }
        }
*/

/*
    일반적으로 class 앞에 사용한 public 키워드는 자바 프로그래밍 시 사용하는 접근 제어자.
    클래스명과 파일명이 같으면 그 class 앞에 public을 붙여 주어야 한다는 관례가 있음.
*/
public class HelloWorld {
    /*
        public: 메서드 접근 제어자, 누구나 이 메서드에 접근할 수 있다는 의미.
        static: 이 메서드는 인스턴스를 생성하지 않아도 실행할 수 있다는 것을 의미.
        void: 리턴값이 없음을 의미.
        String[]: String은 문자열을 나타내는 자료형. ([]는 값이 여러 개로 이루어진 배열이라는 것을 의미)
        args: String[] 자료형의 변수명.
        System.out.println(): 표준 출력으로 데이터를 보내는 자바의 내장 메서드로 문자열을 화면에 출력.
    */
    public static void main(String[] args) {
        System.out.println("Hello World");

        // 숫자형
        byte i = -128;                  // -128 ~ 127
        short j = -32768;               // -32768 ~ 32767
        int x = 10;                     // -2147483648 ~ 2147483647
        int y = 5;
        long z = 898989898989898989L;   // -9223372036854775808 ~ 9223372036854775807
        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(z);
        System.out.println(i);
        System.out.println(j);
        System.out.println(7 % 3);
        System.out.println(3 % 7);
        x++;
        y--;
        System.out.println(x);
        System.out.println(y);
        System.out.println(++x);

        // 실수형
        float pi = 3.14F;                           // -3.4 * 10^38 ~ 3.4 * 10^38
        double morePi = 3.14159265358979323846;     // -1.7 * 10^308 ~ 1.7 * 10^308 자바 실수 기본값
        System.out.println(pi);
        System.out.println(morePi);

        // boolean
        boolean tf = true;
        System.out.println(tf);
        System.out.println("3".equals("2"));
        if (x > y) {
            System.out.println("true!");
        }

        // char
        char a1 = 'a';
        char a2 = 97;           // 아스키코드
        char a3 = '\u0061';     // 유니코드
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);
    }
}
