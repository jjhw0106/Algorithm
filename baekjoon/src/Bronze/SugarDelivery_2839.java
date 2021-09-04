package Bronze;

import java.util.Scanner;

public class SugarDelivery_2839 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("설탕 몇 kg?: ");
		int sugar = scan.nextInt();
		int fiveKG = sugar / 5 + 1;
		int remainBig = sugar - (5 * fiveKG);
		int threeKG = remainBig / 3;
		int remainSmall = sugar - (5 * fiveKG) - (3 * threeKG);
		int min = 0;

		while (fiveKG != 0)

		{
			fiveKG--;
			remainBig = sugar - (5 * fiveKG);
			threeKG = remainBig / 3;
			remainSmall = sugar - (5 * fiveKG) - (3 * threeKG);
			if (remainSmall % 3 == 0)
			{
				min = fiveKG + threeKG;
				System.out.println(min + "봉지");
				break;
			}
			if (fiveKG == 0 && remainSmall % 3 != 0)
			{
				System.out.println(-1);
				break;
			}

		}
	}
}
