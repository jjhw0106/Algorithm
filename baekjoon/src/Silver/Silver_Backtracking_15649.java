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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]); 	
		int m = Integer.parseInt(str.split(" ")[1]);

		value = new int[n];
		visited = new boolean[n];

		String s = "";
		dfs(s, m);
	}

	public static void dfs(String s, int remain) {
		if(remain==0) {
			System.out.println(s.trim());
			return;
		}
		for(int i=0; i<value.length;i++) {
			if(visited[i]!=true) {
				visited[i]=true;
				dfs(s+(i+1)+" ", remain-1);
				visited[i]=false;
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
