package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Silver_BfsDfs_11724 {
	static int n;
	static int m;
	static int[][] way;
	static int[] node;
	static int[] visited;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		int n = Integer.parseInt(str.split(" ")[0])+1;
		int m = Integer.parseInt(str.split(" ")[1]);
		node = new int[n];
		visited = new int[n];
		way = new int[n][n];
		for (int i = 0; i < n; i++) {
			node[i] = i + 1;
		}
		for (int i = 0; i < m; i++) {
			String temp = br.readLine();
			int fr = Integer.parseInt(temp.split(" ")[0]);
			int to = Integer.parseInt(temp.split(" ")[1]);
			way[fr][to] = 1;
			way[to][fr] = 1;
		}
		cnt = 0;
		for (int i = 1; i < n; i++) {
			if (visited[i] == 0) {
				dfs(i);
				cnt++;
			}
		}
		System.out.println(cnt);
	}

	static void dfs(int fr) {
		visited[fr] = 9;
		for (int to = 0; to < node.length; to++) {
			if (way[fr][to] == 1 && visited[to] == 0) {
				visited[to] = 9;
				dfs(to);
			}
		}
	}
}
