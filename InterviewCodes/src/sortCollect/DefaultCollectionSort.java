package sortCollect;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DefaultCollectionSort {

	public static void main(String[] args) {
		List<Student> obj = new ArrayList<Student>();

		Student obj1 = new Student(1, 23, 45.2, "asdasdasd");
		Student obj2 = new Student(2, 56, 4.2, "dasd");
		Student obj3 = new Student(3, 23, 432.2, "asdasdasd");
		Student obj4 = new Student(4, 2345, 4325.2, "aasdasd");
		Student obj5 = new Student(5, 23, 45.232, "asdasdasd");
		Student obj6 = new Student(6, 2345, 4532.2, "xsdasdasd");
		Student obj7 = new Student(7, 254, 451.2, "gsdasdasd");
		Student obj8 = new Student(8, 22, 45131.2, "ssdasdasd");
		Student obj9 = new Student(9, 25, 4513.2, "fdasd");
		Student obj10 = new Student(10, 423, 4531.2, "asdasdasd");

		obj.add(obj10);
		obj.add(obj9);
		obj.add(obj8);
		obj.add(obj7);
		obj.add(obj6);
		obj.add(obj5);
		obj.add(obj4);
		obj.add(obj3);
		obj.add(obj2);
		obj.add(obj1);
		Collections.sort(obj);

		obj.stream().forEach(System.out::println);

		obj = obj.stream().sorted((i1, i2) -> i2.getAge() - i1.getAge()).collect(Collectors.toList());
		System.out.println("dfghbjnkl");
		obj.stream().forEach(System.out::println);

		Collections.sort(obj, new Comparator<Student>() {

			@Override
			public int compare(Student o1, Student o2) {

				return o1.getName().compareTo(o2.getName());
			}

		});

		obj.stream().forEach(System.out::println);
	}

}

class Student implements Comparable<Student> {

	private Integer id;
	private Integer age;
	private double percentage;
	private String name;

	public Student(Integer id, Integer age, double percentage, String name) {
		super();
		this.id = id;
		this.age = age;
		this.percentage = percentage;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", age=" + age + ", percentage=" + percentage + ", name=" + name + "]";
	}

	@Override
	public int compareTo(Student o) {
		return this.age - o.age;
	}

}