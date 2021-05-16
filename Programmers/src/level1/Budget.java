package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class Budget {
	public static void main(String[] args) {
		int[] d = { 1, 2, 3, 4, 5 };
		int budget = 10;
		System.out.println(solution(d, budget));
	}

	static public int solution(int[] d, int budget) {
		int answer = 0;
		Arrays.sort(d);
		int idx = 0;

		for (int i = 0; i < d.length; i++) {
			budget -= d[i];
			if (budget < 0) {
				break;
			} else if (budget >= 0)
				answer++;
		}

		return answer;
	}

//	{
//		ArrayList<Integer> list = new ArrayList<>();
//		Arrays.sort(d);
//		int sum = 0;
//		int answer = 0;
//		for (int i = 0; i < d.length; i++) {
//			list.add(d[i]);
//			if (sum + list.get(i) <= budget) {
//				sum += list.get(i);
//				answer++;
//			} else
//				return answer;
//		}
//		return answer;
//	}
}
