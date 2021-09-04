
package Bronze;

import java.util.Scanner;

public class Bronze_4344 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		float cnt = 0;
		float average = 0;
		float[] answer = new float[c];
		for (int i = 0; i < c; i++) {
			int n = sc.nextInt();
			int score[] = new int[n];
			for (int j = 0; j < n; j++) {
				score[j] = sc.nextInt();
				average += score[j];
			}
			average /= n;
			for (int j = 0; j < n; j++) {
				if (score[j] > average)
					cnt++;
			}
			answer[i] = cnt / n;
			cnt = 0;
			average = 0;
		}
		for (int i = 0; i < c; i++) {
			System.out.printf("%.3f%%", answer[i] * 100);
			System.out.println();
		}
	}
}
