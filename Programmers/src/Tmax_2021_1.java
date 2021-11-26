
public class Tmax_2021_1 {
	public static void main(String[] args) {
		System.out.println(solution(21));
	}

	public static int solution(int num) {
		int answer = 0;
		while (true) {
			String temp = String.valueOf(num);
			int[] arr = new int[temp.length()];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(temp.split("")[i]);
			}
			int left = 1;
			int right = 1;
			for (int i = 0; i < arr.length / 2; i++) {
				left *= arr[i];
				right *= arr[i + arr.length / 2];
			}
			if (left == right) {
				answer = num;
				break;
			} else
				num++;
		}
		return answer;
	}
}
//
//public class Tmax_2021_1 {
//	public static void main(String[] args) {
//		System.out.println(solution(21));
//	}
//	
//	public static int solution(int num) {
//		int answer = 0;
//		String temp = String.valueOf(num);
//		int[] arr = new int[temp.length()];
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] = Integer.parseInt(temp.split("")[i]);
//		}
//		int left = 1;
//		int right = 1;
//		for (int i = 0; i < arr.length / 2; i++) {
//			left*=arr[i];
//			right*=arr[i+arr.length/2];
//		}
//		if(left==right) {
//			System.out.println(num);
//			return num;
//		}else {
//			solution(num+1);
//		}
//		return -1;
//	}
//}
