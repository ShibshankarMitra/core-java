package oops_concepts.multi_threading.parallel_programming;

import java.util.concurrent.Callable;

public class LastNameCallable implements Callable<String> {

    private final String lastName;

    public LastNameCallable(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String call() {
        // Simulate some processing
        try {
            Thread.sleep(10000); // Simulating a delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt(); // Restore interrupted status
        }
        return lastName;
    }
}
