import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String rightStr="";
		int right=str.length()-1;
		System.out.println(reverseString(str, rightStr, right));
	}

	static String reverseString(String str, String rightStr, int right) {
		
		if(right < 0 ) {
			return rightStr;
		}
		
		rightStr += str.charAt(right);
		
		return reverseString(str, rightStr, right-1);
	}
}
