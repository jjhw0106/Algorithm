package Gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class Gold_Stack_17298 {
	static Stack<Integer> stack;

//	4
//	9 5 4 8

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		Stack<Integer> stack = new Stack<Integer>();
		stack.add(0);
		for (int i = 1; i < arr.length; i++) {
			while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
				arr[stack.pop()] = arr[i];
			}
			stack.push(i);
		}
		while (!stack.isEmpty()) {
			arr[stack.pop()] = -1;
		}
		for (int i = 0; i < arr.length; i++) {
			bw.write(arr[i]+" ");
		
		}
		br.close();
		bw.close();
	}
}
