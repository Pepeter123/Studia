import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Main {
    private final static int SIZE = 10;

    public static void main(String[] args) {

        ArrayBlockingQueue<Integer> kolejka1 = new ArrayBlockingQueue<>(SIZE);
        ArrayBlockingQueue<Integer> kolejka2 = new ArrayBlockingQueue<>(SIZE);

        System.out.println("Program wejściówka - START");

        final int W1_SIZE = 4;
        final int W2_SIZE = 1;
        final int W3_SIZE = 2;

        Watek1[] w1 = new Watek1[W1_SIZE];
        Watek2[] w2 = new Watek2[W2_SIZE];
        Watek3[] w3 = new Watek3[W3_SIZE];

        /*W1*/
        for (int i = 0; i < W1_SIZE; i++) {
            w1[i] = new Watek1(kolejka1);
            Thread t1 = new Thread(w1[i], "W1_" + (i + 1));
            t1.start();
        }

        /*W2*/
        for (int i = 0; i < W2_SIZE; i++) {
            w2[i] = new Watek2(kolejka1, kolejka2);
            Thread t1 = new Thread(w2[i], "W2_" + (i + 1));
            t1.start();
        }

        /*W3*/
        for (int i = 0; i < W3_SIZE; i++) {
            w3[i] = new Watek3(kolejka2);
            Thread t1 = new Thread(w3[i], "W3_" + (i + 1));
            t1.start();
        }
    }
}
