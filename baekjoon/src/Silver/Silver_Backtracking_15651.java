package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_Backtracking_15651 {
	static int n;
	static int m;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);
		sb = new StringBuilder();
		bt(0, "", m);
		System.out.println(sb);
	}

	public static void bt(int cur, String s, int remain) {
		if (remain == 0) {
			sb.append(s).append("\n");
			return;
		}
		for (int i = 0; i < n; i++) {
			bt(i, s + (i + 1) + " ", remain - 1);
		}
	}
}
