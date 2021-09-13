package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bronze_1546 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		double[] scores = new double[n];
		double max =0;
		for (int i = 0; i < n; i++) {
			scores[i] = Integer.valueOf(st.nextToken());
			if(scores[i]>max) {
				max = scores[i];
			}
		}
		float newTotal = 0;
		for(int i=0; i<n; i++) {
			newTotal += (scores[i]*100)/max;
		}
		System.out.println(newTotal/n);
	}
}
