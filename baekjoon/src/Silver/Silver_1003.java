package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_1003 {
	static int cnt1 = 0;
	static int cnt0 = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[41];
		int[] arr2 = new int[41];
		boolean[] ts = new boolean[41];
		String[] answer = new String[n];
		
		arr1[0] = 1;
		arr1[1] = 0;
		arr2[0] = 0;
		arr2[1] = 1;
		
		for(int i=2; i<41; i++) {
			arr1[i] = arr1[i-1]+arr1[i-2];
			arr2[i] = arr2[i-1]+arr2[i-2];
		}
		
		
		for (int i = 0; i < n; i++) {
			int t = Integer.parseInt(br.readLine());
			answer[i] = arr1[t]+" "+arr2[t];
		}
		for (String string : answer) {
			System.out.println(string);
		}
	}
}
