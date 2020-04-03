package multi_threading_problems;

// Thread Priority

public class MultiThreading4 extends Thread {
    @Override
    public void run() {
        System.out.println("Threads of  A is executing");
        for (int i = 1; i <=5; i++)
            System.out.println("Thread A " + i);
    }
}

class ThreadT2 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread B is executing");
        for (int i = 1; i <= 5; i++)
            System.out.println("Thread B " + i);
    }
}

class MainThread4 {
    public static void main(String[] args) {
        System.out.println("Main Thread Executes");

        MultiThreading4 a = new MultiThreading4();
        ThreadT2 b = new ThreadT2();
        a.setPriority(1); // min
        b.setPriority(10); // max
        b.start();
        a.start();

        System.out.println("Main Thread Exceution Ends");
    }
}