package coding_test;

public class ¿ùÄÚÃ¨1 {
	public static void main(String[] args) {

		int left = 13;
		int right = 17;
		System.out.println(solution(left, right));

	}

	public static int solution(int left, int right) {
		int answer = 0;

		for (int i = left; i <= right; i++) {
			answer += find(i);
		}

		return answer;
	}

	public static int find(int num) {
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				cnt++;
			}
		}
		return cnt % 2 == 0 ? num : num * -1;
	}
}
