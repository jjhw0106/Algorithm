package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Silver_PriorityQ_11286 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				if(Math.abs(o1)-Math.abs(o2)==0) {
					return o1-o2;
				}
				return Math.abs(o1)-Math.abs(o2);
			}

		});
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
