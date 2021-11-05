import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Zum_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int[][] data = { { 1, 0, 5 }, { 2, 2, 2 }, { 3, 3, 1 }, { 4, 4, 1 }, { 5, 10, 2 } };
		int[][] data = { { 1, 0, 3 }, { 2, 1, 3 }, { 3, 3, 2 }, { 4, 9, 1 }, { 5, 10, 2 } };
		solution(data);

	}

	static int time;

	static public int[] solution(int[][] data) {
		int[] answer = new int[data.length];
		int idx = 0;
		
//        1. 대기중인 문서 중 페이지 수 가장 작은 것 부터
//        2. 페이지 같으면 먼저 들어온 문서부터
//        3. 페이지 요청 시 먼저 대기열에 추가/정렬할 것

		// [문서번호, 인쇄 요청 시각, 페이지 수]
		// 요청시간 순
		PriorityQueue<int[]> pqReq = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[1] - o2[1];
			}
		});
		// 페이지 순
		PriorityQueue<int[]> pqPage = new PriorityQueue<int[]>(new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[2] - o2[2];
			}
		});

		for (int i = 0; i < data.length; i++) {
			pqReq.add(new int[] { data[i][0], data[i][1], data[i][2] });
		}
		time = 0;
		while (!pqReq.isEmpty()) {
			while (true) {
				if (!pqReq.isEmpty() && pqReq.peek()[1] <= time) {
					pqPage.offer(pqReq.poll());
				} else {
					break;
				}
			}
			if (!pqPage.isEmpty()) {
				answer[idx++] = pqPage.peek()[0];
				time += pqPage.poll()[2] - 1;
			}
			while (!pqPage.isEmpty()) {
				pqReq.add(pqPage.poll());
			}
			time++;
		}
		return answer;
	}
}
