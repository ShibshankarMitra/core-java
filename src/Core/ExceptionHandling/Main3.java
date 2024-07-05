package ExceptionHandling;


class Ex0 extends Exception{};
class Ex1 extends Ex0{};

public class Main3 {

	public static void main(String[] args) {
		try {
			throw new Ex1();
		} 
		catch (Ex1 e1) {//Ex0 is the immediate Super Class
			System.out.println("Caught Ex1");
			//In this case the Ex1 will be directly caught of same type
		}
		catch (Ex0 e0) {//Ex0 is the immediate Super Class
			System.out.println("Caught Ex0");
			//Only the most immidiate superclass will be caught
		}
		catch (Exception e) {//Exception is the Superclass of Ex0
			System.out.println("Caught Exception");
			//Will not be executed as It is the Super-most Class
		}
	}

}
