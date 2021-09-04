package level2;

public class MakeBigNum {
	public static void main(String[] args) {
//		String number = "4177252841";
//		int k = 4;
		String number = "1231234";
		int k = 3;
		System.out.println(solution(number, k));

	}

//	어떤 숫자에서 k개의 수를 제거했을 때 얻을 수 있는 가장 큰 숫자를 구하려 합니다.
//
//	예를 들어, 숫자 1924에서 수 두 개를 제거하면 [19, 12, 14, 92, 94, 24] 를 만들 수 있습니다. 
//	이 중 가장 큰 숫자는 94 입니다.
//
//	문자열 형식으로 숫자 number와 제거할 수의 개수 k가 solution 함수의 매개변수로 주어집니다. 
//	number에서 k 개의 수를 제거했을 때 만들 수 있는 수 중 가장 큰 숫자를 
//	문자열 형태로 return 하도록 solution 함수를 완성하세요.

	static public String solution(String number, int k) {
		String answer = "";
		int idx = 0;
		while (true) {
			char max = 48;
			for (int i = idx; i < k + 1; i++) {
				if (number.charAt(i) == 57) {
					max = number.charAt(i);
					idx = i + 1;
					break;
				}
				if (number.charAt(i) > max) {
					max = number.charAt(i);
					idx = i + 1;
				}
			}
			k++;
			answer += max;
			if (k == number.length())
				break;
		}
//		0에서  k번째까지 중 가장 큰  수 찾음
//		1번에서 찾은 max의 idx+1의 값부터 (k+2)까지 중 가장 큰 수를 찾음.
//		2번에서 찾은 max2의 idx+2부터 (k+3)까지 중 가장 큰 수를 찾음
//		...

		return answer;
	}

}
