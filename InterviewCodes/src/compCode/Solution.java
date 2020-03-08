package compCode;

import java.util.*;
import java.util.function.Predicate;

public class Solution {

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {
		List<String> objMagzineT = Arrays.asList(magazine);
		List<String> objNoteT = Arrays.asList(note);
		ArrayList<String> m = new ArrayList<String>(objMagzineT);
		ArrayList<String> n = new ArrayList<String>(objNoteT);

		Predicate<ArrayList<String>> objCheck = (ArrayList<String> objk) -> {
			boolean ret = true;
			for (String j : objk) {
				if (!m.contains(j)) {
					ret = false;
					break;
				}
				m.remove(j);

			}

			return ret;
		};

		if (objCheck.test(n)) {
			System.out.println("Yes");

		} else {
			System.out.println("No");
		}
		HashMap<Integer, Integer> obj=new HashMap<Integer, Integer>();
		obj.put(01, 01);
		

	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(0&20);
		String[] mn = scanner.nextLine().split(" ");

		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = scanner.nextLine().split(" ");
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

		scanner.close();
	}
}
