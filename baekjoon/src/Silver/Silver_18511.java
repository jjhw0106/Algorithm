package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver_18511 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		String[] input2 = br.readLine().split(" ");
		String n = input[0];
		int k = Integer.parseInt(input[1]);
		String[] arr = new String[k];
		for(int i=0; i<k; i++) {
			arr[i] = input2[i];
		}
		
		Arrays.sort(arr);
		int nLen = n.length();

		StringBuilder answer = new StringBuilder();
		for(int i=0; i<nLen-1; i++) {
			answer.append(arr[arr.length-1]);
		}

		String biggest =n.substring(0,1);
		String replace = "0";
		
		for(int i=0; i<arr.length; i++) {
			if(Integer.parseInt(arr[i]) <= Integer.parseInt(biggest)) {
				replace = arr[i];
			}
		}
		
		answer.insert(0, replace);
		String strAns = answer.toString();
		int intAns = Integer.parseInt(strAns);
		System.out.println(intAns);
	}
}
