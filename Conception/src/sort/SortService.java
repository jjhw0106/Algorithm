package sort;

import java.util.PriorityQueue;

import common.CommonUtils;

public class SortService {
	CommonUtils utils = new CommonUtils();
	// 버블정렬, 평균 : O(n^2), 최악 : O(n^2), 안정성 : O
	// key: 인접 두개 비교, 뒤에서부터 정렬
	void bubbleSort(int[] nums) {
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = 0; j < nums.length - i - 1; j++) {
				if (nums[j] > nums[j + 1]) {
					utils.swap(nums, j, j + 1);
				}
			}
		}
	}

	// 선택정렬, 평균 : O(n^2), 최악 : O(n^2), 안정성 : X
	// key: 가장 작은(큰) 값 선택, 앞(뒤)에서부터 정렬
	void selectionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int minIdx = utils.findMinIdx(nums, i);
			utils.swap(nums, i, minIdx);
		}
	}

	// 삽입정렬, 평균 : O(n^2), 최악 : O(n^2), 안정성 : O
	// key: 앞에서부터 정렬해 나간다.
	void insertionSort(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			int target = i;
			while (target != 0 && nums[target] < nums[target - 1]) {
				utils.swap(nums, target - 1, target);
				target--;
			}
		}
	}

	// 퀵 정렬, 평균 : O(NlogN), 최악 : O(n^2), 안정성 : X
	void quickSort(int[] nums, int left, int right) {
		int pivot = nums[right];

		int i = left;
		for (int j = left; j < right; j++) {
			if (nums[j] < pivot) {
				utils.swap(nums, i, j);
				i++;
			}
		}

		int pivotIdx = i;
		utils.swap(nums, pivotIdx, right);
		quickSort(nums, left, pivotIdx);
		quickSort(nums, pivotIdx, right);
	}

	// 병합정렬, 평균: O(NlogN), 최악 : O(NlogN), 안정성 : O
	// key: 반으로 나누고 병합, 합병 시 정렬
	void mergeSort(int[] nums, int m, int n) { // m = 시작값, n = 끝값
		if (m < n) {
			int middle = (m + n) / 2;
			mergeSort(nums, m, middle);
			mergeSort(nums, middle + 1, n);

			utils.merge(nums, m, middle, n); // 합병과 동시에 정렬
		}
	}

	// 힙 정렬, 평균: O(NlogN), 최악 : O(NlogN), 안정성 : X
	// key: 힙을 구현(자바의 우선순위 큐(PriorityQueue)사용가능)하고 힙에서 하나씩 꺼내어 배열의 뒤에서부터 저장하면 된다.
	void heapSort(int[] nums) {
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>();
		int[] sorted = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			maxHeap.add(nums[i]);
		}
		for (int i = 0; i < nums.length; i++) {
			sorted[i] = maxHeap.poll();
		}
//		nums=sorted;
//		=> nums에 sorted가 대입되는 것이 아니다.
//		nums의 위치를 가리키는 포인터가 sorted를 가리킨다. 즉 nums로 생성된 배열의 공간은 건들지 않고 sorted로 new된 위치를 가리키게 된다.
		for (int i = 0; i < nums.length; i++) {
			nums[i] = sorted[i];
		}
	}
}
