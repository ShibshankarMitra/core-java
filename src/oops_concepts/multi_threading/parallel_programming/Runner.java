package oops_concepts.multi_threading.parallel_programming;

import java.sql.SQLOutput;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Runner {
    public static void main(String[] args) {
        // Create instances of Callable for first and last names
        FirstNameCallable firstNameCallable = new FirstNameCallable("John");
        LastNameCallable lastNameCallable = new LastNameCallable("Doe");

        try (ExecutorService executorService = Executors.newFixedThreadPool(5)) {
            Future<String> firstNameFuture = executorService.submit(firstNameCallable);
            Future<String> lastNameFuture = executorService.submit(lastNameCallable);
            System.out.println("First Name: " + firstNameFuture.get() + " Last Name: " + lastNameFuture.get());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
