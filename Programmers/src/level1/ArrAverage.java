package level1;

//정수를 담고 있는 배열 arr의 평균값을 return하는 함수, solution을 완성해보세요.
public class ArrAverage {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4 };
		System.out.println(solution(arr));
	}

	static public double solution(int[] arr) {
		double answer = 0;
		int sum = 0;
		for (int i : arr) {
			sum = i;
		}

		return sum / arr.length;
	}
}
