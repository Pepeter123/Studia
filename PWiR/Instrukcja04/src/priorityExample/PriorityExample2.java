package priorityExample;

public class PriorityExample2 implements Runnable {
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
/*
           try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
*/

        }
    }

}
