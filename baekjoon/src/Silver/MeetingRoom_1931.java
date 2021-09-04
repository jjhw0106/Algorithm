package Silver;

import java.util.Scanner;

class MeetingRoom_1931 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int answer = 1;
		int n = sc.nextInt();
		int time[][] = new int[n][2];
		for (int i = 0; i < n; i++) {
			time[i][0] = sc.nextInt();
			time[i][1] = sc.nextInt();
		}

		int cnt = 0;
		for (int i = cnt; i < time.length; i++) {
			if (time[cnt][1] > time[i][1]) {
				int temp[] = time[cnt];
				time[cnt] = time[i];
				time[i] = temp;
				if (time[cnt][1] == time[i][1]) {
					if (time[cnt][0] > time[i][0]) {
						int temp2[] = time[cnt];
						time[cnt] = time[i];
						time[i] = temp2;
					}
				}
			}
//			System.out.println(cnt+","+i);
			if (i == time.length-1) {
				cnt++;
				i=cnt;
			}
		}

		int end = time[0][1];
		for (int i = 0; i < time.length; i++) {
			if (time[i][0] > end) {
				end = time[i][1];
				answer++;
			}
		}
//		int temp[] = time[0];
//		time[0] = time[1];
//		time[1] = temp;
//		for (int i = 0; i < time.length; i++) {
//			System.out.println(time[i][0] + " " + time[i][1]);
//		}

		System.out.println(answer);

	}
}
