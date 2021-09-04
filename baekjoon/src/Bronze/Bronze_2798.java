package Bronze;

import java.util.Scanner;

//브루트포스 알고리즘(=완전탐색 알고리즘)
public class Bronze_2798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();// 카드개수
		int m = sc.nextInt();// 리미트
		int card[] = new int[n];
		int idx1;
		int idx2;
		int idx3;
		int size = 0;

		for (int i = 0; i < n; i++) {
			card[i] = sc.nextInt();
		}

		for (idx1 = 0; idx1 < n - 2; idx1++) {
			for (idx2 = idx1 + 1; idx2 < n - 1; idx2++) {
				for (idx3 = idx2 + 1; idx3 < n; idx3++) {
					size++;
				}
			}
		}
		int sum[] = new int[size];
		int idx = 0;
		for (idx1 = 0; idx1 < n - 2; idx1++) {
			for (idx2 = idx1 + 1; idx2 < n - 1; idx2++) {
				for (idx3 = idx2 + 1; idx3 < n; idx3++) {
					sum[idx] = card[idx1] + card[idx2] + card[idx3];
					idx++;
				}
			}
		}

		int max = 0;
		for (int i = 0; i < size; i++) {
			if (max < sum[i] && sum[i] <= m) {
				max = sum[i];
			}
		}
		System.out.println(max);

	}
}
