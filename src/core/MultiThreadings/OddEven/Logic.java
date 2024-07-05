package Core.MultiThreadings.OddEven;

public class Logic {

	int current=0;
	//if current%2==0 then evenPrint()
	//if current%2!=0 then oddPrint()
	synchronized void oddPrint() throws InterruptedException {
		
		if(current%2!=0) {
		
			System.out.println("Odd Thread- "+current);
			current=current+1;
			this.notify();
		}
		else this.wait();
	}
	
	synchronized void evenPrint() throws InterruptedException {
		
		if(current%2==0) {
			
			System.out.println("Even Thread- "+current);
			current=current+1;
			this.notify();
		}
		else this.wait();
	}
}
