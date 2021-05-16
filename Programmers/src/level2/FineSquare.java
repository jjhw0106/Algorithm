package level2;

public class FineSquare {
	public static void main(String[] args) {
		int w = 8;
		int h = 12;
		System.out.println(solution(w, h));
	}

	static public long solution(int w, int h) {
		int small = (w < h ? w : h);
		int big = (w > h ? w : h);
		int gcd = 0;
		for (int i = 1; i < small; i++) {
			if (small % i == 0) {
				gcd = i;
			}
		}
//		1.
		big /= gcd;
		small /= gcd;
//		2.
		int move = big + small ;
		move *= gcd;

//		1. 최대공약수사이즈로 바꾸기
//		2. 가로 몇칸 세로 몇칸 갔는지? -1 ==> 이해 안감
//		3. 2번에 최대공약수 곱한 뒤

		return w * h - move;
	}

}
