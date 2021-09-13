import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String str = br.readLine();
//		StringTokenizer st = new StringTokenizer(str,"\n");
		
		int a = Integer.parseInt(br.readLine());
		int b= Integer.parseInt(br.readLine());
		
		int fir=b%10;
		int sec=(b%100)/10;
		int thd=b/100;
		
		System.out.println(a*fir);
		System.out.println(a*sec);
		System.out.println(a*thd);
		System.out.println(a*b);
		br.close();
	}
}
