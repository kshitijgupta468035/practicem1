package multi_threading_problems;

// Implementing runnable Interface

public class MultiThreading2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++)
            System.out.println("1st Thread Run" + i);

        System.out.println("End of thread 1");
    }
}

class ThreadR2 implements Runnable {
    @Override
    public void run() {
        for (int j = 1; j <= 5; j++)
            System.out.println(j + "Runs left of threadr2");

        System.out.println("End of threadr2");
    }
}

class MainThread2 {
    @Override
    public String toString() {
        return super.toString();
    }

    public static void main(String[] args) {
        MultiThreading2 a = new MultiThreading2();
        ThreadR2 b = new ThreadR2();
        Thread t1,t2;
        t1 = new Thread(a);
        t2 = new Thread(b);
        t1.start();
        t2.start();
        System.out.println("Main thread executes");

    }
}
