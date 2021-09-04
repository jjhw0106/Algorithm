package level1;

import java.util.ArrayList;
import java.util.Stack;

public class CranePickUp {
	public static void main(String[] args) {
		int[][] board = {

				{ 0, 0, 0, 0, 0 },

				{ 0, 0, 1, 0, 3 },

				{ 0, 2, 5, 0, 1 },

				{ 4, 2, 4, 4, 2 },

				{ 3, 5, 1, 3, 1 } };

		int[] moves = { 1,5,3,5,1,2,1,4 };

		solution(board, moves);
	}

	static public int solution(int[][] board, int[] moves) {
		int answer = 0;
		Stack<int[]> st = new Stack<>();

		int[][] column = new int[board[0].length][board.length];
		for (int i = 0; i < board[0].length; i++) {
			for (int j = 0; j < board.length; j++) {
				column[i][j] = board[board.length - j - 1][i];
			}
		}
		for (int i = 0; i < column.length; i++)
			st.push(column[i]);

//		System.out.println("=======스택=======");
//		for (int i = 0; i < st.size(); i++) {
//			for (int j = 0; j < st.get(i).length; j++) {
//				System.out.print(st.get(i)[j]);
//			}
//			System.out.println();
//		}
//		System.out.println("================");

		ArrayList<Integer> basket = new ArrayList<>();
		for (int i = 0; i < moves.length; i++) {
			for (int j = st.get(0).length - 1; j >= 0; j--) {
				if (st.get(moves[i] - 1)[j] != 0) {
					basket.add(st.get(moves[i] - 1)[j]);
					st.get(moves[i] - 1)[j] = 0;
					break;
				}
			}
		}

		for (int i = 0; i < basket.size() - 1; i++) {
			if (basket.get(i) == basket.get(i + 1)) {
				answer += 2;
				basket.remove(i);
				basket.remove(i);
				i = -1;
			}
		}
//		System.out.println("=======바스켓======");
//		for (int i = 0; i < basket.size(); i++)
//			System.out.print(basket.get(i));
//		System.out.println("\n================");

		System.out.print("\n" + answer);
		return answer;
	}

}