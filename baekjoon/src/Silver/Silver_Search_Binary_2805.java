package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_Search_Binary_2805 {
	static Integer height[];
	static int maxHeight=0; //절단기의 최대높이
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int n = Integer.parseInt(str.split(" ")[0]);	// 나무의 수
		int m = Integer.parseInt(str.split(" ")[1]);	// 가져갈 나무 m
		height = new Integer[n];
		String temp = br.readLine();
		String[] temp2 = temp.split(" ");
		int max = 0;
		for (int i = 0; i < n; i++) {
			height[i] = Integer.parseInt(temp2[i]);
			if(max<height[i]) max=height[i];
		}
		bs(m, 0, max);
		System.out.println(maxHeight);
	}

	public static void bs(int m, int start, int end) {
		if(start>end) return;
		int mid = (start + end) / 2;
		if (getM(mid) >= m ) { // 이전작업에서 얻은 나무길이와 현재 작업에서 얻은 나무길이가 같으면 return
			if(maxHeight<mid) {
				maxHeight = mid;
			}
			bs(m, mid + 1, end);
		}else
		{
			bs(m,start,mid-1);
		}
	}

	public static long getM(int mid) {
		long sum = 0;
		for (int i = 0; i < height.length; i++) {
			sum += height[i] >= mid ? (height[i] - mid) : 0;
		}
		return sum;
	}
}
