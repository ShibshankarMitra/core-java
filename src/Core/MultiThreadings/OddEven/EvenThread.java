package Core.MultiThreadings.OddEven;

public class EvenThread extends Thread{
	Logic logic;
	public EvenThread(Logic logic) {
		super();
		this.logic = logic;
	}
	@Override
	public void run() {
		while(true) {
		try {
			logic.evenPrint();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}
	}
}
