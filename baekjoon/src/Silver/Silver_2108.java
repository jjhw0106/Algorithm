package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//산술평균 : N개의 수들의 합을 N으로 나눈 값
//중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
//최빈값 : N개의 수들 중 가장 많이 나타나는 값
//범위 : N개의 수들 중 최댓값과 최솟값의 차이
public class Silver_2108 {
	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int nums[] = new int[num];
		int sum = 0;
		int counting[] = new int[8001];
		for (int i = 0; i < num; i++) {
			int a = Integer.parseInt(br.readLine());
			nums[i] = a;
			counting[a + 4000]++;
			sum += nums[i];
		}
		
		int max = -10000;
		int mode=0;
		boolean flag=false;
		for (int i = 0; i < counting.length; i++) {
			if (counting[i] > max ) {
				max = counting[i];
				mode=i;
				flag=true;
			}else if(counting[i]==max && flag==true){
				mode=i;
				flag=false;
			}
		}
		

		Arrays.sort(nums);

		System.out.println(Math.round((double) sum / num));
		System.out.println(nums[num / 2]);
		System.out.println(mode-4000);
		System.out.println(nums[nums.length - 1] - nums[0]);

	}
}