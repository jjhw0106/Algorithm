package kakaoIntership;

import java.util.ArrayList;
import java.util.Stack;

public class SelectAndDelete {
	public static void main(String[] args) {
		int n = 8;
		int k = 2;
//		String[] cmd = { "U 2", "U 2", "U 2", "U 2", "U 4", "C", "U 2", "Z", "Z", "D 4", "C" };
//		String[] cmd = { "D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C" };
		String[] cmd = { "D 2","C","U 3","C","D 4","C","U 2","Z","Z","U 1","C"};
		solution(n, k, cmd);
	}

	static public String solution(int n, int k, String[] cmd) {
		String answer = "";

		boolean[] origin = new boolean[n];

		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		

		Stack<Integer> deleted = new Stack<Integer>();

		for (int i = 0; i < cmd.length; i++) {
			if (cmd[i].substring(0, 1).equals("D")) {
				k += Integer.parseInt(cmd[i].substring(2));
			} 
			
			else if (cmd[i].substring(0, 1).equals("U")) {
				k -= Integer.parseInt(cmd[i].substring(2));
			} 
			
			else if (cmd[i].equals("C")) {
				deleted.push(list.get(k));
				list.remove(k);
				if (k == list.size()) {
					k = list.size() - 1;
				}
			} 
			
			else if (cmd[i].equals("Z")) {
				if (k > deleted.peek()) {
					k++;
				}
				if (deleted.peek() >= list.size())
					list.add(list.size(), deleted.pop());
				else {
					list.add(deleted.peek(), deleted.pop());
				}
			}
		}
		for (int i = 0; i < list.size(); i++) {
			
			origin[list.get(i)] = true;
		}
		for (boolean bool : origin) {
			if (bool == true) {
				answer += "O";
			} else {
				answer += "X";
			}
		}
		System.out.println(answer);
		return answer;
	}
}

//static public String solution(int n, int k, String[] cmd) {
//	String answer = "";
//	
//	boolean[] origin = new boolean[n];
//	
//	ArrayList<Integer> list = new ArrayList<Integer>();
//	for (int i = 0; i < n; i++) {
//		list.add(i);
//	}
//	
//	Stack<Integer> deleted = new Stack<Integer>();
//	
//	for (int i = 0; i < cmd.length; i++) {
//		if (cmd[i].substring(0, 1).equals("D")) {
////				if (k >= list.size() - 1) {
////					continue;
////				}
//			k += Integer.parseInt(cmd[i].substring(2));
////				if (k >= list.size()) {
////					k = list.size() - 1;
////				}
//		} else if (cmd[i].substring(0, 1).equals("U")) {
////				if (k == 0) {
////					continue;
////				}
////				if (k <= Integer.parseInt(cmd[i].substring(2))) {
////					k = 0;
////					continue;
////				}
//			k -= Integer.parseInt(cmd[i].substring(2));
//		} else if (cmd[i].equals("C")) {
////				if (list.isEmpty()) {
////					break;
////				}
//			deleted.push(list.get(k));
//			list.remove(k);
//			if (k == list.size()) {
//				k = list.size() - 1;
//			}
//		} else if (cmd[i].equals("Z")) {
////				if (deleted.isEmpty()) {
////					continue;
////				}
//			if (k > deleted.peek()) {
//				k++;
//			}
//			if (deleted.peek() >= list.size())
//				list.add(list.size(), deleted.pop());
//			else {
//				list.add(deleted.peek(), deleted.pop());
//			}
//		}
//	}
//	for (int i = 0; i < list.size(); i++) {
//		origin[list.get(i)] = true;
//	}
//	for (boolean bool : origin) {
//		if (bool == true) {
//			answer += "O";
//		} else {
//			answer += "X";
//		}
//	}
//	System.out.println(answer);
//	return answer;
//}
//}