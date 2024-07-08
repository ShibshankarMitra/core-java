package Logical;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
	
	List<Integer> primeFactors(int num){
		
		List<Integer> list= new ArrayList<>();
		int number=num;
		int c=2;
		
	while(number!=1) {
		
		while(number%c==0) {
			number=number/c;
			list.add(c);
		}
		c++;
		
	}
		
		
		return list;
	}

	public static void main(String[] args) {
		
		PrimeFactors pf= new PrimeFactors();
		System.out.println(pf.primeFactors(135));
	}

}
