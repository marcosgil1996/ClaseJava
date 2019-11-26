
/**
 * Act17 un progrma que solicite dos números enteros (ancho y alto)
 */
import java.util.Scanner;
public class Act17 {
   public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        char letra;
        int alto, ancho;
        System.out.println("*** RECTÁNGULO ***");
        System.out.print("Indica la letra: ");
        letra = lector.nextLine().charAt(0);
        System.out.print("Ancho: ");
        ancho = Integer.parseInt(lector.nextLine());
        System.out.print("Alto: ");
        alto = Integer.parseInt(lector.nextLine());
        rectangulo(ancho, alto, letra);
        lector.close();
   }
   public static void rectangulo(int ancho, int alto, char c) {
      for(int i = 1; i <= alto; i++) {
         for(int j = 1; j <= ancho; j++) {
            System.out.print(c);   
         }
         System.out.println();
      }   
   }
}