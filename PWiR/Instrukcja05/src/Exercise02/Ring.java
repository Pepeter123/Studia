package Exercise02;

import Exercise02.caller.Caller;

import java.util.concurrent.Semaphore;

public class Ring extends Thread {

    public static Semaphore semaphore = new Semaphore(1);

    public static void main(String[] args) {
        Thread[] thread = new Thread[3];

        for (int i = 0; i < 3; i++) {
            thread[i] = new Thread(new Caller());
        }

        for (int j = 0; j < 5; j++) {
            for (Thread t : thread)
                t.start();
        }
    }

}
