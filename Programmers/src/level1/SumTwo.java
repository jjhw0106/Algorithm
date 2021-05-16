package level1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class SumTwo {
	public static void main(String[] args) {

		int[] numbers = { 7, 2, 0, 5 };
		System.out.println(solution(numbers));

	}

	static public int[] solution(int[] numbers) {
		TreeSet<Integer> tset = new TreeSet<>();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i+1; j < numbers.length; j++) {
				tset.add(numbers[i]+numbers[j]);
			}
		}
		int[] answer = new int[tset.size()];
		int idx = 0;
		for (int treeVal : tset) {
			answer[idx++] = treeVal;
		}
		for (int i = 0; i < answer.length; i++) {
			System.out.println(answer[i]);
		}

		return answer;
	}

//	treeSet //////////////////////////////////////

//	hashSet //////////////////////////////////////
//	static public int[] solution(int[] numbers) {
//		int[] answer;
//
//		HashSet<Integer> set = new HashSet<>();
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = i + 1; j < numbers.length; j++) {
//				set.add(numbers[i] + numbers[j]);
//			}
//		}
//		answer = new int[set.size()];
//		int idx = 0;
//		for (Integer i : set) {
//			answer[idx++] = i;
//		}
//		Arrays.sort(answer);
//		return answer;
//	}

}

//public class SumTwo {
//	public static void main(String[] args) {
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] numbers = new int[n];
//		for (int i = 0; i < n; i++) {
//			numbers[i] = sc.nextInt();
//		}
//		solution(numbers);
//	}
//
//	static public int[] solution(int[] numbers) {
//		int[] answer = {};
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		for (int i = 0; i < numbers.length - 1; i++)
//			for (int j = i + 1; j < numbers.length; j++)
//				if (!arr.contains(numbers[i] + numbers[j]))
//					arr.add(numbers[i] + numbers[j]);
//
//		answer = new int[arr.size()];
//		for (int i = 0; i < answer.length; i++) {
//			answer[i] = arr.get(i);
//		}
//
//		Arrays.sort(answer);
//		for (int j = 0; j < answer.length; j++) {
//			System.out.print(answer[j]);
//			if(j!=answer.length-1)
//			System.out.print(",");
//		}
//		
//		return answer;
//	}
//
//}