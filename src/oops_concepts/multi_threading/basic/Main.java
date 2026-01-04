package oops_concepts.multi_threading.basic;

public class Main {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();
        Thread myRunnable = new Thread(new MyRunnable());
        myRunnable.start();
        Runnable myRunnableAnonymous = new Runnable() {
            @Override
            public void run() {
                System.out.println("Running My Runnable Anonymous");
            }
        };
        new Thread(myRunnableAnonymous).start();
        Thread myRunnablelambda= new Thread(
                ()-> {
                    System.out.println("Running My Runnable Lambda");
                }
        );
        myRunnablelambda.start();
    }
}
