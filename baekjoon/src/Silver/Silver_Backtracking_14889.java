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
		pickCase(s, n);
//		teamScore(list);
	}

	public static void pickCase(String s, int remain) {
		if (remain == 0) {
			list.add(s);
			System.out.println(s);
			return;
		}
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				pickCase(s + i + " ", remain - 1);
				visited[i] = false;
			}
		}
	}

}
