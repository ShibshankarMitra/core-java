package async_programming;

public class ServiceA {
    public void performTask() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Service A performing task.");
    }

    public int returnValue() {
        //Thread.sleep(10000);
        return 20;
    }
}