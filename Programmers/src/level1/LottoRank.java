package level1;



public class LottoRank {
	static class Solution {
		public int[] solution(int[] lottos, int[] win_nums) {
			int[] answer = new int[2];
			int check = 0;
			int unknown = 0;
			int row;
			int high;
			// 당첨 숫자 갯수 확인
			for (int num : lottos) {
				for (int win : win_nums) {
					if (num == win) {
						check++;
					}
				}
				if (num == 0) {
					unknown++;
				}
			}

			row = check;
			high = check + unknown;

			answer[0] = getRank(high);
			answer[1] = getRank(row);

			return answer;
		}

		public int getRank(int num) {
			if (num <= 1) {
				return 6;
			} else {
				return 7 - num;
			}
		}
	}
	public static void main(String[] args) {
		Solution sol = new Solution();
		int lottos[] = { 0, 0, 0, 0, 0, 0 };
		int win_nums[] = { 38, 19, 20, 40, 15, 25 };
		int[] answer = sol.solution(lottos, win_nums);
		System.out.println(answer[0] + "," + answer[1]);
	}
}
