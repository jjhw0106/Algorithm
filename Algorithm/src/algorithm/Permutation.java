package algorithm;

import java.util.ArrayList;

public class Permutation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		permutation(arr);
	}

	public static int[] swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		return arr;
	}

	public static void permutation(int[] arr) {
		if (arr.length == 2) {
			swap(arr, 0, 1);
			for (int i : arr) {
				System.out.println(i);
			}
			return;
		}
		int[] temp = null;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				temp = swap(arr, i, j);
			}
		}
		permutation(temp);
	}

}
//		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		permutation(arr);
//	}
//
//	public static void permutation(int[] arr) {
//		if (arr.length == 2) {
//			swap(0, 1);
//			return;
//		}
//		for (int i = 0; i < arr.length; i++) {
//
//		}
//
//	}
//
//	public static void swap(int a, int b) {
//		int temp = arr[a];
//		arr[a] = arr[b];
//		arr[b] = temp;
//	}
//
//	public static boolean check() {
//		boolean check = false;
//
//		return check;
//	}
//
//}
