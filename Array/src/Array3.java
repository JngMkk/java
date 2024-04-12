/*
    배열의 초기화와 배열의 복사

    배열이 생성되면 모든 요소는 0 또는 null로 초기화됨.
        int[] ar = new int[10] -> 배열의 모든 요소 0으로 초기화
        String[] ar = new String[10]; -> 배열의 모든 요소 null로 초기화

    int형 배열과 같은 기본 자료형 배열을 0 이외의 값으로 초기화해야 할 때가 있음.
        java.util.Arrays 클래스
        public static void fill(int[] a, int val): 두 번째 인자로 전달된 값으로 배열 초기화
        public static void fill(int[] a, int fromIndex, int toIndex, int val): 인덱스 fromIndex ~ toIndex-1 범위까지 val의 값으로 초기화

    배열을 복사하는 경우
        java.lang.System 클래스
        public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
            - 복사 원본의 위치: 배열 src의 인덱스 srcPos
            - 복사 대상의 위치: 배열 dest의 인덱스 destPos
            - 복사할 요소의 수: length
*/
import java.util.Arrays;

class Array3 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        int[] arr2 = new int[10];

        Arrays.fill(arr1, 7);
        System.arraycopy(arr1, 0, arr2, 3, 4);

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.print('\n');

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.print('\n');
    }
}
