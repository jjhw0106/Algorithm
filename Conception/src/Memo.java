import java.util.Arrays;

public class Memo {
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		int[] b;
<<<<<<< HEAD
		int[] c = {2,3,4,2,1};
		b=a;
		a=c;
		System.out.println(Arrays.toString(b));
=======
		int[] c = {5,4,3,2,1};
		b=a;
		a=c;
		System.out.println("a: "+Arrays.toString(a));
		System.out.println("b: "+Arrays.toString(b));
>>>>>>> bde1cbd29957b0d93fc76c988a30473d4625aeae
	}
}
