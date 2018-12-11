package lista4;

public class zad3 {
	public static void main(String[] args) {
		boolean[] tab=new boolean[40];
		for(int i=0; i<tab.length; i++) {
			if((i%2)==0) tab[i]=false;
			else if((i%2)!=0) tab[i]=true;
		}
		
		for(int i=0; i<tab.length; i++) {
			System.out.println(tab[i]);
		}
	}
}