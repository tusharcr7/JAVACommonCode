package java8prac;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class OutputJAva {
	public static void main(String[] args) {

		List<Employee> objk = new ArrayList<Employee>();
		objk.add(new Employee("asdasdas", 45));
		objk.add(new Employee("mary", 25));
		objk.add(new Employee("asdasdas", 3));
		objk.add(new Employee("asdasdas", 25));

		List<Employee> objks = objk.stream().filter(x -> x.getAge() > 20).collect(Collectors.toList());

		objks.stream().forEach(System.out::println);

		List<String> obj = objk.stream().filter(x -> x.getAge() > 20).map(Employee::getName)
				.collect(Collectors.toList());

		obj.stream().forEach(System.out::println);

		System.out.println(objk.stream().filter(x -> x.getAge() == 25).count());

		Optional<Employee> objksd = objk.stream().filter(x -> x.getName().equalsIgnoreCase("Marry")).findAny();
		if (objksd.isPresent()) {

			System.out.println(objksd.get());
		} else {

			System.out.println("No Marry");

		}
		
		System.out.println("sadsadas"+objk.stream().max((x1,x2)->x1.getAge()-x2.getAge()));

		List<Employee> employeeList = objk;
		OptionalInt max = employeeList.stream().
				          mapToInt(Employee::getAge).max();
		        
		if(max.isPresent())
			System.out.println("Maximum age of Employee: "+max.getAsInt());
		
		
		
		
		
		List<String> objkkl=objk.stream().map(Employee::getName).collect(Collectors.toList());
		String df=String.join(",", objkkl);
		System.out.println(df);
		
		
		
		
		
	}

}

class Employee {
	private String name;
	private int age;

	public Employee(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Employee Name: " + name + " age: " + age;
	}
}