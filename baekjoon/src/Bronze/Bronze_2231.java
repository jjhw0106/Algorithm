package Bronze;

import java.util.Scanner;

//분해합: 어떤 자연수가 있을 때 (256=245+2+4+5)256-> 분해합, 245-> 생성자)
public class Bronze_2231 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();// 분해합
		String a = String.valueOf(n);
		int size = a.length();

		for (int i = 0; i <= n; i++) {
			if (i + lineSum(i) == n) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(0);

	}

	
	static int lineSum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += n % 10;	//**** 자리수 추출 기법
			n /= 10;
		}
		return sum;
	}
}
//		for (int m = 0; m < size; m++) {
//			for (int i = 0; i < 10; i++) {
//				b[m] = i;
//
//			}
//		}
//
//		for (int i = 0; i < 10; i++) {
//			for (int j = 0; j < 10; j++) {
//				for (int k = 0; k < 10; k++) {
//					int num1 = Integer.parseInt(String.valueOf(i));
//					int num2 = Integer.parseInt(String.valueOf(j));
//					int num3 = Integer.parseInt(String.valueOf(k));
//					int sum = Integer.parseInt(String.valueOf(i) + String.valueOf(j) + String.valueOf(k));
//					if (n == sum + num1 + num2 + num3) {
//						System.out.println(sum);
//						return;
//					}
//				}
//			}
//		}
