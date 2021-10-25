package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Silver_Greedy_1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		String[] div1 = str.split("-");
		List<Integer> digit = new ArrayList<Integer>();
		for (String string : div1) {
			String[] temp = string.split("\\+");
			int sum = 0;
			for (String integer : temp) {
				sum += Integer.parseInt(integer);
			}
			digit.add(sum);
		}
		int minus = 2 * digit.get(0);
		for (Integer integer : digit) {
			minus -= integer;
		}
		System.out.println(minus);
	}
}
