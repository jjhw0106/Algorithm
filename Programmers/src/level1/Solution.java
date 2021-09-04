package level1;

import java.util.ArrayList;

public class Solution {

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };
		solution(answers);
	}

	static public int[] solution(int[] answers) {
		int[] answer = {};
		int[] st1 = { 1, 2, 3, 4, 5 };
		int[] st2 = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] st3 = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };

		int cnt[] = new int[3];

		int max = 0;
		for (int i = 0; i < answers.length; i++) {
			if (st1[i%5]  == answers[i])
				cnt[0]++;
			if (st2[i%8] == answers[i])
				cnt[1]++;
			if (st3[i%11] == answers[i])
				cnt[2]++;
		}

		max = Math.max(Math.max(cnt[0], cnt[1]), cnt[2]);
		
		ArrayList<Integer> temp = new ArrayList<>();

		for (int i = 0; i < 3; i++) {
			if (cnt[i] == max) {
				temp.add(i+1);
			}
		}
		answer = new int[temp.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = temp.get(i);
		}

		return answer;
	}
}