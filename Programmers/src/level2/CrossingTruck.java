package level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

//트럭 여러 대가 강을 가로지르는 일 차선 다리를 정해진 순으로 건너려 합니다. 
//모든 트럭이 다리를 건너려면 최소 몇 초가 걸리는지 알아내야 합니다. 
//트럭은 1초에 1만큼 움직이며, 다리 길이는 bridge_length이고 다리는 무게 weight까지 견딥니다.
//※ 트럭이 다리에 완전히 오르지 않은 경우, 이 트럭의 무게는 고려하지 않습니다.
//예를 들어, 길이가 2이고 10kg 무게를 견디는 다리가 있습니다. 
//무게가 [7, 4, 5, 6]kg인 트럭이 순서대로 최단 시간 안에 다리를 건너려면 다음과 같이 건너야 합니다.

public class CrossingTruck {
	public static void main(String[] args) {
// test case
		 int bridgeLength = 3;
		 int maxCapa = 10;
		 int truck[] = { 7, 4, 5, 6 }; 
		// int bridgeLength = 1;
		// int maxCapa = 1;
		// int truck[] = { 1, 1, 1 };
//		int bridgeLength = 100;
//		int maxCapa = 100;
//		int truck[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };

		System.out.println(solution(bridgeLength, maxCapa, truck));

	}

	static class Truck {
		int weight;
		int move;

		public Truck(int weight) {
			this.weight = weight;
			this.move = 0;
		}

		public void moving() {
			this.move++;
		}
	}

	static public int solution(int bridge_length, int maxCapa, int[] truck_weights) {

		Queue<Truck> waitingQ = new LinkedList<>();
		Queue<Truck> movingQ = new LinkedList<>();

//		int answer = 0;
//		Truck t = new Truck(20);
//		System.out.println(t.weight);
//		Truck t2 = new Truck(30);
//		System.out.println(t.weight);
//		System.out.println(t2.weight);

//		1. 대기중인 트럭에 트럭웨이트 반환
		for (int t : truck_weights) {
			waitingQ.offer(new Truck(t));
		}

		int answer = 0;
		int curWeight = 0;

//		2. 대기하는 트럭이 있거나, 다리위의 트럭이 있을 경우, answer++
		while (!waitingQ.isEmpty() || !movingQ.isEmpty()) {
			answer++;

			if (movingQ.isEmpty()) {
				Truck t = waitingQ.poll();
				curWeight += t.weight;
				movingQ.offer(t);
				continue;
			}

			// q. t가 왜 move를 공유 ? => movingQ의 Truck t를 가져와서 moving함.
			for (Truck t : movingQ) {
				t.moving();
			}

			if (movingQ.peek().move >= bridge_length) {
				Truck t = movingQ.poll();
				curWeight -= t.weight;
			}

			if (!waitingQ.isEmpty() && curWeight + waitingQ.peek().weight < maxCapa) {
				Truck t = waitingQ.poll();
				curWeight += t.weight;
				movingQ.offer(t);
			}

		}

		return answer;
	}
}

// 1차 풀이. 큐 미사용

//public class CrossingTruck {
//	static int weightSum = 0;
//
//	// Test Case
//	public static void main(String[] args) {
////		int bridgeLength = 3;
////		int maxCapa = 10;
////		int truck[] = { 7, 4, 5, 6 };
////		int bridgeLength = 1;
////		int maxCapa = 1;
////		int truck[] = { 1, 1, 1 };
//		int bridgeLength = 100;
//		int maxCapa = 100;
//		int truck[] = { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 };
//
//		System.out.println(solution(bridgeLength, maxCapa, truck));
//	}
//
//	static public int solution(int bridge_length, int maxCapa, int[] truck_weights) {
//		int answer = 0;
//		ArrayList<Integer> onBridge = new ArrayList<Integer>();
//		ArrayList<Integer> truckList = new ArrayList<Integer>();
//
//		for (int i = 0; i < truck_weights.length; i++)
//			truckList.add(truck_weights[i]);
//		for (int i = 0; i < bridge_length; i++)
//			onBridge.add(0);
//
//		while (true) {
//// 		다리 위 트럭 체크
////			System.out.print("다리 위 :");
////			for (int i = 0; i < onBridge.size(); i++) {
////				System.out.print(onBridge.get(i) + ",");
////			}
////			System.out.println();
//			///
//			if (truckList.isEmpty() && checkWeightOnBridge(onBridge, truckList) == 0)
//				break;
//
//			if (bridgeLengthCheck(bridge_length, onBridge) == true) {
//				if (checkWeightOnBridge(onBridge, truckList) <= maxCapa) {
//					move(onBridge, truckList);
//				} else {
//					onBridge.remove(onBridge.size() - 1);
//					if (checkWeightOnBridge(onBridge, truckList) <= maxCapa) {
//						System.out.println("onbridge 합은 " + onBridge.size());
//						onBridge.add(0, truckList.get(0));
//						truckList.remove(0);
//					} else
//						onBridge.add(0, 0);
//				}
//			} else {
//				int temp = 0;
//				onBridge.remove(onBridge.size() - 1);
//
//				for (int i = 0; i < onBridge.size(); i++) {
//					temp += onBridge.get(i);
//				}
//
//				if (!truckList.isEmpty() && temp + truckList.get(0) <= maxCapa) {
//					onBridge.add(0, truckList.get(0));
//					truckList.remove(0);
//				} else {
//					onBridge.add(0, 0);
//				}
//			}
//
//			answer++;
//		}
//
//		return answer;
//
//	}
//
//	static public boolean bridgeLengthCheck(int bridge_length, ArrayList<Integer> onBridge) {
//		int count = 0;
//		for (int i = 0; i < onBridge.size(); i++)
//			if (onBridge.get(i) != 0)
//				count++;
//		if (count < bridge_length)
//			return true;
//		return false;
//	}
//
//	static public int checkWeightOnBridge(ArrayList<Integer> onBridge, ArrayList<Integer> truckList) {
//		int sum = 0;
//		for (int i = 0; i < onBridge.size(); i++)
//			sum += (onBridge.get(i));
//
//		if (truckList.isEmpty())
//			return sum;
//		else if (!truckList.isEmpty())
//			return sum += truckList.get(0);
//
//		return sum;
//	}
//
//	static public void move(ArrayList<Integer> onBridge, ArrayList<Integer> truckList) {
//		if (truckList.isEmpty()) {
//			onBridge.remove(onBridge.size() - 1);
//			onBridge.add(0, 0);
//		} else if (!truckList.isEmpty()) {
//			onBridge.remove(onBridge.size() - 1);
//			onBridge.add(0, truckList.get(0));
//			truckList.remove(0);
//		}
//	}
//}
