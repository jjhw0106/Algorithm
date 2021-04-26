package BruteForce;

public class ExhaustiveSearch {
	public static void main(String[] args) {
		char a[] = { 'a', 'b', 'c', 'd' };
//	배열에서 어떤 값의 첫 번째 마지막 색인찾기

//	배열에 들어있는 정수들의 합 또는 평균 구하기
//	배열에서 최솟값 최댓값 찾기
//	char[]에 저장된 문자열 뒤집기(사본 생성금지)
		for (int i = 0; i < a.length / 2; i++) {
			char temp = a[i];
			a[i] = a[a.length - i - 1];
			a[a.length - i - 1] = temp;
		}

		for (char c : a) {
			System.out.print(c);
		}
	}
}
