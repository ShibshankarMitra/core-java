package OopsConcepts.multi_threading;

import java.util.concurrent.*;

public class Callable1 implements Callable<String> { //As it implement callable, it will return values and will also be able to throw exceptions
    @Override
    public String call() {
        return "SSM";
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Future<?> future;
        try (ExecutorService executorService = Executors.newSingleThreadExecutor()) {
            future = executorService.submit(new Callable1());
        }
        System.out.println(future.get());
    }
}
