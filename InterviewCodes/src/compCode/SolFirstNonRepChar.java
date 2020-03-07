package compCode;

import java.util.Scanner;

public class SolFirstNonRepChar {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String st = sc.next();
		boolean stu = false;
		String sd = "";
		for (int i = 0; i < st.length(); i++) {
			String temp = st.substring(i + 1);
			if (temp.indexOf(st.charAt(i)) == -1 && sd.indexOf(st.charAt(i)) == -1) {
				stu = true;
				System.out.println(st.charAt(i));
				break;
			}
			sd += st.charAt(i);

		}
		if (!stu) {

			System.out.println(-1);
		}

	}

}
