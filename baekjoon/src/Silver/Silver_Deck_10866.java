package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_Deck_10866 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		while (n-- >= 0) {
			String str = br.readLine();
			String[] command = str.split(" ");
			switch (command[0]) {
			case "push_back":
				break;

			default:
				break;
			}
		}
	}
}

class Deck {
	private int front = 0;
	private int back = 0;
	private int[] deck = new int[10000];

	void pushFront(int n) {
		if (front < back) {
			deck[front++] = n;
		}else {
			System.out.println("값을 추가할 수 없습니다.");
		}
	}

	void pushBack() {

	}

	int size() {
		return back - front;
	}

	void empty() {

	}

	void popFront() {

	}

	void popBack() {

	}

	public int getFront() {
		return front;
	}

	public void setFront(int front) {
		this.front = front;
	}

	public int getBack() {
		return back;
	}

	public void setBack(int back) {
		this.back = back;
	}

	public int[] getDeck() {
		return deck;
	}

	public void setDeck(int[] deck) {
		this.deck = deck;
	}

}