import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Zum_1 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		long n = Long.parseLong(br.readLine());
		solution(n);

	}

	static public long solution(long n) {
		long answer = 0;
		long max = n * n;
		int sum = 0;
		for (long i = 0; i < max; i++) {
			if (i % n == i / n) {
				sum += i;
				i+=n;
				continue;
			}
		}
		System.out.println(sum);
		answer=sum;
		return answer;
	}
}