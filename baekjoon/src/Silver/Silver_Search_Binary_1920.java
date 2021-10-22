package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class Silver_Search_Binary_1920 {
	static int[] target;
	static List<Integer> inputList;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		List<Integer> answer = new ArrayList<Integer>();

		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Set<Integer> inputSet = new HashSet<Integer>();
		inputList = new ArrayList<Integer>();
		while (st.hasMoreTokens()) {
			inputSet.add(Integer.parseInt(st.nextToken()));
		}
		for (Integer integer : inputSet) {
			inputList.add(integer);
		}

		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine(), " ");
		target = new int[m];
		int idx = 0;
		while (st.hasMoreTokens()) {
			target[idx++] = Integer.parseInt(st.nextToken());
		}

		// 정렬
		Collections.sort(inputList);

		// 이분탐색
		// target의 각 요소가 inputList에 있는지 없는지 check
		for (Integer cur : target) {
			binarySearch(cur, 0, inputList.size() - 1);
			if (hit == false)
				System.out.println(0);
			else
				System.out.println(1);
		}
	}

	static boolean hit;

	static void binarySearch(int cur, int start, int end) {
		int mid = (start + end) / 2;
		hit = false;
		if (start > end) {
			return;
		}
		if (cur == inputList.get(mid)) {
			hit = true;
			return;
		} else if (cur < inputList.get(mid)) {
			binarySearch(cur, start, mid - 1);
		} else {
			binarySearch(cur, mid + 1, end);
		}
	}
}

// 시간초과
//		for (int j = 0; j < target.length; j++) {
//			boolean hit = false;
//			for (String val : input) {
//				if ((target[j]).equals(val)) {
//					hit = true;
//					break;
//				}
//			}
//			if (hit == false)
//				answer.add(0);
//			else if (hit == true)
//				answer.add(1);
//		}
//		for (int i : answer) {
//			System.out.println(i);
//		}
