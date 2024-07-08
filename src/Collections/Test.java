package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
public static void main(String[] args) {
	
//	String str= "bbbab";
//	Map<Integer, Long> collect = str.chars().boxed().collect(Collectors.groupingBy(i->i,Collectors.counting()));
//	Optional<Entry<Integer, Long>> max = collect.entrySet().stream().filter(e->e.getValue()>1).max((i,j)->i.getValue().compareTo(j.getValue()));
//	Integer c= max.get().getKey();
//	Long size = max.get().getValue();
//	int sizeint = size.intValue();
//	
//	Integer value = max.get().getKey();
//	char[] carr= {value, value, value, value};
	
	int[] arr= {3, 1, 2, 5, 3};
	int current=0;
	for(int i=0;i< arr.length-1;i++)
	{
		if (arr[i]>arr[i+1])
			current = arr[i+1];
			arr[i+1]=arr[i];
			arr[i]=current;
	}
	System.out.println(arr);
	
	 for(int i=0;i< arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	 
	 Map<Integer, String> map = new HashMap<>();
	 map.put(1001, "Shnakar");
	 map.put(1002, "Shib");
	 map.put(1003, "Chnadan");
	 
	 Set<Entry<Integer, String>> entrySet = map.entrySet();
	 Iterator<Entry<Integer, String>> iterator = entrySet.iterator();
	 while( iterator.hasNext()) {
		 System.out.println(iterator.next());
	 }

}
}
