import java.util.ArrayList;

public class Test {
	public static void main(String[] args) {
		int[] gift_cards = { 5, 4, 5, 4, 5 };
		int[] wants = { 1, 2, 3, 5, 4 };
		solution(gift_cards, wants);

	}

	static public int solution(int[] gift_cards, int[] wants) {
		int answer = 0;
		ArrayList<Integer> wantsList = new ArrayList<Integer>();
		for (int want : wants) {
			wantsList.add(want);
		}

		int idx = 0;
		while (true) {
			if (idx >= gift_cards.length) {
				break;
			}
			for (int i = 0; i < wantsList.size(); i++) {
				if (gift_cards[idx] == wantsList.get(i)) {
					wantsList.remove(i);
					break;
				}
			}
			idx++;
		}
		answer = wantsList.size();
		System.out.println(answer);
		return answer;
	}
}

//		for (int i = 0; i < wantsList.size(); i++) {
//			if (wantsList.get(i) == giftList.get(i)) {
//				wantsList.remove(i);
//				giftList.remove(i);
//			}
//		}

//		Arrays.sort(gift_cards);
//		Arrays.sort(wants);
//		for (int i = 0; i < wants.length; i++) {
//			for(int j=0; j<gift_cards.length; j++)
//			if (gift_cards[i] != wants[i])
//				answer++;
//		}