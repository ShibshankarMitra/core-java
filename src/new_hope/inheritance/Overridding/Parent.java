package new_hope.inheritance.Overridding;

public class Parent {
	int a;
	int b;
	public Parent() {
		super();
	}
	public Parent(int a, int b) {
		super();//Its a child class of object. It calls Object class Constructors
		this.a = a;
		this.b = b;
	}
	public void m1() {
		System.out.println("super class m1()");
	}
	
	public void m2() {
		System.out.println("super class m2()");
	}
	
	public static void stat1() {
		System.out.println("super class static() 1");
	}

	public void stat2() {
		System.out.println("Super Class non-static() 4");
	}
	
	public static void stat3() {
		System.out.println("Super Class Static() 4");
	}
	
	
}
