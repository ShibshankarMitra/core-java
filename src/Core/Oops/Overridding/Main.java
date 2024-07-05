package Core.Oops.Overridding;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		                                /* Overriding EXAMPLE */
		
		//creating child class object
		//Child class object can be created in two ways
		
		
		
		                                          //1---->
		
		//Superclass reference, Subclass constructor/Object
		//Object/Constructor of Sub class but has Superclass reference
		//It can only call those methods which are in SuperClass
		//out of those the Overridden methods will executed from Child class
		//but Static methods can't be Overridden will be executed only from Super Class
		Parent c1= new Child();
		//Child c4= (Child) new Parent();
		
		
		c1.m1();
		/*
		 * m1() is common in both super and sub class and has been Overridden in child class. 
		 * Since it has Superclass reference it will call super m1()
		 * but At runtime Complier will execute the Child class m1()
		 * Example of runtime Polymorphism.
		 */
		
		//I can not call c1.m1(int), as that is Sub Class overloaded method, Does not belong to Super Class
		
		c1.m2();
		/*
		 * m2() is SuperClass method.
		 * Since c1 has Superclass reference it uses the reference to execute
		 * Superclass method m2(). example of Inheritance
		 */		
		
		
		//c1.m3();
		/*
		 * Complie time error(The method m3() is undefined for the type Parent)
		 * although c1 is child class object, it gets references from the Superclass. 
		 * child class method m3() is not there in parent, so it can not be referenced.
		 * only methods from the referencing class  can be called
		 */
		
		
		c1.stat1();
		/*
		 * Static methods can't be overridden and will be executed from the Super Class only
		 * Runtime polymorphism or Overridding is not Allowed
		 * Both the static methods with same name will belong to the respective Separate classes
		 */
		
		
		                                          //2---->
		 
		//Subclass reference, Subclass constructor/Object
		//object of Child class only has reference to Child class.
		//But Inherits parent class methods, fields
		Child c2= new Child();
		
		
		c2.m1();
		/*
		 * m1() is common in both super and sub class and has been Overridden in child class. 
		 * Since c1 is Child class object with Child class reference it will Call and execute the Child class m1()
		 * it can not reference Super Class m1(), But if no implementation of m1() is present in child class, it will borrow the implementation from Parent class
		 */
		
		
		
		c2.m2();
		/*
		 * Does not have superclass reference but It inherits all Superclass components
		 * It will call and execute parent class m2() method as it inherits parent class methods and fields
		 */
		
		c2.m3();
		/*
		 * No Complie time error
		 * Here c1 is child class object, and also gets references from Child class
		 * child class method m3() is present in Child class and can be referenced.
		 */
		
		
		
		
		
		                                          /* OTHERS */
		
		
		//Creating a superclass object
		Parent p1= new Parent();//Super class reference Superclass Constructor
		
		
		p1.m1();
		/*
		 * Executes the superclass m1(), since it is a Superclass Object with Superclass
		 * reference
		 */
		
		p1.m2();
		/*
		 * Executes the superclass m2(), since it is a Superclass Object with Superclass
		 * reference
		 */
		
		
		// Wrong way
		//Child c3= new Parent();//Type mismatch: cannot convert from Parent to Child
		
		
		LocalDateTime time= LocalDateTime.now();
		
		
		
		
		

	}

}
