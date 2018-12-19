package lista7;

import java.util.ArrayList;
import java.util.Random;


/*
* 
*
* 
*Program wyœwietla d³ugoœæ ArrayListy - studentów
*oraz przypisuje do ka¿dego studenta imie, nazwisko oraz numer indeksu losowo z arrayListy i tablic
*
*
*
*/

public class Student {
	private String firstName = "";
	private String lastName = "";
	private int indexNr = 0;

	public static void main(String[] args) {
		int size = 3;

		ArrayList<Student> ar = new ArrayList<>();

		int i = 0;
		for (i = 0; i < size; i++)
			ar.add(new Student());

		ArrayList<String> arFirstName = new ArrayList<>();
		arFirstName.add("Tomasz");
		arFirstName.add("Wojciech");
		arFirstName.add("Daniel");
		arFirstName.add("Piotr");
		arFirstName.add("Pawe³");

		Random rand = new Random();

		String[] listLastName = { "Góra", "Krawczyk", "Duda", "Szyd³o", "Putin" };
		int[] listIndexNr = { 101, 200, 345, 823, 105, 185, 401, 632, 231 };

		for (Student e : ar) {
			e.setFirstName(arFirstName.get(rand.nextInt(arFirstName.size())));
			e.setLastName(listLastName[rand.nextInt(listLastName.length)]);
			e.setIndexNr(listIndexNr[rand.nextInt(listIndexNr.length)]);
		}

		System.out.println("List has " + ar.size() + " elements\n");
		System.out.println("3rd element of list is:\nStudent" + 3 + "\nFirstName: " + ar.get(2).getFirstName()
				+ "\nLastName: " + ar.get(2).getLastName() + "\nIndexNr: " + ar.get(2).getIndexNr() + "\n");

		int j = 1;
		for (Student g : ar) {

			System.out.println("Student" + j + "\nFirstName: " + g.getFirstName() + "\nLastName: " + g.getLastName()
					+ "\nIndexNr: " + g.getIndexNr() + "\n");
			j++;
		}
	}

	String getFirstName() {
		return this.firstName;
	}

	void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	String getLastName() {
		return this.lastName;
	}

	void setLastName(String lastName) {
		this.lastName = lastName;
	}

	int getIndexNr() {
		return this.indexNr;
	}

	void setIndexNr(int indexNr) {
		this.indexNr = indexNr;
	}
}
