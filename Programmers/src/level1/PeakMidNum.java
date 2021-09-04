package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PeakMidNum {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String param = br.readLine();
		System.out.println(solution(param));

	}

	static public String solution(String s) {

		String answer = "";
		answer = s.substring((s.length() - 1) / 2, s.length() / 2+1);

		return answer;
	}
}
