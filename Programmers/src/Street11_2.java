import java.io.IOException;

public class Street11_2 {
	public static void main(String[] args) throws IOException {
//		String s[] = { "gr", "sd", "rg" };
//		String s[] = { "gr", "sd", "rg" };
		String s[] = { "abc", "bca", "dbe" };
		System.out.println(solution(s)[0]);
		System.out.println(solution(s)[1]);
		System.out.println(solution(s)[2]);
	}
	
	// 같은 자릿수에 같은 문자? 없으면 빈배열 반환
	public static int[] solution(String[] s) {
		int[] answer = { 0, 0, 0 };
		boolean check = false;
		for (int i = 0; i < s.length; i++) {
			for (int j = i + 1; j < s.length; j++) {
				for (int k = 0; k < s[i].length(); k++) {
					if (s[i].charAt(k) == s[j].charAt(k)) {
						answer[0] = i;
						answer[1] = j;
						answer[2] = k;
						check = true;
						break;	// 이거 안적음
					}
				}
			}
		}
		if(check==false) {
			answer= new int[0];
		}
		return answer;
	}
}
