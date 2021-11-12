package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Silver_BackTracking_14889 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] board = new int[n][n];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
		}
		
		int[][] team = new int[n*n-1/2][2];
		
	}
	static public void teamMake(int[][] board) {
		
	}
}
