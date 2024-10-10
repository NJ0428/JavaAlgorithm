package algorithm;

public class s006_HeapSort {
    public static void heapify(int[] array, int n, int i) {
        int largest = i;// 자신 노드
        int left = 2 * i + 1;// 왼쪽 자식 노드
        int right = 2 * i + 2;// 오른쪽 자식 노드

        // 큰 값 찾기 왼쪽이 크면 자신의 노드와 바꾼다.
        if (left < n && array[left] > array[largest]) {
            largest = left;
        }
        // 오른쪽이 크면 자신의 노드와 바꾼다.
        if (right < n && array[right] > array[largest]) {
            largest = right;
        }

        if (largest != i) {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;

            // 교체 후 다시 힙정렬
            heapify(array, n, largest);
        }
    }

    public static void heapSort(int[] array) {
        int n = array.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(array, n, i);
        }

        // 정렬되고 마지막과 교환하고 다시 힙정렬
        for (int i = n - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }

    }

    public static void main(String[] args) {
        int array[] = { 2, 1, 10, 6, 5, 3, 7, 9, 4, 8 };

        heapSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}
