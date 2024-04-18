import java.util.Arrays;

/*
    java.util.Arrays 클래스는 배열 조작에 도움을 주는 메서드들로 채워져 있음.
    따라서 이 클래스에 정의된 메서드들을 사용하면 배열의 복사, 비교, 정렬 및 탐색과 관련된 코드를 비교적 쉽게 작성할 수 있음.

    배열의 복사
        public static int[] copyOf(int[] original, int newLength)
            -> original에 전달된 배열을 첫 번째 요소부터 newLength의 길이만큼 복사

        public static int[] copyOfRange(int[] original, int from, int to)
            -> original에 전달된 배열을 인덱스 from부터 to 이전 요소까지 복사

        모든 기본 자료형 배열에 대해 이 메서드가 오버로딩 되어 있음.
        위 메서드는 배열을 복사하여 '새로운 배열을 생성'하는 메서드.
        첫 번째 인자로 전달된 배열을 두 번째 인자로 전달된 길이만큼 복사하되 '새로운 배열을 생성'하여 복사함.
        그리고 이렇게 생성된 배열의 참조 값을 반환함.

        배열을 새로 생성하지 않고 존재하는 배열에 복사를 하려는 경우에는 java.lang.System 클래스의 아래 메서드를 호출.

        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            -> 배열 src의 srcPos에서 배열 dest의 destPos로 length 길이만큼 복사
*/
public class CopyOfArrays {
    public static void main(String[] args) {
        double[] arOrg = {1.1, 2.2, 3.3, 4.4, 5.5};

        // 배열 전체를 복사
        double[] arCpy1 = Arrays.copyOf(arOrg, arOrg.length);

        // 세 번째 요소까지만 복사
        double[] arCpy2 = Arrays.copyOf(arOrg, 3);

        for (double d : arCpy1)
            System.out.print(d + "\t");
        System.out.println();

        for (double d : arCpy2)
            System.out.print(d + "\t");
        System.out.println();
    }
}
