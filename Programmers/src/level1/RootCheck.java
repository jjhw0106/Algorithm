package level1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RootCheck {
	public static void main(String[] args) throws NumberFormatException, IOException {
		while (true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			long num = Long.parseLong(br.readLine());
			System.out.println(solution(num));
		}
	}

	static public long solution(long n) {
		long answer = (long) Math.sqrt(n);
		if (n == (long) Math.pow(answer, 2))
			return (long) Math.pow(answer+1, 2);
		return -1;
//		float numDouble = (float) Math.sqrt(n);
//		int numInt = (int) Math.sqrt(n);
//		if (numDouble == numInt)
//			return (numInt + 1) * (numInt + 1);
//		else
//			return -1;
	}
}