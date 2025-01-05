package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {


		Address a1 = new Address(700100, "Kolkata", "India");
		Address a2 = new Address(500106, "Duni", "UAE");
		Address a3 = new Address(503250, "Dhaka", "Bangladesh");
		Address a4 = new Address(201234, "Toronto", "Canada");
		Address a5 = new Address(103012, "NewYork", "USA");

		Employee e1 = new Employee();
		e1.setId(1001);
		e1.setName("Shib");
		e1.setSalary(25000);
		e1.setAddress(a1);

		Employee e2 = new Employee();
		e2.setId(1002);
		e2.setName("Shankar");
		e2.setSalary(35000);
		e2.setAddress(a2);

		Employee e3 = new Employee(1003, "Raja", 30000, a3);
		Employee e4 = new Employee(1004, "Pronoy", 28000, a4);
		Employee e5 = new Employee(1005, "Aanal", 28000, a5);


		//System.out.println(e1.compareTo(e2));

		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		List<Employee> list2 = new ArrayList<>(list);

		System.out.println("Unsorted List: ");
		list.forEach(System.out::println);

		System.out.println("Natural sorted List: ");
		list.stream().sorted().forEach(System.out::println);

		System.out.println("Custom sorted List based on Name: ");
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

		System.out.println("Custom sorted List based on Salary then on the address country: ");
		list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(e->e.getAddress().getPin())).forEach(System.out::println);


	}
}
