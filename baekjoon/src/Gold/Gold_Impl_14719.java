package Gold;

import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;

public class Gold_Impl_14719 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int h = Integer.parseInt(str.split(" ")[0]);
		int w = Integer.parseInt(str.split(" ")[1]);

		String ground = br.readLine();
		StringTokenizer st = new StringTokenizer(ground, " ");
		int answer = 0;
		int[] arr = new int[w];
		for (int i = 0; i < w; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		// 왼쪽과 오른쪽 값을 비교하여 더 작은 수를 기준으로 빗물의 수량을 체크함
		for (int j = 1; j < w - 1; j++) {
			int l = searchLTop(arr, j);
			int r = searchRTop(arr, j);

			int shorter = l > r ? r : l;
			if (!(shorter - arr[j] <= 0)) {	// 현재 인덱스의 땅이 제일 높은 경우 음수가 나온다
				answer += shorter - arr[j];
			}
		}
		if (answer <= 0)
			answer = 0;
		System.out.println(answer);
	}

	
	
	static int searchLTop(int[] arr, int cur) {
		int max = 0;
		for (int i = 0; i < cur; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}

	static int searchRTop(int[] arr, int cur) {
		int max = 0;
		for (int i = cur; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
