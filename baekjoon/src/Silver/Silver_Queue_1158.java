package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Silver_Queue_1158 {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();

		Queue<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			q.offer(i + 1);
		}
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (!q.isEmpty()) {
			idx++;
			if (idx == k) {
				sb.append(q.poll());
				if (q.size() != 0) {
					sb.append(", ");
				}
				idx = 0;
			} else {
				q.offer(q.poll());
			}
		}
		sb.append(">");
		System.out.println(sb);
	}
}
