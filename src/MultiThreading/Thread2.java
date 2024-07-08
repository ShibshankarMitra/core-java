package MultiThreading;

public class Thread2 extends Thread{
	@Override
	public void run() {
		for (int i = 10; i>0; i--)
		{
			System.out.println("I am Child thread 2");
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
