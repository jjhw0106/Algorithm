import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NaverFinancial_3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] logs = { "0001 3 95", "0001 5 90", "0001 5 100", "0002 3 95", "0001 7 80", "0001 8 80", "0001 10 90",
				"0002 10 90", "0002 7 80", "0002 8 80", "0002 5 100", "0003 99 90" };
		solution(logs);
	}

	static public String[] solution(String[] logs) {
		String[] answer = {};

		List<String> sNo = new ArrayList<String>();
		List<Integer> no = new ArrayList<Integer>();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < logs.length; i++) {
			sNo.add(logs[i].split(" ")[0]);
			no.add(Integer.parseInt(logs[i].split(" ")[1]));
			String key = sNo.get(i) + " " + no.get(i);
			int value = Integer.parseInt(logs[i].split(" ")[2]);
			map.put(key, value);
		}
		
		

		return answer;
	}

}
