package algorithm;
//버블 정렬(Bubble Sort)은 서로 인접한 두 원소를 검사하여 정렬하는 알고리즘이다.
//초기 배열을 받고, 첫 번째 원소부터 인접한 다음 원소와 비교하여 큰 값을 뒤로 보내면서 정렬을 한다. 
//이때 큰 값은 계속해서 뒤로 밀리고, 마지막 원소까지 가면 가장 큰 원소가 배열의 맨 끝에 위치하게 된다. 
//다시 처음부터 끝에서 두 번째 원소까지 위의 과정을 반복하면서 배열을 정렬한다.
//시간 복잡도는 최악의 경우 O(N^2)이며, 안정 정렬(stable sort)이다. 
//데이터의 개수가 적은 경우나 이미 정렬되어 있는 경우에는 비교적 빠른 속도로 정렬이 가능하지만, 
//데이터의 개수가 많아질수록 다른 정렬 알고리즘에 비해 속도가 느려진다.

public class BubbleSort {
	public static void main(String[] args) {
        int array[] = {2, 1, 10, 6, 5, 3, 7, 9, 4, 8};
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
