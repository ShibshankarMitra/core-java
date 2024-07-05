package test;


import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Integer> list1 = List.of(1, 2, 3, 25, 56, 289, 58, 58, 2, 3, 2, 1, 2, 25, 25, 25);
		
		
		//get the sum
		int sum = list1.stream().mapToInt(i->i).sum();
		System.out.println(sum);
		
		//Min Max AVG
		Optional<Integer> max = list1.stream().max((i1,i2)->i1.compareTo(i2));
		System.out.println(max.get());
		
		OptionalDouble average = list1.stream().mapToInt(i->i).average();
		System.out.println(average.getAsDouble());
		
		//Sorted
		List<Integer> sorted = list1.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println(sorted);
		
		List<Integer> filter = list1.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(filter);

	}

}

