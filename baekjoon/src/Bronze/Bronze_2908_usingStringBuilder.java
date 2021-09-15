package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_2908_usingStringBuilder {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str);

		int[] no = new int[2];

		for (int i = 0; i < 2; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(st.nextToken());
			no[i] = Integer.parseInt(sb.reverse().toString());
		}
		System.out.println(no[0] > no[1] ? no[0] : no[1]);
	}
}
