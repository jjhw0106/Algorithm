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
		temp = br.readLine().split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < m; i++) {
			sb.append(upperBound(0, cards.length - 1, Integer.parseInt(temp[i])) - lowerBound(0, cards.length - 1, Integer.parseInt(temp[i]))+" ");
		}
		System.out.println();
		System.out.println(sb);
	}

	static int value = 0;

	public static int upperBound(int lo, int hi, int target) {
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (cards[mid] < target) {
				hi = mid;
			} else {
				lo = mid + 1;
			}
		}
		System.out.print("lo"+lo);
		
		return lo;
	}

	public static int lowerBound(int lo, int hi, int target) {
		while (lo < hi) {
			int mid = (lo + hi) / 2;
			if (cards[mid] < target) {
				lo = mid + 1;
			} else {
				hi = mid;
			}
		}
		System.out.print("lo"+lo);
		return lo;
	}
}
