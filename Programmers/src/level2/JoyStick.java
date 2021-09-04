package level2;

import java.util.Iterator;

import level1.Solution;

public class JoyStick {
	public static void main(String[] args) {
		String name = "JEROEN";

		solution(name);

	}

	static public int solution(String name) {
		int answer = 0;
		String board = "";
		for (int i = 0; i < name.length(); i++) {
			board += "A";
		}

		int move = 0;

		// while()
		// 커서이동
		int cursor = 0;
		if (name.charAt(cursor) == 'A') {
			move++;
			cursor ++ ;
		}

		// 캐릭터와 맞춤

		return answer;
	}

}
