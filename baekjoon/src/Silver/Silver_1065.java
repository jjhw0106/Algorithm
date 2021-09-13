package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_1065 {
	static boolean solution(int num) {
		int gap = num % 10 - (num / 10) % 10;
		while (true) {
			int a = num % 10 - (num / 10) % 10;
			num /= 10;
			if (gap != a) {
				return true;
			}
			if (num == 0) {
				break;
			}
		}
		return false;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		boolean check[] = new boolean[n];
		for (int i = 1; i < n; i++) {
			check[i] = solution(i);
			if(check[i]==false) {
				System.out.println(i);
			}
		}
	}
}
