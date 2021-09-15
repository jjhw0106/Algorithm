package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cnt; i++) {
			String str = br.readLine();
			StringTokenizer st = new StringTokenizer(str, " ");
			int repeat = Integer.valueOf(st.nextToken());
			String output = st.nextToken();
			for (int n = 0; n < output.length(); n++) {
				for (int j = 0; j < repeat; j++) {
					sb.append(output.charAt(n));
				}
			}
			sb.append('\n');
		}
		System.out.println(sb);
	}
}
