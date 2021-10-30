import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class NHNCommerce_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Set<String> set = new HashSet<String>();

		int k = Integer.parseInt(br.readLine());
		for (int i = 0; i < k; i++) {
			String temp = br.readLine();
			int n = Integer.parseInt(temp.split(" ")[0]);
			int m = Integer.parseInt(temp.split(" ")[1]);

			String[] numbers = br.readLine().split(" ");
			int cnt = 0;
			for (String string : numbers) {
				set.add(string);
				cnt++;
				if (set.size() == m) {
					System.out.println(cnt);
					set.clear();
					break;
				}
			}
		}
	}
}
