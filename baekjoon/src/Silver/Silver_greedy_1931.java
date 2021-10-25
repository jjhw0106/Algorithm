package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Silver_greedy_1931 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int cnt = 0;
		// 하나씩 다 돌면서 cnt++ 하고 max값 구해서 반환
		// 끝나는 시간 기준으로 정렬
		List<int[]> reserve = new ArrayList<int[]>();

		for (int i = 0; i < n; i++) {
			String temp = br.readLine();
			reserve.add(new int[] { Integer.parseInt(temp.split(" ")[0]), Integer.parseInt(temp.split(" ")[1]) });
		}
		
		
		
		Collections.sort(reserve, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				int con1 =o1[1]-o2[1];
				if(con1==0) {
					int con2= o1[0]-o2[0];
					return con2;
				} 
				return con1;
			}
		});
		
		
		int temp =0;
		for (int[] is : reserve) { 
			if(is[0]>=temp) {
				cnt++;
				temp=is[1];
			}
		}
		System.out.println(cnt);

	}

}
