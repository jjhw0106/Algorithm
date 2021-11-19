import java.util.HashSet;
import java.util.Set;

public class Tmax_2020_1 {
	
	
	static int[][] part_time = { { 1, 4, 7 },
			{ 5, 10, 10 }/*
							 * , { 6, 7, 2 }, { 3, 5, 8 }, { 10, 20, 9 }, { 11, 70, 50 }, { 1, 70, 60 }
							 */ };
	static boolean visited[] = new boolean[part_time.length];
	static int temp = 0;
	static Set<Integer> set = new HashSet<Integer>();

	
	public static void main(String[] args) {

		solution(part_time[0][0], part_time[0][1], part_time[0][2], part_time[0][2], 0);
		for (Integer integer : set) {
			System.out.println(integer);
		}
	}

	// 완탐(DFS)
	public static void solution(int s, int e, int c, int max, int idx) {
		// 탈출
		if (idx >= part_time.length) {
			set.add(max);
			return;
		}
		
		temp = e;
		for (int i = 0; i < part_time.length; i++) {
			if (visited[i] == false) {
				visited[i] = true;
				if (part_time[i][0] >= temp) {
					max += c;
				}
				solution(part_time[i][0], part_time[i][1], part_time[i][2], max, idx + 1);
				visited[i] = false;
			}
		}
	}
}
