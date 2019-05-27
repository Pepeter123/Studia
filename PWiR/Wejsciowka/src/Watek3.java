import java.util.concurrent.ArrayBlockingQueue;

public class Watek3 extends Thread {

    private ArrayBlockingQueue<Integer> kolejka2;

    public Watek3(ArrayBlockingQueue<Integer> kolejka_2) {
        kolejka2 = kolejka_2;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < kolejka2.size(); i++) {

                Integer y = kolejka2.take();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.getName() + " wystartował.");
        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + " " + i);
        }
    }
}
