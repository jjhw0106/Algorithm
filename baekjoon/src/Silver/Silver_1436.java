package Silver;

import java.util.Scanner;
//1436 영화감독 숌
public class Silver_1436 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int idx = 0; // 인덱스(영화 제목->만번째 영화제목을 받기 위해)
		int nCnt = 0; // 몇번째 영화인지

		while (nCnt != n) {
			idx++;
			if (String.valueOf(idx).contains("666"))
				nCnt++;
		}
		System.out.println(idx);
	}
}
//방법2
//public class Silver_1436 {
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//
//		int num[] = new int[100000];
//
//		int idx = 0; // 인덱스(영화 제목->만번째 영화제목을 받기 위해)
//		int nCnt = 0; // 몇번째 영화인지
//
//		for (int i = 0; i < 3000000; i++) {
//			if (String.valueOf(i).contains("666")) {
//				num[nCnt] = i;
//				nCnt++;
//			}
//		}
//		System.out.println(num[n - 1]);
//	}
//
//}