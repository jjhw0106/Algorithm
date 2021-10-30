package Silver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Silver__1789 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		long n = Long.parseLong(br.readLine());
		int cnt = 0;
		int number = 1;
		while (n != 0) {
			if(n<number) {
				break;
			}
			n-=number++;
			cnt++;
		}
		bw.write(String.valueOf(cnt));
		br.close();
		bw.close();
	}
}
