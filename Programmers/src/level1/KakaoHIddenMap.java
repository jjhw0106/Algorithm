package level1;

import java.io.BufferedReader;

public class KakaoHIddenMap {
	public static void main(String[] args) {
	 int n = 6;
		int map1[] = { 46, 33, 33, 22, 31, 50 };
		int map2[] = { 27, 56, 19, 14, 14, 10 };

		solution(n, map1, map2);
	}
	
//	1. map을 2진수로 바꿈->toString
//	2. map1[i].charAt[j]||map2[i].charAt[j] == 1 => map3[i] = 1

	static public String[] solution(int n, int[] map1, int[] map2) {
		String[] answer = new String[n];

		for (int i = 0; i < n; i++) {
			answer[i] = "";
			for (int j = 0; j < n; j++) {
				String mapTemp1 = decimalToBinary(map1[i], n);
				String mapTemp2 = decimalToBinary(map2[i], n);

				if (mapTemp1.charAt(j) == '1' || mapTemp2.charAt(j) == '1') {
					answer[i] += '#';
				} else
					answer[i] += ' ';
			}
		}
		return answer;
	}

	static public String decimalToBinary(int mapComp, int n) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < n; i++) {
			sb.append(String.valueOf(mapComp % 2));
			mapComp /= 2;
		}
		sb.reverse();

		return sb.toString();
	}
}
