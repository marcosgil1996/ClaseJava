

/**
 * Act16
 */
import java.util.Scanner;
public class Act16 {
   public static Scanner lector = new Scanner(System.in);
   public static void main(String[] args) {
      int n;
      char c;
      System.out.println("*** CONTADOR DE 4 DÍGITOS ***");
      System.out.print("Indica el número a sustituir: ");
      n = Integer.parseInt(lector.nextLine());
      System.out.print("Indica el carácter de sustitución: ");
      c = lector.nextLine().charAt(0);
      imprimir(n,c);
   }

   public static void imprimir(int num, char c) {
      char ci, cj, ck, cl;
      for(int i = 0; i <= 9; i++) {
         for(int j = 0; j <= 9; j++) {
            for(int k = 0; k <= 9; k++) {
               for(int l = 0; l <= 9; l++) {
                  ci = i == num ? c : String.valueOf(i).charAt(0);
                  cj = j == num ? c : String.valueOf(j).charAt(0);
                  ck = k == num ? c : String.valueOf(k).charAt(0);
                  cl = l == num ? c : String.valueOf(l).charAt(0);
                  System.out.println(ci + "-" + cj + "-" + ck + "-" + cl);
               }
            }
         }
      }
   }
}