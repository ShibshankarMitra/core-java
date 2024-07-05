package com.java.generics;

public class Add {

	public<T> void adddition(T obj, int result){
		
		System.out.println(result+Integer.parseInt(obj.toString()));
		
		
		
	}

	public static void main(String[] args) {
		Add add= new Add();
		add.adddition(100, 100);
		
		System.out.println("B"+"A");

	}

}
