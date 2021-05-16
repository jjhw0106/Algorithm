package level1;

public class StringControl {
	public static void main(String[] args) {
		String str = "1234";
		System.out.println(solution(str));
	}

	static public boolean solution(String s) {
		boolean answer = true;
		if (s.length() != 4 && s.length() != 6) {
			answer = false;
			return answer;
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) < 48 || s.charAt(i) > 57) {
				System.out.println(i);
				answer = false;
				break;
			}
		}
		return answer;
	}
}
