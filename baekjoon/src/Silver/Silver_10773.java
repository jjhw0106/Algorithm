package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Silver_10773 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		Stack<Integer> input = new Stack<Integer>();
		int sum = 0;
		for (int i = 0; i < num; i++) {
			int n = Integer.parseInt(br.readLine());
			if (n != 0) {
				sum += n;
				input.push(n);
			} else if (n == 0) {
				sum -= input.pop();
			}
		}
		System.out.println(sum);
	}
}
