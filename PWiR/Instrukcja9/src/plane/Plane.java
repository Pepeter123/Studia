package plane;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

public class Plane implements Runnable {
    private Random rand = new Random();
    private final ArrayList<Thread> ship;
    private int fuel;
    private ArrayBlockingQueue<Thread> queue;

    public Plane(int fuel, ArrayBlockingQueue<Thread> queue, ArrayList<Thread> ship) {
        this.fuel = fuel;
        this.queue = queue;
        this.ship = ship;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("Samolot " + Thread.currentThread().getName() + " lata z zapasem benzyny " + getFuel() + "%");
                setFuel(getFuel() - rand.nextInt(20));
                Thread.sleep(rand.nextInt(2000));
                if (getFuel() < 20) {
                    queue.put(Thread.currentThread());
                    System.out.println("Laduje samolot " + Thread.currentThread().getName());
                    queue.take();
                    ship.add(Thread.currentThread());
                    Thread.sleep(2000);
                    System.out.println("Samolot "+Thread.currentThread().getName()+" zostal zatankowany");
                    setFuel(100);
                    queue.put(Thread.currentThread());
                    System.out.println("Startuje samolot " + Thread.currentThread().getName());
                    ship.remove(Thread.currentThread());
                    queue.take();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }

    private void setFuel(int fuel) {
        this.fuel = fuel;
    }

    private int getFuel() {
        return fuel;
    }
}