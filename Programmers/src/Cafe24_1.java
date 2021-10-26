import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Cafe24_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		solution(a, b);
	}

	static public String[] solution(int startNumber, int endNumber) {
		String[] answer = {};
		Queue<Integer> q = new LinkedList<Integer>();

		q.offer(startNumber);

		int temp = 0;
		if (endNumber > startNumber) {
			temp = startNumber + 1;
			while (endNumber != temp) {
				q.offer(temp++);
			}
			q.offer(temp);
		} else {
			temp = startNumber - 1;
			while (endNumber != temp) {
				q.offer(temp--);
			}
			q.offer(temp);
		}
		String ans="";
		List<String> ansList= new ArrayList<String>();
		while (!q.isEmpty()) {
			ans += q.poll();
			ansList.add(String.format("%010d", Integer.parseInt(ans)));
		}
		answer = new String[ansList.size()];
		for(int i=0; i<answer.length;i++) {
			answer[i]=ansList.get(i);
		}
		return answer;
	}
}
