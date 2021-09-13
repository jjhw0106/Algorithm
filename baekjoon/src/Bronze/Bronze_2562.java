package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_2562 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[9];
		int max = 0;
		int idx = 0;
		for (int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			if(arr[i]>max) {
				max=arr[i];
				idx=i;
			}
		}
		System.out.println(max);
		System.out.println(idx+1);
	}
}
