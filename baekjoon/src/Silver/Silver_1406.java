package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver_1406 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();

		Stack<String> before = new Stack<String>();
		for (int i = 0; i < str.length(); i++) {
			before.push(str.substring(i, i + 1));
		}
		Stack<String> after = new Stack<String>();

		int n = Integer.parseInt(br.readLine());
		String order = "";

		for (int i = 0; i < n; i++) {
			order = br.readLine();
			if (order.length() != 1) {
				String val = order.split(" ")[1];
				insert(before, val);
			} else if (order.equals("L")) {
				moveLeft(before, after);
			} else if (order.equals("D")) {
				moveRight(before, after);
			} else if (order.equals("B")) {
				delete(before);
			}
		}
		show(before, after);
	}

	static void moveLeft(Stack<String> before, Stack<String> after) {
		if (!before.isEmpty()) {
			after.push(before.pop());
		}
	}

	static void moveRight(Stack<String> before, Stack<String> after) {
		if (!after.isEmpty()) {
			before.push(after.pop());
		}
	}

	static void delete(Stack<String> before) {
		if (!before.isEmpty()) {
			before.pop();
		}
	}

	static void insert(Stack<String> before, String val) {
		before.push(val);
	}

	static void show(Stack<String> before, Stack<String> after) {
		StringBuilder sb = new StringBuilder();
		
		while (!before.isEmpty()) {
			after.push(before.pop());
		}
		while (!after.isEmpty()) {
		sb.append(after.pop());
		}
		System.out.println(sb);
	}
}
