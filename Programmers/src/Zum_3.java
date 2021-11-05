import java.io.IOException;

public class Zum_3 {
	public static void main(String[] args) throws IOException {
		int[] data = { 6, 5, 7, 3, 4, 2 };
		System.out.println(solution(data));
	}

	static public int solution(int[] histogram) {
		int answer = -1;

		int max = 0;

		int left = 0;
		int right = 0;
		int width = 0;
		int height = 0;
		
		//최악 : 10,000,000,000(n^2) => n*(n-i) => o(n)?
		for (int i = 0; i < histogram.length - 2; i++) {
			left = histogram[i];
			for (int j = i + 2; j < histogram.length; j++) {
				right = histogram[j];
				height = (left > right) ? right : left;
				width = Math.abs(i - j)-1;
				if(width*height>max) {
					max=width*height;
				}
			}
		}
		answer=max;
		return answer;
	}
}
