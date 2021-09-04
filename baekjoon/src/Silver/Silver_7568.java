package Silver;

import java.util.Scanner;

//1. 몸무게 정렬
//2. 키로 정렬
//3. checkIdx[i][2]비교
public class Silver_7568 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int human[][] = new int[n][3];
		int rank = 1;
		for (int i = 0; i < n; i++) {
			human[i][0] = sc.nextInt();
			human[i][1] = sc.nextInt();
			human[i][2] = rank;
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (human[i][0] < human[j][0] && human[i][1] < human[j][1]) {
					human[i][2]++;
				}
			}
		}
		for (int i = 0; i < n; i++)
			System.out.println(human[i][2] + " ");
	}
}
//
//	static void weightOrder() {
//		for (int i = 0; i < size; i++) {
//			for (int j = i; j < size; j++) {
//				if (human[i][0] < human[j][0]) {
//					int temp[] = human[i];
//					human[i] = human[j];
//					human[j] = temp;
//				}
//			}
//		}
//	}
//
//	static void heightOrder() {
//		for (int i = 0; i < size; i++) {
//			for (int j = i; j < size; j++) {
//				if (human[i][0] == human[j][0]) {
//					if (human[i][1] < human[j][1]) {
//						int temp[] = human[j];
//						human[j] = human[i];
//						human[i] = temp;
//					}
//				}
//			}
//		}
