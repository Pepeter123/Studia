package Logs;


import java.io.*;
import java.util.Random;

public class LogsFight implements Runnable{

    public static void main(String[] args) throws IOException {
        Runnable r = new LogsFight();
        Thread t = new Thread(r);
        Thread[] l = new Thread[SIZE];
        for (int i = 0; i < l.length; i++) {
            l[i] = new Thread(r); //nowy watek, ktory jako parametr przyjmuje LogsFight
            l[i].start();
        }


    }
    private static int SIZE = 3;
    private int damage = rand.nextInt(90)+10;
    private int time;
    private int hour =  rand.nextInt(24)+1;
    private int minute =  rand.nextInt(60);
    String[] types = { "mage", "warrior", "archer" };
    private String type = types[rand.nextInt(types.length)];



    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("Logs.txt"))
            for (int i = 0; i < l.length; i++) {
                pw.print("Type of enemy: " + l[i].getType );
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        }





    static Random rand = new Random();

    public int getDamage() {
        return damage;
    }


    public int getTime() {
        return time;
    }


    public int getHour() {
        return hour;
    }


    public int getMinute() {
        return minute;
    }


    public String getType(){

        return this.type ;
    }

}