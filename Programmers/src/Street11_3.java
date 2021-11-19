import java.io.IOException;
import java.util.Arrays;

public class Street11_3 {
	public static void main(String[] args) throws IOException {
		System.out.println(solution(56));
	}

	// 1억 넘어가면 -1, 입력받은 숫자 조합 중 가장 큰 수 반환
	static public int solution(int N) {
		if (N > 100000000) {
			return -1;
		}
		String temp = String.valueOf(N);
		int[] arr = new int[temp.length()];
		for (int i = 0; i < temp.length(); i++) {
			arr[i] = Integer.parseInt(temp.split("")[i]);
		}
		Arrays.sort(arr);
		String a = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			a += arr[i];
		}
		return Integer.parseInt(a);
	}
}
