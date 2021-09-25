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
	static int num;
	static int[][] map;
	static String[] apts;
	static int[][] way;
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		num = Integer.parseInt(br.readLine());
		apts = new String[num];
		map = new int[num][num];

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				apts[i] = br.readLine();
				map[i][j] = Integer.parseInt(apts[i].substring(j, j + 1));
			}
		}

		for (int i = 0; i < num; i++) {
			for (int j = 0; j < num; j++) {
				if (map[i][j] == 1) {
					map[i][j] = 9;
					bfs(i, j);
				}
			}
		}
		System.out.println(list.size());
		Collections.sort(list);
		
	}

	static int[] dr = { 1, -1, 0, 0 };
	static int[] dc = { 0, 0, 1, -1 };

	static void bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<int[]>();
		int cnt = 1;
		q.add(new int[] { r, c });
		while (!q.isEmpty()) {
			r = q.peek()[0];
			c = q.poll()[1];
			for (int i = 0; i < 4; i++) {
				int nr = r + dr[i];
				int nc = r + dc[i];

				if (nr >= 0 && nr < num && nc >= 0 && nc < num && map[nr][nc] == 1) {
					map[nr][nc] = 9;
					q.add(new int[] { nr, nc });
					cnt++;
				}
			}
		}
		list.add(cnt);
	}
}
