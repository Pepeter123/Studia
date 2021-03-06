package lista5;

import java.util.ArrayList;
import java.util.Random;
import java.util.*;

public class Autokomis {
	private String marka = "Audi";

	public static void main(String[] args) {
		final int SIZE = 10;
		ArrayList<Samochod> lista = new ArrayList<>(SIZE); // mozna dla wszystkich zrobic arrayListy tylko dodaje sie po
															// 1, dlatego lepiej w tablicy
		/*
		 * ArrayList<String> modele = new ArrayList<>(SIZE); modele.add("TT");
		 * modele.add("A7"); ArrayList<String> typy = new ArrayList<>(SIZE);
		 * ArrayList<String> silniki = new ArrayList<>(SIZE); ArrayList<Double>
		 * pojemnosci = new ArrayList<>(SIZE); ArrayList<Integer> lataProdukcji = new
		 * ArrayList<>(SIZE); ArrayList<Integer> lataRejestracji = new
		 * ArrayList<>(SIZE); ArrayList<Integer> ceny = new ArrayList<>(SIZE);
		 */

		Random rand = new Random();
		String markaAuta = "Audi";
		String[] modele = { "A1", "A3", "A4", "A5", "A6", "TT", "S5", "Q2", "Q5", "Q7" };
		String[] typy = { "combi", "sedan" };
		String[] silniki = { "diesel", "benzyna" };
		double[] pojemnosci = { 1.6, 2.0, 2.5, 3.0, 3.7, 4.2, 4.9 };
		int[] lataProdukcji = { 1998, 2005, 2008, 2011, 2015, 2018 };
		int[] lataRejestracji = { 2000, 2003, 2005, 2009, 2014, 20018 };
		int[] ceny = { 5000, 15000, 30000, 100000, 200000 };

		for (int i = 0; i < SIZE; i++)
			lista.add(new Samochod());

		for (int i = 0; i < SIZE; i++) {
			lista.get(i).setMarka(markaAuta);
			lista.get(i).setModel(modele[rand.nextInt(modele.length)]); // lista.get(i).setModel(modele[rand.nextInt(10)])
			lista.get(i).setTyp(typy[rand.nextInt(typy.length)]);
			lista.get(i).setSilnik(silniki[rand.nextInt(silniki.length)]);
			lista.get(i).setPojemnosc(pojemnosci[rand.nextInt(pojemnosci.length)]);
			lista.get(i).setRokProdukcji(lataProdukcji[rand.nextInt(lataProdukcji.length)]);
			lista.get(i).setRokRejestracji(lataRejestracji[rand.nextInt(lataRejestracji.length)]);
			lista.get(i).setCena(ceny[rand.nextInt(ceny.length)]);

		}

		for (int i = 0; i < SIZE; i++) {

			System.out.println(lista.get(i).getMarka() + " " + lista.get(i).getModel() + " " + lista.get(i).getTyp()
					+ " " + lista.get(i).getSilnik() + " " + lista.get(i).getPojemnosc() + " "
					+ lista.get(i).getRokProdukcji() + " " + lista.get(i).getRokProdukcji() + " "
					+ lista.get(i).getCena() + "zl ");

		}

	}

}
