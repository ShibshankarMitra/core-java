package async_programming;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class AsyncSupply {

    public ServiceA serviceA;
    public ServiceB serviceB;
    public AsyncSupply() {
        serviceA = new ServiceA();
        serviceB = new ServiceB();
    }
    public static void main(String[] args) {
        AsyncSupply asyncSupply = new AsyncSupply();
        List<Integer> list = IntStream.range(0, 201).boxed().collect(Collectors.toList());
        Iterator<Integer> iterator = list.iterator();
        CompletableFuture<Void> futureA = CompletableFuture.supplyAsync(()->asyncSupply.serviceA.returnValue())
                .thenAccept(i-> {
                    System.out.println("Adding elements to the list in Service A Thread: "+Thread.currentThread().getName());
                    while(i>0){
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        list.remove(i);
                        i--;
                    }
                });
        CompletableFuture<Void> futureB = CompletableFuture.supplyAsync(()->asyncSupply.serviceB.returnValue())
                .thenAccept(i-> {
                    System.out.println("Adding elements to the list in Service B Thread: "+Thread.currentThread().getName());
                    while(i>0){
                        try {
                            Thread.sleep(50);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                        list.add(i);
                        i--;
                    }
                });
        CompletableFuture.allOf(futureA, futureB).join();
        System.out.println(list.toString());
    }

}
