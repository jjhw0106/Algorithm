package Silver;

import java.util.Scanner;

public class ATM_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int pi[] = new int[n];
		for (int i = 0; i < n; i++) {
			pi[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < pi.length; j++) {
				if (pi[i] < pi[j]) {
					int temp = pi[i];
					pi[i] = pi[j];
					pi[j] = temp;
				}
			}
		}
		int answer = 0;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < i + 1; j++) {
				answer += pi[j];
			}
		}
		System.out.println(answer);
	}
}
