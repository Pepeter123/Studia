package lista5;

//import java.util.Scanner;

public class Samochod {
	private String marka = "";
	private String model = "";
	private double pojemnosc = 0.0;
	private String typ = "";
	private String silnik = "";
	private int rokProdukcji = 0;
	private int rokRejestracji = 0;
	private int cena = 0;
	public static void main(String[] args) {
		Samochod s1 = new Samochod();
		//Scanner sc = new Scanner(System.in);
		
		s1.setRokRejestracji(2016);
		s1.gwarancja2(s1.getRokRejestracji());
		
    
    
    
    
    }

	public String getMarka() {
		return this.marka;
	}

	public void setMarka(String marka) {
		this.marka = marka;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPojemnosc() {
		return this.pojemnosc;
	}

	public void setPojemnosc(double pojemnosc) {
		this.pojemnosc = pojemnosc;
	}

	public String getTyp() {
		return this.typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public String getSilnik() {
		return this.silnik;
	}

	public void setSilnik(String silnik) {
		this.silnik = silnik;
	}
	
	
	public int getCena() {
		return this.cena;
	}

	public void setCena(int cena) {
		this.cena = cena;
	}

	public int getRokProdukcji() {
		return this.rokProdukcji;
	}

	public void setRokProdukcji(int rokProdukcji) {
		this.rokProdukcji = rokProdukcji;
	}

	public int getRokRejestracji() {
		return this.rokRejestracji;
	}

	public void setRokRejestracji(int rokrejestracji) {
		this.rokRejestracji = rokrejestracji;
	}


	public void gwarancja2(int g2) {
		if( g2 < 2016)
			System.out.println("nie ma");
		else
			System.out.println("jest");
	}	
}
