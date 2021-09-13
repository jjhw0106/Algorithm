package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_1110 {
	static int cycle(String start, String num, int answer) {
		String a = num.substring(num.length() - 1);
		String b = String.valueOf(Integer.parseInt(num.substring(0, 1)) + Integer.parseInt(a));
		num = a + b.substring(b.length() - 1);
		answer++;
		if (start.equals(num)) {
			return answer;
		}
		return cycle(start, num, answer);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		String num = br.readLine();
		if (num.length() == 1) {
			num = 0 + num;
		}
		answer = cycle(num, num, answer);
		System.out.println(answer);
	}
}
