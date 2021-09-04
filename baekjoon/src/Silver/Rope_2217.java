package Silver;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

class Rope {
	static ArrayList<Integer> ropeList = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);

	void ropeInit(int k) {
		for (int i = 0; i < k; i++) {
			int num = sc.nextInt();
			ropeList.add(num);
		}
	}

	void ropeSort() {
		Collections.sort(ropeList);
	}
}

public class Rope_2217 {
	public static void main(String[] args) {
		Rope rope = new Rope();
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		rope.ropeInit(k);
		rope.ropeSort();
		for (int i = 1; i < Rope.ropeList.size(); i++) {
			if (Rope.ropeList.get(0) * k < (Rope.ropeList.get(i) * (k - i))) {
				Rope.ropeList.remove(0);
				k--;
				i = 0;
			}
		}
		System.out.println(Rope.ropeList.get(0) * k);

	}
}
