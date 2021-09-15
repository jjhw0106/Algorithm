package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char target = 97;
		for (int i = 97; i <= 122; i++) {
			target = (char) i;
			int output = -1;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(j) == target) {
					output = j;
					break;
				}
			}
			System.out.print(output + " ");
		}
	}
}
