package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Bronze_5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Map<Integer, String> map = new HashMap<Integer, String>();
		String[] arr = new String[2];
		arr[0] = "abc";
		arr[1] = "def";

		for (int i = 0; i < arr.length; i++) {
			map.put(i + 1, arr[i]);
		}

		int sum = 0;
		String a = br.readLine();
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < a.length(); j++) {
				String temp =a.substring(j,j+1);
				if (arr[i].contains(temp)) {
					sum += (i + 1);
					break;
				}
			}
		}
		System.out.println(sum);

	}
}
