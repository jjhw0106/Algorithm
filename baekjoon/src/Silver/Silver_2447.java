package Silver;

import java.util.Scanner;

import java.io.BufferedReader;

public class Silver_2447 {

	static char[] a;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		a = new char[n];
		star(n);

	}

	static void star(int n) {
		if (n == 3) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (i == n / 3 && j == n / 3) {
						for (int k = 0; k < n / 3; k++) {
							for (int k2 = 0; k2 < n / 3; k2++) {
								System.out.print(" ");
							}
						}
						continue;
					}
					System.out.print("*");
					if (j == n - 1)
						System.out.println();
				}
			}
//			return;
		}
		if (n >= 9)
			star(n / 3);
	}
}