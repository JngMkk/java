public class NullPointerException {
    public static void main(String[] args) {
        String str = null;
        System.out.println(str);
        int len = str.length();         // null이 저장된 참조변수를 대상으로 메서드를 호출할 때 발생
        /*
            Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "str" is null
	            at NullPointerException.main(NullPointerException.java:5)

	        NullPointerException: RuntimeException 상속
        */
    }
}
