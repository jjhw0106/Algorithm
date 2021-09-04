package Bronze;

import java.util.Scanner;

public class Exchange_5585 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int price = 1000-sc.nextInt();
		int answer = 0;
		while (true) {
			if (price == 0)
				break;
			if (price >= 500)
				price -= 500;
			else if (price >= 100)
				price -= 100;
			else if (price >= 50)
				price -= 50;
			else if (price >= 10)
				price -= 10;
			else if (price >= 5)
				price -= 5;
			else if (price >= 1)
				price -= 1;

			answer++;

		}
		System.out.println(answer);
	}
}
