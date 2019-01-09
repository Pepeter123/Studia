package lista8;

import java.util.Scanner;


public class Test {
	private static StudentInstytut s = new StudentInstytut();

	public static void init() {
		Scanner in = new Scanner(System.in);
		System.out.print("Podaj imie: ");
		s.Ustaw_Imie(in.nextLine());
		in.close();
		s.Ustaw_Nazwisko("Noga");
		s.Ustaw_Indeks(96150); 
		s.Ustaw_Wydzial("WIEA");
		s.Ustaw_Instytut("ISSI");
		
		System.out.println("\nImie: " +s.getImie() + "\nNazwisko: " +s.getNazwisko() + "\nIndeks: " 
		+s.getIndeks() + "\nWydzial: " +s.getWydzial() + "\nInstytut: " +s.getInstytut());		
	}
	
	public static void main(String[] args) {
		init();
	}

}
