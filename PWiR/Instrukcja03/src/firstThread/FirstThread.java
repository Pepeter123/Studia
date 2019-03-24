package firstThread;

public class FirstThread extends Thread {
    public void run() {
        for (int i = 0; i < 10; i++)
            System.out.println(Thread.currentThread().getName());
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
