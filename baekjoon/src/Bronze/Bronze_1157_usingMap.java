package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Bronze_1157_usingMap {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str =br.readLine().toUpperCase();
		Map<Character, Integer> mapChar = new HashMap<Character, Integer>();
		for(int i=0; i<str.length();i++) {
			mapChar.put(str.charAt(i), 0);
		}
		for (Entry<Character, Integer> entry : mapChar.entrySet()) {
			for (int i=0; i<str.length(); i++) {
				if(entry.getKey()==str.charAt(i)) {
					entry.setValue(entry.getValue()+1);
				}
			}
		}
		int max =0;
		int dup =0;
		char answer = 0;
		for (Entry<Character, Integer> entry : mapChar.entrySet()) {
			if(max<entry.getValue()) {
				max=entry.getValue();
				dup=0;
				answer = entry.getKey();
			}
			else if(max==entry.getValue()) {
				dup++;
			}
		}
		if(dup!=0) {
			System.out.println("?");
		}else{
			System.out.println(answer);
		}
	}
}
