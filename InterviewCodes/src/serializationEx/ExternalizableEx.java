package serializationEx;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableEx {
	public static void main(String[] args) throws Exception {

		B obj = new B(1, "asdasdas");

		/**
		 * Serialization using Externalizable
		 */
		obj.print();
		FileOutputStream fos = new FileOutputStream("asd.ser");
		ObjectOutput oos = new ObjectOutputStream(fos);
		oos.writeObject(obj);

		/**
		 * 
		 * Deserializable
		 * 
		 */

		FileInputStream fis = new FileInputStream("asd.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		B Objk = (B) ois.readObject();
		Objk.print();
	}

}

class B implements Externalizable {

	Integer x;
	String s;

	public B() {
		super();
	}

	public Integer getX() {
		return x;
	}

	public void setX(Integer x) {
		this.x = x;
	}

	public String getS() {
		return s;
	}

	public void setS(String s) {
		this.s = s;
	}

	public B(Integer x, String s) {
		super();
		this.x = x;
		this.s = s;
	}

	@Override
	public void readExternal(ObjectInput arg0) throws IOException, ClassNotFoundException {

		x = arg0.readInt();
		s = arg0.readLine();

	}

	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		arg0.writeInt(x);
		arg0.writeChars(s);
	}

	@Override
	public String toString() {
		return "B [x=" + x + ", s=" + s + "]";
	}

	public void print() {
		System.out.println(this.toString());
	}

}
