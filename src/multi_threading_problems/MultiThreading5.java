package multi_threading_problems;

public class MultiThreading5 implements Runnable {
    @Override
    public void run() {
        OpenFile();
    }

    // Synchronized method (only 1 thread is allowed)
    private synchronized void OpenFile() {
        System.out.println(Thread.currentThread().getName() + " is " + "start");
        System.out.println(Thread.currentThread().getName() + " is still running");

        try {
            Thread.sleep(500);
        } catch(InterruptedException ex) {
            System.out.println(Thread.currentThread().getName() + " completes");
        }
    }
}

class CallingThread {
    public static void main(String[] args) {
        MultiThreading5 a = new MultiThreading5();
        Thread update = new Thread(a);
        Thread read = new Thread(a);
        update.setName("Updating Process");
        read.setName("Reading Process");
        update.start();
        read.start();
    }
}
