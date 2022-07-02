package level2;

public class TargetNumber {
	int count = 0;

	public int solution(int[] numbers, int target) {
		int answer = 0;
		int depth = 0;
		dfs(numbers, target, depth, 0);
		System.out.println(this.count);
		return answer;
	}


	public void dfs(int[] numbers, int target, int depth, int sum) {

		if (depth == numbers.length) {
			if (sum == target) {
				this.count++;
			}
			return;
		}

		int add = sum + numbers[depth];
		int sub = sum - numbers[depth];

		dfs(numbers, target, depth+1, add);
		dfs(numbers, target, depth+1, sub);
	}
}
