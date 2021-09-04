package Silver;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Silver_1260_BfsDfs {
	static int n;// 노드의 개수
	static int m;// 간선의 개수
	static int start;// 시작점

	static int way[][];
	static int visited[];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt() + 1;// 노드의 개수
		m = sc.nextInt();// 간선의 개수
		start = sc.nextInt();// 시작점
		way = new int[n][n];
		visited = new int[n];

		for (int i = 0; i < m; i++) {
			int fr = sc.nextInt();
			int to = sc.nextInt();
			way[fr][to] = 1;
			way[to][fr] = 1;
		}

		DFS(start);
		System.out.println();
		visited = new int[n];
		BFS(start);

	}

	static void DFS(int fr) {
		visited[fr] = 1;
		System.out.print(fr + " ");

		for (int to = 0; to < n; to++) {
			if (way[fr][to] == 1 && visited[to] == 0) {
				DFS(to);
			}

		}
	}

	static void BFS(int fr) {

		Queue<Integer> q = new LinkedList<Integer>();
		q.add(fr);
		visited[fr] = 1;
		while (!q.isEmpty()) {
			fr = q.poll();
			System.out.print(fr + " ");
			for (int i = 0; i < n; i++) {
				if (way[fr][i] != 0 && visited[i] == 0) {
					q.add(i);
					visited[i] = 1;
				}
			}
		}
	}
}

//public class Silver_1260 {
//	public static void main(String[] args) {
//		Solution sol = new Solution();
//		sol.run();
//	}
//
//}
//class Solution {
//	Scanner sc = new Scanner(System.in);
//	int n = sc.nextInt() + 1;// 노드의 개수
//	int m = sc.nextInt();// 간선의 개수
//	int start = sc.nextInt();// 시작점
//	
//	int way[][] = new int[n][n];
//	int visited[] = new int[n];
//	
//	void run() {
//		for (int i = 0; i < m; i++) {
//			int fr = sc.nextInt();
//			int to = sc.nextInt();
//			way[fr][to] = 1;
//			way[to][fr] = 1;
//		}
//		DFS(start);
//		System.out.println();
//		visited = new int[n];
//		BFS(start);
//		
//	}
//	
//	void DFS(int fr) {
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
//	void BFS(int fr) {
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
//
//public class Silver_1260 {
//	public static void main(String[] args) {
//		Solution sol = new Solution();
//		sol.run();
//	}
//	
//}
