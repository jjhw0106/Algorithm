import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.StringTokenizer;

public class Kakao2022_1 {
	public static void main(String[] args) {
		String[] id_list = { "muzi", "frodo", "apeach", "neo" };
		String[] report = { "muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "muzi neo", "muzi neo",
				"apeach muzi" };
		int k = 2;
		solution(id_list, report, k);
	}

	static public int[] solution(String[] id_list, String[] report, int k) {
		int[] answer = {};

		Arrays.sort(report);
		Set<String> uniqueReport = new HashSet<String>();

		for (String rep : report) {
			uniqueReport.add(rep);
		}
		
		String[] accused=new String[uniqueReport.size()];
		
		int idx=0;
		for (String rep : uniqueReport) {
			StringTokenizer st = new StringTokenizer(rep," ");
			st.nextToken();
			accused[idx++]=st.nextToken();
		}
			
		Map<String, Integer> mapId = new HashMap<String, Integer>();
		for (String string : id_list) {
			mapId.put(string, 0);
		}
		for (Entry<String, Integer> set : mapId.entrySet()) {
			for(int i=0; i<accused.length;i++) {
				if(set.getKey().equals(accused[i])) {
					set.setValue(set.getValue()+1);
				}
				mapId.put(set.getKey(), set.getValue());
			}
		}
		answer = new int[id_list.length];
		idx=0;
		for (Entry<String, Integer> set : mapId.entrySet()) {
			answer[idx]=set.getValue();
			idx++;
		}
		System.out.println(Arrays.toString(answer));
		return answer;
	}
}
