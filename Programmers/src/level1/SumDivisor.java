package level1;

public class SumDivisor {
	public static void main(String[] args) {
		int n = 12;
		solution(n);
	}

	static public int solution(int n) {
		int answer = 0;
		for (int i = 1; i <= n / 2; i++)
			if (n % i == 0)
				answer += i;
		return answer + n;
	}
}
