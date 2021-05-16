package level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class Kakao_missRate {
	public static void main(String[] args) {
		int n = 5;
		int[] stages = { 2, 1, 2, 6, 2, 4, 3, 3 };
		solution(n, stages);
	}

	static public int[] solution(int n, int[] stages) {
		HashMap<Integer, Float> map = new HashMap<Integer, Float>();

		int[] answer = {};

		int clearUser[] = new int[n + 1];
		for (int i : stages) {
			for (int j = 0; j < i - 1; j++) {
				clearUser[j]++;
			}
		}

		int challenging[] = new int[n];
		for (int i : stages) {
			if (i <= n)
				challenging[i - 1]++;
		}

		float missRate[] = new float[n];
		int idx[] = new int[n];
		ArrayList<Float> list = new ArrayList<Float>();
		for (int i = 0; i < n; i++) {
			missRate[i] = (float) challenging[i] / (challenging[i] + clearUser[i]);
//			list.add(missRate[i]);
//			System.out.println(list.get(i));
		}
		float compare[] = missRate;
		Arrays.sort(compare);
		for (int i = 0; i < compare.length; i++) {
			for (int j = 0; j < missRate.length; j++)
				if (missRate[j] == compare[i]) {
				}
		}

		return answer;
	}

}
