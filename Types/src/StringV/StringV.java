package StringV;

public class StringV {
    public static void main(String[] args) {
        // char
        char a1 = 'a';
        char a2 = 97;           // 아스키코드
        char a3 = '\u0061';     // 유니코드
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        // String
        String a = "Hello Java";
        /*
            new 키워드는 객체를 만들 때 사용
            문자열을 표현할 때는 가급적이면 위의 방식(리터럴 표기 방식)이 좋다.
            왜냐하면 리터럴 표기 방식은 가독성이 좋고 컴파일할 때 최적화에 도움을 주기 때문.
        */
        String b = new String("Hello Java");

        /*
            a, b 변수는 같은 문자열 값을 갖게 되지만 완전히 동일하지는 않음.
            a는 객체를 생성하지 않고 고정된 값을 그대로 대입하는 방법.
            b는 항상 새로운 String 객체를 만듦.

            int, long, double, float, boolean, char 자료형은 원시 자료형이라 함.
            이런 원시 자료형은 new 키워드로 값을 생성할 수 없음.
            원시 자료형은 리터럴 표기 방식으로만 값을 세팅할 수 있음.
            원시 자료형에는 각각 그에 대응하는 Wrapper 클래스가 있다.

            원시 자료형	Wrapper 클래스
            int	        Integer
            long	    Long
            double	    Double
            float	    Float
            boolean	    Boolean
            char	    Character

            멀티 스레드 환경에서 동기화를 지원하려면 원시 자료형대신 Wrapper 클래스를 사용해야 한다.

            String은 리터럴 표기 방식을 사용할 수 있지만 원시 자료형에 포함되지는 않음.
        */
        System.out.println(a);
        System.out.println(b);

        // 문자열 내장 메서드
        // equals(): 문자열 2개가 같은지를 비교하여 결과값 리턴
        System.out.println(a.equals(b));
        // == 연산자는 2개의 자료형이 같은 객체인지를 판별할 때 사용하는 연산자이므로 false를 리턴
        System.out.println(a == b);

        // indexOf(): 문자열에서 특정 문자열이 시작되는 위치(인덱스 값)을 리턴.
        System.out.println(a.indexOf("Java"));

        // contains(): 문자열에서 특정 문자열이 포함되어 있는지 여부
        System.out.println(a.contains("Java"));

        // charAt(): 문자열에서 특정 위치의 문자를 리턴.
        System.out.println(a.charAt(6));

        // replaceAll(): 문자열에서 특정 문자열을 다른 문자열로 바꿀 때 사용.
        System.out.println(a.replaceAll("Java", "World"));
        System.out.println(a);

        // substring(시작위치, 끝위치): 문자열에서 특정 문자열을 뽑아낼 때 사용. 끝위치 앞까지 문자를 뽑아냄
        System.out.println(a.substring(0, 5));

        // toUpperCase(): 문자열을 모두 대문자로 변경할 때 사용 (소문자는 toLowerCase())
        System.out.println(a.toUpperCase());

        // split(): 문자열을 특정한 구분자로 나누어 문자열 배열로 리턴
        String[] result = a.split(" ");
        for (String x : result) {
            System.out.println(x);
        }

        // 문자열 포맷팅
        System.out.println(String.format("I ate %d apples.", 3));
        System.out.println(String.format("I ate %s apples.", "three"));
        System.out.printf("I ate %d apples.\n", 3);


        // StringBuffer는 문자열을 추가하거나 변경할 때 주로 사용하는 자료형
        StringBuffer sb = new StringBuffer();

        // append(): StringBuffer에 문자열 추가
        sb.append("Hello");
        sb.append(" ");
        sb.append("Java");

        String res = sb.toString();         // StringBuffer를 String 자료형으로
        System.out.println(res);

        String res2 = "";
        res2 += "Hello";
        res2 += " ";
        res2 += "Java";
        System.out.println(res2);

        /*
            첫 번째 예제와 두 번째 예제는 결과는 같지만 내부적으로 객체를 생성하고 메모리를 사용하는 과정은 다름.
            첫 번째 예제에서는 StringBuffer 객체를 한 번만 생성하지만,
            두 번째 예제에서는 String 자료형에 + 연산이 있을 때마다 새로운 String 객체를 생성하므로 총 4개의 String 객체가 만들어짐.

            String 자료형은 값이 한 번 생성되면 변경할 수 없음.
            toUpperCase와 같은 메서드를 보면 문자열이 변경되는 것처럼 보이지만, 해당 메서드를 수행할 때 도 다른 String 객체를 생성하여 리턴할 뿐임.
            반면에 StringBuffer 자료형은 값을 변경할 수 있으므로 생성된 값을 언제든지 수정할 수 있음.

            상황에 따라 StringBuffer와 String을 사용해야 함.
            StringBuffer는 String보다 무거운 편에 속함.
            new StringBuffer()로 객체를 생성하면 String을 사용할 때보다 메모리 사용량도 많고 속도도 느림.
            따라서, 문자열을 추가하거나 변경하는 작업이 많으면 StringBuffer를 사용하고, 적으면 String을 사용하는 것이 유리함.
        */

        // StringBuilder는 StringBuffer와 비슷한 자료형
        // StringBuffer는 멀티 스레드 환경에서 안전하고, StringBuilder는 StringBuffer보다 성능이 우수함.
        // 따라서 동기화를 고려할 필요가 없는 상황에서는 StringBuffer보다 StringBuilder를 사용하는 것이 유리함.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello");
        sb2.append(" ");
        sb2.append("Java");
        String res3 = sb2.toString();
        System.out.println(res3);

        // insert(): 특정 위치에 원하는 문자열을 삽입할 수 있음.
        sb.insert(0, "Welcome, ");
        System.out.println(sb.toString());

        // substring(): String 자료형의 substring 메서드와 동일함.
        System.out.println(sb.substring(0, 7));
    }
}
