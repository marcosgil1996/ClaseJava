
import java.io.*;

public class Act11Impares {

    /*
    Contador de numero impares entre 1000 y 5000
    */



	public static void main(String args[]) {
		/*int contador*/ 
        int impares = 0;
        final int MIN = 1000;
        final int MAX = 5000;
        
		for (int i=MIN; i<=MAX;i++) {
			if (i%2 != 0) {
                System.out.print(i +" ");
                impares++;
            }
        } 
        
        /*
        for(contador=1; contador<100; contador= contador+2){
            impares++;
        }*/
        
        System.out.println("\n Hay  "+ impares + " impares entre 1001 y 5000");

	}


}

