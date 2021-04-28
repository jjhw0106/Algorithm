package Recursive;

public class FibonacciRecursive {
	public static void main(String[] args) {
		
		int a = 10;
		System.out.println(fibo(a));
	}
	
	public static int fibo(int a) {
		if(a <=1)
			return a;
		
		return fibo(a-1)+fibo(a-2);
	}
}
