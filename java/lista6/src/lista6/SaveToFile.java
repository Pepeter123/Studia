package lista6;

import java.io.*;
/*
 * 
 * 
 * Program zapisuje wynik oraz sk�adowe dodawania z jednym i czterema parametrami
 * 
 * 
 * 
 */

public class SaveToFile {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter zapisz = new PrintWriter("zad2.txt");
		Kalkulator k = new Kalkulator(2);
		Kalkulator k1 = new Kalkulator(1, 1, 1, 1);
		zapisz.println("Wynik:" +k.dodawanie(2)+ " Sk�adowe: " +k.getX());
		zapisz.println("Wynik:" +k1.dodawanie(1, 1, 1, 1)+ " Sk�adowe: " +k1.getX() + " " +k1.getY()+ " " +k1.getZ()+ " " +k1.getW());
		zapisz.close();
		
	}
}






// dana skladowa obiektu -> zawarto�� danego obiektu (dla kalkulatora: jeden, dwa, trzy id.)