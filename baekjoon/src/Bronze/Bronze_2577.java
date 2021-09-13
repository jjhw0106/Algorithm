package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Bronze_2577 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.valueOf(br.readLine());
		int b = Integer.valueOf(br.readLine());
		int c = Integer.valueOf(br.readLine());
		int value = a * b * c;
		int digit = String.valueOf(value).length();
		int max = (int) Math.pow(10, digit - 1);
		int[] arr = new int[digit];
		for (int i = 0; i < digit; i++) {
			arr[i] = value / max;
			value %= max;
			max /= 10;
		}
		for (int i = 0; i < 10; i++) {
			int output=0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j]==i) {
					output++;
				}
			}
			System.out.println(output);
		}
	}
}
