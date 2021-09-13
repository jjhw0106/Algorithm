package dstructure;

public class MyStack {

import java.util.Arrays;

public class MyStack {

	private int top;
	private int stackSize;
	private int[] stackArr;

	void stackInit(int size) {
		stackSize = size;
		stackArr = new int[stackSize];
		for (int i = 0; i < stackSize; i++) {
			stackArr[i] = 0;
		}
	}

	int pop() {
		if (size() == 0) {
			System.out.println("스택이 비어있습니다");
			return -1;
		}
		int output = stackArr[top--];
		return output;
	}

	int size() {
		int size = 0;
		for (int i = 0; i < stackArr.length; i++) {
			if (stackArr[i] != 0) {
				size++;
			}
		}
		return size;
	}

	void push(int input) {
		if (isFull()) {
			System.out.println("스택이 가득 찼습니다.");
			return;
		}
		stackArr[top++] = input;
	}

	boolean isEmpty() {
		return top == 0 ? true : false;
	}

	boolean isFull() {
		return top == stackSize ? true : false;
	}

	void clear() {
		if (isEmpty()) {
			System.out.println("이미 비어있는 스택입니다.");
		}
		// Q. 기존에 stackArr에 할당된 메모리가 남아있고 객체가 새로 생성되어 메모리 잡아먹는거 아닌지?
		// A. 기존의 stackArr가 가비지 컬렉션의 대상이 된다.
		stackArr = new int[stackSize];
	}

	int peek() {
		if (size() == 0) {
			System.out.println("스택이 비어있습니다");
			return -1;
		}
		return stackArr[top];
	}

	public int getTop() {
		return top;
	}

	public void setTop(int top) {
		this.top = top;
	}

	public int getStackSize() {
		return stackSize;
	}

	public void setStackSize(int stackSize) {
		this.stackSize = stackSize;
	}

	public int[] getStackArr() {
		return stackArr;
	}

	public void setStackArr(int[] stackArr) {
		this.stackArr = stackArr;
	}

	@Override
	public String toString() {
		return "Stack [stackArr=" + Arrays.toString(stackArr) + "]";
	}
}
