import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NHNCommerce_4 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String arr[] = str.split(" ");
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
