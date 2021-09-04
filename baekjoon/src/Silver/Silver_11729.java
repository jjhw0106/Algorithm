package Silver;

import java.util.Scanner;

//하노이의 탑

public class Silver_11729 {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		sb.append((int) Math.pow(2, n) - 1).append('\n');
		hanoi(n, 1, 2, 3);
		System.out.println(sb);
	}

	public static void hanoi(int n, int start, int mid, int to) {
		if (n == 1) {
			sb.append(start + " " + to + "\n");
			return;
		}
		hanoi(n - 1, start, to, mid);

		sb.append(start + " " + to + "\n");

		hanoi(n - 1, mid, start, to);

	}
}
//	public static StringBuilder sb = new StringBuilder();
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		int n = sc.nextInt();
//
//		sb.append((int) Math.pow(2, n) - 1).append('\n');
//		hanoi(n, 1, 2, 3);
//		System.out.println(sb);
//	}
//
//	public static void hanoi(int n, int start, int mid, int to) {
//		if (n == 1) {
//			sb.append(start + " " + to + "\n");
//			return;
//		}
//		hanoi(n - 1, start, to, mid);
//
//		sb.append(start + " " + to + "\n");
//
//		hanoi(n - 1, mid, start, to);
//	}
