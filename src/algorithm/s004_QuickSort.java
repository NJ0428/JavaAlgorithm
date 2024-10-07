package algorithm;

public class s004_QuickSort {
    // 메인 메서드
    public static void main(String[] args) {
        int array[] = { 2, 1, 10, 6, 5, 3, 7, 9, 4, 8 };
        int n = array.length;

        // 퀵정렬 호출
        quickSort(array, 0, n - 1);

        // 정렬된 배열 출력
        System.out.println("정렬된 배열:");
        printArray(array);
    }
    // 퀵정렬 메서드
    public static void quickSort(int[] array, int low, int high) {
        if (low >= high)
            return;

        // 피벗을 기준으로 분할
        int pi = partition(array, low, high);

        // 피벗의 왼쪽 부분 정렬
        quickSort(array, low, pi - 1);

        // 피벗의 오른쪽 부분S 정렬
        quickSort(array, pi + 1, high);

    }

    // 분할 메서드
    public static int partition(int[] array, int low, int high) {
        int pivot = array[high]; // 피벗
        int i = (low - 1); // 작은 요소의 인덱스

        for (int j = low; j < high; j++) {
            // 현재 요소가 피벗보다 작거나 같으면
            if (array[j] <= pivot) {
                i++;

                // 요소 교환
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // 피벗과 교환
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;
    }

    // 배열 출력 메서드
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
