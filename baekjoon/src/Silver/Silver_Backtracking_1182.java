package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_Backtracking_1182 {
	static int n;
	static int s;
	static int[] nums;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		s = Integer.parseInt(str.split(" ")[1]);

		nums = new int[n];
		visited = new int[n];
		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			nums[i] = Integer.parseInt(temp.split(" ")[i]);
		}
		dfs(1, n);
	}

	public static void dfs(int cnt, int remain) {
		if (remain <= 0) {
			return;
		}
		for (int i = 0; i < n; i++) {
			if (visited[i] == 0) {
				visited[i] = 1;
				dfs(remain - 1);
				visited[i] = 0;
			}
		}
	}
}
