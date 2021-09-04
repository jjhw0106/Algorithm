package level1;

public class InnerProduct {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int[] b = { -3, -1, 0, 2 };
		System.out.println(solution(a, a.length, b, b.length));
	}

	static int solution(int a[], int a_len, int b[], int b_len) {
		int answer = 0;

		for (int i = 0; i < a.length; i++) {
			answer += a[i] * b[i];
		}

		return answer;
	}
}
