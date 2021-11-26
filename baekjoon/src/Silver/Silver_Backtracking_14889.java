package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Silver_Backtracking_14889 {
	static int n;
	static int board[][];
	static boolean visited[];
	static List<String> list;
	static HashSet<int[]> set;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(br.readLine());
		board = new int[n][n];
		visited = new boolean[n];
		list = new ArrayList<String>();
		set = new HashSet<int[]>();
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
		}
		String s = "";
		pickCase(s, n / 2);
		System.out.println(min);
//		teamScore(list);
	}

	static int idx = 0;
	static int min;

	public static void pickCase(String s, int remain) {
		if (remain == 0) {
			System.out.println(s);
			int[] t1 = new int[n / 2];
			int[] t2 = new int[n / 2];
			int score1 = 0;
			int score2 = 0;
			min = 100;
			for (int i = 0; i < n / 2; i++) {
				t1[i] = Integer.parseInt(s.split("")[i]);
				t2[i] = n - 1 - i;
			}
			for (int i = 0; i < n / 2; i++) {
				for (int j = 0; j < n / 2; j++) {
					score1 += board[t1[i]][t1[j]];
					score2 += board[t2[i]][t2[j]];
					System.out.println(score1 + "," + score2);
					if (Math.abs(score2 - score1) < min) {
						min = Math.abs(score2 - score1);
					}
				}
			}
			return;
		}
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				pickCase(s + i, remain - 1);
				visited[i] = false;
			}
		}
	}
}
