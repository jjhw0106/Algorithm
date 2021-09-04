package NDB_Code;

import java.util.*;

class Student {
	String name;
	int score;
}

public class Chapter6_2 {
	public static void main(String[] args) {
		ArrayList<Student> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			Student temp = new Student();
			temp.name = sc.next();
			temp.score = sc.nextInt();
			list.add(temp);
		}

		int max = 0;
		for (int i = 0; i < list.size(); i++) {
			if (max < list.get(i).score) {
				max = list.get(i).score;
			}
		}

	} 
}
