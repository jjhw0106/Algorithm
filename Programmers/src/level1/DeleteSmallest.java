package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class DeleteSmallest {
	public static void main(String[] args) {
		int[] arr = { 4 };
		solution(arr);
	}

	static public int[] solution(int[] arr) {
		if (arr.length < 1) {
			int[] answer = { -1 };
			return answer;
		}

		ArrayList<Integer> list = new ArrayList<>();
		int[] answer = new int[list.size()];

		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] <= min)
				min = arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min)
				list.add(arr[i]);
		}

		answer = new int[list.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = list.get(i);
		}
		return answer;
	}
}
