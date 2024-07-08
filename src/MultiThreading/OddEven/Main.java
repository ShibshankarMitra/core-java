package MultiThreading.OddEven;

public class Main {

	public static void main(String[] args) {
		 Logic l = new Logic();
		 OddThread oddThread= new OddThread(l);
		 EvenThread evenThread =  new EvenThread(l);
		 oddThread.start();
		 evenThread.start();

	}

}
