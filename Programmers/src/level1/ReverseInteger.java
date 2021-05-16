package level1;

public class ReverseInteger {
	public static void main(String[] args) {
		int num = 12345;
		solution(num);
	}

	static public int[] solution(long n) {
		int[] answer;
		StringBuilder sb = new StringBuilder();
		sb.append(n);
		sb.reverse();
		answer = new int[sb.length()];
		for (int i = 0; i < sb.length(); i++) {
			answer[i] = Integer.parseInt(sb.substring(i, i + 1));
		}
		return answer;
	}
}
