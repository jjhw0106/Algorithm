package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_8958 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int total[] = new int[num];

		String[] input = new String[num];
		for (int n = 0; n < num; n++) {
			input[n] = br.readLine();
			int score = 0;
			for (int i = 0; i < input[n].length(); i++) {
				if (input[n].substring(i, i + 1).equals("O")) {
					total[n] += ++score;
				} else {
					score = 0;
				}
			}
		}
		for(int i=0; i<total.length; i++) {
			System.out.println(total[i]);
		}
	}
}
