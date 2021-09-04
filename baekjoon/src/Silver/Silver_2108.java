package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값 : N개의 수들 중 가장 많이 나타나는 값
//범위 : N개의 수들 중 최댓값과 최솟값의 차이
public class Silver_2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Cal c = new Cal();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int num[] = new int[N];
		for (int i = 0; i < num.length; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		System.out.println(c.average(num));
		System.out.println(c.mid(num));
		System.out.println(c.mode(num));
	}

}

class Cal {
	int average(int[] num) {
		int sum = 0;
		for (int i = 0; i < num.length; i++) {
			sum += num[i];
			System.out.println(num[i]);
		}
		return sum / num.length;
	}

	int mid(int[] num) {
		int value = num[num.length / 2];

		return value;
	}

	int mode(int[] num) {
		Arrays.sort(num);
		ArrayList<Integer> list = new ArrayList<Integer>();
		int cnt[] = new int[4001];
		for (int i = 0; i < num.length; i++) {
			cnt[num[i]]++;
		}
		int value = 0;

		for (int i = 0; i < cnt.length; i++) {
			if (value < cnt[i])
				value = cnt[i];
		}
		for (int i = 0; i < cnt.length; i++) {
			if (cnt[i] == value)
				list.add(cnt[i]);
		}
		return list.get(2);
	}
}