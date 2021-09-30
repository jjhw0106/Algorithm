package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Silver_BfsDfs_1012 {
	static List<Integer> ansList = new ArrayList<Integer>();
	static int[][] map;
	static int ans;
	static int m;
	static int n;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			String str = br.readLine();
			m = Integer.parseInt(str.split(" ")[0]);
			n = Integer.parseInt(str.split(" ")[1]);
			int k = Integer.parseInt(str.split(" ")[2]);

			map = new int[m][n];

			for (int i = 0; i < k; i++) {
				String pos = br.readLine();
				int r = Integer.parseInt(pos.split(" ")[0]);
				int c = Integer.parseInt(pos.split(" ")[1]);
				map[r][c] = 1;
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					if (map[i][j] == 1) {
						dfs(i, j);
						ans++;
					}
				}
			}
			ansList.add(ans);
			ans = 0;
		}
		for (int answer : ansList) {
			System.out.println(answer);
		}
	}

	static int[] dr = { 1, -1, 0, 0 };
	static int[] dc = { 0, 0, 1, -1 };

	static void dfs(int r, int c) {
		map[r][c] = 9;
		for (int i = 0; i < 4; i++) {
			int nr = r + dr[i];
			int nc = c + dc[i];
			if (!(nr < 0 || nr >= m || nc < 0 || nc >= n)) {
				if (map[nr][nc] == 1) {
					dfs(nr, nc);
				}
			}
		}
	}
}
