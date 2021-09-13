package sort;

import common.CommonUtils;

public class Controller {
	public static int[] nums = {5,3,4,2,1,8,7,9,5,3,1,5,9,9};
	public static void main(String[] args) {
		CommonUtils utils = new CommonUtils();
		SortService sort = new SortService();
		
		utils.shuffle(nums);
		System.out.print("버블정렬 :");
		sort.bubbleSort(nums);
		for(int i=0; i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
		System.out.println();
		utils.shuffle(nums);
		System.out.print("선택정렬 :");
		sort.selectionSort(nums);
		for(int i=0; i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
		System.out.println();
		utils.shuffle(nums);
		System.out.print("삽입정렬 :");
		sort.insertionSort(nums);
		for(int i=0; i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}

		System.out.println();
		utils.shuffle(nums);
		System.out.print("퀵 정렬 :");
		sort.insertionSort(nums);
		for(int i=0; i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}

		System.out.println();
		utils.shuffle(nums);
		System.out.print("병합 정렬 :");
		sort.mergeSort(nums, 0, nums.length-1);
		for(int i=0; i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
		
		System.out.println();
		utils.shuffle(nums);
		System.out.print("힙 정렬 :");
		sort.heapSort(nums);
		for(int i=0; i<nums.length;i++) {
			System.out.print(nums[i]+" ");
		}
	}
}