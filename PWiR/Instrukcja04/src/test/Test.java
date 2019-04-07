package test;

import minMax.MinMax;

import java.util.Random;

import static minMax.MinMax.a1;

public class Test {
    private static int SIZE = 10;


    public static void main(String[] args) throws InterruptedException {
        //ArrayList<Integer> ar = new ArrayList<>();
        //MinMax a1 = new MinMax();
        long runTimeStart = System.currentTimeMillis();

        Random rd = new Random();
        for (int i = 0; i < SIZE; i++) {
            a1[i] = rd.nextInt(100);
        }

        System.out.println();
        for (int e : a1) {
            System.out.print(e + " ");
        }

        Thread[] t = new Thread(new MinMax())[4];
        for(Thread e: t){
        t[e].start();
        t[e].join();
}
        long runTimeEnd = System.currentTimeMillis();
        System.out.println("Run Time: " + (runTimeEnd - runTimeStart) + "ms");
    }
}
// time without threads = 2-9ms
// time with one thread = 3-7ms

