package com.java.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		
		String str= new String("sghtrsstfhsrrhhhsrrtsdhakkwtrtrqrewhjkak");
		List<Entry<Character,Long>> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).
		entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());
		
		System.out.println(collect);
		
		List<Integer> integers = List.of(1,2,11,14,56,123);
		Optional<Integer> max = integers.stream().max(Comparator.comparing(Integer::intValue));
		System.out.println(max.get());
		
		str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(c->c,Collectors.counting())).entrySet().stream().filter(e->e.getValue()>1)
		.forEach(e-> {
			System.out.println("Charecter: "+e.getKey()+" Occurance: "+e.getValue());
		});
		
		
		
		
		
		
	}

}
