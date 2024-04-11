class StringMethods {
    public static void main(String[] args) {
        String str1 = "Coffee";
        String str2 = "Bread";

        // Concatenating
        // public String concat(String str)
        String str3 = str1.concat(str2);
        System.out.println(str3);
        String str4 = "Fresh".concat(str3);
        System.out.println(str4);

        // Substring
        // public String substring(int beginIndex)
        // public String substring(int beginIndex, int endIndex)
        String str5 = str1.substring(2);
        System.out.println(str5);
        String str6 = str5.substring(1, 3);
        System.out.println(str6);

        // Comparing
        // public boolean equals(Object anObject)
        String str7 = "my house";
        boolean isSame = str7.equals("my house");
        System.out.println(isSame);

        String str8 = "Lexicographically";
        String str9 = "lexicographically";
        if (str8.equals(str9))
            System.out.println("두 문자열은 같습니다.");
        else
            System.out.println("두 문자열은 다릅니다.");

        // 사전 편찬 순서
        // 두 문자열의 사전 편찬 상 순서를 비교함.
        // 두 문자열의 내용이 일치하면 0, 호출된 인스턴스의 문자열이 인자로 전달된 문자열보다 앞서면 0보다 작은 값 반환. 뒤서면 0보다 큰 값 반환
        // public int compareTo(String anotherString)
        int cmp = str8.compareTo(str9);
        if (cmp == 0)
            System.out.println("두 문자열은 일치합니다.");
        else if (cmp < 0)
            System.out.println("사전의 앞에 위치하는 문자: " + str8);
        else
            System.out.println("사전의 앞에 위치하는 문자: " + str9);

        // 문자열 비교에 있어서 대소문자 구분을 하지 않음. (사전 편찬 상 순서를)
        // public int compareToIgnoreCase(String str)
        if (str8.compareToIgnoreCase(str9) == 0)
            System.out.println("두 문자열은 같습니다.");
        else
            System.out.println("두 문자열은 다릅니다.");

        // 기본 자료형의 값을 문자열로 바꾸기
        // static String valueOf(int i)
        double e = 2.718281;
        String se = String.valueOf(e);
        System.out.println(se.getClass().getName());    // java.lang.String

        /*
            문자열 결합의 최적화

            String birth = "<양>" + 7 + '.' + 16;
                => String birth = "<양>".concat(String.valueOf(7)).concat ...
                => valueOf, concat 메소드의 호출은 지속적으로 문자열 인스턴스의 생성을 의미하고 이는 성능에 영향을 미침.
                   이러한 문제점의 해결을 위해 StringBulider라는 클래스가 제공됨.
                   위 예시도 컴파일러에 의해 다음과 같이 처리됨.
                   String birth = (new StringBuilder("<양>").append(7).append('.').append(16)).toString();
        */
    }
}
