package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver_4949 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// (,[ -> before, ),] -> after
		String str = "";
		StringBuilder sb = new StringBuilder();
		while (!(str = br.readLine()).equals(".")) {
			Stack<String> stack = new Stack<String>();
			for (int i = 0; i < str.length(); i++) {
				String temp = str.substring(i, i + 1);
				if (temp.equals("(") || temp.equals("[") || temp.equals(")") || temp.equals("]")) {
					if (!stack.isEmpty()) {
						if ((stack.peek() + temp).equals("()") || (stack.peek() + temp).equals("[]")) {
							stack.pop();
						} else {
							stack.push(str.substring(i, i + 1));
						}
					} else {
						stack.push(str.substring(i, i + 1));
					}
				}
			}
			if (stack.isEmpty()) {
				sb.append("yes").append('\n');
			} else
				sb.append("no").append('\n');
		}
		System.out.println(sb);
	}
}
