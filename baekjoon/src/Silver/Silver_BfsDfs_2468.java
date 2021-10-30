package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Silver_BfsDfs_2468 {
	static int[][] map;
	static int[][] visited;
	static int n;
	static int m;
	static int cnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		List<Integer> list = new ArrayList<Integer>();

		int max = 0;
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(str.split(" ")[j]);
				if (map[i][j] > max) {
					max = map[i][j];
				}
			}
		}
		int k = 0; // 강수량
		int answer=0;
		while (max-->0) {
			cnt = 0;
			visited = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] > k && visited[i][j] == 0) {
						bfs(i, j, k);
						cnt++;
					}
				}
			}
			if(answer<cnt) {
				answer=cnt;
			}
			k++;
		}
		System.out.println(answer);
	}

	static int[] dy = { 0, 0, -1, 1 };
	static int[] dx = { -1, 1, 0, 0 };

	static void bfs(int y, int x, int k) {
		Queue<int[]> q = new LinkedList<int[]>();
		visited[y][x] = 1;
		q.offer(new int[] { y, x });
		while (!q.isEmpty()) {
			int repeat = q.size();
			while (repeat-- != 0) {
				int now[] = q.poll();
				for (int i = 0; i < 4; i++) {
					int ny = now[0] + dy[i];
					int nx = now[1] + dx[i];
					if (ny >= 0 && nx >= 0 && ny < n && nx < n) {
						if (map[ny][nx] > k && visited[ny][nx] == 0) {
							visited[ny][nx] = 1;
							q.add(new int[] { ny, nx });
						}
					}
				}
			}
		}
	}
}
