package java8prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalEX {
	public static void main(String[] args) {

		List<String> objex = new ArrayList<String>();

		objex.add("sdsfsdfsdfsdfs");

		String s = getStartingWithS(objex);

		Optional<String> objk = getStartingsWithS(objex);
		if (objk.isPresent()) {
			System.out.println(objk.get());

		} else {
			System.out.println("No values present");

		}

	}

	public static String getStartingWithS(List<String> obj) {
		String sf = null;
		for (String s : obj) {

			if (s.startsWith("s")) {
				sf = s;
				break;

			}

		}

		return sf;

	}

	public static Optional<String> getStartingsWithS(List<String> obj) {
		String sf = null;
		for (String s : obj) {

			if (s.startsWith("s")) {
				return Optional.of(s);

			}

		}

		return Optional.ofNullable(sf);

	}

}
