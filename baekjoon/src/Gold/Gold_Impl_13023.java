package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Gold_Impl_13023 {
	static int n;
	static int m;
	static int[][] way;
	static int[] visited;
	static int[] node;
	
	static boolean find = false;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);
		
		node = new int[n];
		for (int i = 0; i < n; i++) {
			node[i] = i;
		}
		
		way = new int[n][n];
		for (int i = 0; i < m; i++) {
			String[] temp = br.readLine().split(" ");
			way[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = 1;
			way[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = 1;
		}
		
		for (int i = 0; i < node.length; i++) {
			visited = new int[n];
			int depth = 0;
			dfs(i, depth);
			if (find == true) {
				System.out.println(1);
				return;
			}
		}
		System.out.println(0);
	}
	
	static void dfs(int fr, int depth) {
		visited[fr] = 9;
		depth++;
		if (depth >= 5) {
			find = true;
			return;
		}
		for (int i = 0; i < way.length; i++) {
			if (way[fr][i] == 1 && visited[i] != 9) {
				dfs(i, depth);
			}
		}
		visited[fr]=0;
	}
}
