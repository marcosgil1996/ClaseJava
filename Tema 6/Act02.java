import java.util.Scanner;
public class Act02 {
   public final static float PI = 3.141592f; 
   public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);
         float radio;
         
         System.out.println("*** ÁREA Y LONGITUD ***");
         System.out.print("Radio de la circunferencia: ");
         radio = Float.parseFloat(lector.nextLine());
         System.out.println("El área de una circunferencia de radio " + radio + " es " + area(radio) + " y su longitud es " + longitud(radio));
         lector.close();
   }

   public static float area(float r) {
      return r*r*PI;
   }

   public static float longitud(float r) {
      return 2*PI*r;
   }
}