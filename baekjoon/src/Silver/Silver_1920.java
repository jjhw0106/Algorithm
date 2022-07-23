package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Silver_1920 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String nStr = br.readLine();
		String[] a = nStr.split(" ");
		int m = Integer.parseInt(br.readLine());
		String mStr = br.readLine();
		String[] b = mStr.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0; i<m; i++) {
			map.put(b[i], 0);
		}
		for (String string : a) {
			map.put(string, 1);
		}
		for (String string : b) {
			System.out.println(map.get(string));
		}
	}

}


