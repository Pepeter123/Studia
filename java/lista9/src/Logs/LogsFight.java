package Logs;

public class LogsFight implements Runnable{

    public static void main(String[] args){
        Runnable r = new LogsFight();
        Thread t = new Thread(r);
        t.start();

    }

    private int damage;
    private int time;
    private int hour;
    private int minute;
    private String type;

    @Override
    public void run() {


    }


    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public String getType(){

        return this.type ;
    }

    public void setType(String a){
        this.type = a;
    }
}