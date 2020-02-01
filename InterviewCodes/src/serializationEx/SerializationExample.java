package serializationEx;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationExample {
	public static void main(String[] args) throws Exception {

		A obj = new A(1, "dasdasdas");

		/**
		 * Serialisation
		 */
		System.out.println(obj.toString());
		FileOutputStream fos = new FileOutputStream("asd.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		/**
		 * Deserialisation
		 *
		 *
		 */

		FileInputStream fis = new FileInputStream("asd.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);

		A readObj = (A) ois.readObject();
		System.out.println(readObj.toString());

	}

}

class A implements Serializable {

	Integer intX;
	String str;

	public Integer getIntX() {
		return intX;
	}

	public void setIntX(Integer intX) {
		this.intX = intX;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	public A(Integer intX, String str) {
		super();
		this.intX = intX;
		this.str = str;
	}

	@Override
	public String toString() {
		return "A [intX=" + intX + ", str=" + str + "]";
	}

}
