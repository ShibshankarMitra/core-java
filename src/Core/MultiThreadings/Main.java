package Core.MultiThreadings;

public class Main {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());
		Thread1 t1 = new Thread1();
		t1.start();
		Thread2 t2 = new Thread2();
		t2.start();
		
		
		

		

	}

}
