package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Silver_1966 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		boolean isMax = false;
		int max = 0;
		while (no-- > 0) {
			String[] str = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int target = Integer.parseInt(str[1]);
			int[] prt = new int[n];

			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			Queue<Integer> q = new LinkedList<Integer>();
			for (int i = 0; i < n; i++) {
				prt[i] = Integer.parseInt(st.nextToken());
				if (prt[i] > max) {
					max = prt[i];
				}
				q.add(prt[i]);
			}
			for (Integer integer : q) {
				if(integer == max) {
					q.poll();
				}else {
					q.offer(q.poll());
				}
				
			}

		}
	}
}
