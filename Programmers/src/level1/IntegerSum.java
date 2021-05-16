package level1;

public class IntegerSum {
	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		System.out.println(solution(a, b));

	}

	static public long solution(int a, int b) {
		long answer = 0;
		long min = Math.min(a, b);

		for (long i = 0; i <= Math.abs(b-a); i++)
			answer += min + i;

		return answer;
	}
}