package Exercise01;

import Exercise01.data.Data;
import Exercise01.delta.Delta;
import Exercise01.roots.Roots;

import java.util.concurrent.Semaphore;

public class Test extends Thread {

    public static Semaphore semaphore = new Semaphore(0);

    public static void main(String[] args){

        Data data = new Data();
        Delta delta = new Delta(data);
        Roots roots = new Roots(data, delta);

        Thread[] threads = new Thread[3];
        threads[0] = new Thread(data);
        threads[1] = new Thread(delta);
        threads[2] = new Thread(roots);

        for(Thread t: threads)
        t.start();

    }
}