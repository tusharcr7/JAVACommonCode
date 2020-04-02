package generics;

import java.io.Serializable;
import java.util.ArrayList;

public class GenEx {

	public static void main(String[] args) {

		A<Number> on = new A<Number>(1); // works
		A<Integer> onw = new A<Integer>(1);// works because Integer is a child Class
		B<Runnable> or = new B<Runnable>(new Thread());// works
		B<Thread> orn = new B<Thread>(new Thread()); // works because thread class implements Runnable

		ArrayList<String> l1 = new ArrayList<String>();
		ArrayList<Integer> l2 = new ArrayList<Integer>();
		ArrayList<Thread> l3 = new ArrayList<Thread>();
		m1(l1); // valid
		m1(l2); // valid
		m2(l2); // valid
		m3(l3); // valid
		m4(new ArrayList<Object>());
		/**
		 * above line is valid because m4 has x super Runnable that means we can pass
		 * the super class of implementation class Runnable so implementation class is
		 * thread and its super class is Object
		 */

		m5(new ArrayList<Number>());// valid
	}

	public static void m1(ArrayList<?> l) {
		/**
		 * in this case we can pass any type of arraylist to this method
		 */
	}

	public static void m2(ArrayList<? extends Number> l) {

		/**
		 * public static void m2(ArrayList<? extends X> l)
		 * 
		 * If X is a class: then: ? can be Number or its child type
		 * 
		 * if X is interface : then : ? can be X or its implementation class
		 */
	}

	public static void m3(ArrayList<? extends Runnable> l) {

		/**
		 * public static void m2(ArrayList<? extends X> l)
		 * 
		 * If X is a class: then: ? can be Number or its child type
		 * 
		 * if X is interface : then : ? can be X or its implementation class
		 */
	}

	public static void m4(ArrayList<? super Runnable> l) {

		/**
		 * public static void m2(ArrayList<? extends X> l)
		 * 
		 * If X is a class: then: ? can be Number or its Parent type
		 * 
		 * if X is interface : then : ? can be X or super class of implementation class
		 * of X
		 * 
		 * but within this method we can add null or X type of object to list
		 */
	}

	public static void m5(ArrayList<? super Integer> l) {

		/**
		 * public static void m2(ArrayList<? extends X> l)
		 * 
		 * If X is a class: then: ? can be Number or its Parent type
		 * 
		 * if X is interface : then : ? can be X or super class of implementation class
		 * of X
		 * 
		 * 
		 * 
		 * but within this method we can add null or X type of object to list
		 */
	}

	/**
	 * public static void m7(ArrayList<Integer> l) {
	 * 
	 * } public static void m7(ArrayList<String> l) {
	 * 
	 * }
	 * 
	 * NB: Above code will not be overloaded and gives CE because when the above
	 * code is compile it is compiled in two steps:
	 * 
	 * 1: it will compiled with generics 2:it will remove and resolve all generics
	 * at compile time 3:Compile without generics
	 * 
	 * so when it will compile without generics 
	 * both argument will become ArrayList l
	 * hence it will throw error
	 * 
	 * 
	 */

}
// class E<T extends Runnable & Number> //this will give error as the a class
// cannot be after interface after extends

class D<T extends Runnable & Serializable> {
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public D(T obj) {
		super();
		this.obj = obj;
	}

	public D() {
		super();
	}

	@Override
	public String toString() {
		return "D [obj=" + obj + "]";
	}

}

class C<T extends Number & Runnable> {// Bound Type: T can be Number or its child class and Runnable or its
										// implementation class
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public C(T obj) {
		super();
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "C [obj=" + obj + "]";
	}

	public C() {
		super();
	}

}

class B<T extends Runnable> {// Bound Type: T can be Runnable or its implementation class
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public B(T obj) {
		super();
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "B [obj=" + obj + "]";
	}

}

class A<T extends Number> {// Bound Type: T can be Number or its child class
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	public A(T obj) {
		super();
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "A [obj=" + obj + "]";
	}

}
