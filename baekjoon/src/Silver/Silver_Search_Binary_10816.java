package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Silver_Search_Binary_10816 {
	static int[] cards;
	static int[] targets;
	static int n;
	static int m;
	static int answer[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		cards = new int[n];
		String[] temp = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			cards[i] = Integer.parseInt(temp[i]);
		}
		Arrays.sort(cards);
		m = Integer.parseInt(br.readLine());
		targets = new int[m];
		answer = new int[m];
		temp = br.readLine().split(" ");

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			targets[i] = Integer.parseInt(temp[i]);
			sb.append(upperBound(0, cards.length-1, targets[i]) - lowerBound());
		}
		System.out.println(Arrays.toString(answer));
	}

	public static int upperBound(int lo, int hi, int target) {
		int cnt = 0;

		return cnt;
	}

	public static int lowerBound(int mid, int target) {
		int cnt = 0;
		while (mid >= 0 && cards[mid--] == target) {
			cnt++;
		}
		return cnt;
	}
}
