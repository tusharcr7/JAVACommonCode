
import java.util.Scanner;

public class SubsetOfArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		int lim = (int) Math.pow(2, arr.length);
		for (int i = 0; i < lim; i++) {
			int temp = i;
			System.out.print("[");
			for (int j = arr.length - 1; j >= 0; j--) {
				int rem = temp % 2;
				temp = temp / 2;
				if (rem != 0)
					System.out.print(" " + arr[j]);
			}
			System.out.println(" ]");
		}
	}
}
