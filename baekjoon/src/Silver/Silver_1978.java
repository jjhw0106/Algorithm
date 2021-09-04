package Silver;

import java.util.Scanner;

public class Silver_1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int num[] = new int[n];
		int cnt = 0;
		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();

		}
		for (int i = 0; i < n; i++) {
			if (sosuCheck(num[i]) == true)
				cnt++;
		}
		System.out.println(cnt);

	}

	static boolean sosuCheck(int num) {
		boolean check = true;
		int sosuCnt = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				sosuCnt++;
			}
		}
		if (sosuCnt > 2||num==1)
			check = false;
		return check;
	}
}
