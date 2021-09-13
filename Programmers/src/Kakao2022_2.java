import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import level1.Solution;

public class Kakao2022_2 {
	public static void main(String[] args) {
		for (int i = 1; i < 1000000; i++) {
			solution(i, 2);
		}
	}

	// 소수판별
	static public boolean sosu(double num) {
		if (num <= 1) {
			return false;
		}
		boolean check = true;
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				check = false;
				break;
			}
		}
		return check;
	}

	// 진법변환(k to 10)
	static public int change10(String n) {
		int number = Integer.parseInt(n);
		return number;
	}

	// 진법변환(10 to k)
	static public String changeK(int n, int k) {
		String changed = "";
		int div = n;
		while (true) {
			changed += div % k;
			div /= k;
			if (div == 0)
				break;
		}
		if (div != 0)
			changed += div;
		StringBuilder sb = new StringBuilder(changed);
		changed = sb.reverse().toString();
		return changed;
	}

	// 0으로 자르기
	static public List<String> cutNum(String changed, int k) {
		StringTokenizer st = new StringTokenizer(changed, "0");
		List<String> nominee = new ArrayList<String>();
		while (st.hasMoreTokens()) {
			String temp = st.nextToken();
			nominee.add(temp);
		}
		return nominee;
	}

	static public int solution(int n, int k) {
		int answer = 0;
		String changed = changeK(n, k);
		List<String> nominee = cutNum(changed, k);
		for (String nom : nominee) {
			double temp = Double.parseDouble(nom);
			// temp 소수판별
			if (sosu(temp) == true) {
				answer++;
			}
		}
		System.out.println(answer);
		return answer;
	}
}
