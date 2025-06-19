package async_programming;

import java.util.concurrent.CompletableFuture;

public class AsyncRun {

    ServiceA serviceA;
    ServiceB serviceB;

    public AsyncRun() {
        serviceA = new ServiceA();
        serviceB = new ServiceB();
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("AsyncRun programming example.");
        AsyncRun asyncRun = new AsyncRun();
        CompletableFuture<Void> futureA = CompletableFuture.runAsync(() -> {
            try {
                asyncRun.serviceA.performTask();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Service A interrupted: " + e.getMessage());
            }
        });

        CompletableFuture<Void> futureB = CompletableFuture.runAsync(() -> {
            try {
                asyncRun.serviceB.performTask();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.err.println("Service B interrupted: " + e.getMessage());
            }
        });
        CompletableFuture.allOf(futureA, futureB).join();//blocking call to wait for both tasks to complete
        System.out.println("Both services have completed their tasks.");
    }
}
