package level1;

import java.util.Scanner;

public class Collatz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(solution(n));
	}

	static public int solution(int num) {
		int cnt = 0;

		while (true) {
			if (num == 1)
				return cnt;
			if (cnt > 500)
				return -1;

			if (num % 2 == 0)
				num /= 2;
			else {
				num *= 3;
				num += 1;
			}
			cnt++;
		}
	}
}
