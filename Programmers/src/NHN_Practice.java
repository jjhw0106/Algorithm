import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class NHN_Practice {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[][] map = new int[n][n];

		String row = "";
		for (int i = 0; i < n; i++) {
			row = br.readLine();
			for (int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(row.split(" ")[j]);
			}
		}

		solution(map);
	}

	static void solution(int[][] map) {
		int area = 0;
		List<Integer> sizeList = new ArrayList<Integer>();

		for (int i = 0; i < map.length; i++) {
			for (int j = 0; j < map[0].length; j++) {
				if (map[i][j] == 1) {
					area++;
					sizeList.add(bfs(i, j, map));
				}
			}
		}
		System.out.println(area);
		
		Collections.sort(sizeList);
		
		for (int i = 0; i < sizeList.size(); i++)
			System.out.println(sizeList.get(i));
	}

	static int dy[] = { -1, 1, 0, 0 };
	static int dx[] = { 0, 0, -1, 1 };

	static int bfs(int r, int c, int[][] map) {
		Queue<int[]> q = new LinkedList<int[]>();
		map[r][c] = 9;
		int cnt = 0;
		q.offer(new int[] { r, c });

		while (!q.isEmpty()) {
			int[] now = q.poll();
			cnt++;
			for (int i = 0; i < 4; i++) {
				int ny = now[0] + dy[i];
				int nx = now[1] + dx[i];
				if (ny >= 0 && nx >= 0 && ny < map.length && nx < map.length) {
					if (map[ny][nx] == 1) {
						map[ny][nx] = 9;
						q.offer(new int[] { ny, nx });
					}
				}
			}
		}
		return cnt;
	}
}
