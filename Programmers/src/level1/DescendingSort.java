package level1;

import java.util.ArrayList;
import java.util.Comparator;

public class DescendingSort {
	public static void main(String[] args) {
		int n = 118372;
		solution(n);
	}

	static public long solution(long n) {
		long answer = 0;
		ArrayList<Integer> list = new ArrayList<>();
		while (n != 0) {
			list.add((int) n % 10);
			n /= 10;
		}
		list.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 - o2) * -1;
			}
		});

		String temp = "";
		for (int i = 0; i < list.size(); i++) {
			temp += String.valueOf(list.get(i));
		}
		answer = Long.parseLong(temp);
		return answer;
	}

}
