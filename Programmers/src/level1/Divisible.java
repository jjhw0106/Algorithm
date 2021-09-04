package level1;

import java.util.ArrayList;
import java.util.Collections;

//array의 각 element 중 divisor로 나누어 떨어지는 값을 오름차순으로 
//정렬한 배열을 반환하는 함수, solution을 작성해주세요.
//divisor로 나누어 떨어지는 element가 하나도 없다면 배열에 -1을 담아 반환하세요.

public class Divisible {
	public static void main(String[] args) {
		int[] arr = { 5, 9, 7, 10 };
		int divisor = 5;
		solution(arr, divisor);
	}

	static public int[] solution(int[] arr, int divisor) {
		int[] answer = new int[1];
		answer[0] = -1;

		ArrayList<Integer> temp = new ArrayList<>();
		for (int i = 0; i < arr.length; i++)
			if (arr[i] % divisor == 0)
				temp.add(arr[i]);

		if (temp.size() == 0)
			return answer;

		Collections.sort(temp);
		answer = new int[temp.size()];
		for (int i = 0; i < temp.size(); i++)
			answer[i] = temp.get(i);

		return answer;
	}
}
