import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Jinhak4 {
	static Map<Integer, Sticker> map = new HashMap<Integer, Jinhak4.Sticker>();
	static int max = 0;

	public int[] solution(int[] sticker) {
		int[] answer = {};

		int idx = 0;

		for (int i = 0; i < sticker.length; i++) {
			map.put(i, new Sticker(sticker[i], false));
		}

		for (int i = 0; i < map.size(); i++) {
			System.out.println(map.get(i).getNumber() + " " + map.get(i).isCut());
		}

		int sum = 0;

		for (int i = 0; i < sticker.length - 1; i++) {
			cut(sum, i);
			map = new HashMap<Integer, Jinhak4.Sticker>();
		}

		System.out.println(max);
		return answer;
	}

	public void cut(int sum, int index) {
		if (sum > max) {
			max = sum;
		}
		if(index>=map.size()) {return;}

		if (map.get(index).isCut() == false) {
			if (null == map.get(index - 1) || map.get(index - 1).isCut() == false) {
				if (null == map.get(index + 1) || map.get(index + 1).isCut() == false) {
					sum += map.get(index).getNumber();
					map.get(index).setCut(true);
					cutSide(index);
				}
			}
		}
		cut(sum, index + 1);
	}

	public void cutSide(int index) {
		if (index > 0) {
			map.get(index - 1).setCut(true);
		}
		map.get(index + 1).setCut(true);
	}

	class Sticker {
		private int number;
		private boolean cut;

		public Sticker(int number, boolean cut) {
			super();
			this.number = number;
			this.cut = cut;
		}

		public int getNumber() {
			return number;
		}

		public void setNumber(int number) {
			this.number = number;
		}

		public boolean isCut() {
			return cut;
		}

		public void setCut(boolean cut) {
			this.cut = cut;
		}

	}
}
