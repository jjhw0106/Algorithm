package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bronze_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] keys = new String[10];
		keys[0] = "";
		keys[1] = "ABC";
		keys[2] = "DEF";
		keys[3] = "GHI";
		keys[4] = "JKL";
		keys[5] = "MNO";
		keys[6] = "PQRS";
		keys[7] = "TUV";
		keys[8] = "WXYZ";
		keys[9] = "";
		for (int i = 0; i < keys.length; i++) {
			map.put(keys[i], i + 1);
		}

		String input = br.readLine();
		int sum =0;
		for (int i = 0; i < input.length(); i++) {
			for (Entry<String, Integer> entry : map.entrySet()) {
				if (entry.getKey().contains(input.substring(i, i + 1))) {
					sum +=entry.getValue()+1;
				}
			}
		}
		System.out.println(sum);
	}
}
