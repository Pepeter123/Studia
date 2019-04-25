package test;

import ab.Ab;
import sum.Sum;

import java.util.concurrent.Semaphore;

public class Test extends Thread {
    public static Semaphore semaphore = new Semaphore(1);
    public static Semaphore semaphore1 = new Semaphore(0);

    public static void main(String[] args) {
        Ab ab = new Ab();
        Thread threadAb = new Thread(ab);
        Thread threadSum = new Thread(new Sum(ab));
        threadAb.start();
        threadSum.start();

    }
}
