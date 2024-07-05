package com.java.Basic;

import java.util.Scanner;

public class Recurssion {

	public static void main(String[] args) {

		System.out.println("Give a number");
		int i = new Scanner(System.in).nextInt();

		int result= fact(i);
		System.out.println(result);

	}

	private static int fact(int i) {
		
			if(i==1 || i==0)
		    {
			return 1;
		    }
			else
			{
				return fact(i-1) * i;
			}
		

}
}
