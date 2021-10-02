import java.util.Arrays;

public class Memo {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b;
		int[] c = { 2, 3, 4, 2, 1 };
		b = a;
		a = c;
		System.out.println(Arrays.toString(b));
	}
}
