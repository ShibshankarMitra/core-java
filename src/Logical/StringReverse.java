package Logical;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class StringReverse {

	public static void main(String[] args) {
		int num = 131;
		String str= String.valueOf(num);
		String reversed = str.chars().mapToObj(c -> (char) c)
				.reduce("", (s, c) -> c + s, (s1, s2) -> s2 + s1);
		int reversedNum= Integer.parseInt(reversed);
		if(reversedNum==num){
			System.out.println("Palindrome: "+num);
		}
	}

}
