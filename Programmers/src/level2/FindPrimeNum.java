package level2;

import java.util.Arrays;

//한자리 숫자가 적힌 종이 조각이 흩어져있습니다. 
//흩어진 종이 조각을 붙여 소수를 몇 개 만들 수 있는지 알아내려 합니다.
//
//각 종이 조각에 적힌 숫자가 적힌 문자열 numbers가 주어졌을 때, 
//종이 조각으로 만들 수 있는 소수가 몇 개인지 return 하도록 solution 함수를 완성해주세요.

public class FindPrimeNum {
	public static void main(String[] args) {
		String numbers = "17";
		solution(numbers);
	}

	static public int solution(String numbers) {
		int answer = 0;
		int[] getNum = new int[numbers.length()];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numbers.length(); i++) {
			getNum[i] = (int) numbers.charAt(i);
		}
		Arrays.sort(getNum);
		return answer;
	}
}
