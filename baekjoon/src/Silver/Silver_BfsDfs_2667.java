package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Silver_BfsDfs_2667 {
	static int[][] map;
	static boolean[][] visited;
	static int n;
	static ArrayList<Integer> apts;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visited = new boolean[n][n];
		apts = new ArrayList<Integer>();
		cnt = 0;

		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(str.split("")[j]);
			}
		}

		int complex = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (map[i][j] == 1 && visited[i][j] == false) {
					complex++;
					dfs(i, j);
					apts.add(cnt);
					cnt = 0;
				}
			}
		}
		System.out.println(complex);
		apts.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});
		for (Integer integer : apts) {
			System.out.println(integer);
		}

	}

	static int dy[] = { -1, 0, 1, 0 };
	static int dx[] = { 0, -1, 0, 1 };

	public static void dfs(int y, int x) {
		visited[y][x] = true;
		cnt++;
		for (int k = 0; k < 4; k++) {
			int ny = y + dy[k];
			int nx = x + dx[k];
			if (ny >= 0 && nx >= 0 && ny < n && nx < n) {
				if (visited[ny][nx] == false && map[ny][nx] == 1) {
					dfs(ny, nx);
				}
			}
		}

	}
}

//	static int num;
//	static int[][] map;
//	static String[] apts;
//	static int[][] way;
//	static List<Integer> list = new ArrayList<Integer>();
//
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		num = Integer.parseInt(br.readLine());
//		apts = new String[num];
//		map = new int[num][num];
//
//		for (int i = 0; i < num; i++) {
//			apts[i] = br.readLine();
//			for (int j = 0; j < apts.length; j++) {
//				map[i][j] = Integer.parseInt(apts[i].substring(j, j + 1));
//			}
//		}
//
//		// dfs
//		for (int i = 0; i < num; i++) {
//			for (int j = 0; j < num; j++) {
//				if (map[i][j] == 1) {
//					dfs(i, j);
//					list.add(cnt);
//					cnt = 0;
//				}
//			}
//		}
//		// bfs
////		for (int i = 0; i < num; i++) {
////			for (int j = 0; j < num; j++) {
////				if (map[i][j] == 1) {
////					bfs(i, j);
////				}
////			}
////		}
//		System.out.println(list.size());
//		Collections.sort(list);
//		for (int list : list) {
//			System.out.println(list);
//		}
//
//	}
//
//	static int[] dr = { 1, -1, 0, 0 };
//	static int[] dc = { 0, 0, 1, -1 };
//	static int cnt = 0;
//	static int complex = 0;
//
//	static void dfs(int r, int c) {
//		map[r][c] = 9;
//		cnt++;
//		for (int i = 0; i < 4; i++) {
//			int nr = r + dr[i];
//			int nc = c + dc[i];
//			if (nr >= 0 && nr < num && nc >= 0 && nc < num) {
//				if (map[nr][nc] == 1)
//					dfs(nr, nc);
//			}
//		}
//	}
//
//	static void bfs(int r, int c) {
//		Queue<int[]> q = new LinkedList<int[]>();
//		map[r][c] = 9;
//		cnt++;
//		q.add(new int[] { r, c });
//		while (!q.isEmpty()) {
//			int[] now = q.poll();
//			for (int i = 0; i < 4; i++) {
//				int nr = now[0] + dr[i];
//				int nc = now[1] + dc[i];
//				if (nr < 0 || nc < 0 || nr >= num || nc >= num) {
//					continue;
//				}
//				if (map[nr][nc] == 1) {
//					map[nr][nc] = 9;
//					q.add(new int[] { nr, nc });
//					cnt++;
//				}
//			}
//		}
//		list.add(cnt);
//		cnt = 0;
//	}
//}
