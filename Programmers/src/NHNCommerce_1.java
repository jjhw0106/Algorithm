import java.io.*;
import java.util.*;


public class NHNCommerce_1 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
//		String[] logs = new String[n]; // 송수신 기록
		Queue<String> logs = new LinkedList<String>();

		for (int i = 0; i < n; i++) {
			logs.add(br.readLine());
		}

		List<String> answer = new ArrayList<String>();
		while (!logs.isEmpty()) {
			int cnt = 1;
			String temp = logs.poll();
			while (true) {
				if (!logs.isEmpty()) {
					if (temp.equals(logs.peek())) {
						cnt++;
						logs.poll();
					} else {
						if (cnt >= 2) {
							temp += " (" + cnt + ")";
						}
						break;
					}
				} else {
					break;
				}
			}
			answer.add(temp);
		}
		System.out.println(answer.size());
		for (String string : answer) {
			System.out.println(string);
		}
	}
}
