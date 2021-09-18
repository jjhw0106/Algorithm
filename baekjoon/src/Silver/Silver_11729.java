package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

//하노이의 탑

public class Silver_11729 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine()); System.out.println(hanoi(n));
	}

	static int hanoi(int n) {
		if (n == 1) {
			return 1;
		} else {
			return 2 * hanoi(n - 1) + 1;
		}
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
//
//	}
//}
