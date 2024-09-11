package algorithm;

public class s008_Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;

    // 생성자
    public s008_Stack(int size) {
        this.maxSize = size;// 스택의 최대 크기
        this.stackArray = new int[maxSize];// 스택 배열 초기화
        this.top = -1;// 스택이 비어 있는 상태
    }

    // 스택이 있는지 확인
    public int size() {
        return top + 1;
    }

    // 스택이 가득찼는지 확인
    public boolean inFull() {
        return (top == maxSize - 1);
    }

    // 스택이 비어 있는지 확인
    public boolean isEmpty() {
        return (top == -1);// top이 -1이면 비어있음
    }

    // 스택 최상단 값 확인
    public int peek() {
        if (isEmpty()) {
            System.out.println("스택이 비어있습니다.");
            return -1;
        } else
            return stackArray[top];
    }

    // 스택 추가
    public void push(int value) {
        if (inFull())
            System.out.println("스택이 가득찼음");
        else
            stackArray[++top] = value;
    }

    // 스택 제거
    public int pop() {
        if (isEmpty()) {
            System.out.println("스택이 비어 있음");
            return -1;
        } else
            return stackArray[top--];

    }

    public static void main(String[] args) {
        s008_Stack stack = new s008_Stack(8);

        stack.push(1); // 스택 추가
        stack.push(2);
        stack.push(3);

        System.out.println("최상단 값: " + stack.peek()); // 최상단 값
        stack.pop(); // 최상단 값 제거
        System.out.println("최상단 값: " + stack.peek()); // 최상단 값

        // 스택에 남아 있는 모든 값 제거
        while (!stack.isEmpty()) {
            System.out.println("값을 제거: " + stack.pop());
        }
    }

}