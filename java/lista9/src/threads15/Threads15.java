package threads15;

import java.text.*;
import java.util.Date;

public class Threads15 implements Runnable {
    private DateFormat df = new SimpleDateFormat("yyyy.MM.dd");
    private Date date = new Date();

    //private static int id; //bez static za każdym razem tworze nowe pole.
    // w tym przypadku przydzielam jedno pole do wszystkich obiektów(static - nalezy do klasy)
    //Threads15(int id){
    //this.id = id;
    //}

    Threads15() {
    }

    @Override
    public void run() {
        //id++;
        System.out.println("Watek " + Thread.currentThread().getId() + " " + df.format(date) );
        try {
            //usypiamy wątek na 300 milisekund
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}