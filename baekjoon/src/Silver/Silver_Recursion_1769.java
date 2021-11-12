package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_Recursion_1769 {
	static int cnt;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String n = br.readLine();
		cnt = 0;
		transfer(n);
	}

	static void transfer(String n) {
		if (n.length() < 2) {
			StringBuilder sb = new StringBuilder();
			sb.append(cnt).append("\n").append(Integer.parseInt(n) % 3 != 0 ? "NO" : "YES");
			System.out.println(sb);
			return;
		}
		cnt++;
		long sum = 0;
		String[] num = n.split("");
		for (String string : num) {
			sum += Integer.parseInt(string);
		}
		transfer(String.valueOf(sum));
	}
}
