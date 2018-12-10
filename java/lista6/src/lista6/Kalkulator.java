package lista6;

import java.util.*;

/*
 * 
 * 
 * Program wykonuje funkcje dodawania dla 1,4 i 7 parametrów
 * 
 * 
 */

public class Kalkulator {
	private int x = 0, y = 0, z = 0, w = 0, p = 0, r = 0, s = 0;

	public Kalkulator(int jeden) {
		this.setX(jeden);
	}

	public Kalkulator(int jeden, int dwa, int trzy, int cztery) {

		// x = jeden; y = dwa; z = trzy; w = cztery; tak nie mozna bo x,y... sa prywatne
		// i tak sie nie powinno robic
		this.setX(jeden); // wywołuje metode SetX z parameterm jeden na rzecz obiektu this
		this.setY(dwa);
		this.setZ(trzy);
		this.setW(cztery);
	}

	public Kalkulator(int jeden, int dwa, int trzy, int cztery, int piec, int szesc, int siedem) {
		this.setX(jeden);
		this.setY(dwa);
		this.setZ(trzy);
		this.setW(cztery);
		this.setP(piec);
		this.setR(szesc);
		this.setS(siedem);
	}

	public Kalkulator(Kalkulator k) {
		this.setX(k.getX()); // wywołuje metode setX z parametrem pola x obiektu k na rzecz this(w tym
								// przypadku kopia)
		this.setY(k.getY());
		this.setZ(k.getZ());
		this.setW(k.getW());
		this.setP(k.getP());
		this.setR(k.getR());
		this.setS(k.getS());
	}

	public int dodawanie(int x) {
		return x + x;

	}

	public int dodawanie(int x, int y, int z, int w) {

		return x + y + z + w;

	}

	public int dodawanie(int x, int y, int z, int w, int p, int r, int s) {

		return x + y + z + w + p + r + s;

	}

	public static void main(String[] args) {
		int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;
		Scanner liczba = new Scanner(System.in);

		System.out.println("Jaki konstruktor chcesz wywolac?\n1.Jeden\n2.Cztery\n3.Siedem");
		int choice = liczba.nextInt();

		switch (choice) {
		case 1:
			System.out.println("Podaj liczbe: ");
			a = liczba.nextInt();
			Kalkulator k = new Kalkulator(a);
			System.out.println("Wynik dodawania: " + k.dodawanie(k.getX())); // wywoluje metode dodawanie na rzecz
			break; // obiektu k
		// z parametrem x obiektu k
		case 2:
			System.out.println("Podaj liczby: ");
			b = liczba.nextInt();
			c = liczba.nextInt();
			d = liczba.nextInt();
			e = liczba.nextInt();
			Kalkulator k1 = new Kalkulator(b, c, d, e);
			System.out.println("Wynik dodawania: " + k1.dodawanie(k1.getX(), k1.getY(), k1.getZ(), k1.getW()));
			break;
		case 3:
			System.out.println("Podaj liczby: ");
			a = liczba.nextInt();
			b = liczba.nextInt();
			c = liczba.nextInt();
			d = liczba.nextInt();
			e = liczba.nextInt();
			f = liczba.nextInt();
			g = liczba.nextInt();
			Kalkulator k2 = new Kalkulator(a,b,c,d,e,f,g);
			System.out.println("Wynik dodawania: " +k2.dodawanie(k2.getX(), k2.getY(), k2.getZ(), k2.getW(), k2.getP(), k2.getR(), k2.getS()));
			
			break;
		default:
			break;
		}
		liczba.close();

	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getP() {
		return p;
	}

	public void setP(int p) {
		this.p = p;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}
}
