package Core.Referencing;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		System.out.println("Starting the app");
		//using lambda to give impl
//		WorkInterface wi= ()->{
//			System.out.println("Doing Stuff lambbda");
//		};
//		wi.doTask();
		//using Method reference for the impl
		WorkInterface wi= Stuff::doStuff;
		wi.doTask();
		//Using in multithreading
		Runnable t1= Stuff::doStuff;
		Thread thread1= new Thread(t1);
		thread1.start();
		//Method referencing in Collections
		List<Integer> listOfInteger = List.of(1,22,45,789,3,5,69,50);
		listOfInteger.stream().forEach(System.out::println);
		String str= new String("Shibshankar");
	    System.out.println(str.charAt(50));
	}
}
