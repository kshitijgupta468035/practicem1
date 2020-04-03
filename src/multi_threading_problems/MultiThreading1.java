package multi_threading_problems;

public class MultiThreading1 extends Thread{
    public void run() {
        System.out.println("MultiThreading1 is executing");
    }
}

class Thread2 extends Thread {
    public void run() {
        System.out.println("Thread2 is executing");
    }
}

class Thread3 extends Thread {
    public void run() {
        System.out.println("Thread3 is executing");
    }
}

class Thread4 extends Thread {
    public void run() {
        System.out.println("Thread4 is executing");
    }
}

class Thread5 extends Thread {
    public void run() {
        System.out.println("Thread5 is executing");
    }
}

class MainThread {
    public static void main(String[] args) {
        int z = 0;
        System.out.println("Main thread is executing");

        MultiThreading1 a = new MultiThreading1();
        a.start();
        Thread2 b = new Thread2();
        b.start();
        Thread3 c = new Thread3();
        c.start();
        Thread4 d = new Thread4();
        d.start();
        Thread5 e = new Thread5();
        e.start();

        System.out.println("main thread wxecution ends");

    }
}