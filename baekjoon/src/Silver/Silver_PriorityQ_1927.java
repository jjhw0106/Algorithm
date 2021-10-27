package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Silver_PriorityQ_1927 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		Queue<Integer> stack = new LinkedList<Integer>();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (pq.isEmpty()) {
					stack.add(0);
				} else {
					stack.add(pq.poll());
				}
			} else {
				pq.add(x);
			}
		}
		while (!stack.isEmpty()) {
			System.out.println(stack.poll());
		}
	}
}
