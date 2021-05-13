package programmers;

public class ¿ùÄÚÃ¨2 {
	public static void main(String[] args) {
		long[] numbers = { 2, 7 };
		solution(numbers);
	}

	public static long[] solution(long[] numbers) {
		long[] answer = {};

		int idx = 0;
		for (long l : numbers) {
			StringBuilder sb = new StringBuilder();
			String temp = Long.toBinaryString(l);
			sb.append(temp);
			if (temp.substring(temp.length() - 1).equals("0")) {
				sb.replace(temp.length() - 1, temp.length(), "1");
				System.out.println(sb);
				continue;
			}
			for (int i = temp.length() - 1; i >= 0; i--) {
				if (temp.charAt(i) == 0) {
					sb.replace(i, i + 1, "10");
					break;
				}
				if (sb.equals(sb.replace(0, sb.length(), "1"))) {
					sb.append
				}
			}
			System.out.println(sb);
		}

		return answer;
	}
}
