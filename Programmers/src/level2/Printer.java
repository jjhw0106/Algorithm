package level2;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {
	public static void main(String[] args) {
		int[] priorities = { 4, 2, 1, 3 };
		int location = 2;
		solution(priorities, location);

	}

	
	
	// print와 location을 각각 큐로 만들어서 함께 움직이도록 설계
	
	// 1. priorityCheck ==true
	// q의 head가 우선순위가 제일 높으면 출력, printQ의 head가 출력될 때 locationQ의 head도 같이 poll한다
	// 2. priorityCheck ==false
	// 뒤에 우선순위가 더 높은 것이 있다면 head를 마지막으로 보냄, 이 때 locationQ의 head도 같이 보낸다
	
	// print()가 수행될 때 answer(차례) ++해줌
	// locationQ의 head가 poll될 때 문제에서 구하고자 하는 location이 같다면 answer를 반환한다.
	
	static public int solution(int[] priorities, int location) {
		int answer = 0;
		Queue<Integer> printQ = new LinkedList<Integer>();
		Queue<Integer> locationQ = new LinkedList<Integer>();
		int temp = 0;

		for (Integer i : priorities) {
			printQ.add(i);
			locationQ.add(temp++);
		}

		while (true) {
			if (printQ.size() == 0) {
				break;
			}
			if (priorityCheck(printQ) == true) {
				print(printQ);
				answer++;
				if (location == printLocation(locationQ))
					break;
			} else {
				priorityChange(printQ);
				locationChange(locationQ);
			}
		}
		System.out.println("answer: " + answer);
		return answer;
	}

	static public int print(Queue<Integer> printQ) {
		System.out.println(printQ.peek());
		return printQ.poll();
	}

	static public int printLocation(Queue<Integer> locationQ) {
		return locationQ.poll();
	}

	static public boolean priorityCheck(Queue<Integer> printQ) {
		boolean check = true;
		int priority = printQ.peek();
		for (int i : printQ) {
			if (priority < i) {
				check = false;
				break;
			}
		}
		return check;
	}

	static public void priorityChange(Queue<Integer> printQ) {
		printQ.add(printQ.poll());
	}

	static public void locationChange(Queue<Integer> locationQ) {
		locationQ.add(locationQ.poll());
	}

}
