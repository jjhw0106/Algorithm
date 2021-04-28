package Recursive;

public class puff {	//
	public static void main(String[] args) {
			puff(4,6,4);
	}
	public static void puff(int n, int a, int b)
	{
	    if (n <= 0) {
	        return;
	    }
	 
	    System.out.println(String.format("%d %d %d", n, a, b));
	 
	    puff(n - 3, a, b + n);
	    puff(n - 1, b, a + n);
	    puff(n - 2, b, a + n);
	}

}
