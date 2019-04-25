package ab;

import test.Test;

import java.util.Scanner;

public class Ab implements Runnable {
    private int a;
    private int b;


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Test.semaphore.acquire();

                Scanner sc = new Scanner(System.in);
                System.out.println("A = ");
                int a = sc.nextInt();
                setA(a);
                System.out.println("B = ");
                int b = sc.nextInt();
                setA(b);


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Test.semaphore1.release();
        }
    }

    public int getA() {
        return a;
    }

    private void setA(int aa) {
        this.a = aa;
    }

    public int getB() {
        return b;
    }

    private void setB(int bb) {
        this.b = bb;
    }

}
