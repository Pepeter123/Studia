package lista4;


public class zad4 {public static void main(String[] args) {
	int[][] tab=new int[15][15];
	int[][] tab2=new int[15][1];
	for (int i = 0; i < tab.length; i++) {
        for (int j = 0; j < tab.length; j++) {
            tab[i][j] = (i+1)*(j+1);
        }
    }
	for(int j=0; j<tab.length; j++) {
		for (int i = 0; i < tab.length; i++)
	    System.out.printf("%4d",tab[i][j]);
		System.out.println();
	}
	int suma=0;
	for(int j=0; j<tab.length; j++) {
		suma=0;
			for (int i = 0; i < tab.length; i++) {
				suma += tab[j][i];
				tab2[j][0]=suma;
			}
	}
	System.out.println();
	for(int j=0; j<tab2.length; j++) {
	    System.out.printf("%4d",(tab2[j][0]/15));
	}
}
}