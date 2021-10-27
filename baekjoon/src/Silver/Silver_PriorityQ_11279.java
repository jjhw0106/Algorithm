package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Silver_PriorityQ_11279 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		List<Integer> list = new ArrayList<Integer>();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			int x = Integer.parseInt(br.readLine());
			if (x == 0) {
				if (pq.isEmpty()) {
					list.add(0);
				} else {
					list.add(pq.poll());
				}
			} else {
				pq.add(x);
			}
		}
		for (Integer integer : list) {
			System.out.println(integer);
		}
	}
}
