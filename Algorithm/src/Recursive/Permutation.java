package Recursive;

public class Permutation {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		permutation(arr, 0, arr.length, arr.length);
		swap(arr, 2, 3);
	}

	public static void swap(int[] arr, int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void permutation(int[] arr, int depth, int n, int r) {
		if (depth == r) {
			for (int i : arr) {
				System.out.print(i);
			}
			System.out.println();
			return;
		}
		for (int i = depth; i < n; i++) {
			swap(arr, depth, i);
			permutation(arr, depth + 1, n, r);
			swap(arr, i, depth);			// recursion과정에서 원 데이터집합의 순서가 뒤섞인다. 이를
		}									// 원래대로 돌려주기 위한 코드
	}
}
