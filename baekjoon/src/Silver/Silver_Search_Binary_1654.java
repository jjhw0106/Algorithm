package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Silver_Search_Binary_1654 {
	static int[] lines;
	static long answer=0;
	static int n;
	static int k;
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		k = Integer.parseInt(str.split(" ")[0]); // 가지고 있는 랜선의 수
		n = Integer.parseInt(str.split(" ")[1]); // 잘라야 할 랜선의 수
		lines = new int[k];
		int max = 0;
		for (int i = 0; i < k; i++) {
			lines[i] = Integer.parseInt(br.readLine());
			if (max < lines[i]) {
				max = lines[i];
			}
		}
		bs(1, max);
		System.out.println(answer);
	}

	
	//cf) mid를 int형으로 할 경우, 21억이 들어 갔을 경우, start+end가 int의 범위를 벗어나서 이상한 값이 나온다.
	public static void bs(long start, long end) {
		if (start > end) {
			return;
		}
		long mid = (start + end) / 2; // 랜선 커팅 최대길이
		if(cutting(mid)>=n) {
			if(answer<mid) {
				answer = mid;
			}
			bs(mid+1, end);
		}else {
			bs(start, mid-1);
		}
	}

	public static long cutting(long cuttingLength) {
		long cnt = 0;
		for (int i = 0; i < k; i++) {
			cnt += lines[i] / cuttingLength;
		}
		return cnt;
	}
}
