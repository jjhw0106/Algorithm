package Bronze;

import java.util.Scanner;

public class Bronze_14936 {
	static int button[];
	static int n, m;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();// 층
		m = sc.nextInt();// 교수도착시간

		int c1 = n;
		int c2 = n / 2;
		int c3 = ((n % 2) == 0) ? (n / 2) : (n / 2 + 1);
//		int c3 = n / 2;
		int c4 = (n - 1) / 3 + 1;

		// 수행 가능한 경우의수 + 각 케이스 당 걸리는 시간 내림차순 정렬
		int order[] = { 0, c1, c2, c3, c4, c1 + c4, c2 + c4, c3 + c4 };

		for (int i = 0; i < order.length; i++) {
			for (int j = i; j < order.length; j++) {
				if (order[i] < order[j]) {
					int temp = order[i];
					order[i] = order[j];
					order[j] = temp;
				}
			}
		}
		// 테스트
		for (int i = 0; i < order.length; i++)
			System.out.print(order[i] + " ");
		System.out.println();
		for (int i = 0; i < order.length; i++) {
			if (n == 1) {
				if (m == 0)
					System.out.println(1);
				else
					System.out.println(2);
				break;
			}
			if (n == 2) {
				if (m == 0)
					System.out.println(1);
				else if (m == 1)
					System.out.println(3);
				else
					System.out.println(4);
				break;
			}

			if (m >= order[i]) {
				System.out.println(8 - i);
				break;
			}
		}
	}

}
