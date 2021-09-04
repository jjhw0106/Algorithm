package level2;

import java.util.LinkedList;
import java.util.Queue;

//1초 시점의 ₩1은 끝까지 가격이 떨어지지 않았습니다.
//2초 시점의 ₩2은 끝까지 가격이 떨어지지 않았습니다.
//3초 시점의 ₩3은 1초뒤에 가격이 떨어집니다. 따라서 1초간 가격이 떨어지지 않은 것으로 봅니다.
//4초 시점의 ₩2은 1초간 가격이 떨어지지 않았습니다.
//5초 시점의 ₩3은 0초간 가격이 떨어지지 않았습니다.
public class StockPrice {
	public static void main(String[] args) {
		int[] prices = { 1, 2, 3, 2, 3, 1 }; // 5,4,1,2,1,0
		solution(prices);
	}

	static public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		Queue<Integer> priceQ = new LinkedList<Integer>();

		for (int i : prices) {
			priceQ.add(i);
		}

		for (int i = 0; i < prices.length; i++) {
			int tempQ = priceQ.poll();
			int cnt = 0;
			for (int j = i + 1; j < prices.length; j++) {
				
				if (tempQ > prices[i + 1]) {
					cnt = 1;
					break;
				}
				
				if (tempQ <= prices[j]) {
					cnt++;
				} else {
					cnt++;
					break;
				}
			}
			answer[i] = cnt;
//			System.out.println("tempQ: " + tempQ);
//			System.out.println(answer[i]);
			if (i + 1 > prices.length) {
				break;
			}
		}

		return answer;
	}
}