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

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();

		StringTokenizer st = new StringTokenizer(str, " ");

		int[] arr = new int[n];
		int[] target = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			target[i] = arr[i];
		}
		Arrays.sort(arr);

		List<Integer> ansList = new ArrayList<Integer>();
		// arr 정렬해서 stack에 저장
		stack = new Stack<Integer>();
		for (int i = arr.length - 1; i >= 0; i--) {
			stack.push(arr[i]);
		}
		
		int idx = 0;
		
		if(target[idx] < stack.pop()) {
			
		}
		
		
		for (Integer integer : ansList) {
			System.out.println(integer);
		}
	}
}
