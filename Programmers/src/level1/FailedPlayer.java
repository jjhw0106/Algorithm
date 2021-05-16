package level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

//수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//
//마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이 담긴 배열 completion이 주어질 때,
//완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
public class FailedPlayer {
	public static void main(String[] args) {
		String participant[] = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String completion[] = { "josipa", "filipa", "marina", "nikola" };
		System.out.println(solution(participant, completion));
	}

	static public String solution(String[] participant, String[] completion) {
		// 2차 풀이_ HashMap 사용 풀이//////
		String answer = "";

		return answer;

		// 1차 풀이/////
//		 String answer = "";
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		int i = 0;
//		for (i = 0; i < completion.length; i++) {
//			if (!completion[i].equals(participant[i])) {
//				answer = participant[i];
//				break;
//			}
//		}
//		answer = participant[i];
//
//		return answer;
//////////////////////////////////////////

		// String answer = "";
//		Arrays.sort(participant);
//		Arrays.sort(completion);
//		int number = participant.length;
//		int cIdx = 0;
//		for (int i = 0; i < number; i++) {
//			if (!participant[i].equals(completion[cIdx++])) {
//				answer = participant[i];
//				break;
//			}
//			if (cIdx >= completion.length) {
//				answer = participant[i + 1];
//				break;
//			}
//		}
//		return answer;
	}
}

//수많은 마라톤 선수들이 마라톤에 참여하였습니다. 단 한 명의 선수를 제외하고는 모든 선수가 마라톤을 완주하였습니다.
//마라톤에 참여한 선수들의 이름이 담긴 배열 participant와 완주한 선수들의 이름이
//담긴 배열 completion이 주어질 때, 완주하지 못한 선수의 이름을 return 하도록 solution 함수를 작성해주세요.
