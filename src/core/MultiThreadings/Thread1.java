package Core.MultiThreadings;

public class Thread1 extends Thread{
	@Override
	public void run() {
		int normPriority = Thread.NORM_PRIORITY;
		for (int i = 10; i>0; i--)
		{
			Thread.currentThread().setPriority(NORM_PRIORITY);
			System.out.println("I am Child thread 1"+ Thread.currentThread().getPriority());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
