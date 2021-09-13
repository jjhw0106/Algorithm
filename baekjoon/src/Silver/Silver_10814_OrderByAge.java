package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person implements Comparator<Object>{
	int age;
	String name;
	@Override
	public int compare(Object o1, Object o2) {
		
		return o1.age - o2.age;
	}
	
}

public class Silver_10814_OrderByAge {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		List<Person> list = new ArrayList<Person>();
		
		for(int i=0; i<n; i++) {
			String[] arr=br.readLine().split(" ");
			Person person = new Person();
			person.age = Integer.parseInt(arr[0]);
			person.name = arr[1];
			list.add(person);
		}
		Collections.sort(list, Comparator<Person>);
	}
}
