package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_10872 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		System.out.println(factorial(n));
	}

	static public int factorial(int n) {
		if (n == 0) {
			return 1;
		} else if (n == 1) {
			return n;
		} else {
			return n * factorial(n - 1);
		}
	}
}