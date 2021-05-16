package level1;

import java.util.Arrays;

public class FindKim {
	public static void main(String[] args) {
		String[] str = { "Jane", "Kim", " dfsfd" };

		System.out.println(solution(str));

	}

	static public String solution(String[] seoul) {
		int idx = Arrays.asList(seoul).indexOf("Kim");
		return String.format("김서방은 %d에 있다", idx);
	}
}
