package priorityExample;

public class PriorityExample implements Runnable {
    public void run() {
        while(true) {
            System.out.println(Thread.currentThread().getName());
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
