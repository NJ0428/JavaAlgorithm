package algorithm;

public class s005_MergeSort {
    static int[] sorted;

    // 병합정렬
    public static void merge(int[] array, int left, int middle, int right) {
        int n = left;
        int m = middle + 1;
        int k = left;

        while (n <= middle && m <= right) {
            if (array[n] < array[m]) {
                sorted[k] = array[n];
                n++;
            } else {
                sorted[k] = array[m];
                m++;
            }
            k++;
        }
        while (n <= middle) {
            sorted[k] = array[n];
            n++;
            k++;
        }
        while (m <= right) {
            sorted[k] = array[m];
            m++;
            k++;
        }
        for (int t = left; t <= right; t++) {
            array[t] = sorted[t];
        }
    }

    // 1개까지 나누기
    public static void mergSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = ((left + right) / 2);
            mergSort(array, left, middle);// 오른쪽 정렬
            mergSort(array, middle + 1, right);// 왼쪽정렬
            merge(array, left, middle, right);
        }
    }

    public static void main(String[] args) {
        int array[] = { 2, 1, 10, 6, 5, 3, 7, 9, 4, 8 };
        sorted = new int[array.length];// 임시 배열 생성

        mergSort(array, 0, array.length - 1);// 병합정렬 호출

        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}
