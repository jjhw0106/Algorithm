package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Bronze_10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> answer = new ArrayList<Integer>();
		String str;
		while ((str=br.readLine())!=null) {
			StringTokenizer st = new StringTokenizer(str, " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			answer.add(a + b);
			
		}
		
		for (int i = 0; i < answer.size(); i++) {
			System.out.println(answer.get(i));
		}
	}
}
