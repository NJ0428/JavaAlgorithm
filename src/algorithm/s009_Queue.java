package algorithm;

import java.util.Queue;
import java.util.Stack;

public class s009_Queue {

    private int maxSize;// 큐의 최대 크기
    private int[] queueArray;// 저장 배열
    private int front;// 값이 나가는 위치
    private int rear;// 값이 들어가는위치
    private int nItems;// 저장개수

    // 큐 생성자
    public s009_Queue(int size) {
        this.maxSize = size;// 최대 크기
        this.queueArray = new int[maxSize];// 초기화
        this.front = 0;// 앞쪽 초기화
        this.rear = -1;// 뒤쪽 초기화
        this.nItems = 0;// 빈값
    }

    public boolean isEmpty() {
        return (nItems == 0);
    }

    public boolean isFull() {
        return (nItems == maxSize);
    }

    public int size() {
        return nItems;// 현재 저장된 요소
    }

    // 큐 값확인
    public int peek() {
        if (isEmpty()) {
            System.out.println("큐가 비어 있습니다.");
            return -1;
        } else {
            return queueArray[front];
        }
    }

    // 큐값 추가
    public void enqueue(int value) {
        if (isFull()) {
            System.out.println("큐가 가득 찼습니다.");
        } else {
            if (rear == maxSize - 1) { // 처음으로 순환
                rear = -1;
            }
            queueArray[++rear] = value; // 값을 저장
            nItems++; // 저장된 요소 개수 증가
        }
    }

    // 큐에서 값 제거
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("큐가 비어 있습니다.");
            return -1; // 오류 처리
        } else {
            int temp = queueArray[front++]; // 앞쪽에서 값을 제거하고 front를 증가
            if (front == maxSize) { // front가 끝에 도달하면 다시 처음으로 순환
                front = 0;
            }
            nItems--; // 저장된 요소 개수 감소
            return temp; // 제거된 값을 반환
        }
    }

    public static void main(String[] args) {
        s009_Queue queue = new s009_Queue(8); // 큐 생성

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println("큐의 값: " + queue.peek()); // 큐의 앞쪽 값 확인
        queue.dequeue(); // 앞쪽 값 제거
        System.out.println("큐의 값: " + queue.peek()); // 큐의 앞쪽 값 확인

        // 큐에 남아 있는 모든 값 제거
        while (!queue.isEmpty()) {
            System.out.println("값을 제거: " + queue.dequeue());
        }
    }

}