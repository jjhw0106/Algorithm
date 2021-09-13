package dstructure;

import java.util.Arrays;
import java.util.Scanner;

public class Controller {
	public static void main(String[] args) {
		MyArrQueue queue = new MyArrQueue();
		Scanner sc = new Scanner(System.in);
		int repeat = sc.nextInt();
		int[] arr = new int[repeat];
		int idx = 0;
		while (repeat-- != 0) {
			arr[idx++] = sc.nextInt();
		}
		for (int i = 0; i < arr.length; i++) {
			queue.push(arr[i]);
			System.out.println(queue.toString());
		}
		System.out.println(queue.getFront()+","+queue.getRear());
		while (!queue.isEmpty()) {
			queue.pop();
			System.out.println(queue.toString());
		}
	}
}
