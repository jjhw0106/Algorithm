package level1;

import java.util.Scanner;

public class StringToInt {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println(solution(input));

	}

	static public int solution(String s) {
		int answer = 0;

		if (s.charAt(0) != '-')
			answer = Integer.parseInt(s);
		else {
			StringBuilder sb = new StringBuilder(s);
			s = sb.deleteCharAt(0).toString();
			answer = Integer.parseInt(s) * -1;
		}

		return answer;
	}
}
