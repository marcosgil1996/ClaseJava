/**
 * Act4 Escribe un método que devuelva el mayor de cuatro números
 */

 /**
  * Act04
  */
  import java.util.Scanner;
public class Act04{
   public static void main(String[] args) {
         Scanner lector = new Scanner(System.in);
         float num1, num2,num3,num4;
         
         System.out.println("*** MAYOR ***");
         System.out.print("Primer número: ");
         num1 = Float.parseFloat(lector.nextLine());
         System.out.print("Segundo número: ");
         num2 = Float.parseFloat(lector.nextLine());
         System.out.print("Tercer número: ");
         num3 = Float.parseFloat(lector.nextLine());
         System.out.print("Cuarto número: ");
         num4 = Float.parseFloat(lector.nextLine());
         System.out.println("El número mayor entre " + num1 + ", " + num2 + ", " + num3 + " y " + num4 + " es " + mayor(num1,num2,num3,num4));
         lector.close();
   }

   public static float mayor(float n1, float n2, float n3, float n4) {
      float m1 = n1 > n2 ? n1 : n2;
      float m2 = n3 > n4 ? n3 : n4;
      return m1 > m2 ? m1 : m2;
   }
}