package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Gold_BfsDfs_5427 {
	static String[][] map;
	static int n;

	static Queue<int[]> meQ;
	static Queue<int[]> fireQ;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		List<Integer> answer = new ArrayList<Integer>();
		for (int k = 0; k < n; k++) {
			String str = br.readLine();
			int w = Integer.parseInt(str.split(" ")[0]);
			int h = Integer.parseInt(str.split(" ")[1]);
			map = new String[h][w];
			meQ = new LinkedList<int[]>();
			fireQ = new LinkedList<int[]>();
			for (int i = 0; i < h; i++) {
				map[i] = br.readLine().split("");
				for (int j = 0; j < w; j++) {
					if (map[i][j].equals("@")) {
						meQ.add(new int[] { i, j, 0 });
					} else if (map[i][j].equals("*")) {
						fireQ.add(new int[] { i, j });
					}
				}
			}
			bfs(/* meQ, fireQ */);
			answer.add(depth);
			meQ.clear();
			fireQ.clear();
			map=null;
		}
		for (Integer integer : answer) {
			if (integer == -1) {
				System.out.println("IMPOSSIBLE");
			} else {
				System.out.println(integer);
			}
		}
	}

	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int depth;

	static void bfs(/* Queue<int[]> meQ, Queue<int[]> fireQ */) {
		depth = -1;
		while (!meQ.isEmpty()) {
			int fireRepeat = fireQ.size();
			while (fireRepeat-- > 0) {
				int[] fNow = fireQ.poll();
				for (int i = 0; i < 4; i++) {
					int ny = fNow[0] + dy[i];
					int nx = fNow[1] + dx[i];
					if (ny >= 0 && nx >= 0 && ny < map.length && nx < map[0].length) {
						if (!(map[ny][nx]).equals("#")) {
							map[ny][nx] = "*";
							fireQ.offer(new int[] { ny, nx });
						}
					}
				}
			}
			int repeat = meQ.size();
			while (repeat-- > 0) {
				int[] now = meQ.poll();
				if (now[0] <= 0 || now[1] <= 0 || now[0] >= map.length - 1 || now[1] >= map[0].length - 1) {
					depth = now[2] + 1;
					return;
				}
				for (int i = 0; i < 4; i++) {
					int ny = now[0] + dy[i];
					int nx = now[1] + dx[i];
					if (ny >= 0 && nx >= 0 && ny < map.length && nx < map[0].length) {
						if (map[ny][nx].equals(".")) {
							map[ny][nx] = "@";
							meQ.offer(new int[] { ny, nx, now[2] + 1 });
						}
					}
				}
			}
//			System.out.println();
//			for (int i = 0; i < map.length; i++) {
//				System.out.println();
//				for (int j = 0; j < map[0].length; j++) {
//					System.out.print(map[i][j]);
//				}
//			}
		}
	}
}
