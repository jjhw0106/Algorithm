package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class SIlver_DP_1463 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] d = new int[n];

		if (n / 2 == 0 || n / 3 == 0) {

		}
	}

	static List<Integer> list = new ArrayList<Integer>();
	static int cnt = 0;
	static int t1 = 0;
	static int t2 = 0;

	int div(int n) {

		if (n == 1) {
			return cnt;
		}
		if (n % 2 != 0) {
			cnt++;
			div(n / 2);
		}
		if (n % 3 != 0) {
			cnt++;
			div(n / 3);
		}
		if (n % 2 != 0 && n % 3 != 0) {
			cnt++;
			div(n - 1);
		}
	}
}
