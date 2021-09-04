package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;

public class Silver_10814_OrderByAge {
	static class Name {
		int age;
		String name;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Name> list = new ArrayList<>();

		String name = "";
		for (int i = 0; i < n; i++) {
			Name temp = new Name();
			temp.age = Integer.parseInt(br.readLine());
			temp.name = br.readLine();
			list.add(temp);
		}

	}

	static public void solution() {

	}
}
