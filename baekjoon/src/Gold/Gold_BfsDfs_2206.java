package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Gold_BfsDfs_2206 {
	static int n;
	static int m;
	static int[][] map,visited;
	

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);
		int[][] visited = new int[n][m];
		map = new int[n][m];
		for (int i = 0; i < n; i++) {
			String temp[] = br.readLine().split("");
			for (int j = 0; j < m; j++) {
				map[i][j] = Integer.parseInt(temp[j]);
			}
		}
		bfs(0, 0, visited);
		if (arrv == true) {
			System.out.println(depth);
		} else {
			System.out.println(-1);
		}
	}

	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static boolean arrv = false;
	
	static void bfs(int fr, int to, int[][] visited) {
		Queue<Param> q = new LinkedList<Param>();
		int bomb = 1;
		visited[fr][to] = 1;
		q.add(new Param(fr, to, bomb, 1));
		while (!q.isEmpty()) {
			int repeat = q.size();
			while (repeat-- > 0) {
				Param temp = q.poll();
				int[] now = new int[] { temp.fr, temp.to, temp.bomb };
				for (int i = 0; i < 4; i++) {
					int ny = now[0] + dy[i];
					int nx = now[1] + dx[i];
					bomb = now[2];
					if (ny >= 0 && nx >= 0 && ny < n && nx < m) {
						if (map[ny][nx] == 0 && visited[ny][nx] == 0) {
							visited[ny][nx] = 1;
							q.offer(new Param(ny, nx, bomb, visited));
						} else if (map[ny][nx] == 1 && visited[ny][nx] == 0) {
							if (bomb == 1) {
								bomb = 0;
								visited[ny][nx] = 1;
								q.offer(new Param(ny, nx, bomb, visited));
							}
						}
					}
				}
			}
			System.out.println();
			for (int i = 0; i < n; i++) {
				System.out.println();
				for (int j = 0; j < m; j++) {
					System.out.print(visited[i][j]);
				}
			}
			if (visited[n - 1][m - 1] == 1) {
				arrv = true;
				return;
			}
		}
	}

	static class Param {
		public Param(int fr, int to, int bomb, int depth) {
			super();
			this.fr = fr;
			this.to = to;
			this.bomb = bomb;
			this.depth = depth;
		}

		int fr;
		int to;
		int bomb;
		int depth;
	}
}
//		while (!q.isEmpty()) {
//			if (visited[n - 1][m - 1] == 1) {
//				//
//				for (int i = 0; i < n; i++) {
//					System.out.println();
//					for (int j = 0; j < m; j++) {
//						System.out.print(map[i][j]);
//					}
//				}
//				//
//				return;
//			}
//			int repeat = q.size();
//			while (repeat-- > 0) {
//				Object[] now = q.poll();
//				for (int i = 0; i < 4; i++) {
//					int ny = (int) now[0] + dy[i];
//					int nx = (int) now[1] + dx[i];
//					int tBomb = (int) now[2];
//					if (ny >= 0 && nx >= 0 && ny < n && nx < m) {
//						if (map[ny][nx] == 1 && tBomb-- != 0) {
//							map[ny][nx] = 0;
//						}
//						if (map[ny][nx] == 0 && visited[ny][nx] == 0) {
//							visited[ny][nx] = 1;
//							q.add(new Object[] { ny, nx, tBomb,map, visited });
//						}
//					}
//				}
//			}
//			depth++;
//		}
//	}
//
//	static void breakWall() {
//
//	}
//}
