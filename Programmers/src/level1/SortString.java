package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class SortString {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] strings = { "sun", "bed", "car" };
		int n = Integer.parseInt(br.readLine());

		solution(strings, n);

	}

//	문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다. 
//	예를 들어 strings가 ["sun", "bed", "car"]이고 n이 1이면 
//	각 단어의 인덱스 1의 문자 "u", "e", "a"로 strings를 정렬합니다.
	static public String[] solution(String[] strings, int n) {
		String[] answer = {};

		Arrays.sort(strings, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.charAt(n) == o2.charAt(n))
					return o1.compareTo(o2);

				return o1.charAt(n) - o2.charAt(n);
			}
		});
		answer = strings;
		return answer;
	}
}
