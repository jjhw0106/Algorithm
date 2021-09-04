package Bronze;

import java.util.Scanner;

public class Bronze_10872 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();

		System.out.println(factorial(n));
	}

	static long factorial(long n) {
		if (n == 0)
			return 1;
		else if (n == 1)
			return n;
		else {
			return n * factorial(n - 1);
		}
	}
}