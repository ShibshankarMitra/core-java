package Overridding;

public class Child extends Parent {

	int c;
	

	//It can have 3 Constructors------>
	
	//Superclass Default(----> calls super() default superclass constructor internally)
	//Superclass parameterized constructor(----> calls super(field, field,...) parameterized superclass constructor internally)
	
	//child constructor(------>constructor using its own fields)
	

	public Child() {
		super();
		// Internally calling super class default constructor
	}



	public Child(int a, int b, int c) {
		super(a, b);//Calls the parent class constructors first// internally calling superclass parameterized constructors
		this.c= c;//then sets c in this reference to the current object
		
	}



	public Child(int c) {
		super();
		this.c = c;
	}



	//sub class method and Superclass method has same signature
	//example of overriding
	public void m1() {
		System.out.println("sub class m1()");
	}
	
	
	//If we make only the method return type Different lets say int, there would be ambiguity.
//	public int m1() {
//		System.out.println("sub class int m1()");
//		return 0;
//	}
//
	//You can overLoad m1() by changing the parameters
	public void m1(int intgr) {
		System.out.println("sub class m1(int)");
	}
	
	
	// You just cant have same method name+parameter(Signature) with different a return type,
	// for a same method name with different return type you have to use different parameter
	// But that will not be called overloading, Since changing the return type means completely different method
	//Overloading is only when same name and return type but different parameter
	public int m1(String s) {
		System.out.println("sub class int m1()");
		return c;
	}
	
	
	
	//But you can have another m1() with different parameters and different return type
	//But that is not called overloading, If the return type is same then only It will be called as Overloading
	public int m1(int intgr, String s) {
		System.out.println("sub class m1()");
		return intgr;
	}
	
	
	
	
	public void m3() {
		System.out.println("sub class m3()");
	}
	
	
	public static void stat1() {
		System.out.println("Sub class static() 1");
	}
	
	
	
	//public static void stat2() { System.out.println("Sub class static() 2"); }
	
	//stat2() is already declared as non-static instance method in Parent
	//This static method cannot hide the instance method from Parent
	//Either make Parent method Static, or make this non-static.
	
	//public static void stat2() { System.out.println("Sub class static() 2"); }
	 
	 
	
	
	//public void stat3() { System.out.println("Sub class Non-static() 3"); }
	
	//stat3() is already declared in Parent as static
	//This instance method cannot override the static method from Parent
	//Can be declared as Static though
	
	
	
}
