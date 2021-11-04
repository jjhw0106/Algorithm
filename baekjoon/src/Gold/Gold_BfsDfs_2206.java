package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Gold_BfsDfs_2206 {
	static int[][] map;
	static int n;
	static int m;
	static int[] way;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);

		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			String row = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(row.substring(j, j + 1));
			}
		}

		bfs(0, 0);

		if (map[n - 1][m - 1] != 9) {
			System.out.println(-1);
			return;
		}
		System.out.println(depth);
	}

	static int[] dy = { 0, 0, -1, 1 };
	static int[] dx = { -1, 1, 0, 0 };
	static int depth = 1;

	static void bfs(int row, int col) {
		Queue<int[]> q = new LinkedList<int[]>();
		map[row][col] = 9;
		int bomb = 1;
		q.add(new int[] { row, col, bomb });

		while (!q.isEmpty()) {
			if (map[n - 1][m - 1] == 9) {
				return;
			}
			int repeat = q.size();

			int[] cur = q.poll();
			while (repeat-- != 0) {
				for (int i = 0; i < 4; i++) {
					int ny = cur[0] + dy[i];
					int nx = cur[1] + dx[i];
					if (ny >= 0 && nx >= 0 && ny < n && nx < m) {
						if (map[ny][nx] == 0) {
							map[ny][nx] = 9;
							q.offer(new int[] { ny, nx, cur[2] });
						} else if (map[ny][nx] == 1 && cur[2] == 1) {
							q.offer(new int[] { ny, nx, cur[2]-1 });
						}
					}
				}
			}
			depth++;
		}
	}
}
