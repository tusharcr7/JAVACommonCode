

import java.util.Scanner;

public class ResortArrWithAbsoluteValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		// find positive index
		int posIndex = 0;
		boolean t = false;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 0) {
				posIndex = i;
				t = true;
				break;
			}
		}

		if (t) {

			if (posIndex != 0) {
				int nls = posIndex - 1, postLs = arr.length - 1;

				// reverse the negative part of array
				int l = 0, r = posIndex - 1;
				while (l < r) {
					int temp = arr[l];
					arr[l] = arr[r];
					arr[r] = temp;
					l++;
					r--;
				}
				int pt1 = 0, pt2 = posIndex;
				int N[] = new int[arr.length];
				int count = 0;
				while (pt1 < posIndex && pt2 < arr.length) {

					if ((-1 * arr[pt1]) < arr[pt2]) {
						N[count++] = -1 * arr[pt1++];
					} else if ((-1 * arr[pt1]) > arr[pt2]) {
						N[count++] = arr[pt2++];

					} else {
						N[count++] = (-1 * arr[pt1++]);
						N[count++] = arr[pt2++];

					}
				}
				if (posIndex != pt1) {
					while (pt1 < posIndex) {
						N[count++] = arr[pt1++];
					}
				}
				if (arr.length != pt2) {
					while (pt2 < arr.length) {
						N[count++] = arr[pt2++];
					}
				}

				for (int d : N) {
					System.out.println(d + " ");
				}

			}

		} else {
			for (int i = 0; i < arr.length; i++) {
				arr[i] = -1 * arr[i];
			}
		}

	}

}
