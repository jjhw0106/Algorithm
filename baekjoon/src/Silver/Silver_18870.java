package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Silver_18870 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		int[] cmp = new int[num];
		int idx = 0;
		for (String i : input) {
			cmp[idx++] = Integer.parseInt(i);
		}
		int[] dup = cmp.clone();
		Arrays.sort(dup);

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		idx=0;
		for (int i = 0; i < dup.length; i++) {
			if (!map.containsKey(dup[i])) {
				map.put(dup[i], idx++);
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i : cmp) {
			sb.append(map.get(i)).append(' ');
		}
		System.out.println(sb.toString());
	}
}
