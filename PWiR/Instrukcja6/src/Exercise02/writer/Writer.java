package Exercise02.writer;


import Exercise02.Test;

public class Writer implements Runnable {


    @Override
    public void run() {
        try {
            Test.sem.release();
            System.out.println(Thread.currentThread().getName() + " is reading some information");
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}