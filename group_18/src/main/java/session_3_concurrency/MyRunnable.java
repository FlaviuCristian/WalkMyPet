package session_3_concurrency;

public class MyRunnable implements Runnable {

    @Override
    public void run() {

        System.out.println(Thread.currentThread().getName());
        System.out.println("My Runnable");
    }
}
