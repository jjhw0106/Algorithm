
public class Kakao2022_3 {

	static class Area {

	}

	static class Board {

	}

	static class Skill {
		int type;
		int r1;
		int c1;
		int r2;
		int c2;
		int degree;
	}

	public static void main(String[] args) {
//		int[][] board = { { 5, 5, 5, 5, 5 }, { 5, 5, 5, 5, 5 }, { 5, 5, 5, 5, 5 }, { 5, 5, 5, 5, 5 } };
//		int[][] skill = { { 1, 0, 0, 3, 4, 4 }, { 1, 2, 0, 2, 3, 2 }, { 2, 1, 0, 3, 1, 2 }, { 1, 0, 1, 3, 3, 1 } };
		int[][] board = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int[][] skill = { { 1, 1, 1, 2, 2, 4 }, { 1, 0, 0, 1, 1, 2 }, { 2, 2, 0, 2, 0, 100 } };
		solution(board, skill);
	}

	public static int war(int[][] board, int[][] skill) {
		for(int i=0; i<skill.length; i++) {
			for(int j=skill[i][2]; j<skill[i][4]; j++) {
				for(int k=0; k<board.length;k++) {
				board[k][j]=skill[i][5];
			}}
		}

		for (int j = 0; j < board[0].length; j++) {
			for (int k = 0; k < skill.length; k++) {
				for (int i = skill[k][1]; i < skill[k][3]; i++) {
					if (skill[k][0] == 1) {
						board[i][j] -= skill[k][5];
					} else {
						board[i][j] += skill[k][5];
					}
				}
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}

		return 0;
	}

	public static int solution(int[][] board, int[][] skill) {
		int answer = 0;
		war(board, skill);
		return answer;
	}
}
