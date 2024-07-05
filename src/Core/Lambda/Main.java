package Core.Lambda;

import java.util.concurrent.Callable;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//
//		MyFunctionalInterfaceImpl impl= new MyFunctionalInterfaceImpl();
//		impl.showName();
	
		
		
		//Anonymous class
		//this class doesnot have a name only implementation is present
		MyFunctionaInterface i2 = new MyFunctionaInterface() {
			
			@Override
			public void showName() {
				// TODO Auto-generated method stub
				
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
		
		Runnable thread1= ()->{
			//implementation of thread
			for(int i = 10; i>=1; i--) 
			System.out.println("Inside Thread 1");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
		
		
		Runnable thread2= ()->{
			//implementation of thread
			for(int i = 10; i>=1; i--) 
			System.out.println("Inside Thread 2");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		};
		
		Thread t1 = new Thread(thread1);
		Thread t2= new Thread(thread2);
		t1.start();
		t2.start();
		
		
		
		
	}
}
