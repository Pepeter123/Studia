package test;

import firstThread.FirstThread;

public class Test {
    public static void main(String[] args) {
        for(int i=0; i<5; i++) {
            FirstThread t = new FirstThread();
            t.setName("Watek" +i);
            t.start();
        }
    }
}
