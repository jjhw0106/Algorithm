package Silver;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Silver_DP_1463 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int dp[] = new int[n + 1];
		dp[0] = 0;
		dp[1] = 0;
		for (int i = 2; i < n + 1; i++) {
			dp[i] = dp[i - 1] + 1;
			if (n % 2 == 0) {
				dp[i] = Math.min(dp[i / 2] + 1, dp[i] + 1);
			}
			if (n % 3 == 0) {
				dp[i] = Math.min(dp[i / 3] + 1, dp[i] + 1);
			}
		}
		System.out.print(dp[n]);
	}

}
