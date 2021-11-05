package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Gold_BfsDfs_5427 {
	static String[][] map;
	static int[][] visited;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		for (int k = 0; k < n; k++) {
			String str = br.readLine();
			int w = Integer.parseInt(str.split(" ")[0]);
			int h = Integer.parseInt(str.split(" ")[1]);
			map = new String[h][w];
			for (int i = 0; i < h; i++) {
				map[i] = br.readLine().split("");
				System.out.println();
				for (int j = 0; j < w; j++) {
					System.out.print(map[i][j]);
				}
			}
		}
	}

	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int depth;

	static void bfs(int[] me, List<int[]> fire) {
		depth = -1;
		Queue<int[]> meQ = new LinkedList<int[]>();
		Queue<int[]> fireQ = new LinkedList<int[]>();
		meQ.offer(new int[] { me[0], me[1], 0 });
		for (int[] f : fire) {
			fireQ.offer(f);
		}
		while (!meQ.isEmpty()) {
			int fireRepeat = fireQ.size();
			while (fireRepeat-- > 0) {
				int[] fNow = fireQ.poll();
				for (int i = 0; i < 4; i++) {
					int ny = fNow[0] + dy[i];
					int nx = fNow[1] + dx[i];
					if (ny >= 0 && nx >= 0 && ny < n && nx < n) {
						if (!("#").equals(map[ny][nx])) {
							map[ny][nx] = "*";
							fireQ.offer(new int[] { ny, nx });
						}
					}
				}
			}
			int[] now = meQ.poll();
			if (now[0] < 0 || now[1] < 0 || now[0] >= n || now[1] >= n) {
				depth = now[2];
				return;
			}
			for (int i = 0; i < 4; i++) {
				int ny = now[0] + dy[i];
				int nx = now[1] + dx[i];
				if (ny >= 0 && nx >= 0 && ny < n && nx < n) {
					if (".".equals(map[ny][nx])) {
						map[ny][nx] = "@";
						meQ.offer(new int[] { ny, nx, now[2] + 1 });
					}
				}
			}
		}
	}
}
