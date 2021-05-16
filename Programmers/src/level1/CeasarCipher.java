package level1;

public class CeasarCipher {
	public static void main(String[] args) {
		String str = "a B z";
		System.out.println(solution(str, 1));
	}

	static public String solution(String s, int n) {

		String answer = "";
		char[] temp = new char[s.length()];
		temp = s.toCharArray();

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == ' ') {
				answer += ' ';
				continue;
			}
			if (temp[i] + n > 122) {
				answer += (char) (temp[i] + n - 26);
				continue;
			}
			if (temp[i] + n > 90 && temp[i] < 97) {
				answer += ((char) (temp[i] + n - 26));
				continue;
			}
			answer += (char) (temp[i] + n);

		}

		return answer;
	}
}
