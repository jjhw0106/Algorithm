package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		// 1. 테스트케이스의 갯수
		int t = Integer.parseInt(br.readLine());
		int idx = 0;
		while (t-- > 0) {
			// 2. 문서 갯수 n, 궁금한 문서 m
			String str = br.readLine();
			int n = Integer.parseInt(str.split(" ")[0]);
			int m = Integer.parseInt(str.split(" ")[1]);

			// 3. 각 문서 중요도
			LinkedList<int[]> q = new LinkedList<>();

			String[] arr = br.readLine().split(" ");
			int[] print = new int[2];
			for (int i = 0; i < n; i++) {
				print[0] = i; // idx
				print[1] = Integer.parseInt(arr[i]); // 중요도
				q.offer(print);
			}
//			max인지 판단
//			max가 아니면 큐의 맨 뒤로

			int cnt = 0;
			boolean isMax = true;
			while (!q.isEmpty()) {
				int[] target = q.poll();
				cnt++;
				for (int i = 0; i < q.size(); i++) {
					if (target[1] < q.get(i)[1]) {
						q.offer(target);
						isMax = false;
						break;
					}
				}
				if (isMax == true && target[0] == m) {
					sb.append(cnt);
				}
				isMax = false;
			}
//			max면 타겟 idx인지 확인
//			아니면 다음 loop
		}
		System.out.println(sb);
	}

//	static int findMax(int[] arr) {
//		Arrays.sort(arr,com);
//		return arr[arr.length - 1];
//	}
}
