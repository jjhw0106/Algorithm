import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NaverFinancial_1 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] days = { "JAY", "JAY ELLE JAY MAY", "MAY ELLE MAY", "ELLE MAY", "ELLE ELLE ELLE", "MAY" };
		int k = Integer.parseInt(br.readLine());
		solution(days, k);
	}

	static public int solution(String[] id_list, int k) {
		int answer = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < id_list.length; i++) {
			String[] temp = id_list[i].split(" ");
			Set<String> set = new HashSet<String>();
			for (String string : temp) {
				set.add(string);
			}
			for (String string : set) {
				if (map.containsKey(string)) {
					if (map.get(string) == k) {
						map.put(string, k);
					} else {
						map.put(string, map.get(string) + 1);
					}
				} else {
					map.put(string, 1);
				}
			}
		}
		for (Entry<String, Integer> string : map.entrySet()) {
			System.out.println(string);
		}
		for (Entry<String, Integer> entry : map.entrySet()) {
			answer += entry.getValue();
		}
		System.out.println(answer);
		return answer;
	}
}
