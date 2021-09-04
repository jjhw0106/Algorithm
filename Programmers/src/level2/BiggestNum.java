package level2;

import java.util.Arrays;
import java.util.Comparator;

//	0 또는 양의 정수가 주어졌을 때, 
//	정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.
//
//	예를 들어, 주어진 정수가 [6, 10, 2]라면 
//	[6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.
//
//	0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 
//	순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 
//	return 하도록 solution 함수를 작성해주세요.
public class BiggestNum {
	public static void main(String[] args) {
		int[] num = { 0, 0, 0, 0, 0 };
		solution(num);
	}

	static public String solution(int[] numbers) {
		String answer = "";
		// 문자열의 compareTo는 사전순으로 정렬한다.=> ******
		String getNumbers[] = new String[numbers.length];

		int idx = 0;
		for (int num : numbers) {
			getNumbers[idx++] = String.valueOf(num);
		}
		Arrays.sort(getNumbers, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return ((o1 + o2).compareTo(o2 + o1)) * -1;
			}
		});

		if (getNumbers[0].equals("0"))
			return "0";

		for (String string : getNumbers) {
			answer += string;
		}
		return answer;
	}
}
//	// 1. 첫번째 자릿수가 제일 큰 수고르기 int bigFirst[]
//	// 2. 정렬
//	// 3. bigFirst에서 제일 큰 수와 제일 작은 수 연결한 수 앞,뒤 바꿔 번갈아 비교
//	// 4. 큰 경우의 앞자리 수 answer+=에 남겨논 후 위 과정 반복
//
//	static public String solution(int[] numbers) {
//		String answer = "";
//		int sum = 0;
//		for (int i : numbers) {
//			sum += i;
//		}
//		if (sum == 0)
//			return "0";
//
//		ArrayList<String> intToString = new ArrayList<String>();
//		int idx = 0;
//		for (int i : numbers) {
//			intToString.add(String.valueOf(i));
//		}
//
//		while (true) {
//			ArrayList<Integer> bigFirst = findBigFirst(intToString);
//			String temp = String.valueOf(compareNum(bigFirst));
//			answer += temp;
//			bigFirst.clear();
//			intToString.remove(intToString.indexOf(temp));
//			if (intToString.isEmpty())
//				break;
//		}
//		System.out.println(answer);
//		return answer;
//	}
//
//	static public ArrayList<Integer> findBigFirst(ArrayList<String> numbers) {
//		int max = 0;
//		ArrayList<Integer> bigFirst = new ArrayList<Integer>();
//		for (String str : numbers) {
//			if (str.charAt(0) >= max)
//				max = (int) str.charAt(0);
//		}
//		for (String str : numbers) {
//			if ((int) str.charAt(0) == max) {
//				bigFirst.add(Integer.parseInt(str));
//			}
//		}
//		return bigFirst;
//	}
//
//	static public int compareNum(ArrayList<Integer> bigFirst) {
//		Collections.sort(bigFirst);
//		String forward = String.valueOf(bigFirst.get(0));
//		String backward = String.valueOf(bigFirst.get(bigFirst.size() - 1));
//		int case1 = Integer.parseInt(forward + backward);
//		int case2 = Integer.parseInt(backward + forward);
//
//		return case1 >= case2 ? bigFirst.get(0) : bigFirst.get(bigFirst.size() - 1);
//	}
//}
