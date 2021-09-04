package Bronze;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Bronze_2750 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startTime = (int) System.currentTimeMillis();
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		// Arrays로 풀이
		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		int endTime = (int) System.currentTimeMillis();

		System.out.println("걸린시간: " + (endTime - startTime));

		// ArrayList로 풀이
//		ArrayList<Integer> numList = new ArrayList<Integer>();
//		int n = sc.nextInt();
//
//		for (int i = 0; i < n; i++) {
//			numList.add(sc.nextInt());
//		}
//
//		order(numList);
//
//		for (int i = 0; i < numList.size(); i++)
//			System.out.println(numList.get(i));
//	}
//
//	static void order(ArrayList<Integer> num) {
//		for (int i = 0; i < num.size(); i++) {
//			for (int j = i + 1; j < num.size(); j++) {
//				if (num.get(i) > num.get(j)) {
//					int temp = num.get(i);
//					num.set(i, num.get(j));
//					num.set(j, temp);
//				}
//				if (num.get(i) == num.get(j)) {
//					num.remove(i);
//				}
//			}
//		}
	}
}
