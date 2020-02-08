package polymorphism;

/**
 * Overloading :Compile timed polymorphism,early binding,Static polymorphism
 * 
 * Resolution: Done by Compiler Basis:reference type
 * 
 */
public class OverloadCase {

	public static void main(String[] args) {

		/**
		 * Case 1:-
		 * 
		 * Simple overloading with auto promotion and resolution on the basis of
		 * reference type
		 * 
		 * Implementation:
		 */

		OverloadCase o = new OverloadCase();
		o.c1(10.5f);
		o.c1(10);
		o.c1('a');
		/**
		 * Output :
		 * 
		 * Float type Integer type10 Integer type97
		 * 
		 * 
		 * Explanation: In case of char auto promotion happened to int Autopromotion
		 * order: byte->short->int->long-.float->double char->int->long->float->double-
		 * 
		 */

	}

	public void c1(int i) {
		System.out.println("Integer type" + i);

	}

	public void c1(float f) {
		System.out.println("Float  type");

	}

}
