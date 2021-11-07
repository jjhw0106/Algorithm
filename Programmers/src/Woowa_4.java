import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Woowa_4 {
	public static void main(String[] args) throws IOException {
		String s = "wowwow";
		solution(s);
	}
	static public int[] solution(String s) {
		int[] answer = {};
		List<Integer> cnts = new ArrayList<Integer>();

		// 첫글자랑 끝글자 같으면 첫 글자를 끝글자 뒤로(반복)
		Queue<Character> q = new LinkedList<Character>();
		for (int i = 0; i < s.length(); i++) {
			q.offer(s.charAt(i));
		}
		while (q.peek() == s.charAt(s.length() - 1)) {
			q.offer(q.poll());
		}

		// 중복 글자 카운트
		int cnt = 1;
		while (!q.isEmpty()) {
			char cur = q.poll();
			if (!q.isEmpty() && cur == q.peek()) {
				cnt++;
			} else {
				cnts.add(cnt);
				cnt = 1;
			}
		}
		Collections.sort(cnts);
		answer = new int[cnts.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = cnts.get(i);
		}
		return answer;
	}
}