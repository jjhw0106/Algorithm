package Silver;

import java.util.ArrayList;
import java.util.Scanner;

public class Silver_15649 {
	ArrayList<Integer> num = new ArrayList<>();
	static int n; // 최대 숫자
	static int m; // 몇 개?

	static final int MAX = 8 + 1;// arr는 0부터이므로
	static boolean visited[];
	static int arr[] = new int[MAX];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[MAX];
		visited = new boolean[MAX];

		Func(0);
	}

	static void Func(int cnt) {
		if (cnt == m) {
			for (int i = 0; i < m; i++)
				System.out.print(arr[i] + " ");
			System.out.println();
			return;
		}
		for (int i = 1; i <= n; i++) {
			if (!visited[i]) {
				visited[i] = true;
				arr[cnt] = i;
				Func(cnt + 1);
				visited[i] = false;
			}
		}
	}
}
