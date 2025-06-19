package async_programming;

public class ServiceB {
    public void performTask() throws InterruptedException {
        Thread.sleep(10000);
        System.out.println("Service b performing task.");
    }

    public int returnValue() {
        //Thread.sleep(5000);
        return 10;
    }
}