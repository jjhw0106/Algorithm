package level1;

public class GCD_LCM {
	public static void main(String[] args) {
		int n = 522400;
		int m = 244400;
		solution(n, m);
	}

	static public int[] solution(int n, int m) {
		int[] answer = new int[2];

		int big, small;

		if (n >= m) {
			big = n;
			small = m;
		} else {
			big = m;
			small = n;
		}

		answer[0] = gcd(big, small);
		answer[1] = lcm(big, small, gcd(big, small));
		System.out.println(answer[0] + "," + answer[1]);
		return answer;
	}
	// 유클리드호제법: big과 small의 최대공약수는 small과 big%small의 최대공약수와 같다.

	static public int gcd(int big, int small) {
		int gcd = 1;
		while (true) {
			if (big % small == 0)
				return small;
			else {
				gcd = small;
				small = big%small;
				big = gcd;
			}
		}
	}

	static public int lcm(int big, int small, int gcd) {
		return gcd * (big / gcd) * (small / gcd);
	}
}
