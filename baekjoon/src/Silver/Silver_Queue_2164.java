package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Silver_Queue_2164 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		LinkedList<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			q.offer(i+1);
		}
		while (q.size() > 1) {
			q.poll();
			q.offer(q.poll());
		}
		System.out.println(q.poll());

	}
}
