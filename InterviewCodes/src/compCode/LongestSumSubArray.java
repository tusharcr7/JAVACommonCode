package compCode;

public class LongestSumSubArray {
	public static void main(String[] args) {

		int arr[] = { 1, 2, 2, 5, 0, 0, 5, 7 };

		for (int n : slideWinLongSumSubArray(arr, 14)) {
			System.out.println(n);

		}

	}

	public static int[] slideWinLongSumSubArray(int arr[], int s) {

		int result[] = new int[2];
		int sum = 0, l = 0, r = 0;
		while (r < arr.length) {
			sum += arr[r];

			while (sum > s && l < r) {
				sum -= arr[l++];

			}

			if (sum == s && ((result[1] - result[0]) < (r - l))) {
				result[0] = l;
				result[1] = r;
			}

			r++;
		}
		return result;

	}

}
