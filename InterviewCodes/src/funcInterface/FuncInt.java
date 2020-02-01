package funcInterface;

public class FuncInt {

	public static void main(String[] args) {

		
		FuncInts objnf=()->{System.out.println("sdsdsds");};
		
		objnf.f();
		
						
	}

}

@FunctionalInterface
interface FuncInts {

	public void f();

}
