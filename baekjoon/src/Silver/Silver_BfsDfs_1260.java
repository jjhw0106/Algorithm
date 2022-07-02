package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Silver_BfsDfs_1260 {
	static int n;
	static int m;
	static int v;
	static int cnt;
	static int[][] ways;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		n = Integer.parseInt(input.split(" ")[0]);
		m = Integer.parseInt(input.split(" ")[1]);
		visited = new int[n + 1];
		ways = new int[n + 1][n + 1];
		v = Integer.parseInt(input.split(" ")[2]);

		int fr;
		int to;

		for (int i = 0; i < m; i++) {
			String temp = br.readLine();
			fr = Integer.parseInt(temp.split(" ")[0]);
			to = Integer.parseInt(temp.split(" ")[1]);
			ways[fr][to] = 1;
			ways[to][fr] = 1;
		}
		dfs(v);
		visited = new int[n+1];
		System.out.println();
		bfs(v);
	}

	static void dfs(int fr) {
		visited[fr] = 1;
		System.out.print(fr + " ");
		for (int to = 0; to < n + 1; to++) {
			if (visited[to] == 0 && ways[fr][to] == 1) {
				dfs(to);
			}
		}
	}

	static void bfs(int fr) {
		Queue<Integer> q = new LinkedList<>();
		visited[fr] = 1;
		q.add(fr);

		while (!q.isEmpty()) {
			fr = q.poll();
			System.out.print(fr+" ");
			for (int to = 0; to < n+1; to++) {
				if (ways[fr][to] == 1 && visited[to] == 0) {
					visited[to]=1;
					q.add(to);
				}
			}
		}
	}
}

//
//package Silver;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.LinkedList;
//import java.util.Queue;
//
//public class Silver_BfsDfs_1260 {
//
//	static int n;
//	static int m;
//	static int[][] way;
//	static int[] visited;
//
//	public static void main(String[] args) throws IOException {
//		// 정 간 탐시
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String input = br.readLine();
//		String attr[] = input.split(" ");
//
//		n = Integer.parseInt(attr[0]) + 1;
//		m = Integer.parseInt(attr[1]);
//		int v = Integer.parseInt(attr[2]);
//
//		way = new int[n][n];
//		visited = new int[n];
//
//		for (int i = 0; i < m; i++) {
//			String road = br.readLine();
//			int fr = Integer.parseInt(road.split(" ")[0]);
//			int to = Integer.parseInt(road.split(" ")[1]);
//			way[fr][to] = 1;
//			way[to][fr] = 1;
//		}
//		dfs(v);
//		System.out.println();
//		visited = new int[n];
//		bfs(v);
//
//	}
//
//	static void dfs(int fr) {
//		visited[fr] = 1;
//		System.out.print(fr + " ");
//
//		for (int to = 0; to < n; to++) {
//			if (visited[to] == 0 && way[fr][to] == 1) {
//				dfs(to);
//			}
//		}
//	}
//
//	static void bfs(int fr) {
//		Queue<Integer> q = new LinkedList<Integer>();
//		q.offer(fr);
//		visited[fr] = 1;
//		while (!q.isEmpty()) {
//			fr = q.poll();
//			System.out.print(fr + " ");
//			for (int to = 0; to < n; to++) {
//				if (visited[to] == 0 && way[fr][to] != 0) {
//					q.offer(to);
//					visited[to]=1;
//				}
//			}
//		}
//	}
//}
//
//
//
