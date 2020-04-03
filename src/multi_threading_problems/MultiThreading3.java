package multi_threading_problems;

// thread sleep

public class MultiThreading3 extends Thread {
    public void run() {
        System.out.println("Thread A is executing");

        try {
            System.out.println("Thread A sleeps");
            sleep(1000);
            System.out.println("Thread A sleep Over");
        } catch (Exception e) {
        }
    }
}

class ThreadS2 extends Thread {
    public void run() {
        System.out.println("Thread B Executing");
    }
}

class ThreadS3 extends Thread {
    public void run() {
        System.out.println("Thread C is executing");
    }
}

class MainThread3 {
    public static void main(String[] args) {
        System.out.println("Main Thread is executing");
        MultiThreading3 a = new MultiThreading3();
        ThreadS2 b = new ThreadS2();
        ThreadS3 c = new ThreadS3();

        a.start();
        b.start();
        c.start();

        System.out.println("Main Thread execution ends");
    }
}