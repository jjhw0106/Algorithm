package Search;

import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] args) {
		Scanner sc = new java.util.Scanner(System.in);
		int arr[] = { 1, 4,7,11,115,234,655 };
		int num = sc.nextInt();
		search(arr, num);
	}

	static void search(int[] arr, int num) {
		if (num == arr[arr.length / 2]) {
			System.out.println(num);
			return;
		}
		if (arr.length == 1) {
			System.out.println("찾으시는 값이 없습니다");
			return;
		}

		if (num < arr[arr.length / 2]) {
			int[] halfArr = new int[arr.length / 2];
			for (int i = 0; i < arr.length / 2; i++) {
				halfArr[i] = arr[i];
			}
			search(halfArr, num);
		}

		else if (num > arr[arr.length / 2]) {
			int[] halfArr = new int[arr.length - (arr.length / 2)];
			for (int i = arr.length / 2; i < arr.length; i++) {
				halfArr[i - (arr.length / 2)] = arr[i];
			}
			search(halfArr, num);
		}
	}
}
