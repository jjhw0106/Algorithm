package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Silver_1316 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		int answer = 0;

		while (repeat != 0) {
			String str = br.readLine();
			int cnt = 1;
			for (int i = 0; i < str.length() - 1; i++) {
				if (str.charAt(i) != str.charAt(i + 1)) {
					cnt++;
				}
			}
			char toCharAry[] = str.toCharArray();
			Set<Character> uniqueChar = new HashSet<Character>();
			for (Character character : toCharAry) {
				uniqueChar.add(character);
			}
			if (cnt == uniqueChar.size()) {
				answer++;
			}
			repeat--;
		}
		System.out.println(answer);
	}
}
