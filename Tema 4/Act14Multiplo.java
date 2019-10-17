import java.util.Scanner;

/**
 * un programa que calcule la potencia de un número real (a) elevado a un número entero (b) utilizando multiplicaciones. Debes tener en cuenta que tanto (a) como 
 * (b) pueden valer 0 o puedenser números negativos.
 * @author SergiSvk
 */

public class Act14Multiplo{
   public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in); //Declaramos el scanner
        int base, exponente;

        System.out.println("Introduce la base de la potencia"); //Pedimos la base de la potencia
        base = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Introduce la exponente de la potencia"); //Pedimos el exponente de la potencia
        exponente = teclado.nextInt();
        teclado.nextLine();

        double potencia = 1;
        
        if (exponente == 0) { 
            potencia = 1;
        }
        if (exponente > 0) {
         for (int i = 0; i < exponente; i++) {
            potencia *= base;
            }
        }
        if (exponente < 0) {
        for (int i = 0; i < -exponente; i++) {
            potencia *= base;
        }
        potencia = 1/potencia;
        }
        System.out.println(base + "^" + exponente + " = " + potencia);
        
        teclado.close(); // Nota: siempre cerrar el teclado
    }
}
