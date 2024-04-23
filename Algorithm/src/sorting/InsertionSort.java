package sorting;

/*
    삽입 정렬
        처리되지 않은 데이터를 하나씩 골라 적절한 위치에 삽입함.
        선택 정렬에 비해 구현 난이도가 높은 편이지만, 일반적으로 더 효율적으로 동작함.

        시간 복잡도 O(N^2)이며, 선택 정렬과 마찬가지로 반복문이 두 번 중첩되어 사용됨.
        현재 리스트의 데이터가 거의 정렬되어 있는 상태라면 매우 빠르게 동작함.
            - 최선의 경우 O(N)의 시간 복잡도를 가짐.
*/
public class InsertionSort {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 1; i < n; i++) {
            // 인덱스 i부터 1까지 감소시키며
            for (int j = i; j > 0; j--) {
                // 한 칸씩 왼쪽으로 이동시킴
                if (arr[j] < arr[j - 1]) {
                    // 스왑
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                } else {
                    // 자신보다 작은 데이터를 만나면 그 위치에서 멈춤
                    break;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
