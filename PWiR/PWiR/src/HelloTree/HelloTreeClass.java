package HelloTree;

public class HelloTreeClass {
    public static void main(String[] args){
        System.out.print("Hello World");
        int N=15;
        for(int x=N;x>=0;x-=2) {
            for(int y=x;y>0;y-=2) {
                System.out.print(" ");
            }
            for(int j=x+1;j<N;j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=0; i<3; i++) {
            if (N % 2 == 0)
                N -= 1;
            for (int g = N / 2; g > 0; g--) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }

    }

