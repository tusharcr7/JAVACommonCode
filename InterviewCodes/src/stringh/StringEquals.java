package stringh;

public class StringEquals {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("a");
		StringBuilder sbt = new StringBuilder();
		sbt.append("a");
		String sd = "a";

		System.out.println(sd.equals("a"));

		System.out.println(sb.equals("a"));
		System.out.println(sbt.equals("a"));
		
         g(10);
         g();
	}

	
	public static void g(int... i)
	{
		System.out.println(i.length);
		System.out.println(i[0]);
		
		
	}
}
