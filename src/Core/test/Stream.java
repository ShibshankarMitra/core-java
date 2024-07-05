package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;



public class Stream {

	public static void main(String[] args) {
		Address  addr1 = new Address(700136,"Kolkata");
		Address  addr2 = new Address(600135,"Delhi");
		Address  addr3 = new Address(509823,"Hyderabad");
		Address  addr4 = new Address(200034,"Kolkata");
		Address  addr5 = new Address(456723,"Kolkata");
		
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setName("Rajkumar");
		s1.setAddress(addr1);
		
		
		Student s2 = new Student();
		s2.setId(2);
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
		
		
		//Map<String, Long> collect = students.stream().collect(Collectors.groupingBy(s->s.getAddress().getCity(),Collectors.counting()));
		List<Student> collect = students.stream().sorted((s,r)->s.getAddress().getCity().compareTo(r.getAddress().getCity())).collect(Collectors.toList());
		
		
		
		String sentence= new String("I love my Country India. India is my Motherland. I would always stay in India.");
		String words = sentence.replace(".","");
		System.out.println(words);
		String[] split = words.split(" ");
		List<Entry<String, Long>> collect2 = Arrays.stream(split).collect(Collectors.groupingBy(s->s,Collectors.counting())).entrySet().stream().filter(set->set.getValue()>1).collect(Collectors.toList());
		//List<Entry<String, Long>> collect2 = words.stream().
		
	
     	System.out.println(collect2);
	}

}
