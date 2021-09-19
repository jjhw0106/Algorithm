package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Sliver_9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int no = Integer.parseInt(br.readLine());
		String[] str = new String[no];
		for (int i = 0; i < no; i++) {
			str[i] = br.readLine();
		}

		for (int i = 0; i < no; i++) {
			char[] cha = str[i].toCharArray();
			if (cha[0] == ')') {
				System.out.println("NO");
				continue;
			}
			Stack<Character> stack = new Stack<Character>();
			boolean check = true;
			for (Character character : cha) {
				if (character == ')' && stack.isEmpty()) {
					System.out.println("NO");
					check = false;
					break;
				}
				if (character == '(') {
					stack.add(character);
				} else {
					stack.pop();
				}
			}
			if (check == true) {
				if (stack.size() == 0) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
	}
}
