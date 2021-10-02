package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Silver_BfsDfs_2178 {
	static int map[][];
	static int n;
	static int m;
	List<Integer> ansList = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);

		map = new int[n][m];

		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(line.substring(j, j + 1));
			}
		}
		bfs(0, 0);
	}

	static int[] dr = { 0, 0, -1, 1 };
	static int[] dc = { -1, 1, 0, 0 };

	static int cnt = 0;

	static void bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<int[]>();
		map[r][c] = 9;
		q.offer(new int[] { r, c });
		int depth = 1;
		while (!q.isEmpty()) {
			if (map[n - 1][m - 1] == 9) {
				break;
			}

			int repeat = q.size();
			for (int k = 0; k < repeat; k++) {
				int now[] = q.poll();
				for (int i = 0; i < 4; i++) {
					int nr = now[0] + dr[i];
					int nc = now[1] + dc[i];

					if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
						if (map[nr][nc] == 1) {
							map[nr][nc] = 9;
							q.offer(new int[] { nr, nc });
						}
					}
				}
			}
			depth++;
		}
		System.out.println(depth);
	}
}
