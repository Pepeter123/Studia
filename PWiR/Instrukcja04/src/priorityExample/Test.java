package priorityExample;

public class Test {
    public static void main(String[] arg){
        PriorityExample p1 = new PriorityExample();
        new Thread(p1, "First thread").start();
        new Thread(p1, "Second thread").start();
    }
}
