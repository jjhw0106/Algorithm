import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		int[][] needs = {  { 1, 1, 0 }, { 1, 0, 1 }, { 1, 1, 0 }, { 0, 1, 1 }};
		int r = 2;
		solution(needs, r);
	}

	static public int solution(int[][] needs, int r) {
		int answer = 0;
		String count[] = new String[needs.length];
		
		//2진법 각 자릿수를 String 10진법으로(숫자 사이 0은 제거)
		for (int i = 0; i < needs.length; i++) {
			String toDec = "";
			int temp = 1;
			for (int j = 0; j < needs[i].length; j++) {
				if (needs[i][j] == 1) {
					toDec += String.valueOf((int) Math.pow(2, j));
				} else {
					toDec += "";
				}
			}
			count[i] = toDec;
		}
		
		//로봇대수가 덜 필요한 작업을 더 많이 필요한 작업과 같은 숫자르 맞춰줌
		for (int i = 0; i < count.length; i++) {
			for (int j = 0; j < count.length; j++) {
				if (count[j].contains(count[i])) {
					count[i] = count[j];
				}
			}
		}

		
		//String배열로 된 숫자를 int배열로 변환
		int[] toInt = new int[count.length];
		for (int i = 0; i < count.length; i++) {
			toInt[i] = Integer.parseInt(count[i]);
		}
		Arrays.sort(toInt);

		for (int i : toInt) {
			System.out.println(i);
		}
		System.out.println(countDup(toInt));
		answer = countDup(toInt);
		return answer;
	}

	static public int countDup(int[] toInt) {
		int check = toInt[0];
		int count = 0;
		int max = count;

		for (int i = 0; i < toInt.length; i++) {
			if (check == toInt[i]) {
				count++;
				if (count > max) {
					max = count;
				}
			} else {
				check = toInt[i];
				count = 1;
			}
		}

		return max;
	}
}
