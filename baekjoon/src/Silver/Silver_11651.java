package Silver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Silver_11651 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<xyPosition> pos = new ArrayList<>();
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			xyPosition temp = new xyPosition(x, y);
			pos.add(temp);
		}
		Collections.sort(pos);
		for (int i = 0; i < pos.size(); i++) {
			System.out.println(pos.get(i).x + " " + pos.get(i).y);
		}
	}
}

class xyPosition implements Comparable<xyPosition> {

	int x;
	int y;

	public xyPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(xyPosition pos) {
		if ((this.y - pos.y) != 0) {
			return this.y - pos.y;
		} else
			return this.x - pos.x;

	}

}
