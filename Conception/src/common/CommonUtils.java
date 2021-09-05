package common;

import java.util.Arrays;
import java.util.Random;

import sort.Controller;

public class CommonUtils {

	public int[] swap(int[] nums, int a, int b) {
		int temp = nums[a];
		nums[a] = nums[b];
		nums[b] = temp;
		return nums;
	}

	public void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}

	public void shuffle(int[] nums) {
		Random random = new Random();
		for (int i = 0; i < 100; i++) {
			int ranIdx = random.nextInt(nums.length);
			swap(nums, 0, ranIdx);
		}
		System.out.println("셔플값:" + Arrays.toString(nums));
	}

	public int findMinIdx(int[] nums, int start) {
		int min = nums[start];
		int idx = start;
		for (int i = start; i < nums.length; i++) {
			if (nums[i] < min) {
				min = nums[i];
				idx = i;
			}
		}
		return idx;
	}

	int sorted[] = new int[Controller.nums.length];
	public void merge(int arr[], int m, int middle, int n) {
		int i = m;
		int j = middle + 1;
		int k = m;

		while (i <= middle && j <= n) {
			if (arr[i] < arr[j]) {
				sorted[k] = arr[i];
				i++;
			} else {
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}
		if (i > middle) {
			for (int t = j; t <= n; t++) {
				sorted[k++] = arr[t];
			} 
		} else {
			for(int t=i; t<=middle; t++) {
				sorted[k++] = arr[t];
			}
		}
		for(int t=m; t<=n; t++) {
			arr[t]=sorted[t];
		}
	}
}
