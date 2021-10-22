package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_BfsDfs_4963 {
	static int[][] land;
	static int[][] way;
	static int[] visited;
	static int n;
	static int m;

	public static void main(String[] args) throws IOException {
		List<Integer> answer = new ArrayList<Integer>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			int cnt = 0;
			String temp = br.readLine();
			m = Integer.parseInt(temp.split(" ")[0]); // 열
			n = Integer.parseInt(temp.split(" ")[1]); // 행
			land = new int[n][m];
			if (m == 0 && n == 0) {
				break;
			}

			for (int i = 0; i < n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine(), " ");
				for (int j = 0; j < m; j++) {
					land[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < m; j++) {
					if (land[i][j] == 1) {
						bfs(i, j);
						cnt++;
					}
				}
			}
			answer.add(cnt);
		}
		for (Integer integer : answer) {
			System.out.println(integer);
		}
	}

	static int[] dy = { 0, 0, -1, 1, -1, 1, -1, 1 };
	static int[] dx = { -1, 1, 0, 0, 1, -1, -1, 1 };

	static void bfs(int r, int c) {
		land[r][c] = 9;
		Queue<int[]> q = new LinkedList<int[]>();
		q.offer(new int[] { r, c });

		while (!q.isEmpty()) {
			int[] now = q.poll();
			for (int i = 0; i < 8; i++) {
				int ny = now[0] + dy[i];
				int nx = now[1] + dx[i];
				if (ny >= 0 && nx >= 0 && ny < n && nx < m) {
					if (land[ny][nx] == 1) {
						land[ny][nx] = 9;
						q.offer(new int[] { ny, nx });
					}
				}
			}
		}
	}
}
