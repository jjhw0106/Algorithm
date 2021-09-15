package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		String num = br.readLine();
		int sum = 0;

		for (int i = 0; i < repeat; i++) {
			sum += Integer.parseInt(num.substring(i, i + 1));
		}
		System.out.println(sum);
	}
}
