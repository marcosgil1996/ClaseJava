import java.io.*;

/**
 * La suma de los números comprendidos entre 1 y 1000.
 */

 public class Act09Compren {
     public static void main(String[] args) {

        int suma = 0; // 
        int i = 0;
        
        while(suma<1000){
            suma++;
            i= suma + i;
        }
            System.print.ln("La suma de los mill primero números es:  " + i);
     }
 }