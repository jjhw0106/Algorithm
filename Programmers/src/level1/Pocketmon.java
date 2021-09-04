package level1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Pocketmon {
	public static void main(String[] args) {
		int[] poc = { 3,3,3,2,2,4};
		System.out.println(solution(poc));
	}

	static public int solution(int[] nums) {
		int answer = 0;
		int size = nums.length / 2;
		int max = 0;
		HashSet<Integer> set = new HashSet<>();
		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}
		if (set.size() >= size)
			answer = size;
		else
			answer = set.size();

		return answer;
	}
}
