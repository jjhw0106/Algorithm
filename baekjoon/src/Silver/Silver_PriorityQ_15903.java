package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Silver_PriorityQ_15903 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String temp = br.readLine();
		int n = Integer.parseInt(temp.split(" ")[0]);
		int repeat = Integer.parseInt(temp.split(" ")[1]);
		long answer = 0;

		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		String str = br.readLine();
		for (int i = 0; i < n; i++) {
			pq.add(Long.parseLong(str.split(" ")[i]));

		}

		for (int i = 0; i < repeat; i++) {
			long sum = pq.poll() + pq.poll();
			pq.add(sum);
			pq.add(sum);
		}
		for (Long ln : pq) {
			answer += ln;
		}
		System.out.println(answer);
	}
}
