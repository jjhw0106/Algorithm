package kakaoIntership;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class NumberPlay {
	public static void main(String[] args) {
		solution("23four5six7");
	}

	static public int solution(String s) {
		int answer = 0;
		Queue<String> strQ = new LinkedList<String>();
		for (int i = 0; i < s.length(); i++) {
			strQ.offer(s.substring(i, i + 1));
		}
		ArrayList<String> list = new ArrayList<String>();
		list.add("zero");
		list.add("one");
		list.add("two");
		list.add("three");
		list.add("four");
		list.add("five");
		list.add("six");
		list.add("seven");
		list.add("eight");
		list.add("nine");
		
		String tempAns = "";
		String getStr = "";

		while (!strQ.isEmpty()) {
			if (strQ.peek().charAt(0) < 65) {
				tempAns += strQ.poll();
				continue;
			}
			getStr += strQ.poll();
			if (getStr.length() >= 3 && list.contains(getStr)) {
				if(getStr.equals("zero")) 		{tempAns += "0"; getStr = "";}
				else if(getStr.equals("one")) 	{tempAns+="1"; getStr="";}
				else if(getStr.equals("two")) 	{tempAns+="2"; getStr="";}
				else if(getStr.equals("three")) {tempAns+="3"; getStr="";}
				else if(getStr.equals("four")) 	{tempAns+="4"; getStr="";}
				else if(getStr.equals("five")) 	{tempAns+="5"; getStr="";}
				else if(getStr.equals("six")) 	{tempAns+="6"; getStr="";}
				else if(getStr.equals("seven")) {tempAns+="7"; getStr="";}
				else if(getStr.equals("eight")) {tempAns+="8"; getStr="";}
				else if(getStr.equals("nine")) 	{tempAns+="9"; getStr="";}
			}
		}
		answer = Integer.parseInt(tempAns);
//		System.out.println(answer);
		return answer;
	}

}
