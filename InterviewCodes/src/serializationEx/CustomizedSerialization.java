package serializationEx;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * Customized Serialization with more than one transient variable
 *  that enables to restore values of transient variable after de-
 *  Serialization
 * @author Tushar.Srivastava
 *
 */
public class CustomizedSerialization {

	public static void main(String[] args) throws Throwable {

		Test t = new Test(10, 10, 10);

		FileOutputStream fos = new FileOutputStream("ser.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(t);

		System.out.println("Deserialization Starts Now");

		FileInputStream fis = new FileInputStream("ser.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		t = (Test) ois.readObject();
		System.out.println(t);

	}

}

class Test implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6271767748851386504L;
	int x;
	transient int y;
	transient int z;

	public Test(int x, int y, int z) {
		super();
		this.x = x;
		this.y = y;
		this.z = z;
	}

	private void writeObject(ObjectOutputStream oos) throws Throwable {
		oos.defaultWriteObject();
		int y = 10 + this.y;
		oos.writeInt(y);
		int z = 10 + this.z;
		oos.writeInt(z);
	}

	private void readObject(ObjectInputStream ois) throws Throwable {
		ois.defaultReadObject();
		this.y = ois.readInt() - 10;
		this.z = ois.readInt() - 10;

	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + ", z=" + z + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	

}
