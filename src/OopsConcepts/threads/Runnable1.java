package OopsConcepts.threads;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runnable1 implements Runnable { //does not support throwing exception and returns nothing


    @Override
    public void run() {
        System.out.println("inside thread1");
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<?> future;
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            future = executorService.submit(new Runnable1());
        }
        future.get();
    }
}
