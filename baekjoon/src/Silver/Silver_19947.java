package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver_19947 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int h = Integer.parseInt(input.split(" ")[0]);
		int y = Integer.parseInt(input.split(" ")[1]);

		int[] dp = new int[y + 1];
		dp[0] = h;
		for (int i = 1; i < y + 1; i++) {
			dp[i] = (int) (dp[i - 1] * 1.05);
			if (i >= 3) {
				dp[i] = Math.max(dp[i], (int) (dp[i - 3] * 1.2));
			}
			if (i >= 5) {
				dp[i] = Math.max(dp[i], (int) (dp[i - 5] * 1.35));
			}
		}
		System.out.println(dp[y]);
	}
}
