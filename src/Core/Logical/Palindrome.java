package Logical;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {
	
	int reverse(int number) {
		//Using StringBuffer to reverse
		Integer num= number;
		StringBuffer str = new StringBuffer(num.toString());
		str.reverse();
		int reversed= Integer.parseInt(str.toString());
		return reversed;
		
	}
	
	int reverse1(int number) {
		List<Integer> list= new ArrayList<>();
		while(number!=0) {
			list.add(number%10);
			number=number/10;
		}
		int order=list.size()-1;
		
		int num=0;
		for(int i=0;i<list.size();i++)
		{
			int digit = list.get(i);
			num= num+ (int) (digit * Math.pow(10,order));
			order=order-1;
		}
		
		
		
		System.out.println(list);
		return num;
	}
	

	public static void main(String[] args) {
		
		int number=12321;
		Palindrome pd= new Palindrome();
		int reverse = pd.reverse1(number);
		System.out.println(reverse);

	}

}
