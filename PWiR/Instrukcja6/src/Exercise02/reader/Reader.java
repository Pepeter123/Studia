package Exercise02.reader;


import Exercise02.Test;

public class Reader implements Runnable {

    @Override
    public void run() {
        try {
            Test.sem.acquire();
            System.out.println(Thread.currentThread().getName() + " is writing right now!");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}