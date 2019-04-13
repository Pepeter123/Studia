package threads5;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) throws InterruptedException {
        ArrayList<Thread> threads = new ArrayList<>(5);


        for (int i = 4; i >= 0; i--) {
            threads.add(new Threads5("Watek nr " + (++i)));
        }

        for (int i = 4; i >= 0; i--) {
            threads.get(i).start();
        }

        for (int i = 4; i >= 0; i--) {
            threads.get(i).join();
        }


    }
}
