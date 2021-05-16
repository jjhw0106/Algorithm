package level2;

import java.util.Stack;

import java.util.Scanner;
//124 나라에는 자연수만 존재합니다.
//124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.

public class NumberWorld124 {
	public static void main(String[] args) {

		Scanner sc = new java.util.Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			solution(n);
		}
	}

	static public String solution(int n) {
		String answer = "";
		String[] str = { "1", "2", "4" };
		Stack<Integer> bowl = new Stack<Integer>();

		to124(n, bowl);
		while (!bowl.isEmpty()) {
			answer += str[bowl.pop() - 1];
		}
		return answer;
	}

	static public int to124(int n, Stack<Integer> bowl) {
		int upPosition;
		int value = 0;
		if (n > 3) {
			upPosition = n / 3;
			value = n % 3;
			if (value == 0) {
				bowl.add(value + 3);
				upPosition -= 1; // 올림인자가 upPosition-1을 안해주면, 1,2,4 이후에
									// 자릿수는 올라가나 1의 자리는 0이 되는 꼴이됨.
			} else {
				bowl.add(value);
			}
			to124(upPosition, bowl);
		} else if (n / 3 == 1) {
			upPosition = n / 3;
			bowl.add(3);
		} else {
			value = n % 3;
			bowl.add(value);
		}

		return value;
	}

}
