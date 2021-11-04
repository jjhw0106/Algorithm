package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Gold_BfsDfs_10026 {
	static int n;
	static int m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());

		String[][] map = new String[n][n];
		String[][] map2 = new String[n][n];
		int[][] visited = new int[n][n];
		int[][] visited2 = new int[n][n];

		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = temp.split("")[j];
				map2[i][j] = temp.split("")[j];
				if (map2[i][j].equals("G")) {
					map2[i][j] = "R";
				}
			}
		}
		int normal = 0;
		int abnormal = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j] == 0) {
					bfs(i, j, map, visited);
					normal++;
				}
				if (visited2[i][j] == 0) {
					bfs(i, j, map2, visited2);
					abnormal++;
				}

			}
		}
		System.out.println(normal + " " + abnormal);
	}

	static int[] dy = { 0, 0, -1, 1 };
	static int[] dx = { -1, 1, 0, 0 };

	static void bfs(int y, int x, String[][] map, int[][] visited) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] { y, x });
		visited[y][x] = 1;

		while (!q.isEmpty()) {
			int now[] = q.poll();
			for (int i = 0; i < 4; i++) {
				int ny = dy[i] + now[0];
				int nx = dx[i] + now[1];
				if (ny >= 0 && nx >= 0 && ny < n && nx < n) {
					if (map[ny][nx].equals(map[y][x]) && visited[ny][nx] == 0) {
						visited[ny][nx] = 1;
						q.offer(new int[] { ny, nx });
					}
				}
			}

		}
	}
}
