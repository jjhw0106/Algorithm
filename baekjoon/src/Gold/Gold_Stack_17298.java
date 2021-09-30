package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class Gold_Stack_17298 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] attr = new int[num];
		for (int i = 0; i < num; i++) {
			attr[i] = sc.nextInt();
		}

		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < attr.length; i++) {
			stack.push(attr[i]);
		}
		Stack<Integer> aStack = new Stack<Integer>();
		aStack.push(-1);
		int a = 0;
		int temp = 0;
		for (int i = 1; i < num; i++) {
			if ((temp = stack.pop()) > stack.peek()) {
				a = temp;
				aStack.push(a);
			} else {
				if (a > stack.peek()) {
					aStack.push(a);
				} else {
					aStack.push(-1);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		while (!aStack.isEmpty()) {
			sb.append(aStack.pop());
			if (aStack.size() > 0) {
				sb.append(" ");
			}
		}
		System.out.println(sb);
//		시간초과
//		StringBuilder sb = new StringBuilder();
//		for (int i = 0; i < num; i++) {
//			if (i == num - 1) {
//				sb.append(-1);
//				break;
//			}
//			for (int j = i; j < num; j++) {
//				if (attr[i] < attr[j]) {
//					sb.append(attr[j]).append(" ");
//					break;
//				}
//				if (j == num - 1) {
//					sb.append(-1).append(" ");
//					break;
//				}
//			}
//		}
//		System.out.println(sb);
	}
}
