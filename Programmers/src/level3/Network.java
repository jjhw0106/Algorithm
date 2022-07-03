package level3;

import java.util.LinkedList;
import java.util.Queue;

public class Network {

	public int solution(int n, int[][] computers) {
		boolean[] visited = new boolean[n];

		int answer = 0;
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				answer++;
			}
			dfs(computers, visited, i);
		}
		System.out.println(answer);
		return answer;
	}


	public void dfs(int[][] computers, boolean[] visited, int fr) {
		visited[fr] = true;

		for (int to = fr; to < computers.length; to++) {
			if (computers[fr][to] == 1 && !visited[to]) {
				dfs(computers, visited, to);
			}
		}
	}

	static int[] dr = { 1, -1, 0, 0 };
	static int[] dc = { 0, 0, 1, -1 };
	static int depth = 0;
	public boolean bfs(int[][] computers, int n, int fr, int to) {
		Queue<int[]> q = new LinkedList<>();
		boolean check = false;
		computers[fr][to] = 9;
		q.offer(new int[] { fr, to });

		while (!q.isEmpty()) {
			for (int k = 0; k < q.size(); k++) {
				int[] now = q.poll();
				for (int i = 0; i < 4; i++) {
					int nr = now[0] + dr[i];
					int nc = now[1] + dc[i];
					if (nr >= 0 && nc >= 0 && nr < n && nc < n) {
						if (computers[nr][nc] == 1) {
							computers[nr][nc] = 9;
							q.offer(new int[] { nr, nc });
							check = true;
						}
					}
				}
			}
		}
		return check;
	}
}
