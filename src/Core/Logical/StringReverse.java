package Logical;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		String str= new String("ShibihSha");
		
		//to get the Charecter Array we call str.toCharArray()
		//but to get a stream of Charectors we call str.chars().mapToObj(c->(char)c)
		List<Character> collect = str.chars().mapToObj(c->(char)c).collect(Collectors.toList());
		char[] arr= new char[collect.size()];
		
		Iterator<Character> it = collect.iterator();
		int i= collect.size();
		while(it.hasNext()) {
			arr[i-1]=it.next();
			i--;
		} 
		
		String test= new String(arr);
		System.out.println(test.equals(str));

	}

}
