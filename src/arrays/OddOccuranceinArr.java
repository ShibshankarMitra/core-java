package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OddOccuranceinArr {

	public static void main(String[] args) {
		int[] arr= {1,2,3,5,4,2,2,1,3,5,4};
		String[] str= {"A","B","C"};
		//List<Integer> asList = Arrays.asList(arr);//Can not convert from primitive array to List of wrapper objects
		List<String> asList2 = Arrays.asList(str);
		Map<Integer, Long> collect = Arrays.stream(arr).boxed().collect(Collectors.groupingBy(i->i,Collectors.counting()));
		System.out.println(collect);
		System.out.println(asList2);

	}

}
