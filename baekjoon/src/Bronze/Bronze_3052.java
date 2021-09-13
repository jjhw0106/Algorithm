package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Bronze_3052 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0; i<10; i++) {
			set.add(Integer.parseInt(br.readLine())%42);
		}
		System.out.println(set.size());
	}
}
