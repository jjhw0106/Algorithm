import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Woowa_5 {
	public static void main(String[] args) throws IOException {

		int rows = 3;
		int columns = 4;
		solution(rows, columns);

	}

	static public int[][] solution(int rows, int columns) {
		int[][] answer = {};
		int[][] boards = new int[rows][columns];
		int[] cur = { 0, 0 };
		int num = 1;
		boards[0][0] = num;

		while (true) {
			if (boards[cur[0]][cur[1]] % 2 == 0) {
				whenEven(cur, rows);
				if (boards[cur[0]][cur[1]] != 0 && roopCheck(boards[cur[0]][cur[1]])) {
					break;
				}
				boards[cur[0]][cur[1]] = ++num;
			} else {
				whenOdd(cur, columns);
				if (boards[cur[0]][cur[1]] != 0 && !roopCheck(boards[cur[0]][cur[1]])) {
					break;
				}
				boards[cur[0]][cur[1]] = ++num;
			}
		}
		answer = boards;
		return answer;

	}

	// true > 짝수 , false > 홀수
	static boolean roopCheck(int value) {
		boolean check = false;
		if (value % 2 == 0) {
			check = true;
		}
		return check;
	}

	static int[] whenEven(int[] cur, int rows) {
		cur[0] += 1;
		if (cur[0] >= rows) {
			cur[0] = 0;
		}
		return cur;
	}

	static int[] whenOdd(int[] cur, int columns) {
		cur[1] += 1;
		if (cur[1] >= columns) {
			cur[1] = 0;
		}
		return cur;

	}
}
