package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

//알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.
//
//길이가 짧은 것부터
//길이가 같으면 사전 순으로
//첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 
//둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
//주어지는 문자열의 길이는 50을 넘지 않는다.
public class Silver_1181 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		HashSet<String> set = new HashSet<>();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			set.add(br.readLine());
		}

		ArrayList<String> sList = new ArrayList<>(set);
		Collections.sort(sList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				if (o1.length() - o2.length() != 0)
					return o1.length() - o2.length();
				else
					return o1.compareTo(o2);
			}

		});
		for (String output : sList)
			System.out.println(output);
	}
}
//////////////////////////////////////////////////////////
//	@Override
//	public int compareTo(StringCompare o) {
//		if (this.str.length() != o.str.length()) {
//			return (this.str.length() - o.str.length());
//		} else {
//			return this.str.compareTo(o.str);
//		}
//	}

// 구현해볼것
//	@Override
//	public boolean equals(Object o) {
//		if(o instanceof StringCompare)
//			(StringCompare) o;
//		
//		return true;
//	}
//////////////////////////////////////////////////////////
