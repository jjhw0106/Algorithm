package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Silver_Backtracking_15649 {
	static int n;
	static int m;
	static int[] value;
	static boolean[] visited;
	static int depth;
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);
		value = new int[n];
		visited = new boolean[n];
		cnt = 0;
		for (int i = 0; i < n; i++) {
			value[i] = i + 1;
		}
		dfs(0);
	}

	static public void dfs(int idx) {
		if (cnt >= m) {
//			System.out.print(value[idx] + " ");
			visited = new boolean[n];
			cnt = 0;
			return;
		}
		visited[idx] = true;
		System.out.print(value[idx] + " ");
		for (int i = 0; i < n; i++) {
			if (visited[i] == false) {
				cnt++;
				dfs(i);
				System.out.println();
			}
		}
	}
}
//
//	ArrayList<Integer> num = new ArrayList<>();
//	static int n; // 최대 숫자
//	static int m; // 몇 개?
//
//	static final int MAX = 8 + 1;// arr는 0부터이므로
//	static boolean visited[];
//	static int arr[] = new int[MAX];
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//
//		n = sc.nextInt();
//		m = sc.nextInt();
//		arr = new int[MAX];
//		visited = new boolean[MAX];
//
//		Func(0);
//	}
//
//	static void Func(int cnt) {
//		if (cnt == m) {
//			for (int i = 0; i < m; i++)
//				System.out.print(arr[i] + " ");
//			System.out.println();
//			return;
//		}
//		for (int i = 1; i <= n; i++) {
//			if (!visited[i]) {
//				visited[i] = true;
//				arr[cnt] = i;
//				Func(cnt + 1);
//				visited[i] = false;
//			}
//		}
//	}
//}
