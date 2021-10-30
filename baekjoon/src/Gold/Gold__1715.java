package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Gold__1715 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		for (int i = 0; i < n; i++) {
			q.offer(Integer.parseInt(br.readLine()));
		}

		int answer = 0;

		while (q.size() != 1) {
			int temp = q.poll() + q.poll();
			answer += temp;

			q.offer(temp);
		}
		System.out.println(answer);
	}
}

//		수정 전 코드
//		if (q.size() == 1) {
//			System.out.println(0);
//			return;
//		}
//		while (!q.isEmpty()) {
//			if (q.size() == 1) {
//				answer += q.poll();
//				break;
//			}
//			int temp = q.poll() + q.poll();
//			answer += temp;
//			if (!q.isEmpty())
//				q.offer(temp);
//		}
