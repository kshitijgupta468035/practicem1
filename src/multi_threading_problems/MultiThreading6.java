package multi_threading_problems;

// Daemon Thread

public class MultiThreading6 extends Thread {
    public void run() {
        try {
            while(true) {
                System.out.println("Daemon Threaded Runs");
                Thread.sleep(100);
            }
        } catch(Exception e) {
        }
    }
}

class Main {
    public static void main(String[] args) {
        MultiThreading6 dae = new MultiThreading6();
        dae.setDaemon(true);
        dae.start();

        System.out.println("Main Thread Starts");

        try {
            Thread.sleep(1000);
        } catch(Exception e) {}
        System.out.println("Main Thread Ends");
    }

}
