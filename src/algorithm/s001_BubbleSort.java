package algorithm;

public class s001_BubbleSort {
    public static void main(String[] args) {
        int array[] = { 2, 1, 10, 6, 5, 3, 7, 9, 4, 8 };

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1]; // 'temp'로 수정
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        // 정렬된 배열 출력
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

}
