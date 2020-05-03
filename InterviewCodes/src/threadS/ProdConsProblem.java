package threadS;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
/**
 * 
 * 
 * @author user
 *
 *
 *
 *Producer Consumer problem using Blocking queue
 *
 */

public class ProdConsProblem {

	public static void main(String[] args) {

		BlockingQueue<Integer> objSharedSpace = new LinkedBlockingQueue<Integer>();

		Producer objProducer = new Producer(objSharedSpace);
		Consumer objConsumer = new Consumer(objSharedSpace);

		objProducer.start();
		objConsumer.start();

	}

}

class Producer extends Thread {

	private BlockingQueue<Integer> sharedSpace;

	public Producer(BlockingQueue<Integer> sharedSpace) {
		super("Producer");
		this.sharedSpace = sharedSpace;
	}

	public void run() {

		for (int i = 1; i < 100; i++) {

			try {
				System.out.println(Thread.currentThread().getName() + " " + i);
				sharedSpace.put(i);
				Thread.sleep(20000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

	}

}

class Consumer extends Thread {
	private BlockingQueue<Integer> sharedSpace;

	public Consumer(BlockingQueue<Integer> sharedSpace) {
		super("Consumer");
		this.sharedSpace = sharedSpace;
	}

	public void run() {

		while (true) {

			try {
				System.out.println(Thread.currentThread().getName() + " " + sharedSpace.take());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
