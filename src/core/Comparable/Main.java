package Core.Comparable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		
			
		Address a1= new Address(700100, "Kolkata", "India");
		Address a2= new Address(500106, "Duni", "UAE");
		Address a3= new Address(503250, "Dhaka", "Bangladesh");
		Address a4= new Address(201234, "NewYork", "USA");
		Address a5= new Address(103012, "Toronto", "Canada");
		
		Employee e1= new Employee();
		e1.setId(1001);
		e1.setName("Shib");
		e1.setSalary(25000);
		e1.setAddress(a1);
		
		Employee e2= new Employee();
		e2.setId(1002);
		e2.setName("Shankar");
		e2.setSalary(35000);
		e2.setAddress(a2);
		
		Employee e3= new Employee(1003, "Raja", 30000, a3);
		Employee e4= new Employee(1004, "Pronoy", 28000, a4);
		Employee e5= new Employee(1005,"Aanal", 28000, a5);
		

		
		
		
		
		
		//System.out.println(e1.compareTo(e2));
		
		List<Employee> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		List<Employee> list2 = new ArrayList<>(list);
		
		
		System.out.println("------Unsorted List------");System.out.println();
		for(Employee e:list)
			System.out.println(e);
		System.out.println();
		//Collections.sort is using natural sorting in orders according to the implementation of the compareTo()
		//Collections.sort(list);
		
		
		
		//Using custom comparator class to compare manually
		EmpCompareBySalary empCompareBySalary= new EmpCompareBySalary();
		//
		
		//Instructing Collections.sort(list, comparator<T>) to use our custom comparator function to compare
		Collections.sort(list,(o1,o2)->{//Given Lambda Expression
			if(o1.getSalary()>o2.getSalary())
				return 1;
			else if(o1.getSalary()<o2.getSalary())
				return -1;
			else 
			return 0;
		});
		
		System.out.println("-----After Sorting using SalaryComparator-----");System.out.println();
		for(Employee e:list)
			System.out.println(e);
		
		
		
		EmpCompareByName compareByName = new EmpCompareByName();
		//Collections.sort(list2, compareByName);//Given a comparator class
		Collections.sort(list2,Comparator.comparing(Employee::getName));
		Collections.sort(list2,(emp1,emp2)->emp1.getAddress().getCity().compareTo(emp2.getAddress().getCity()));
		System.out.println("-----After Sorting using NameComparator-----");System.out.println();
		for(Employee e:list2)
			System.out.println(e);
		
		
		
		//Printing the sorted list
		
		
		
		//Using stream API
		List<Employee> sorted = list.stream().sorted().collect(Collectors.toList());
		
		
		
		System.out.println("------Stream API Natural Sorted List------");System.out.println();
		for(Employee e:sorted)
		System.out.println(e);
		
		
		
		System.out.println("------Stream API First sort using Salary Then name comparision sorted List------");System.out.println();
		List<Employee> collect = list.stream().sorted(Comparator.comparing(Employee::getSalary).
				thenComparing(Comparator.comparing(Employee::getName))).collect(Collectors.toList());
		for(Employee e:collect)
			System.out.println(e);
		
	

	}

}
