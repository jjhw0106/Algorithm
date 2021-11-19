package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Silver_BfsDfs_2667 {
	static int[][] map;
	static int[][] visited;
	static int n;
	static List<Integer> apts;
	static int aptCnt = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visited = new int[n][n];
		apts = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(str.split("")[j]);
			}
		}
		int cnt = 0;
		aptCnt = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (visited[i][j] == 0 && map[i][j] == 1) {
					dfs(i, j);
					cnt++;
					apts.add(aptCnt);
					System.out.println("cnt="+cnt);
					System.out.println(aptCnt);
					aptCnt = 0;
				}
			}
		}
		for (int string : apts) {
			System.out.println(string);
		}

	}

	static int[] dy = { -1, 0, 1, 0 };
	static int[] dx = { 0, -1, 0, 1 };

	static void dfs(int y, int x) {
		visited[y][x] = 1;
		aptCnt++;
		for (int i = 0; i < 4; i++) {
			int ny = y + dy[i];
			int nx = x + dx[i];
			if (ny >= 0 && nx >= 0 && ny < n && nx < n) {
				if (map[ny][nx] == 1 && visited[ny][nx] == 0) {
					visited[ny][nx] = 1;
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
