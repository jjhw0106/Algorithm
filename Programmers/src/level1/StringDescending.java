package level1;

import java.util.Arrays;

public class StringDescending {
	public static void main(String[] args) {
		String str = "Zbdcefg";
		System.out.println(solution(str));
	}

	static public String solution(String s) {
		String answer = "";
		char idx = s.charAt(0);

		char[] temp = new char[s.length()];
		for (int i = 0; i < s.length(); i++)
			temp[i] = s.charAt(i);
		Arrays.sort(temp);
		for (int i = temp.length - 1; i >= 0; i--)
			answer += temp[i];
		return answer;
	}
}
