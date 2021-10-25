package Silver;

import java.util.Arrays;
import java.util.Scanner;

public class Rope_2217 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] rope = new int[n];
		for (int i = 0; i < n; i++) {
			rope[i] = sc.nextInt();
		}
		Arrays.sort(rope);
		int max = rope[0] * n;
		for (int i = 0; i < n; i++) {
			if (max < rope[i] * (n - i))
				max = rope[i] *  (n - i);
		}
		System.out.println(max);
	}
}
