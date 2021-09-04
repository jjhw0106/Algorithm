package Silver;

import java.util.Scanner;

public class Silver_2581 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int num[] = new int[n - m + 1];
		int sum = 0;
		int min;
		for (int i = 0; i < n - m + 1; i++) {
			num[i] = m + i;
		}
		min = 10000;
		int cnt = 0;
		for (int i = 0; i < num.length; i++) {
			if (sosuCheck(num[i]) == true) {
				cnt++;
				sum += num[i];
				if (num[i] < min)
					min = num[i];
			}
		}
		if (cnt == 0) {
			System.out.println(-1);
		} else {
			System.out.println(sum);
			System.out.println(min);
		}
	}

	static boolean sosuCheck(int num) {
		boolean check = true;
		int sosuCnt = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sosuCnt++;
			}
		}
		if (sosuCnt > 2 || num == 1)
			check = false;
		return check;
	}
}
