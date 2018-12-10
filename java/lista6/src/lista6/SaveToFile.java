package lista6;

import java.io.*;

public class SaveToFile {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter zapisz = new PrintWriter("zad3.txt");
		Kalkulator k = new Kalkulator(2);
		Kalkulator k1 = new Kalkulator(1, 1, 1, 1);
		zapisz.println("Wynik:" +k.dodawanie(2)+ " Sk³adowe: " +k.getX());
		zapisz.println("Wynik:" +k1.dodawanie(1, 1, 1, 1)+ " Sk³adowe: " +k1.getX() + " " +k1.getY()+ " " +k1.getZ()+ " " +k1.getW());
		zapisz.close();
		
	}
}










// dana skladowa obiektu -> zawartoœæ danego obiektu (dla kalkulatora: jeden, dwa, trzy id.)