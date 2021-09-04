package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_10989 {
	public static void main(String[] args) throws IOException {
		// 입력 숫자는 10000보다 작거나 같다. 갯수가 얼마 안되므로 개수정렬로 풀이
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());

		int[] cnt = new int[10001];

		for (int i = 0; i < N; i++) {
			cnt[Integer.parseInt(br.readLine())]++;
		}
		
		for (int i = 0; i < cnt.length; i++) {
			for (int j = 0; j < cnt[i]; j++) {
				if (cnt[i] != 0) {
					sb.append(i).append("\n");
				}
			}
		}
		System.out.println(sb);

	}
}
