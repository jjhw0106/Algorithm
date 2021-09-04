package Silver;

import java.util.Scanner;
//체스판 만들기
public class Silver_1018 {
	static char board[][] = new char[0][0];

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		8*8 체스판 만들기, 보드크기 =n*m
		int n = sc.nextInt();
		int m = sc.nextInt();
		board = new char[n][m];
		sc.nextLine();
		for (int i = 0; i < n; i++) {
			String getStr = sc.nextLine();
			for (int j = 0; j < m; j++) {
				board[i][j] = getStr.charAt(j);
			}
		}
		int min = n * m;
		for (int i = 0; i < n - 7; i++) {
			for (int j = 0; j < m - 7; j++) {
				if (min > boardCheck(i, j))
					min = boardCheck(i, j);
			}
		}
		System.out.println(min);
	}
 
	static int boardCheck(int y, int x) {
		char startPos = board[y][x];// board의 시작점
		int cnt = 0;
		int temp1 = 0;
		int temp2 = 0;
		for (int i = y; i < y + 8; i++)
			for (int j = x; j < x + 8; j++) {
				{
					if ((i + j - y - x) % 2 == 0) {// 선택된 체스판의 0~7번째 인덱스를 의미하므로 y,x 빼줌
						if (startPos != board[i][j])
							temp1++;
					} else if ((i + j - y - x) % 2 == 1) {
						if (startPos == board[i][j])
							temp1++;
					}
					if ((i + j - y - x) % 2 == 0) {// 선택된 체스판의 0~7번째 인덱스를 의미하므로 y,x 빼줌
						if (startPos == board[i][j])
							temp2++;
					} else if ((i + j - y - x) % 2 == 1) {
						if (startPos != board[i][j])
							temp2++;
					}

				}
			}
		cnt = (temp1 < temp2 )? temp1 : temp2;
		return cnt;
	}
}
