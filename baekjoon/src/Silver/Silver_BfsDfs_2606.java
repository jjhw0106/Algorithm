package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_BfsDfs_2606 {
	static int cpuNum;
	static int wayNum;

	static int[] visited;
	static int[][] way;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		cpuNum = Integer.parseInt(br.readLine()) + 1;
		wayNum = Integer.parseInt(br.readLine());

		visited = new int[cpuNum];
		way = new int[cpuNum][cpuNum];

		for (int i = 0; i < wayNum; i++) {
			String str = br.readLine();
			int fr = Integer.parseInt(str.split(" ")[0]);
			int to = Integer.parseInt(str.split(" ")[1]);

			way[fr][to] = 1;
			way[to][fr] = 1;
		}
		dfs(1);
		int cnt = 0;
		for (int defected : visited) {
			if (defected == 1) {
				cnt++;
			}
		}
		System.out.println(cnt-1); // 1번 노드 빼야함으로
	}

	static void dfs(int fr) {
		visited[fr] = 1;
		for (int to = 0; to < cpuNum; to++) {
			if (visited[to] == 0 && way[fr][to] == 1) {
				dfs(to);
			}
		}
	}
}
