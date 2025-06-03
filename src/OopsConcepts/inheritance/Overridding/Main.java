package OopsConcepts.inheritance.Overridding;

public class Main {

	public static void main(String[] args) {
		                                /* Overriding EXAMPLE */
		//creating child class object
		//Child class object can be created in two ways
		                                          //1---->
		
		//Superclass reference, Subclass constructor/Object
		//It can only call those methods which are in SuperClass
		//out of those the Overridden methods will execute from Child class
		//but Static methods can't be Overridden will be executed only from Super Class
		Parent parent= new Child();
		//Child c4= (Child) new Parent();
		
		
		parent.m1(); //public override method
		parent.m5(); //protected overridden method
		/*
		 * m1(), m5() is common in both super and subclass and has been Overridden in child class.
		 * Since it has Superclass reference it will call super m1()/ m5()
		 * but At runtime Compiler will execute the Child class m1()/ m5()
		 * Example of overriding and runtime Polymorphism.
		 */
		
		//I can not call c1.m1(int), as that is Sub Class overloaded method, Does not belong to Super Class
		
		parent.m2();
		/*
		 * m2() is SuperClass method.
		 * Since c1 has Superclass reference it uses the reference to execute
		 * Superclass method m2(). example of Inheritance
		 */
		
		//c1.m3();
		/*
		 * Compile time error(The method m3() is undefined for the type Parent)
		 * although c1 is child class object, it gets references from the Superclass. 
		 * child class method m3() is not there in parent, so it can not be referenced.
		 * only methods from the referencing class  can be called
		 */

		Parent.stat1();
		/*
		 * Static methods can't be overridden and will be executed from the Super Class only
		 * Runtime polymorphism or Overriding is not Allowed
		 * Both the static methods with same name will belong to the respective Separate classes
		 */
		                                          //2---->
		 
		//Subclass reference, Subclass constructor
		//Object of Child class only has reference to Child class.
		//But Inherits parent class methods, fields
		Child child= new Child();

		child.m1();
		/*
		 * m1() is common in both super and subclass and has been Overridden in child class.
		 * Since c1 is Child class object with Child class reference it will Call and execute the Child class m1()
		 * it can not reference Super Class m1(), But if no implementation of m1() is present in child class, it will borrow the implementation from Parent class
		 */
		
		child.m2();
		/*
		 * Does not have superclass reference, but It inherits all Superclass components
		 * It will call and execute parent class m2() method as it inherits parent class methods and fields
		 */
		
		child.m3();
		/*
		 * No Compile time error
		 * Here c1 is child class object, and also gets references from Child class
		 * child class method m3() is present in Child class and can be referenced.
		 */
	}

}
