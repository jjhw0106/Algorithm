package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SIlver_1427 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String N = br.readLine();
		char num[] = new char[N.length()];
		for (int i = 0; i < num.length; i++) {
			num[i] = N.charAt(i);
		}
		Arrays.sort(num); 
		for (int i = num.length-1; i >=0; i--) {
			sb.append(num[i]);
		}
		System.out.println(sb);

	}
}
