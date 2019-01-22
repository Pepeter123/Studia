package Logs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class LogsFightExThread extends Thread {

    private static Random rand = new Random();
    private int damage = rand.nextInt(90) + 10;
    private int hour = rand.nextInt(24) + 1;
    private int minute = rand.nextInt(60);
    private String[] types = {"Mage", "Warrior", "Archer"};
    private String type = types[rand.nextInt(types.length)];

    private synchronized void saveToFile() throws IOException { // jak funckja static to saveToFile(LogsFightRun l), zamiast this => l,
        BufferedWriter pw = new BufferedWriter(new FileWriter("Logs.txt", true));
        pw.append("\nType of enemy: ").append(this.getType()).append("\nDamage taken: ").append(String.valueOf(this.getDamage()))
                .append("\nTime of attack: ").append(String.valueOf(this.getHour())).append(":")
                .append(String.valueOf(this.getMinute())).append("\n\n");
        pw.close();
    }

    @Override
    public void run() {
        try {
            this.saveToFile(); // musi byc statyczna - saveToFile(this) - jako parametr funckja wywoluje sama siebie
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private int getDamage() {
        return damage;
    }

    private int getHour() {
        return hour;
    }

    private int getMinute() {
        return minute;
    }

    private String getType() {
        return this.type;
    }
}


