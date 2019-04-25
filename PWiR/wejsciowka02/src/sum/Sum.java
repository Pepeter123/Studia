package sum;

import ab.Ab;
import test.Test;

public class Sum implements Runnable {
    private Ab ab;

    public Sum(Ab x) {
        this.ab = x;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Test.semaphore1.acquire();
                System.out.println(ab.getA() + " , " + ab.getB());
                int sum = ab.getA() + ab.getB();
                System.out.println("Suma = " + sum);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Test.semaphore.release();
        }
    }
}
