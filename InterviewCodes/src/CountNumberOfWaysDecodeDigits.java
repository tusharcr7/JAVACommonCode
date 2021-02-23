package code;

import java.util.Scanner;

public class CountNumberOfWaysDecodeDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int n = s.length();
		int now[] = new int[n + 1];
		now[0] = 1;
		now[1] = 1;
		for (int i = 1; i < n; i++) {
			int q = Integer.parseInt(String.valueOf(s.charAt(i)));
			int p = Integer.parseInt(String.valueOf(s.charAt(i-1)));
			if (q <= 26 && q > 0) {
				now[i + 1] = now[i];
			}
			if (((p * 10) + q) <= 26 && ((p * 10) + q) > 0) {

				now[i + 1] += now[i - 1];

			}

		}
		
		
		System.out.println(now[n]);

	}

}
