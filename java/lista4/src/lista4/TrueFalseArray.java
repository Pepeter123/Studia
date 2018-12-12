package lista4;

public class TrueFalseArray {
	public static void main(String[] args) {
		
		boolean[] ar = new boolean[40];
		int i=0;
		for(i=0; i<ar.length ; i++) {
			if(i%2==0) ar[i] = true;
			else ar[i] = false;
				
		}
		for(Boolean a : ar) {
			System.out.println(a);
		}
		
	}
}
