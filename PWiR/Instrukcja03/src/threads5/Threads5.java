package threads5;

public class Threads5 extends Thread {
    Threads5(String name) {
        super(name);
    }

    @Override
    public synchronized void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName() + " currently working thread");
    }
}
