package Exercise02;

import Exercise02.caller.Caller;

import java.util.concurrent.Semaphore;

public class Ring {
    private static int PERMITS = 3;
    private static int SIZE = 3;

    public static Semaphore semaphore = new Semaphore(PERMITS);

    public static void main(String[] args) {

        Caller[] callers = new Caller[SIZE];
        Thread[] threads = new Thread[3];

        for (int i = 0; i < 3; i++) {
            callers[i] = new Caller();
            threads[i] = new Thread(callers[i]);
            threads[i].start();
        }

    }
}