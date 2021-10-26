import java.util.Arrays;

public class Cafe24_2 {
	public static void main(String[] args) {
		int[] sortedArray = { 1, 2, 5, 7, 10, 15, 18, 20 };
		int findValue = 15;
		solution(sortedArray, findValue);
	}

	static public int solution(int[] sortedArray, int findValue) {
		int answer = 0;

		// sortedArray 정렬
		// 이분탐색
		binarySearch(sortedArray, findValue, 0, sortedArray.length - 1);
		answer= ans;
		return answer;
	}

	static int ans = 0;

	static void binarySearch(int[] sortedArray, int value, int start, int end) {
		int mid = (start + end) / 2;
		if (start > end) {
			ans = -1;
			return;
		}
		if (value == sortedArray[mid]) {
			ans = mid;
			return;
		} else if (value < mid) {
			binarySearch(sortedArray, value, start, mid - 1);
		} else {
			binarySearch(sortedArray, value, mid + 1, end);
		}
	}
}
