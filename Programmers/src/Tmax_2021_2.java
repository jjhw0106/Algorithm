import java.util.LinkedList;
import java.util.Queue;

public class Tmax_2021_2 {
	static int[][] visited;

	public static void main(String[] args) {
		int[][] blocks = { { 1, 3 }, { 1, 4 }, { 2, 1 }, { 2, 2 }, { 3, 3 }, { 3, 4 }, { 4, 1 }, { 4, 2 } };
		solution(4, blocks);
	}

	static int dy[] = { 2, 2, -2, -2, 1, 1, -1, -1 };
	static int dx[] = { 1, -1, 1, -1, 2, -2, 2, -2 };

	public static void solution(int n, int[][] blocks) {
		visited = new int[n][n];
		for (int i = 0; i < blocks.length; i++) {
			visited[blocks[i][0] - 1][blocks[i][1] - 1] = 1;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j] == 0) {
					bfs(n, i, j);
				}
			}
		}
	}
	static int cnt=0;
	public static void bfs(int n, int y, int x) {
		Queue<int[]> q = new LinkedList<int[]>();
		visited[y][x] = 1;
		q.add(new int[] { y, x });
		while (!q.isEmpty()) {
			int[] now = q.poll();
			for (int i = 0; i < 8; i++) {
				int ny = now[0] + dy[i];
				int nx = now[1] + dx[i];
				if (ny < 0 || nx < 0 || ny > n || nx > n) {
					if (visited[ny][nx] == 0) {
						q.add(new int[] { y, x });
						
					}
				}
			}
		}
	}
}
