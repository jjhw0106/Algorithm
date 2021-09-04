package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IdRecommand {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String id = br.readLine();
		Solution2 sol = new Solution2();
		sol.solution(id);
	}
}
//
//		1. 모든 대문자를 소문자로 ok
//		2. 소문자, 숫자, -, _, . 제외한 모든 문자 제거
//		3. ..는 .하나로, .이 처음이나 끝이면 제거
//		4. id가 빈 문자열이면, 'a'입력

//		5. 16자 이상이면 날림
//		6. 2자 이하면 마지막 문자를 3이 될때까지 반복 
class Solution2 {
	public String solution(String new_id) {
		String answer = "";

		answer = new_id.toLowerCase();
		answer = del_str(answer);
		answer = change_a(answer);
		answer = last_repeat(answer);
		System.out.println(answer);
		return answer;
	}

	public String del_str(String new_id) {
		StringBuilder sb = new StringBuilder();
		sb.append(new_id);
		for (int i = 0; i < sb.length(); i++) {
			if (!(sb.charAt(i) >= 97 && sb.charAt(i) <= 122))
				if (!(sb.charAt(i) >= 48 && sb.charAt(i) <= 57)

						&& sb.charAt(i) != '.'

						&& sb.charAt(i) != '_'

						&& sb.charAt(i) != '-')

				{
					if (i != 0)
						sb.deleteCharAt(i--);
				}
			if (i == 0 || i == sb.length() - 1)
				if (sb.charAt(i) == '.')
					sb.deleteCharAt(i--);

			if (i >= 16)
				sb.deleteCharAt(i);
		}
		return sb.toString();
	}

	public String change_a(String new_id) {
		new_id.replace(' ', 'a');
		return new_id;
	}

	public String last_repeat(String new_id) {
		String add = new_id.substring(new_id.length() - 1);
		while (new_id.length() < 3)
			new_id = new_id.concat(add);
		return new_id;
	}
}

//package level1;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class IdRecommand {
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String id = br.readLine();
//		Solution2 sol = new Solution2();
//		System.out.println(sol.solution(id));
//	}
//}
//
//class Solution2 {
//	public String solution(String new_id) {
//		String answer = "";
//		answer = new_id.toLowerCase();
////
//		StringBuilder sb = new StringBuilder();
//		sb.append(answer);
//		for (int i = 0; i < sb.length(); i++) {
//			if (!(sb.charAt(i) >= 97 && sb.charAt(i) <= 122))
//				if (!(sb.charAt(i) >= 48 && sb.charAt(i) <= 57)
//
//						&& sb.charAt(i) != '.'
//
//						&& sb.charAt(i) != '_'
//
//						&& sb.charAt(i) != '-')
//
//				{
//					sb.deleteCharAt(i--);
//				}
//
//			if (i == 0 || i == sb.length() - 1)
//				if (sb.charAt(i) == '.')
//					sb.deleteCharAt(i--);
//
//			if (i >= 16)
//				sb.deleteCharAt(i);
//		}
//		answer = sb.toString();
//		//
//		answer.replace(' ', 'a');
//		//
//
//		String add = answer.substring(answer.length() - 1);
//		while (answer.length() < 3)
//			answer = answer.concat(add);
//		return answer;
//	}
//}
