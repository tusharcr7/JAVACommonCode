package java8prac;

public class Java8Practice {

	public static void main(String[] args) {
		
		  G obj=x->x*x;
		  
			
		 System.out.println(obj.square(5));
	
	}

}



interface G {

	public  int square(int x);
	
	

	public default void g() {
		System.out.println("default method");
	}

	public default void g1() {
		System.out.println("default method");
	}

	public static void gh() {

		System.out.println("static method");
	}

}

/**
 * 1 .functional interface 2 .lambda expression 3 .streams 4.bulitin methods
 * 5.:: operator 6.default methods 7.static methods
 * 
 * 
 * 
 */
