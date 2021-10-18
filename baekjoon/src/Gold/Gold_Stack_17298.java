package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold_Stack_17298 {
	static Stack<Integer> stack;
	static List<Integer> ansList = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		stack = new Stack<Integer>();
		stack.add(0);
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] <= arr[i - 1]) {
				stack.push(i);
			} else {
				for (int j = stack.size() - 1; j >= 0; j--) {
					int temp = stack.pop();
					if (arr[temp] > arr[i]) {
						break;
					}
					ansList.add(arr[temp]);
				}
			}
		}
		System.out.println(ansList.toString());
	}

	void compare(int cur) {
		int temp = stack.pop();
		while(temp <cur) {
			ansList.add(arr[temp]);
		}
	}

}
