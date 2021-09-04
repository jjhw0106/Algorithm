package Bronze;

import java.util.Scanner;
import java.util.Random;

public class Bronze2_14659 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int answer = 0;
		int archer[] = new int[n];
		for (int i = 0; i < n; i++)
			archer[i] = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int kill = 0;
			for (int j = i + 1; j < archer.length; j++) {
				if (archer[j] < archer[i]) {
					kill++;
				}
				if (archer[j] > archer[i])
					break;
			}
			if (kill >= answer)
				answer = kill;
		}
		System.out.println(answer);
	}
}
