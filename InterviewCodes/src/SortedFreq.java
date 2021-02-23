package code;

import java.util.Scanner;
import java.util.TreeMap;

public class SortedFreq {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		TreeMap<Character, Integer> t = new TreeMap<Character, Integer>();
		for (int i = 0; i < st.length(); i++) {
			Character c = st.charAt(i);
			if (t.containsKey(c)) {
				t.put(c, t.get(c) + 1);
			} else {
				t.put(c, 1);
			}

		}
		StringBuilder sb = new StringBuilder();
		t.entrySet().forEach(tv -> {

			String hst = String.valueOf(tv.getKey()) + String.valueOf(tv.getValue());
			sb.append(hst);

		});
		System.out.println(sb.toString());
	}

}
