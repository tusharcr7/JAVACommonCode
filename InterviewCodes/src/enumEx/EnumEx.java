package enumEx;

public class EnumEx {
	public static void main(String[] args) {
		for (A on : A.values()) {
			System.out.println(on);
			System.out.println(on.valueOf(on.toString()));
			System.out.println(on.ordinal());
		}
		for (B on : B.values()) {
			System.out.println("For ENUM B /n" + on);
			System.out.println(on.valueOf(on.toString()));
			System.out.println(on.ordinal());
			on.f();
			on.d();
		}
		for (C on : C.values()) {
			System.out.println("For ENUM B /n" + on);
			System.out.println(on.valueOf(on.toString()));
			System.out.println(on.ordinal());
		}
	}
}

/**
 * 
 * @author Tushar
 *
 **         enum can not extend another class as each and every enum implicitly
 *         extends Enum class.
 *
 **         but enum can implement many interfaces
 *
 *         for Each and every constant in enum thr constructor is called
 *
 *
 **         IN Constructor IN Constructor IN Constructor RED BLUE GREEN
 *
 **         total three methods in enum value,values,ordinal
 */
enum A {
	RED, BLUE, GREEN;
	A() {
		System.out.println("IN Constructor");
	}

}

/**
 * @author tushar
 * 
 * 
 * @category If there is an abstract method in enum then its each constant must
 *           provide the implementation.
 * 
 */
enum B {
	SCIENCE {
		@Override
		public void f() {
			System.out.println("Abstract method f IMPLENETED BY SCIENCE");

		}
	},
	lITERATURE {
		@Override
		public void f() {
			System.out.println("Abstract method f IMPLENETED BY lITERATURE");

		}
	},
	ARTS {
		@Override
		public void f() {
			System.out.println("Abstract method f IMPLENETED BY ARTS");

		}
	};

	public abstract void f();

	public void d() {
		System.out.println("Default Methods");
	}

}

enum C {
	MONDAY("1"), TUESDAY("2"), WEDNESDAY("3");
	private String day;

	public String getDay() {
		return day;
	}

	private C(String day) {
		this.day = day;
	}

}