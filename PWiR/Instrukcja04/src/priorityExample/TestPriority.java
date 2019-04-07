package priorityExample;

public class TestPriority {
    public static void main(String arg[]) {

        PriorityExample2 p1 = new PriorityExample2();

        Thread t1 = new Thread(p1, "First thread");
        Thread t2 = new Thread(p1, "Second thread");

        t1.setPriority(1);
        t2.setPriority(t1.getPriority() + 5);
        t1.start();
        t2.start();
    }
}
