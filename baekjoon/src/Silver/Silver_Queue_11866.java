package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class Silver_Queue_11866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);
		int k = Integer.parseInt(str.split(" ")[1]);
		LinkedList<Integer> q = new LinkedList<Integer>();
		for (int i = 0; i < n; i++) {
			q.add(i + 1);
		}
		int target = 0;
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		while (!q.isEmpty()) {
			target++;
			if (target == k) {
				sb.append(q.poll());
				if (q.size() != 0) {
					sb.append(", ");
				}
				target = 0;
			} else {
				q.offer(q.poll());
			}
		}
		sb.append(">"); 
		System.out.println(sb);
	}
}
