

import java.util.Scanner;

public class Rotate90 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[][] = new int[n][n];

		for (int i = 0; i < n; i++)
			for (int j = 0; j < n; j++)
				arr[i][j] = sc.nextInt();

		int r = sc.nextInt(), c = sc.nextInt(), sn = sc.nextInt();
		sc.close();
		System.out.println("Input array:------------");
		printMatricks(arr);
		// Rotate the matrix by 90 degree: Transpose

		for (int i = r; i < r + sn; i++)
			for (int j = i; j < r + sn; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;

			}
		System.out.println("Transpose:------------");
		printMatricks(arr);

		// rotate by 90 degree clock wise

		for (int i = r; i < arr.length; i++) {
			int l = i, rt = r + sn - 1;
			while (l < rt) {
				int temp = arr[i][l];
				arr[i][l] = arr[i][rt];
				arr[i][rt] = temp;
				l++;
				rt--;
			}

		}
		System.out.println("Rotated by 90 degree:------------");
		printMatricks(arr);
	}

	public static void printMatricks(int arr[][]) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println();

		}
	}

}
