package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Silver_BackTracking_15652 {
	static int m;
	static int n;
	static int[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		n = Integer.parseInt(str.split(" ")[0]);
		m = Integer.parseInt(str.split(" ")[1]);
		visited = new int[n];
		recur("", 1, m);
	}

	static ArrayList<String> list = new ArrayList<String>();

	static void recur(String ans, int cur, int remain) {

		if (remain == 0) {
			System.out.println(ans);
			return ;
		}
		for (int i = cur; i < n; i++) {
			if(visited[i]!=2) {
				visited[i]++;
				recur(ans + i + " ", i, remain - 1);
				visited[i]--;
			}else
			{
				visited[i]
			}
		}
	}
}
