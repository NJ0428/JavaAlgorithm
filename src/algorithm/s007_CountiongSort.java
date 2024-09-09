package algorithm;

import java.util.Arrays;

public class s007_CountiongSort {
    // 계수 정렬
    public static void countiongSort(int[] array) {
        // 최댓값
        int max = Arrays.stream(array).max().getAsInt();
        // 최솟값
        int min = Arrays.stream(array).min().getAsInt();

        // 배열의 크기
        int range = max - min + 1;
        // 개수 배열
        int[] count = new int[range];
        // 정렬된 배열
        int[] output = new int[array.length];

        // 각 숫자의 개수 저정하기
        for (int i = 0; i < array.length; i++) {
            count[array[i] - min]++;
        }

        // 합계산 순서로 변환
        for (int i = 1; i < count.length; i++) {
            count[i] += count[i - 1];
        }
        // 값을 넣음
        for (int i = array.length - 1; i >= 0; i--) {
            output[count[array[i] - min] - 1] = array[i];
            count[array[i] - min]--;
        }
        System.arraycopy(output, 0, array, 0, array.length);
    }

    public static void main(String[] args) {
        int array[] = { -2, 1, 10, 6, 5, 1, -3, 7, 9, 4, 8 };
        countiongSort(array);
        for (int num : array) {
            System.out.print(num + " ");
        }
    }

}