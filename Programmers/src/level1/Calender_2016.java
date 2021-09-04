package level1;

public class Calender_2016 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
		int a = 5, b = 24;
		System.out.println(solution(a, b));

	}

	static public String solution(int a, int b) {
		String answer = "";
		String days[] = { "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT" };
		String month[][] = new String[12][];
		int cnt = 5;

		for (int i = 0; i < 7; i++) {
			if (i % 2 == 0) {
				month[i] = new String[31];
			} else if (i % 2 == 1) {
				if (i == 1) {
					month[i] = new String[29];
					continue;
				}
				month[i] = new String[30];
			}
		}

		for (int i = 7; i < 12; i++) {
			if (i % 2 == 0)
				month[i] = new String[30];
			else if (i % 2 == 1) {
				month[i] = new String[31];
			}
		}

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < month[i].length; j++) {
				month[i][j] = days[cnt++];
				if (cnt % 7 == 0)
					cnt = 0;
			}
		}
		answer = month[a - 1][b - 1];
		return answer;
	}
}