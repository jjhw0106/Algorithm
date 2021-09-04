package level1;

public class TernaryConversion {
	public static void main(String[] args) {
		System.out.println(solution(45));
	}

	static public int solution(int n) {
		int answer = 0;
		String ternary = Integer.toString(n, 3);
		StringBuilder sb = new StringBuilder(ternary);
		String reversed = sb.reverse().toString();

		int exp = 0;
		for (int i = reversed.length() - 1; i >= 0; i--) {
			answer += Integer.parseInt(String.valueOf(reversed.charAt(i))) * Math.pow(3, exp);
			exp++;
		}

		return answer;
	}
}

//package level1;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import com.sun.source.tree.ForLoopTree;
//
//public class TernaryConversion {
//	public static void main(String[] args) {
//		System.out.println(solution(45));
//	}
//	
//	static public int solution(int n) {
//		int answer = toDecimal(toTernary(n));
//		return answer;
//	}
//	
//	static public ArrayList<Integer> toTernary(int n) {
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		while (true) {
//			list.add(n % 3);
//			n /= 3;
//			if (n == 0)
//				break;
//		}
//		return list;
//	}
//	
//	static public int toDecimal(ArrayList<Integer> list) {
//		int idx = list.size() - 1;
//		int num;
//		int value = 0;
//		while (true) {
//			num = list.get(idx);
//			for (int i = list.size() - 2; i >= idx; i--) {
//				num *= 3;
//			}
//			value += num;
//			idx--;
//			if (idx < 0)
//				break;
//		}
//		return value;
//	}
//}
