package StreamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		//create a list and filter all even numbers from List
		List<Integer> list1 = List.of(1,2,3,25,56,289,58,58,2,3,2,1,2,25,25,25);
		List<Integer> list2= new ArrayList<Integer>();
		list2.add(21);
		list2.add(28);
		list2.add(200);
		list2.add(345);
		list2.add(59);

///		//Q. Using stream API filtering even numbers?
		
		Stream<Integer> stream = list1.stream();
		List<Integer> collectedList = stream.filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(collectedList);

		//Q. Using stream API filtering numbers greater than 50
		
		List<Integer> collectedList2 = list2.stream().filter(i->i>=50).collect(Collectors.toList());
		System.out.println(collectedList2);


		//Q. Map method to print the squares
		
		List<Integer> square = list1.stream().map(i->i+100).collect(Collectors.toList());
		System.out.println(square);


		//Q ForEach method to print and execute a method
		
		list1.stream().forEach(i->{
			System.out.println(i);
		});


		//Min method to compare and get a minimum passing comparator as Lambda
		
		Optional<Integer> min = list1.stream().min((x,y)->x.compareTo(y));
		System.out.println(min.get());



		System.out.println("printing Collection");
		String class1 = list1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).toString();
		System.out.println(class1);


		
		//Creating Students and Address

		Address  addr1 = new Address(700136,"Kolkata");
		Address  addr2 = new Address(600135,"Delhi");
		Address  addr3 = new Address(509823,"Hyderabad");
		Address  addr4 = new Address(200034,"Bangalore");
		Address  addr5 = new Address(456723,"Jammu");
		
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Rajkumar");
		s1.setAddress(addr1);
		
		
		Student s2 = new Student();
		s2.setId(3);
		s2.setName("Sharmila");
		s2.setAddress(addr2);
		
		Student s3 = new Student();
		s3.setId(3);
		s3.setName("Premkumar");
		s3.setAddress(addr3);
		
		Student s4 = new Student();
		s4.setId(4);
		s4.setName("Shibkumar");
		s4.setAddress(addr4);
		
		List<Student> students = List.of(s1,s2,s3,s4);
		List<Student> collect7 = students.stream().filter(s->s.getId()>2 && s.getName().startsWith("S")).collect(Collectors.toList());
		System.out.println(collect7);


		List<Student> list3 = students.stream().sorted(Comparator.comparing(Student::getId)).toList();
		System.out.println(list3);

		Map<Integer, String> collect6 = students.stream().collect(Collectors.toMap(Student::getId, Student::getName));
		System.out.println(collect6);
		
		Optional<Student> max = students.stream().max(Comparator.comparing(Student::getId));
		System.out.println(max);

//		// Q1> .get the List of Students and counts Grouping by Address.City
		
//		List<Student> students = List.of(s1,s2,s3,s4);
//		Map<String, Long> collect = students.stream().collect(Collectors.groupingBy(s->s.getAddress().getCity(),Collectors.counting()));
//		Optional<Entry<String, Long>> max = collect.entrySet().stream().max((e1,e2)-> e1.getValue().compareTo(e2.getValue()));
//		System.out.println(max.get().getKey()) ;
		
//		//optional offers get(). For Collection types returns Object, and get() for map types returns Entryset
//		//Then use entrySet.getValue(), entrySet.getKey() to get the values and keys.
//		//But Map offers only get(Object key) method to get.
//		
//	
//		
//		
//		//Q2. get the recurrence of words in a String?
		
//		String str = new String("Welcome to code decode. code decode welcomes you");
//		String[] split = str.split(" ");
//		List<String> asList = Arrays.asList(split);
//		
//		asList.stream().collect(Collectors.groupingBy(i->i,Collectors.counting())).entrySet().stream().forEach(e->{
//			System.out.println(e.getKey()+ " has Occured "+e.getValue()+" times.");
//		});
//		
//		
//		
//		
//		
//		
//		
//		
//		//Q3. Get the highest Occurence of elements in a List of Integers?
		
//		Optional<Entry<Integer, Long>> max2 = list1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()))
//				.entrySet().stream().max((e1,e2)-> e1.getValue().compareTo(e2.getValue()));
//		
		//Q4. Get all the recurring elements in a List of Integers?
		
//		List<Entry<Integer, Long>> collect2 = list1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()))
//				.entrySet().stream().filter(e-> e.getValue()>1).collect(Collectors.toList());
//		System.out.println(collect2);
		
		
//		//------Directly from Arrays.stream().boxed()
//		int[] intarray= {1,2,3,4,5,4,3,2,7,8,9};
//		Map<Integer, List<Integer>> collect3 = Arrays.stream(intarray).boxed().filter(i->i%2==0).collect(Collectors.groupingBy(i->i));
//		collect3.entrySet().forEach(e-> System.out.println(e.getKey()));
//		
//
		//Q4> Program to get the square root of integers in Arraylist/Array
		int arr[]= {1,2,3,4,5};
		//Arrays.asList(arr).stream() OR 
	
		List<Double> collect = Arrays.stream(arr).boxed().map(Math::sqrt).collect(Collectors.toList());
		System.out.println(collect);

		//Q4> Program to get the duplicate characters in a String

		String str= new String("I am happy to get the details from portal");
		
		str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
		.entrySet().stream().filter(e->e.getValue()>1).forEach(e->System.out.println( e.getKey()));
		
		/*
		 * Now Char[] can't be converted to stream directly using arrays.stream() char[]
		 * charArray = str.toCharArray();
		 * Arrays.stream(charArray);
		 * Will not work
		 */
		
		//We can use String.chars().mapToObj(Lambda) method, gives intStream, then convert to (Char) type casting
		List<Entry<Character, Long>> collect2 = str.chars().mapToObj(c-> (char)c).collect(Collectors.groupingBy(c->c,Collectors.counting()))
		                                 .entrySet().stream().filter(e->e.getValue()>1  && e.getKey()!=" ".charAt(0)).collect(Collectors.toList());
		System.out.println(collect2);
		
		//Q5> Delete the duplicates in Arraylist
		
		List<Entry<Integer, Long>> collect3 = list1.stream().collect(Collectors.groupingBy(i->i,Collectors.counting()))
		                                  .entrySet().stream().filter(e->e.getValue()==1).collect(Collectors.toList());
		//collect3.stream().for
		
		                       
		System.out.println("Q6 Get the 2nd highest number in list1");
		  int intValue = list1.stream().sorted((i,j)->j.compareTo(i)).limit(2).min((i,j)->i.compareTo(j)).get().intValue();
		System.out.println(intValue);
		
		  list1.stream().collect(Collectors.groupingBy(s->s, Collectors.counting()))
				 .entrySet().stream().forEach(e-> System.out.println(e.getKey()));
		 //Calling entrySet() give a Set type collection which contains Entry Objects
		
		
		String paragraph= "I live in India. India is my country.";
		 String[] strarr= paragraph.split(" ");
		 List<String> list= Arrays.asList(strarr);
		 Map<String, Long> collect4 = list.stream().collect(Collectors.groupingBy(s->s,Collectors.counting()));
		 collect4.entrySet().stream().forEach(e->System.out.println(e.getKey()));
		          
		 int[] arr1= {1,2,8,4,89,500};
		 int[] array= {1,2,4,1,1,8,2,6,1,48};
		 
		 //Q.> MAximun nuber of occurance
		 Map<Integer, Long> map =Arrays.stream(array).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting()));
			Optional<Integer> value= Arrays.stream(arr1).boxed().min((i,j)->i.compareTo(j));
			System.out.println(value.get());
			}
}
