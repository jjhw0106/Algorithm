import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Woowa_3 {
	public static void main(String[] args) throws IOException {
		String[] ings = { "r 10", "a 23", "t 124", "k 9" };
		String[] menu = { "PIZZA arraak 145", "HAMBURGER tkar 180", "BREAD kkk 30", "ICECREAM rar 50",
				"SHAVEDICE rar 45", "JUICE rra 55", "WATER a 20" };
		String[] sell = { "BREAD 5", "ICECREAM 100", "PIZZA 7", "JUICE 10", "WATER 1" };
		solution(ings, menu, sell);
	}

	static public int solution(String[] ings, String[] menu, String[] sell) {
		int answer = 0;
		// for(메뉴 별)
		for (int i = 0; i < menu.length; i++) {
			// 순이익 = 정가 - 원가
			int net = Integer.parseInt(menu[i].split(" ")[2]) - calCost(ings, menu[i]);
			// result += 순이익 * 갯수
			int cnt = sellCnt(menu[i].split(" ")[0], sell);
			answer += net * cnt;
		}
		return answer;
	}

	static public int sellCnt(String name, String[] sell) {
		int cnt = 0;
		for (String s : sell) {
			if (s.split(" ")[0].equals(name)) {
				cnt = Integer.parseInt(s.split(" ")[1]);
			}
		}
		return cnt;
	}

	static public int calCost(String[] ings, String menu) {
		int cost = 0;
		String itemIng = menu.split(" ")[1]; // arraak
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String string : ings) {
			map.put(string.split(" ")[0], Integer.parseInt(string.split(" ")[1]));
		}
		for (int i = 0; i < itemIng.length(); i++) {
			cost += map.get(String.valueOf(itemIng.charAt(i)));
		}
		return cost;
	}
}
