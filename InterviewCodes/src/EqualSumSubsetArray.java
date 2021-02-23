

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class EqualSumSubsetArray {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int[] a = new int[l];

		for (int i = 0; i < l; i++)
			a[i] = sc.nextInt();
		HashMap<Integer, List<String>> obj = new HashMap<Integer, List<String>>();
		int lim = (int) Math.pow(2, l);
		for (int i = 0; i < lim; i++) {
			int temp = i;
			String st = "";
			int sum = 0;
			for (int j = a.length - 1; j >= 0; j--) {
				int rem = temp % 2;
				temp = temp / 2;
				if (rem == 1) {
					sum += a[j];
					st += a[j] + " ";
				}

			}

			if (obj.containsKey(sum)) {
				obj.get(sum).add(st);
			} else {
				List<String> k = new ArrayList<String>();
				k.add(st);
				obj.put(sum, k);
			}
		}

		obj.entrySet().forEach(t -> {
			if (t.getValue().size() > 1) {
				StringBuilder sb = new StringBuilder();
				t.getValue().forEach(td -> sb.append(td + ","));
				System.out.print("Sum: " + t.getKey() + "  Subset :[" + sb.toString() + "]");
				System.out.println();
			}
		});

	}

}
