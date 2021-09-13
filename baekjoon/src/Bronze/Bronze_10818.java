package Bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Bronze_10818 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int repeat = Integer.parseInt(br.readLine());
		int[] arr= new int[repeat];
		String str = br.readLine();
		StringTokenizer st = new StringTokenizer(str, " ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		System.out.println(arr[0]+" "+arr[arr.length-1]);
	}
}
//import java.io.*;
//import java.util.Arrays;
//
//public class Bronze_10818 {
//    static BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
//
//    public static void main(String[] args) throws IOException {
//        StringBuilder result = new StringBuilder();
//
//        int n = readInt();
//
//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
//        for (int i = 0; i < n; i++) {
//            int a = readInt();
//
//            if (a > max) {
//                max = a;
//            }
//
//            if (a < min) {
//                min = a;
//            }
//        }
//
//        result.append(min);
//        result.append(' ');
//        result.append(max);
//        result.append('\n');
//
//        bufferedWriter.write(result.toString());
//        bufferedWriter.flush();
//    }
//
//    static int readInt() throws IOException {
//        boolean isNegative = false;
//        int sum = 0;
//        while (true) {
//            int input = System.in.read();
//            if (input == '\n' || input == ' ') {
//                return isNegative ? -1 * sum : sum;
//            } else if (input == '-') {
//                isNegative = true;
//            } else {
//                sum = (sum * 10) + (input - '0');
//            }
//        }
//    }
//}
