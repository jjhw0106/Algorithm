package Silver;

public class Silver_4673 {

	static int noSn(int num) {
		int sum = num;
		while (true) {
			sum += num % 10;
			num /= 10;
			if (num == 0) {
				break;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 10000;
		boolean check[] = new boolean[n];
		for (int i = 0; i < check.length; i++) {
			if (noSn(i + 1) < 10000) {
				check[noSn(i + 1)] = true;
			}
		}
		for (int i = 0; i < check.length; i++) {
			if (check[i] == false&&i!=0)
				System.out.println(i);
		}
	}
}
