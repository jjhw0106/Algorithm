package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Gold_BfsDfs_13460 {
	static String[][] board;
	static String[][] visited;
	static int n;
	static int m;
	static int[] goal;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);

		board = new String[n][m];
		visited = new String[n][m];
		Ball red = new Ball();
		Ball blue = new Ball();

		for (int i = 0; i < n; i++) {
			str = br.readLine();
			for (int j = 0; j < m; j++) {
				board[i][j] = str.split("")[j];
				if (board[i][j].equals("R")) {
					red.y = i;
					red.x = j;
				} else if (board[i][j].equals("B")) {
					blue.y = i;
					blue.x = j;
				} else if (board[i][j].equals("O")) {
					goal = new int[] { i, j };
				}
			}
		}
		bfs(red, blue);
//		for(int i=0; i< n ;i++) {
//			System.out.println();
//			for(int j=0; j<m; j++) {
//				System.out.print(board[i][j]);
//			}
//		}
	}

	static class Ball {

		public Ball(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}

		int y;
		int x;
	}

	static int[] dy = { -1, 1, 0, 0 };
	static int[] dx = { 0, 0, -1, 1 };
	static int depth = 0;

	static void bfs(Ball red, Ball blue) {
		Queue<Ball> q = new LinkedList<Ball>();
		Queue<Ball> q2 = new LinkedList<Ball>();
		q.add(red);
		q2.add(blue);
		while (!q.isEmpty()) {
			
			Ball r = q.poll();
			Ball b = q2.poll();
			for (int i = 0; i < 4; i++) {
				int nry = r.y + dy[i];
				int nrx = r.x + dx[i];
				int nby = b.y + dy[i];
				int nbx = b.x + dx[i];
				if (board[nry][nrx].equals(".")) {
					q.offer(new Ball(nry, nrx));
				}
				if (board[nby][nbx].equals(".")) {
					q2.offer(new Ball(nby, nbx));
				}
			}
		}
	}
}
