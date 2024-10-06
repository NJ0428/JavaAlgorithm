package algorithm;

public class s003_InsertSort {
    public static void main(String[] args) {
        int array[] = { 2, 1, 10, 6, 5, 3, 7, 9, 4, 8 };
        // 삽입 정렬 알고리즘
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            // 현재 요소를 정렬된 부분의 적절한 위치에 삽입
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j]; // 요소를 오른쪽으로 이동
                j = j - 1;
            }
            array[j + 1] = key; // 현재 요소를 올바른 위치에 삽입
        }
        // 정렬된 배열 출력
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }

}
