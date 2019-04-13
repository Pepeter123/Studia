package Exercise01.data;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.util.Scanner;

public class Data implements Runnable {
    private double a = 0.0;
    private double b = 0;
    private double c = 0;

    @Override
    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write A : ");
        setA(sc.nextDouble());
        System.out.println("Write B : ");
        setB(sc.nextDouble());
        System.out.println("Write C : ");
        setC(sc.nextDouble());

    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
}