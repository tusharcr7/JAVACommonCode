package compCode;

public class ProductOfArrayExceptSum {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 4 };
		withoutDiv(arr);

	}

	public static void withdiv(int a[]) {
		int mult = 1;
		for (int i = 0; i < a.length; i++) {

			mult *= a[i];

		}

		for (int k = 0; k < a.length; k++) {
			System.out.println((int) mult / a[k]);

		}

	}

	public static void withoutDiv(int a[]) {
		int l[] = new int[a.length];
		int r[] = new int[a.length];
		l[0] = 1;
		l[1] = a[0];
		for (int i = 2; i < a.length; i++) {

			l[i] = l[i - 1] * a[i - 1];

		}

		r[a.length - 1] = 1;
		r[a.length - 2] = a[a.length - 1];
		for (int i = a.length - 3; i >= 0; i--) {
			r[i] = r[i + 1] * a[i + 1];
		}

		for (int i = 0; i < a.length; i++) {

			System.out.println(l[i] * r[i]);

		}
	}

}
