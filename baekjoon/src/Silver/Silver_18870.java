package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Silver_18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String str = br.readLine();

		int input[] = new int[num];

		for (int i = 0; i < str.split(" ").length; i++) {
			input[i] = Integer.parseInt(str.split(" ")[i]);
		}

		Set<Integer> set = new HashSet<Integer>();
		for (int n : input) {
			set.add(n);
		}
		System.out.println(set.toString());
		int idx = 0;
		int[] cmp = new int[set.size()];
		for (Integer integer : set) {
			cmp[idx++] = integer;
		}	
		Arrays.sort(cmp);
		
		
		int[] answer = new int[num];

		for (int i : answer) {
			System.out.print(i + " ");
		}
	}
}
