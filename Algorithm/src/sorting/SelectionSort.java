package sorting;

/*
    선택 정렬
        처리되지 않은 데이터 중에서 가장 작은 데이터를 선택해 맨 앞에 있는 데이터와 바꾸는 것을 반복

        N번 만큼 가장 작은 수를 찾아서 맨 앞으로 보내야 함.
        구현 방식에 따라서 사소한 오차는 있을 수 있지만, 전체 연산 횟수는 N + (N-1) + (N-2) + ... + 2
        (N^2+N-2)/2 => O(N^2)
*/
public class SelectionSort {
    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        for (int i = 0; i < n; i++) {
            // 가장 작은 원소의 인덱스
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }

            // 스왑
            int temp = arr[i];
            arr[i] = arr[min_idx];
            arr[min_idx] = temp;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
