package dstructure;

import java.util.Arrays;

public class MyArrQueue {
	private int front;
	private int rear;
	private int[] queue;
	int MAX=10;
	public MyArrQueue(){
		front = rear =0;
		queue=new int[MAX];
	}
	
	boolean isEmpty() {
		return rear==front;
	}

	boolean isFull() {
		return rear==MAX-1;
	}

	int size() {
		return rear-front;
	}

	void push(int value) {
		if(rear==MAX) {
			System.out.println("큐가 가득 찼습니다.");
			return;
		}
		queue[rear++]=value;
	}

	int peek() {
		if(size()==0) {
			System.out.println("큐가 비어있습니다.");
			return -1;
		}
		return queue[front];
	}

	@Override
	public String toString() {
		return "MyArrQueue [queue=" + Arrays.toString(queue) + "]";
	}

	int pop() {
		if(size()==0) {
			System.out.println("큐가 비어있습니다.");
			return -1;
		}
		int retVal=queue[front];
		queue[front++]=0;
		return retVal;
	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getRear() {
		return rear;
	}

	public void setRear(int rear) {
		this.rear = rear;
	}
}
