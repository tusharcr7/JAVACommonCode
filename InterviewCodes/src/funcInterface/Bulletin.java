package funcInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Bulletin {

	public static void main(String[] args) {

		List<String> objLsttr = Arrays.asList("dsds", "ssdsdsd", "sdadsad", "erqwer", "asdsadasd");
		Predicate<String> obj = (String s) -> {
			return s.startsWith("s");
		};
		objLsttr.stream().forEach((String t) -> {

			if (obj.test(t)) {
				System.out.println(t);
			}

		});

		BinaryOperator<String> obja = (String s, String sd) -> {

			return s.concat(sd);
		};

		objLsttr.stream().forEach((String d) -> {

			System.out.println(obja.apply(d, d));

		});

		Function<String, String> onb = (String s) -> {
			return obja.apply(s, s) + "Function Bulitin";
		};
		objLsttr.stream().forEach((String d) -> {

			System.out.println(onb.apply(d));

		});

		Consumer<String> obh = (String s) -> {
			System.out.println(s);
		};

		objLsttr.stream().forEach((String d) -> {
			obh.accept(d);
		});

	}

}
