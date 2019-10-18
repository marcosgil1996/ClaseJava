import java.util.Scanner;

//** Incompleto **/

public class Act06Moneda {
     public static void main(String[] args) {
         Scanner teclado = new Scanner (System.in);

         float cantidad, moneda2, moneda1, moneda50C, moneda20C, moneda10C, moneda5C, moneda2C, moneda1C;

         System.out.println("Por favor, escribe la cantidad de dinero: "); // Se pide al usuario el dinero
         cantidad = teclado.nextFloat();

         cantidad = cantidad *100;
         moneda2 = (int)cantidad / 100;
         cantidad = cantidad %200;
         moneda1 = (int)cantidad /100;
         cantidad = cantidad %100;
         moneda50C = (int)cantidad /50;
         cantidad = cantidad %50;
         moneda20C = (int)cantidad /20;
         cantidad = cantidad % 20;


        
    }
}