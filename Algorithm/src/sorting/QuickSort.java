package sorting;

/*
    퀵 정렬
        기준 데이터를 설정하고 그 기준보다 큰 데이터와 작은 데이터의 위치를 바꾸는 방법.
        일반적인 상황에서 가장 많이 사용되는 정렬 알고리즘 중 하나
        병합 정렬과 더불어 대부분의 프로그래밍 언어의 정렬 라이브러리의 근간이 되는 알고리즘.
        가장 기본적인 퀵 정렬은 첫 번째 데이터를 기준 데이터로 설정

        왜 빠를까?
            이상적인 경우 분할이 절반씩 일어난다면 전체 연산 횟수로 O(N log N)을 기대할 수 있음.
                - 너비 X 높이 = N x log N = N log N

        평균의 경우 O(N log N)의 시간 복잡도를 가짐.
        하지만 최악의 경우 O(N^2)의 시간 복잡도를 가짐.
            - 첫 번째 원소를 기준으로 삼을 때, 이미 정렬된 배열에 대해서 퀵 정렬을 수행??
*/
public class QuickSort {
    public static void quickSort(int[] arr, int start, int end) {
        if (start >= end)   // 원소가 한 개인 경우
            return;

        int pivot = start;
        int left = start + 1;
        int right = end;

        // left index가 right index보다 커지면 (서로 교차하면) 반복문을 종료한다.
        while (left <= right) {
            // left index는 기준 값보다 큰 데이터를 찾을 때까지 반복
            while (left <= end && arr[left] <= arr[pivot]) {
                left++;
            }
            // right index는 기준 값보다 작은 데이터를 찾을 때까지 반복
            while (right > start && arr[right] >= arr[pivot]) {
                right--;
            }

            // 서로 교차했다면 작은 데이터와 기준 값을 교체
            if (left > right) {
                int temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            } else {
                // 교차하지 않았다면 작은 데이터와 큰 데이터를 교체
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }

        quickSort(arr, start, right - 1);
        quickSort(arr, right + 1, end);
    }

    public static void main(String[] args) {
        int n = 10;
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};

        quickSort(arr, 0, n - 1);

        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
