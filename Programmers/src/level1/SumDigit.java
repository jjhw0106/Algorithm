package level1;

public class SumDigit {
	public static void main(String[] args) {
		int n = 123;
		System.out.println(solution(n));
	}

	static public int solution(int n) {
		int answer = 0;

		while (n != 0) {
			answer += (n % 10);
			n /= 10;
		}

		return answer;
	}
}
