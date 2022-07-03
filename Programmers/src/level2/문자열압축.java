package level2;

public class 문자열압축 {
	public int solution(String s) {
		int answer = 0;
		// 같은 문자열 압축
		// 1~절반길이까지 압축
		// 제일 짧은 길이 반환
		int min = s.length();
		for(int i=0; i<s.length()/2;i++) {
			int result = compression(s, i+1);
			min = min>result? result : min;
			
		}
		
		return answer;
	}
	public int compression(String s, int digit)
	{
		int len = 0;
		
		String target = s.substring(0, digit);
		
		
		return len; 
	}
}
