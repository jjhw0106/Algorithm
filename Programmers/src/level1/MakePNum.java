package level1;

import java.util.ArrayList;
import java.util.List;

public class MakePNum {
	public static void main(String[] args) {
		int[] nums = { 1, 2, 7, 6, 4 };
		solution(nums);
	}

	static public int solution(int[] nums) {
		ArrayList<Integer> sosu = new ArrayList<>();
		int answer = 0;
		sosu = (ArrayList<Integer>) sosuPick();
		int[] pick = pickThree(nums);
		for (int i = 0; i < pick.length; i++)
			if (sosu.contains(pick[i])) {
				answer++;
			}
		System.out.println(answer);
		return answer;
	}

	static public List<Integer> sosuPick() {
		ArrayList<Integer> list = new ArrayList<>();

		list.add(2);
		list.add(3);

		for (int i = 4; i < 2997; i++) {
			boolean check = true;
			for (int j = 0; j < list.size(); j++) {
				if (i % list.get(j) == 0) {
					check = false;
					break;
				}
			}
			if (check == true)
				list.add(i);
		}

		// 리스트를 int[] 배열로 넣기 위해선, stream API 사용.
		// arr = list.stream().mapToInt(i->i).toArray(); =>공부할 것

		return list;
	}

	static public int[] pickThree(int[] nums) {
		int sum[] = new int[((nums.length * (nums.length - 1) * (nums.length - 2) / 6))];
		int idx = 0;
		for (int i = 0; i < nums.length - 2; i++) {
			for (int j = i + 1; j < nums.length - 1; j++) {
				for (int k = j + 1; k < nums.length; k++) {
					sum[idx] = nums[i] + nums[j] + nums[k];
					idx++;
				}
			}
		}
		return sum;
	}
}
