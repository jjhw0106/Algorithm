package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;

public class Silver_Queue_1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Scanner sc = new Scanner(System.in);
		// 1. 테스트케이스의 갯수
		int t = sc.nextInt();
		while (t-- > 0) {
			// 2. 문서 갯수 n, 궁금한 문서 m
			int n = sc.nextInt();
			int m = sc.nextInt();

			// 3. 각 문서 중요도
			LinkedList<int[]> q = new LinkedList<>();

			for (int i = 0; i < n; i++) {
				q.offer(new int[] {i, sc.nextInt()});
			}
//			max인지 판단
//			max가 아니면 큐의 맨 뒤로
			int cnt = 0;
			while (!q.isEmpty()) {
				boolean isMax = true;
				int[] target = q.poll();
				for (int i = 0; i < q.size(); i++) {
					if (target[1] < q.get(i)[1]) {
						q.offer(target);
						for (int j = 0; j < i; j++) {
							q.offer(q.poll());
						}
						isMax = false;
						break;
					}
				}
				if (isMax == false) {
					continue;
				}
				cnt++;
				if (target[0] == m) {
					break;
				}
			}
			sb.append(cnt).append('\n');
		}
		System.out.println(sb);
	}

}