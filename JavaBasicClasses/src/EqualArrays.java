import java.util.Arrays;

/*
    배열의 비교

        public static boolean equals(int[] a, int[] a2)
            -> 매개변수 a와 a2로 전달된 배열의 내용을 비교하여 true 또는 false 반환

        기본적으로 모든 기본 자료형의 배열에 대해 이 메서드가 오버로딩 되어 있음.
        두 배열에 저장된 데이터의 수, 순서, 그리고 내용이 같을 때 true 반환..
*/
public class EqualArrays {
    public static void main(String[] args) {
        int[] ar1 = {1, 2, 3, 4, 5};
        int[] ar2 = Arrays.copyOf(ar1, ar1.length);
        System.out.println(Arrays.equals(ar1, ar2));
    }
}