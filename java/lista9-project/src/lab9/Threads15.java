package lab9;

import java.lang.Object;
import java.text.*;
import java.util.Date;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;

public class Threads15 implements Runnable {
    DateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
    SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");

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
        System.out.println("Watek " + Thread.currentThread().getId() + " " + date); // w println + id;
        try {
            //usypiamy wątek na 100 milisekund
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}