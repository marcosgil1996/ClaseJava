/*Suma números enteros introducidos por el usuario hasta que se introduce el 0.
 *Ejercicio 10-4-2
 *@version: 1
 */

import java.util.Scanner;

public class SumaEnteros {

    public static void main(String Args[]) {

        boolean bucleSuma = true;
        int numero = 0;
        int resultado = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("////// SUMA CONTINUA DE ENTEROS //////");
        
        /* Itera pidiendo al usuario enteros hasta que la entrada es 0,
         * entonces detiene el bucle. */

        while (bucleSuma) {

            System.out.print("Introduce un número entero(Introduce 0 para parar): ");
            numero = scan.nextInt();

            if (numero == 0){
                bucleSuma = false;
            }

            resultado = resultado + numero;
        }

        // Muestra por pantalla la suma de todos los números introducidos.

        System.out.println("La suma de todos los enteros introducidos es: " + resultado);
    }
}