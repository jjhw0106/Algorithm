package dstructure;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("==========자료구조==========");
		System.out.println("1. 큐");
		System.out.println("2. 스택");
		System.out.println("3. 이진탐색트리");
		System.out.println("4. 큐");
		System.out.println("5. 큐");
		System.out.print("test : ");
		int num = sc.nextInt();

		switch (num) {
		case 1:
			System.out.println("큐");
			MyArrQueue queue = new MyArrQueue();
			System.out.print("반복횟수: ");
			int repeat = sc.nextInt();
			int[] arr = new int[repeat];
			int idx = 0;
			while (repeat-- != 0) {
				arr[idx++] = sc.nextInt();
			}
			System.out.println("[Push]");
			for (int i = 0; i < arr.length; i++) {
				queue.push(arr[i]);
				System.out.println(queue.toString());
			}
			System.out.println(queue.getFront() + "," + queue.getRear());
			System.out.println("[Poll]");
			while (!queue.isEmpty()) {
				queue.pop();
				System.out.println(queue.toString());
			}
			break;
		case 2:
			System.out.println("스택");

			break;
		case 3:
			System.out.println("이진탐색트리");
			MyBST bst = new MyBST();
			System.out.print("반복횟수: ");
			repeat = sc.nextInt();
			System.out.println("[insert]");
			for(int i=0; i<repeat; i++) {
				bst.insert(sc.nextInt());
			}
			System.out.println(bst.rootNode.value);
			bst.inOrderPrint(bst.rootNode);
			break;
		case 4:

			break;
		}
	}
}
