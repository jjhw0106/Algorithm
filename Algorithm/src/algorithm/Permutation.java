package algorithm;

import java.awt.print.Printable;
import java.util.ArrayList;

public class Permutation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		permutation(arr, 0, arr.length, arr.length);
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void permutation(int[] arr, int depth, int n, int r) {
		if (depth == r) {
			System.out.print(arr[r]);
			return;
		}
		for(int i=depth; i<n; i++)
		swap(arr,depth,i );
		permutation()

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
