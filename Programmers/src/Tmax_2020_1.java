import java.util.HashSet;
import java.util.Set;

public class Tmax_2020_1 {

	static int[][] part_time = { { 1, 4, 7 },
			{ 5, 10, 10 }/*
							 * , { 6, 7, 2 }, { 3, 5, 8 }, { 10, 20, 9 }, { 11, 70, 50 }, { 1, 70, 60 }
							 */ };
	static boolean visited[] = new boolean[part_time.length];
	static int temp = 0;

	public static void main(String[] args) {
		solution();
	}

	// 완탐(DFS)
	public static void solution() {
		int s = part_time[0][0];
		int e = part_time[0][1];
		int c = part_time[0][2];
		int remain = part_time.length;
		dfs(s, e, c, remain, 0);

	}

	public static void dfs(int s, int e, int c, int remain, int income) {
		if (remain <= 0) {
			System.out.println(income);
			return;
		}

		for (int i = 0; i < part_time.length; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				if (part_time[i][0] >= e) {
					income += c;
				}
				dfs(part_time[i+1][0], part_time[i+1][1], part_time[i+1][2], remain - 1, income);
				visited[i] = false;
			}
		}
	}
}
