package level1;

public class GappedNumber {
	public static void main(String[] args) {
		int x = 2;
		int n = 5;
		solution(x, n);
	}

	static public long[] solution(int x, int n) {
		long[] answer = new long[n];
		answer[0] = x;

		for (int i = 1; i < n; i++)
			answer[i] = answer[i - 1] + x;

		return answer;
	}
}
