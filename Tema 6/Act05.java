/* Ejercicio 5
 * carácter que se desea imprimir y el número a veces que se imprime. */

import java.util.Scanner;

public class Act05 {

    public static void main(String Args[]) {

        char character;
        int numberTimes = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce el caracter: ");
        character = scan.next().charAt(0);
        System.out.print("Introduce el numero de veces que se va a repetir: ");
        numberTimes = scan.nextInt();
        printChar(character, numberTimes);
        scan.close();
    }

    /**
     * Salidas a la pantalla de caracteres un número
     * @param character
     * @param numberTimes
     */
    public static void printChar(char character, int numberTimes){

        for(int x = 0; x < numberTimes; x++){
            System.out.println(character);
        }
        return;
    }
}  