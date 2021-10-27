package Gold;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class Gold_Greedy_PriorityQ_1202 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int k = Integer.parseInt(temp[1]);
		long answer = 0;
		List<int[]> list = new ArrayList<int[]>();
		List<Integer> bags = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			temp = br.readLine().split(" ");
			int[] jewel = new int[] { Integer.parseInt(temp[0]), Integer.parseInt(temp[1]) };
			list.add(jewel);
		}

		Collections.sort(list, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}
		});

		for (int i = 0; i < k; i++) {
			int c = Integer.parseInt(br.readLine());
			bags.add(c);
		}

		Collections.sort(bags, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
		});

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		int idx = 0;
		for (Integer integer : bags) {
			while (idx<n&&list.get(idx)[0] <= integer) {
				pq.add(list.get(idx++)[1]);
			}
			if (!pq.isEmpty())
				answer += pq.poll();
		}
		System.out.println(answer);
		// 시간초과
		// jewel을 300000으로 할당 후 보석의 무게를 idx, 값어치를 jewel[idx]의 값으로 초기화
		// 가방의 최대무게를 입력받고 그 무게이하의 jewel의 값을 탐색하며 max값을 answer에 더함
//		int[] jewel = new int[300001];
//		for (int i = 0; i < n; i++) {
//			temp = br.readLine().split(" ");
//			jewel[Integer.parseInt(temp[0])] = Integer.parseInt(temp[1]);
//		}
//
//		int answer = 0;
//		for (int i = 0; i < k; i++) {
//			int capa = Integer.parseInt(br.readLine());
//			int max = 0;
//			int idx = 0;
//			for (int j = capa; j >= 1; j--) {
//				if (jewel[j] != 0) {
//					if (max < jewel[j]) {
//						max = jewel[j];
//						idx = j;
//					}
//				}
//			}
//			answer += max;
//			jewel[idx] = 0;
//		}
//		System.out.println(answer);
	}
}
