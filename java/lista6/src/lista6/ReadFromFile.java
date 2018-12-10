package lista6;
import java.io.*;
import java.util.Scanner;
/*
 * 
 * 
 * Program zapisuje 10 lini znak�w z pliku
 * 
 * 
 */
public class ReadFromFile {
	public static void main(String[] args) throws FileNotFoundException {
		File plik = new File("zad3.txt"); // nazwa tylko jak plik jest w tej samej paczce, 
										//inaczej trzeba poda� �cie�k�
		
		Scanner odczyt = new Scanner(plik); // mo�na stworzy� plik bezpo�rednio w
			     		//scannerze new Scanner(new File("1.txt"))
										//i usunac tworzenie File plik = new File("1.txt.")
		
		int i;
		for(i=0; i<10; i++) {
			String text = odczyt.nextLine();
			System.out.println(text);
		   }
		odczyt.close();	
	}

}
