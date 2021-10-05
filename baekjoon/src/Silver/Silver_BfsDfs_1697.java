package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_BfsDfs_1697 {
	static int now;
	static int repeat;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int depth = 0;
		int[] visited = new int[k + 1];
		// 어디가 틀린건지
		Queue<Integer> q = new LinkedList<Integer>();
		q.add(n);
		while (!q.isEmpty()) {
			repeat = q.size();
			for (int i = 0; i < repeat; i++) {
				now = q.poll();
				if (now == k) {
					System.out.println(depth);
					return;
				}
				if (now - 1 >= 0 && now - 1 < k + 1) {
					q.offer(now - 1);
					visited[now - 1] = 1;

					if (now + 1 < k + 1) {
						q.offer(now + 1);
						visited[now + 1] = 1;
					}
					if (now * 2 < k + 1) {
						q.offer(now * 2);
						visited[now * 2] = 1;
					}
				}
				depth++;
			}
		}
	}
}
//		Queue<int[]> q = new LinkedList<int[]>();
//		q.add(new int[] { n });
//		while (!q.isEmpty()) {
//			repeat = q.size();
//			for (int i = 0; i < repeat; i++) {
//				now = q.poll();
//				for (int j = 0; j < now.length; j++) {
//					if (now[j] == k) {
//						System.out.println(depth);
//						return;
//					}
//					if(now[j]-1<=k)
//						q.offer(new int[] { now[j] - 1, now[j] + 1, now[j] * 2 });
//				}
//			}
//			depth++;
//		}
