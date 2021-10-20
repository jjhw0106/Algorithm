package level2;

public class Kakao_StringCompression {
	String[] dp;

	public static void main(String[] args) {
		String s = "a";
		solution(s);
	}

	static public int solution(String s) {
		int answer = 1;
		
		// 1자리부터 압축 길이 +1 해주면서 compression 실행
		for (int i = 1; i <= s.length() / 2; i++) {
			if (answer == 1 || answer > compression(s, i)) {
				answer = compression(s, i);
			}
		}
		System.out.println(answer);
		return answer;
	}

	static public int compression(String str, int len) {
		double strLen = str.length();
		int arrCnt = (int) Math.ceil(strLen / len);
		String[] arr = new String[arrCnt];

		int idx = 0;
		for (int i = 0; i < str.length(); i += len) {
			if (i + len > str.length()) {
				arr[idx] = str.substring(i);
				break;
			}
			arr[idx++] = str.substring(i, i + len);
		}

		int cnt = 1;
		
		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < arr.length; j++) {
			for (int i = j; i < arr.length; i++) {
				if (i < arr.length - 1 && arr[i].equals(arr[i + 1])) {
					cnt++;
				} else {
					if (cnt != 1) {
						sb.append(cnt);
					}
					cnt = 1;
					j = i;
					break;
				}
			}
			sb.append(arr[j]);
		}
		return sb.length();
	}
}