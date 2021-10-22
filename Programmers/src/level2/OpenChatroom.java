package level2;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class OpenChatroom {
	public static void main(String[] args) throws IOException {
		String[] str = { "Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo",
				"Change uid4567 Ryan" };
		solution(str);
	}

	static public String[] solution(String[] record) {
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < record.length; i++) {
			String[] query = record[i].split(" ");
			if (query[0].equals("Enter")) {
				map.put(query[1], query[2]);
			} else if (query[0].equals("Change")) {
				map.put(query[1], query[2]);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < record.length; i++) {
			String[] query = record[i].split(" ");
			if (query[0].equals("Enter")) {
				sb.append(map.get(query[1]));
				sb.append("님이 들어왔습니다.").append("\n");
			} else if (query[0].equals("Leave")) {
				sb.append(map.get(query[1]));
				sb.append("님이 나갔습니다.").append("\n");
			}
		}

		String[] answer = sb.toString().split("\n");
		return answer;
	}
}
