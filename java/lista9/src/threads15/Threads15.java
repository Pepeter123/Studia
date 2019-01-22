package threads15;

public class Threads15 implements Runnable{

    private static int id; //bez static za każdym razem tworze nowe pole.
    // w tym przypadku przydzielam jedno pole do wszystkich obiektów(static - nalezy do klasy)

   /* Threads15(int id){
        this.id = id;
    }
*/

    public Threads15() { id++;
    }

    @Override
    public void run(){
        while(true) {
            System.out.println("Watek "+id);
            try {
                //usypiamy wątek na 100 milisekund
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}