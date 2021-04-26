package Recursive;

public class FibonacciRecursive {
	public static void main(String[] args) {
		int number = 10;
		System.out.println(fibo(number));

	}

	public static int fibo(int number) {
		if (number <= 1)
			return number;
		return fibo(number - 1) + fibo(number - 2);
	}
}
