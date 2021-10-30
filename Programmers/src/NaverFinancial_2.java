import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.Set;

public class NaverFinancial_2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		solution(3, 10);
	}

	static public void solution(int n, int jump) {
		int[] answer = {};

		int down = n - 1;
		int left = n - 1;
		int up = 0;
		int right = 1;

		Queue<int[]> q = new LinkedList<int[]>();
		int[] arr = new int[n * n];
		int idx = 0;
		arr[idx] = 1;
		int cnt = n * n;
		while (cnt-- > 0) {
			for (int i = 1; i < n * n; i++) {
				idx += jump;
				if (idx >= n * n) {
					idx = idx % (n * n);
				}
				while (arr[idx] != 0) {
					idx += 1;
				}
				

				arr[idx] = i;
			}
		}

		System.out.println(arr.toString());
//		return answer;
	}

}
