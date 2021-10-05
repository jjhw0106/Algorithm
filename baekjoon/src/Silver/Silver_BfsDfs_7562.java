package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_BfsDfs_7562 {
	static int board[][];

	static int startR;
	static int startC;
	static int endR;
	static int endC;
	static int side;

	static List<Integer> ans = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//		테스트케이스
		int t = Integer.parseInt(br.readLine());
//		roop
		while (t-- > 0) {
//		한 변의 길이
			side = Integer.parseInt(br.readLine());
			board = new int[side][side];
//		시작
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			startR = Integer.parseInt(st.nextToken());
			startC = Integer.parseInt(st.nextToken());
//		도착
			str = br.readLine();
			st = new StringTokenizer(str, " ");
			endR = Integer.parseInt(st.nextToken());
			endC = Integer.parseInt(st.nextToken());
			bfs(startR, startC);
		}
		for (int i = 0; i < ans.size(); i++) {
			System.out.println(ans.get(i));
		}
	}

	static int[] dr = { 2, 2, -2, -2, 1, 1, -1, -1 };
	static int[] dc = { -1, 1, -1, 1, -2, 2, -2, 2 };

	static void bfs(int r, int c) {
		Queue<int[]> q = new LinkedList<int[]>();
		board[r][c] = 9;
		q.offer(new int[] { r, c });

		int move = 0;

		while (!q.isEmpty()) {
			int repeat = q.size();
			for (int j = 0; j < repeat; j++) {
				int[] now = q.poll();
				if (now[0] == endR && now[1] == endC) {
					ans.add(move);
					break;
				}
				
				for (int i = 0; i < 8; i++) {
					int nr = now[0] + dr[i];
					int nc = now[1] + dc[i];
					if (nr >= 0 && nr < side && nc >= 0 && nc < side) {
						if (board[nr][nc] == 0) {
							q.offer(new int[] { nr, nc });
							board[nr][nc] = 9;
						}
					}
				}
			}
			move++;
		}
	}
}
