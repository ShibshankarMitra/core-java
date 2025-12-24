package oops_concepts.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class  Main {

	public static void main(String[] args) {
		Address a1 = new Address(700100, "Kolkata", "India");
		Address a2 = new Address(500106, "Duni", "UAE");
		Address a3 = new Address(503250, "Dhaka", "Bangladesh");
		Address a4 = new Address(201234, "Toronto", "Canada");
		Address a5 = new Address(103012, "NewYork", "USA");

		Employee e1 = new Employee(1001, "Shib", 25000, a1);
		Employee e2 = new Employee(1002, "Shankar", 35000, a2);
		Employee e3 = new Employee(1003, "Raja", 30000, a3);
		Employee e4 = new Employee(1004, "Pronoy", 28000, a4);
		Employee e5 = new Employee(1005, "Aanal", 28000, a5);

		List<Employee> list = new ArrayList<>();
        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        list.add(e5);

        System.out.println("Unsorted List: ");
		list.forEach(System.out::println);

		System.out.println("Natural sorted List: ");
		list.stream().sorted().forEach(System.out::println);

        Collections.sort(list, new EmpCompareByName());
        System.out.println("Custom comparator sorted List: ");
        list.forEach(System.out::println);

		System.out.println("Custom sorted List based on Name: ");
		list.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);

		System.out.println("Custom sorted List based on Salary then on the address country: ");
		list.stream().sorted(Comparator.comparing(Employee::getSalary).thenComparing(e->e.getAddress().getCountry())).forEach(System.out::println);
	}
}
