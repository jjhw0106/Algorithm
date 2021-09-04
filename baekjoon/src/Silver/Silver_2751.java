 package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Silver_2751 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		Collections.sort(list); // Collections.sort()는 병합정렬 + 삽입정렬로 이루어져 있음
								// O(NlogN)을 보장함

		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}

//	// 계수 정렬(시간초과)
//	static int[] countSort(int[] num) {
//		int max = 0;
//		for (int i = 0; i < num.length; i++) {
//			if (max < num[i])
//				max = num[i];
//		}
//		int count[] = new int[max + 1];
//		for (int i = 0; i < num.length; i++) {
//			count[num[i]]++;
//		}
//		return count;
//
//	}

//퀵정렬 => 시간초과
//	static void quickSort(int[] num, int start, int end) {
//		if (start >= end) {
//			return;
//		}
//		int pivot = start;
//		int left = start + 1;
//		int right = end;
//
//		while (left <= right) {
//			while (left <= end && num[left] <= num[pivot]) {
//				left++;
//			}
//			while (start < right && num[right] >= num[pivot]) {
//				right--;
//			}
//			if (left > right) {
//				int temp = num[right];
//				num[right] = num[pivot];
//				num[pivot] = temp;
//			} else {
//				int temp = num[left];
//				num[left] = num[right];
//				num[right] = temp;
//			}
//		}
//		quickSort(num, start, right - 1);
//		quickSort(num, right + 1, end);
