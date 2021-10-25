package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Silver_Greedy_1946 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int total = Integer.parseInt(br.readLine());

		for (int k = 0; k < total; k++) {
			int num = Integer.parseInt(br.readLine());
			int[] arr = new int[num + 1];

			for (int i = 1; i < num + 1; i++) {
				String temp = br.readLine();
				arr[Integer.parseInt(temp.split(" ")[0])] = Integer.parseInt(temp.split(" ")[1]);
			}
			int std = arr[1];
			int cnt = 1;
			for (int i = 1; i < num + 1; i++) {
				if (arr[i] < std) {
					std = arr[i];
					cnt++;
				}
			}
			System.out.println(cnt);

		}

		// 시간초과
//		for (int k = 0; k < total; k++) {
//			list.clear();
//			int num = Integer.parseInt(br.readLine());
//			for (int i = 0; i < num; i++) {
//				String temp = br.readLine();
//				list.add(new int[] { Integer.parseInt(temp.split(" ")[0]), Integer.parseInt(temp.split(" ")[1]) });
//			}
//			Collections.sort(list, new Comparator<int[]>() {
//				@Override
//				public int compare(int[] o1, int[] o2) {
//					return o1[0] - o2[0];
//				}
//			});
//			for (int i = 0; i < list.size(); i++) {
//				int standard = list.get(i)[1];
//				for (int j = i + 1; j < list.size(); j++) {
//					if (list.get(j)[1] > standard) {
//						list.remove(j--);
//					}
//				}
//			}
//			answerList.add(list.size());
//		}
//		for (Integer integer : answerList) {
//			System.out.println(integer);
//		}
	}
}
