package Exercise01;

import Exercise01.data.Data;
import Exercise01.delta.Delta;
import Exercise01.roots.Roots;

import java.util.concurrent.Semaphore;

public class Test {
    private static Data data = new Data();
    private static Delta delta = new Delta(data);
    private static Thread roots = new Thread(new Roots(data, delta));

    static Semaphore semaphore = new Semaphore(1);


    public static void main(String[] args){


        data.run();
        delta.run();
        roots.run();


    }
}