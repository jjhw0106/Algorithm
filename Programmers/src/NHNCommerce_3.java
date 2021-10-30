import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class NHNCommerce_3 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int n = Integer.parseInt(input.split(" ")[0]);
		int m = Integer.parseInt(input.split(" ")[1]);
		int k = Integer.parseInt(input.split(" ")[2]);

		int[][] blocks = new int[n][m];

		Map<int[], Integer> map = new HashMap<int[], Integer>();

		// blocks의 n번째 위치에 레이져
		// blocks의 각 요소에서 n까지의 거리를 map에 대입
		// 합이 k가 되는 조합 중 가장 큰 값을 출력
		for (int i = 0; i < n; i++) {
			String[] row = br.readLine().split(" ");
			for (int j = 0; j < m; j++) {
				blocks[i][j] = Integer.parseInt(row[j]);
				map.put(new int[] { i, j }, m - j+1);
			}
		}
	}
}