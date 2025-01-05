package Lambda;

import java.util.concurrent.Callable;

public class Main {

	public static void main(String[] args) {

//
//		MyFunctionalInterfaceImpl impl= new MyFunctionalInterfaceImpl();
//		impl.showName();

		//Anonymous class
		//this class doesnot have a name only implementation is present
		MyFunctionaInterface i2 = new MyFunctionaInterface() {
			
			@Override
			public void showName() {
			}
		};
		i2.showName();
		
		//Using lambda to implement functional interface
		MyFunctionaInterface i1 = ()->{
			//implementation
			System.out.println("Using lambda");
		};
		i1.showName();
		
		//Using lambda to implement Runnable to create Thread
		
		Runnable thread1= ()-> {
			for (int i = 10; i >= 1; i--){
				try {
					System.out.println("Inside Thread 1");
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
		};
		
		Runnable thread2= ()->{
			for (int i = 10; i >= 1; i--){
				try {
					System.out.println("Inside Thread 2");
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		Thread t1 = new Thread(thread1);
		Thread t2= new Thread(thread2);
		t1.start();
		t2.start();
		
		
		
		
	}
}
