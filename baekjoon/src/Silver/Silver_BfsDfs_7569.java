package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_BfsDfs_7569 {
	static int col; // 열
	static int row; // 행
	static int height; // 높이

	static int[][][] map;
	static int zeroCnt = 0;

	static Queue<int[]> q = new LinkedList<int[]>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		col = Integer.parseInt(st.nextToken());
		row = Integer.parseInt(st.nextToken());
		height = Integer.parseInt(st.nextToken());

		map = new int[height][row][col];

		for (int i = 0; i < height; i++) {
			for (int j = 0; j < row; j++) {
				String temp = br.readLine();
				st = new StringTokenizer(temp, " ");
				for (int k = 0; k < col; k++) {
					map[i][j][k] = Integer.parseInt(st.nextToken());
					if (map[i][j][k] == 1) {
						q.offer(new int[] { i, j, k });
					} else if (map[i][j][k] == 0) {
						zeroCnt++;
					}
				}
			}
		}
		bfs();
		if (zeroCnt == 0) {
			System.out.println(depth - 1);
		} else {
			System.out.println(-1);
		}
	}

	static int[] dr = { 0, 0, 1, -1, 0, 0 };
	static int[] dc = { 1, -1, 0, 0, 0, 0 };
	static int[] dh = { 0, 0, 0, 0, 1, -1 };
	static int depth = 0;

	static void bfs() {
		while (!q.isEmpty()) {
			int repeat = q.size();
			while (repeat-- > 0) {
				int now[] = q.poll();
				map[now[0]][now[1]][now[2]] = 9;
				for (int i = 0; i < 6; i++) {
					int nr = now[1] + dr[i];
					int nc = now[2] + dc[i];
					int nh = now[0] + dh[i];
					if (nr >= 0 && nc >= 0 && nh >= 0 && nr < row && nc < col && nh < height) {
						if (map[nh][nr][nc] == 0) {
							map[nh][nr][nc] = 1;
							zeroCnt--;
							q.offer(new int[] { nh, nr, nc });
						}
					}
				}
			}
			depth++;
		}
	}
}
