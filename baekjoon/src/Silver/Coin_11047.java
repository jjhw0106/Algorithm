package Silver;

import java.util.Scanner;

public class Coin_11047 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int ai[] = new int[n];
		for (int i = 0; i < n; i++) {
			ai[i] = sc.nextInt();
		}
		int answer = 0;
		for (int i = n - 1; i >= 0; i--) {
			if (k >= ai[i] && k != 0) {
				k -= ai[i];
				answer++;
				i++;
			}
		}
		System.out.println(answer);
	}

}
