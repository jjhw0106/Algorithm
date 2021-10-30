package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Gold_Stack_1662 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();

		Stack<String> stack = new Stack<String>();
//		List<String> origin = new ArrayList<String>();
		int answer = 0;
		List<String> compressed = new ArrayList<String>();
		for (int i = 0; i < input.length(); i++) {
			stack.add(input.substring(i, i + 1));
			if (stack.peek().equals(")")) {
				while (!stack.peek().equals("(")) {
					String temp = stack.pop();
					if (!(temp.equals(")") || temp.equals("("))) {
						compressed.add(temp);
					}
				}
				stack.pop();
				int repeat = Integer.parseInt(stack.pop());
				for (int j = 0; j < repeat; j++) {
					for (String string : compressed) {
//						origin.add(string);
						stack.add(string);
					}
				}
				answer+=repeat * compressed.size();
				repeat=1;
			}
			compressed.clear();
		}
		System.out.println(answer);
	}
}
