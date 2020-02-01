package threadS;

public class ThreadCreation {

	public static void main(String[] args) {

		/**
		 * [Method 1 (By Extending thread Class)]
		 * 
		 * In Method 1 we only have to initialize the the class(Method_1) who is
		 * extending the Thread class . We can directly use the object (method1) to call
		 * the start method of Thread class.
		 */
		Method_1 method1 = new Method_1();
		method1.start();

		/**
		 * [Method 2(By Implementing Runnable Interface)]
		 * 
		 * In Method 2 We create a class and implement a Runnable Interface. Now to
		 * start a thread we first create a object(method2) of the class(Method_2) which
		 * is implementing the runnable interface and then we intialize a Thread class
		 * object(objThreadMethod2) and then call the start method on thread's object
		 * (objThreadMethod2).
		 *
		 */
		Method_2 method2 = new Method_2();
		Thread objThreadMethod2 = new Thread(method2);
		objThreadMethod2.start();

		/**
		 * [Method 3(By Anonymous Inner class implementation of Runnable interface)]
		 * 
		 * In this method we create a thread without creating any additional classes
		 * ,here we create a anonymous implementation of Runnable Interface where we
		 * pass the anonymous implementation of Runnable object(Actually we have not
		 * created an object of an interface rather we have created a Anonymous inner
		 * class Implementer of Runnable interface and we passed the object of that
		 * class as an argument of Thread constructor) object as an argument of Thread
		 * constructor . To start the Thread we call the start method on object
		 * (method3).
		 */

		Thread method3 = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("Method 3 By annonymous inner class");
			}
		});
		method3.start();

		/**
		 * [Method 4(By lambda Expression implementation of run method of Runnable
		 * interface)]
		 *
		 * In this method we provide the implementation of the only abstract method of
		 * Runnable Interface(Functional interface Contract of Single abstract method).
		 * This method will only work from and after Java 8 . to start a thread we call
		 * the Start method on Object(method4).
		 */
		Thread method4 = new Thread(() -> {

			System.out.println(
					"Method 4 Involves Using Lamda Expression to provide implemetation of the only abstract method of Runnable Interfaces");
		});
		method4.start();

	}
}

class Method_1 extends Thread {
	public void run() {
		/**
		 * Method 1 Involves the plain old first way of extending the thread class and
		 * then overriding the Run method implemented in Thread Class . I am assuming
		 * you know how the thread works
		 */
		System.out.println("Method 1 Thread Extender");
	}

}

class Method_2 implements Runnable {
	public void run() {
		/**
		 * Method 2 Involves the plain old second way of Implementing the Runnable
		 * interface class and then implemeting the abstract Run method of Runnable
		 * Interface .I am assuming you know how the thread works
		 */
		System.out.println("Method 2 Implementing Runnable");
	}

}