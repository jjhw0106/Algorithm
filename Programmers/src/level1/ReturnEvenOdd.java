package level1;

public class ReturnEvenOdd {
	public static void main(String[] args) {
		int num = 0;
		System.out.println(solution(num));
	}

	static public String solution(int num) {
		return num % 2 == 0 ? "Even" : "Odd";
	}
}
