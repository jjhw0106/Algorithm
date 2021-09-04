package Silver;

import java.util.Scanner;

public class Silver_16956 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int r = sc.nextInt();
		int c = sc.nextInt();
		char[][] farm = new char[r][c];

		sc.nextLine();

		for (int i = 0; i < r; i++) {
			String line = sc.nextLine();
			for (int j = 0; j < c; j++) {
				farm[i][j] = line.charAt(j);
			}
		}
		int dy[] = { -1, 1, 0, 0 };
		int dx[] = { 0, 0, -1, 1 };

		int idxY = 0;
		int idxX = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (farm[i][j] == 'S') {
					idxY = i;
					idxX = j;
				}
			}
		}
		int check = 1;
		for (int n = 0; n < 4; n++) {
			if (farm[idxY + dy[n]][idxX + dx[n]] == 'W')
				break;
			else {
				System.out.println(1);
				for (int i = 0; i < r; i++) {
					for (int j = 0; j < c; j++) {
						if (farm[i][j] == '.') {
							farm[i][j] = 'D';
						}
						System.out.print(farm[i][j] + " ");
						if (j == c - 1) {
							System.out.println();
						}
					}
				}
			}
		}
	}

}
