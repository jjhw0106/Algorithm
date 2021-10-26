package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_Greedy_13305 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());


		String way[] = br.readLine().split(" ");
		long[] length = new long[way.length];
		for (int i = 0; i < way.length; i++) {
			length[i] = Integer.parseInt(way[i]);
		}
		String node[] = br.readLine().split(" ");
		long[] city = new long[n];
		for (int i = 0; i < n; i++) {
			city[i] = Long.parseLong(node[i]);
		}

		long max = city[0];
		long price = city[0] * length[0];
		for (int i = 1; i < length.length; i++) {
			if (city[i] < max) {
				max = city[i];
			}
			price += max * length[i];
		}
		System.out.println(price);
	}
}
