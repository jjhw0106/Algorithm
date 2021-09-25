package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver_Stack_1874 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<Integer>();
		int[] input = new int[num];
		for (int i = 0; i < num; i++) {
			input[i] = Integer.parseInt(br.readLine());
		}

		int cur = 0;
		int idx = 0;
		StringBuilder sb = new StringBuilder();
		while (idx < input.length && cur<100001) {
			if (!stack.isEmpty()&&stack.peek() == input[idx]) {
				stack.pop();
				sb.append("-").append('\n');
				idx++;
			} else {
				stack.push(++cur);
				sb.append("+").append('\n');
			}
		}
		if(idx==input.length) {
			System.out.println(sb);
		}else {
			System.out.println("NO");
		}
	}
}
