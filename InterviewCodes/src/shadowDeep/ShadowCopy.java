package shadowDeep;

public class ShadowCopy {

	public static void main(String[] args) throws CloneNotSupportedException {

		BS obj = new BS(12, "sad", new AS(1, "asdasd"));
		obj.print();
		/**
		 * Shallow Copy Example
		 */
		BS onj = obj.clone();
		obj.ob.setS("dfgdfgdfg");
		obj.setS("dsds");
		onj.print();

		/**
		 * Deep Copy Example
		 */

		BD obja = new BD(12, "sad", new AS(1, "asdasd"));
		obja.print();
		BD onjas = obja.clone();
		obja.ob.setS("dfgdfgdfg");
		obja.setS("dsds");
		onjas.print();

	}

}

class BS implements Cloneable {

	Integer x;
	String s;
	AS ob = null;

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

	public AS getOb() {
		return ob;
	}

	public void setOb(AS ob) {
		this.ob = ob;
	}

	public BS(Integer x, String s, AS ob) {
		super();
		this.x = x;
		this.s = s;
		this.ob = ob;
	}

	public BS() {
		super();
	}

	@Override
	public String toString() {
		return "BS [x=" + x + ", s=" + s + ", ob=" + ob + "]";
	}

	public void print() {

		System.out.println(this.toString());

	}

	protected BS clone() throws CloneNotSupportedException {
		/**
		 * Shallow copy : Immutable,primitive fields are copied Mutable non primitive
		 * references are copied only..
		 */

		return (BS) super.clone();
	}

}

class BD implements Cloneable {

	Integer x;
	String s;
	AS ob = null;

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

	public AS getOb() {
		return ob;
	}

	public void setOb(AS ob) {
		this.ob = ob;
	}

	public BD(Integer x, String s, AS ob) {
		super();
		this.x = x;
		this.s = s;
		this.ob = ob;
	}

	public BD() {
		super();
	}

	@Override
	public String toString() {
		return "BS [x=" + x + ", s=" + s + ", ob=" + ob + "]";
	}

	public void print() {

		System.out.println(this.toString());

	}

	protected BD clone() throws CloneNotSupportedException {
		/**
		 * Shallow copy : Immutable,primitive fields are copied Mutable non primitive
		 * Object are copied also..
		 */
		AS objTemp = new AS();
		BD obj = (BD) super.clone();
		objTemp.s = obj.getOb().getS();
		objTemp.x = obj.getOb().getX();
		obj.setOb(objTemp);

		return obj;
	}

}

class AS implements Cloneable {
	Integer x;
	String s;

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

	public AS(Integer x, String s) {
		super();
		this.x = x;
		this.s = s;
	}

	public AS() {
	}

	@Override
	public String toString() {
		return "AS [x=" + x + ", s=" + s + "]";
	}

	public void print() {

		System.out.println(this.toString());

	}

	public AS clone() throws CloneNotSupportedException {

		return (AS) super.clone();
	}

}
