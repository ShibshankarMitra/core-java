package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<Integer> list= List.of(1, 12, 5, 34, 234, 12, 3, 4, 1, 100, 5, 2, 7);
		System.out.println("Before sorting");
		System.out.println(list);

		List<Integer> list1 = list.stream().sorted(Comparator.naturalOrder()).toList();
		System.out.println("After sorting");
		System.out.println(list1);

		Integer i = list.stream().sorted(Comparator.reverseOrder()).limit(2).min(Comparator.naturalOrder()).get();
		System.out.println("2nd highest value");
		System.out.println(i);

		List<String> words = List.of("I", "love", "India");
		String sentence = words.stream().reduce("", (s1, s2) -> s1.isEmpty()?s1+s2: s1+" "+s2);
		System.out.println(sentence);
	}
}
