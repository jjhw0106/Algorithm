package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_DivCon_2630 {
	static int countZero;
	static int countOne;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int[][] square = new int[n][n];
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			for (int j = 0; j < n; j++) {
				square[i][j] = Integer.parseInt(str.split(" ")[j]);
			}
		}
		divQuart(square, 0, 0, n);
		System.out.println(countZero);
		System.out.println(countOne);
	}

	static void divQuart(int[][] square, int r, int c, int n) {
		int check = square[r][c];
		if (n == 1) {
			if (check == 0) {
				countZero++;
				return;
			} else {
				countOne++;
				return;
			}
		}
		for (int i = r; i < r + n; i++) {
			for (int j = c; j < c + n; j++) {
				if (square[i][j] != check) {
					n /= 2;
					divQuart(square, r, c, n);
					divQuart(square, r, n, n);
					divQuart(square, n, c, n);
					divQuart(square, n, n, n);
					return;
				}
			}
		}
		if (check == 0) {
			countZero++;
		} else {
			countOne++;
		}
	}

}
