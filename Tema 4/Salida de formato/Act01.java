import java.util.Scanner;

/**
 * Act01 Escribe un programa que solicite al usuario un numero real y lo muestre con 2 decimales
 */
public class Act01 {

    public static void main(String[] args) {
        double numero;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escribe un numero natural");
        numero = teclado.nextDouble();

        System.out.printf("El numero introducido redondeados a 2 decimales %.2f ", numero);
        teclado.close();
        

        
    }
}