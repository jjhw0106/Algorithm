package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_DP_11726 {
	static int[] dp;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 2;
		int result = recur((n - 1));
		System.out.println(result);
	}

	static int recur(int n) {
		if (dp[n] == 0) {
			dp[n] = recur(n - 1) + recur(n - 2);
		}
		return dp[n] % 10007; // 어차피 10007로 나누게 되므로 미리 나눠서 값을 반환한다. (숫자 커지면 오버플로가 발생하기 때문)
	}
}
