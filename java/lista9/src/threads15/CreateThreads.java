package threads15;

public class CreateThreads {
    public static void main(String[] args) {
        Runnable[] runners = new Runnable[15];
        Thread[] threads = new Thread[15];

        for(int i=0; i<15; i++) {
            runners[i] = new MyRun(i);
        }

        for(int i=0; i<15; i++) {
            threads[i] = new Thread(runners[i]);
        }

        for(int i=0; i<15; i++) {
            threads[i].start();
        }
    }
}