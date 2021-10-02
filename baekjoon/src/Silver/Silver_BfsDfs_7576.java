package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_BfsDfs_7576 {
	static int[][] map;
	static int n;
	static int m;
	static int zeroCnt = 0;
	static int depth = 0;

	static Queue<int[]> q = new LinkedList<int[]>();
	static int[] now;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		m = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());

//		m = Integer.parseInt(str.split(" ")[0]); // 6
//		n = Integer.parseInt(str.split(" ")[1]); // 4
//
		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			String input = br.readLine();
			st= new StringTokenizer(input," ");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
//				map[i][j] = Integer.parseInt(input.split(" ")[j]);
				if (map[i][j] == 0) {
					zeroCnt++;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (map[i][j] == 1) {
					q.offer(new int[] { i, j });
				}
			}
		}

		bfs();
		if (zeroCnt == 0) {
			System.out.println(depth - 1); // 초깃값이 depth 1로 되기 때문에 -1 해준다
		} else
			System.out.println(-1);
	}

	static int[] dr = { 1, -1, 0, 0 };
	static int[] dc = { 0, 0, 1, -1 };

	static void bfs() {
		while (!q.isEmpty()) {
			int repeat = q.size();
			while (repeat-- > 0) {
				now = q.poll();
				map[now[0]][now[1]] = 9;
				for (int i = 0; i < 4; i++) {
					int nr = now[0] + dr[i];
					int nc = now[1] + dc[i];

					if (nr >= 0 && nr < n && nc >= 0 && nc < m) {
						if (map[nr][nc] == 0) {
							map[nr][nc] = 1;
							zeroCnt--;
							q.offer(new int[] { nr, nc });
						}
					}
				}
			}
			depth++;
		}
	}
}
