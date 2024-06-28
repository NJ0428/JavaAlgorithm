package algorithm;
//선택 정렬
public class SelectionsSort {
	// 선택 정렬
	public class SelectionSort {
	    public static void main(String[] args) {
	        int array[] = {2, 1, 10, 6, 5, 3, 7, 9, 4, 8};

	        for (int i = 0; i < array.length - 1; i++) {
	            int minIndex = i; // 현재 위치를 최소값의 인덱스로 초기화

	            // 현재 위치 이후의 부분에서 최소값의 인덱스를 찾음
	            for (int j = i + 1; j < array.length; j++) {
	                if (array[j] < array[minIndex]) {
	                    minIndex = j; // 최소값 인덱스 업데이트
	                }
	            }

	            // 최소값을 현재 위치와 교환
	            int temp = array[minIndex];
	            array[minIndex] = array[i];
	            array[i] = temp;
	        }

	        // 정렬된 배열 출력
	        for (int i = 0; i < array.length; i++) {
	            System.out.println(array[i]);
	        }
	    }
	}
}