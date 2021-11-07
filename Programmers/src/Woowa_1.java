import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Woowa_1 {
	public static void main(String[] args) throws IOException {

		int[] arr = { 1, 2, 3 };

		solution(arr);
	}

	static public int[] solution(int[] arr) {
		int[] answer = {};
		int[] box = new int[3];
		int max = 0;

		for (int i = 0; i < arr.length; i++) {
			box[arr[i] - 1]++;
			if (box[arr[i] - 1] > max) {
				max = box[arr[i] - 1];
			}
		}

		answer = new int[box.length];
		for (int i = 0; i < box.length; i++) {
			answer[i] = max - box[i];
		}

		return answer;
	}
}
