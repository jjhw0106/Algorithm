package level2;

public class DfsBfs_TargetNumber {
	public static void main(String[] args) {
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;

		solution(numbers, target);
	}

	public static int solution(int[] numbers, int target) {
		int answer = 0;
		
		for(int i=0; i<numbers.length; i++) {
			
		}
		
		return answer;
	}
}

//static int cnt = 0;
//
///*
// * public static void main(String[] args) {
// * int[] numbers = { 1, 1, 1, 1, 1 };
// * int target = 3;
// * solution(numbers, target);
// * }
// */
//
//public static int solution(int[] numbers, int target) {
//	int answer = 0;
//	answer = dfs(numbers, target, 0);
//	System.out.println(answer);
//	return answer;
//}
//
//public static int dfs(int[] numbers, int target, int depth) {
//	if (depth == numbers.length) {
//		int sum = 0;
//		for (int i : numbers) {
//			sum += i;
//		}
//		if (sum == target) {
//			cnt++;
//		}
//	} else {
//		numbers[depth] *= 1;
//		dfs(numbers, target, depth + 1);
//		numbers[depth] *= -1;
//		dfs(numbers, target, depth + 1);
//	}
//	return cnt;
//}
