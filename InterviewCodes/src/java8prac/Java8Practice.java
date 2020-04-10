package java8prac;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Java8Practice {

	public static void main(String[] args) {
		
		  G obj1=x->x*x;
		  G obj2=x->(int)Math.pow(x, 3);
		  G obj3=x->(x%2==0)?1:0;
		  F o=(x,y)->{
			  System.out.println(x+y);
			  
			  
			  
		  System.out.println("asdsadas");};   
			o.take(3, 4);
		 System.out.println(obj1.square(5));
		 System.out.println(obj2.square(5));
		 System.out.println(obj3.square(18));
	
		 ///
		 
		 L obj= ()->System.out.println("sdfsdfsfdsf");
		 obj.display();
		 FT<Integer> onj=x->String.valueOf(x);
		 System.out.println(onj.display(76464646));
		 
		 
		 
		 //Predicate<T> FI ----->method=test(T obj)
		 Predicate<String> objp=x->x.startsWith("t");
		 Predicate<Integer> obji=x->(x%2==0);
		 
		 
		 System.out.println(objp.test("tushar"));
		 System.out.println(obji.test(12312312));
		 
		 //BinaryOPerator<T>   apply(T x,T y)
		 BinaryOperator<Integer> objBO=(x,y)->(int) Math.pow(x, y);
		 System.out.println(objBO.apply(100, 2));
	     
		 //Function R  apply(T)
		 
		 Function<Integer ,String> onjFunc=(x)->"String representation is"+String.valueOf(x);
		 System.out.println(onjFunc.apply(10));
		 
		 
		 //Consumer  accept(T x)
		 Consumer<Integer> onjAcc=x->System.out.println("sdasdasdadasd"+x);
		 onjAcc.accept(21312);
	
	
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
interface F
{
public void take(int k,int l);	


}
interface L
{
public void display();	
}

interface FT<T>
{
	
public String display(T obj);


}

/**
 * 1 .functional interface 2 .lambda expression 3 .streams 4.bulitin methods
 * 5.:: operator 6.default methods 7.static methods 
 * 
 * 
 * 
 */
