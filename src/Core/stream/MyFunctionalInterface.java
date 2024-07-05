package com.java.stream;

@FunctionalInterface
public interface MyFunctionalInterface {

	public abstract void m1();
	
	public default void m2() {
		System.out.println("Inside default method");
	}
}
