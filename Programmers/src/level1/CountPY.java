package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class CountPY {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		System.out.println(solution(str));

	}

	static boolean solution(String s) {
		int cnt = 0;
		s=s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'p')
				cnt++;
			if (s.charAt(i) == 'y')
				cnt--;
		}
		return cnt==0?true:false;
	}
}
//static boolean solution(String s) {
//	boolean answer = true;
//	// [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
//	System.out.println("Hello Java");
//	
//	int pCnt = 0;
//	int yCnt = 0;
//	for (int i = 0; i < s.length(); i++) {
//		if (s.charAt(i) == 'p' || s.charAt(i) == 'P')
//			pCnt++;
//		if (s.charAt(i) == 'Y' || s.charAt(i) == 'y')
//			yCnt++;
//	}
//	if(pCnt == yCnt)
//		answer = true;
//	else
//		answer =false;
//	
//	return answer;
//}
//}
