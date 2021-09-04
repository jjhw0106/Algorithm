package NDB_Code;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Chapter6_1 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Integer num[] = new Integer[n];

		for (int i = 0; i < n; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num, Collections.reverseOrder()); //내림차순

		for (int i = 0; i < num.length; i++)
			System.out.println(num[i]);
	}

}
