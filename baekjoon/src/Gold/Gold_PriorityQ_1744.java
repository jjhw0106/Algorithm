package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Gold_PriorityQ_1744 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			int input = Integer.parseInt(br.readLine());
			if (input >= 0)
				pq.offer(input);
			else
				pq2.offer(input);
		}
		int answer = 0;
		while (pq2.size() >= 2) {
			answer += pq2.poll() * pq2.poll();
		}
		if (!pq2.isEmpty()) {
			pq.offer(pq2.poll());
		}
//		입력값 내림차순 정렬
//		더한게 크면 answer+=poll()
//		곱한게 크면 temp1=poll(), temp2=poll(), answer+= temp1*temp2;
		while (!pq.isEmpty()) {
			int temp1 = pq.poll();
			int temp2 = 0;
			if (!pq.isEmpty()) {
				if (temp1 + pq.peek() >= temp1 * pq.peek()) {
					answer += temp1;
				} else {
					temp2 = pq.poll();
					answer += temp1 * temp2;
				}
			}
			// 마지막 숫자 하나 남았을 경우
			if (pq.isEmpty() && temp2 == 0) {
				answer += temp1;
			}
		}
		System.out.println(answer);

	}
}
