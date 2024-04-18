import java.util.Arrays;

/*
    배열 탐색

        public static int binarySearch(int[] a, int key)
            -> 배열 a에서 key를 찾아서 있으면 key의 인덱스 값, 없으면 0보다 작은 수 반환

        이진 탐색이므로 탐색 이전에 정렬이 선행되어야 함.
*/
public class ArraySearch {
    public static void main(String[] args) {
        int[] ar = {33, 55, 11, 44, 22};
        Arrays.sort(ar);
        for (int n : ar)
            System.out.printf("%d ", n);
        System.out.println();

        int idx = Arrays.binarySearch(ar, 33);
        System.out.printf("Index of 33: %d\n", idx);
    }
}
