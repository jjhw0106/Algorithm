package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Silver_1260_BfsDfs {

	static int n;
	static int m;
	static int[][] way;
	static int[] visited;

	public static void main(String[] args) throws IOException {
		// 정 간 탐시
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String attr[] = input.split(" ");

		n = Integer.parseInt(attr[0]) + 1;
		m = Integer.parseInt(attr[1]);
		int v = Integer.parseInt(attr[2]);

		way = new int[n][n];
		visited = new int[n];

		for (int i = 0; i < m; i++) {
			String road = br.readLine();
			int fr = Integer.parseInt(road.split(" ")[0]);
			int to = Integer.parseInt(road.split(" ")[1]);
			way[fr][to] = 1;
			way[to][fr] = 1;
		}
		dfs(v);
		System.out.println();
		visited = new int[n];
		bfs(v);

	}

	static void dfs(int fr) {
		visited[fr] = 1;
		System.out.print(fr + " ");

		for (int to = 0; to < n; to++) {
			if (visited[to] == 0 && way[fr][to] == 1) {
				dfs(to);
			}
		}
	}

	static void bfs(int fr) {
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(fr);
		visited[fr] = 1;
		while (!q.isEmpty()) {
			fr = q.poll();
			System.out.print(fr + " ");
			for (int to = 0; to < n; to++) {
				if (visited[to] == 0 && way[fr][to] != 0) {
					q.offer(to);
					visited[to]=1;
				}
			}
		}
	}
}
//	static int n;// 노드의 개수
//	static int m;// 간선의 개수
//	static int start;// 시작점
//
//	static int way[][];
//	static int visited[];
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		n = sc.nextInt() + 1;// 노드의 개수
//		m = sc.nextInt();// 간선의 개수
//		start = sc.nextInt();// 시작점
//		way = new int[n][n];
//		visited = new int[n];
//
//		for (int i = 0; i < m; i++) {
//			int fr = sc.nextInt();
//			int to = sc.nextInt();
//			way[fr][to] = 1;
//			way[to][fr] = 1;
//		}
//
//		DFS(start);
//		System.out.println();
//		visited = new int[n];
//		BFS(start);
//
//	}
//
//	static void DFS(int fr) {
//		visited[fr] = 1;
//		System.out.print(fr + " ");
//
//		for (int to = 0; to < n; to++) {
//			if (way[fr][to] == 1 && visited[to] == 0) {
//				DFS(to);
//			}
//
//		}
//	}
//
//	static void BFS(int fr) {
//
//		Queue<Integer> q = new LinkedList<Integer>();
//		q.add(fr);
//		visited[fr] = 1;
//		while (!q.isEmpty()) {
//			fr = q.poll();
//			System.out.print(fr + " ");
//			for (int i = 0; i < n; i++) {
//				if (way[fr][i] != 0 && visited[i] == 0) {
//					q.add(i);
//					visited[i] = 1;
//				}
//			}
//		}
//	}
//}
