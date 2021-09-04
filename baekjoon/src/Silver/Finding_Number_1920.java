package Silver;

import java.util.Scanner;
import java.util.Random;

public class Finding_Number_1920 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random ran = new Random();


		

		int[] data = null;
		int[] answer = null;


		// end = data[count-1];
		// start = 0;
		// mid = (end-start)/2;
		// answer[idx]이 mid면 1(target = 1)출력하고 idx++
		// answer[idx]가 mid보다작으면 end=mid
		//

		while (true)
		{
			System.out.print("n : ");
			int n = scan.nextInt();
			data = new int[n];
			System.out.print("값을 입력하세요: ");
			for (int i = 0; i < n; i++)
				data[i] = scan.nextInt();

			System.out.print("m : ");
			int m = scan.nextInt();
			answer = new int[m];

			int[] check = new int[m];
			System.out.print("값을 입력하세요: ");
			for (int i = 0; i < m; i++)
				answer[i] = scan.nextInt();

			for (int i = 0; i < m; i++)
				for (int j = 0; j < n; j++)
				{
					if (answer[i] == data[j])
					{

						check[i] = 1;
						break;
					}

					else
						check[i] = 0;
				}
			for (int i = 0; i < m; i++)
				System.out.println(check[i]);
			
			break;
		}

	}
}
