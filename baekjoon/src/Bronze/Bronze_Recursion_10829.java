package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bronze_Recursion_10829 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		long n = Long.parseLong(br.readLine());
		toBinary(n);
	}

	public static void toBinary(long n) {
		if(n==0) {
			return;
		}
		toBinary(n/2);
		if (n%2 == 1)
			System.out.print(1);
		else
			System.out.print(0);
	}
}
