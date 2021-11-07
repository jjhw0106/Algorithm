import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Woowa_6 {
	public static void main(String[] args) throws IOException {
		double time = 3.5;
		String[][] plans = { { "홍콩", "11PM", "9AM" }, { "엘에이", "3PM", "2PM" } };
		solution(time, plans);

	}

	static public String solution(double time, String[][] plans) {
		String answer = "";

		for (int i = 0; i < plans.length; i++) {
			String area = plans[i][0];

			String dept = plans[i][1];
			int dt = sToi(dept);
			String arrv = plans[i][2];
			int at = sToi(arrv);
			
			// 휴가시간이 5시간 이상일 경우 고려안됨(월요일 통으로 날려도 되는경우)
			if (time >= dt - 18 + at - 13) {
				answer = plans[i][0];
				break;
			}
		}
		System.out.println(answer);
		return answer;
	}

	static int sToi(String s) {
		int idx = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) > 57) {
				idx = i;
			}
		}
		int a = Integer.parseInt(s.substring(0, idx - 1));
		String b = s.substring(idx - 1);
		if (b.equals("PM")) {
			a += 12;
		}
		return a;
	}
}
