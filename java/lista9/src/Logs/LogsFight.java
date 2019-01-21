package Logs;


import java.io.*;
import java.util.Random;

public class LogsFight implements Runnable{

    public static void main(String[] args) {
        Runnable r = new LogsFight();
       // Thread t = new Thread(r);
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
    private String[] types = { "mage", "warrior", "archer" };
    private String type = types[rand.nextInt(types.length)];



    @Override
    public void run() {
        try {
            PrintWriter pw = new PrintWriter("Logs.txt");
                pw.print("Type of enemy: " + this.getType() + "\nDamage taken: " + this.getDamage() +
                        "\nTime of attack: " + this.getHour() + ":" + this.getMinute() );
                pw.close();
            BufferedReader br = new BufferedReader(new FileReader("Logs.txt"));
            while(br.readLine() != null)
                br.readLine();
                br.close();


            }
        catch (IOException e) {
            e.printStackTrace();
        }
        }

    private static Random rand = new Random();

    private int getDamage() {
        return damage;
    }


    public int getTime() {
        return time;
    }


    private int getHour() {
        return hour;
    }


    private int getMinute() {
        return minute;
    }


    private String getType(){

        return this.type ;
    }

}