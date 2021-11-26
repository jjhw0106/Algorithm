package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_Backtracking_15650 {
	static boolean[] visited;
	static int n;
	static int m;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);
		visited = new boolean[n];
		dfs(0, "", m);
	}

	static public void dfs(int idx, String s, int remain) { // remain = 반복횟수
		if (remain == 0) {
			System.out.println(s);
			return;
		}

		for (int i = idx; i < n; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				dfs(i+1 , s + (i + 1) + " ", remain - 1);
				visited[i] = false;
			}

		}
	}
}
