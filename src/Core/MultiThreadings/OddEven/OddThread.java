package Core.MultiThreadings.OddEven;

public class OddThread extends Thread{
	
	Logic logic;
	
	public OddThread(Logic logic) {
		super();
		this.logic = logic;
	}

	@Override
	public void run() {
		
		while(true) {
		try {
			this.logic.oddPrint();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}

}
