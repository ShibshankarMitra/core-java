package ThreadExecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyExecutor {

	public static void main(String[] args) {
		ExecutorService exe =  Executors.newFixedThreadPool(5);
		for(int i=0;i<10;i++)
		exe.execute(()->{
			System.out.println(Thread.currentThread());
		});

	}

}
