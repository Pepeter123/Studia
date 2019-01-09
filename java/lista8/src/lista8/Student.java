package lista8;

public class Student {
	private String imie;
	private String nazwisko;
	private int indeks;
	
	public void Ustaw_Imie(String x) {
		setImie(x);
	}
	public void Ustaw_Nazwisko(String y) {
		setNazwisko(y);
	}
	public void Ustaw_Indeks(int z) {
		setIndeks(z);
	}
	
	
	public String getImie() {
		return this.imie;
	}
	public void setImie(String a) {
		this.imie = a;
	}
	public String getNazwisko() {
		return this.nazwisko;
	}
	public void setNazwisko(String b) {
		this.nazwisko = b;
	}
	public int getIndeks() {
		return this.indeks;
	}
	public void setIndeks(int c) {
		this.indeks = c;
	}
}
