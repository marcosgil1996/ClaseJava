import java.util.Scanner;

/**
 * Escribe un programa que calcule el factorial de un número.
 * @author SergiSvk
 */

 public class Act15Facto{
     public static void main(String[] args) {
        Scanner teclado  = new Scanner(System.in); 
        int numero;
        long factorial =1;
        System.out.println("***** CALCULO DE FACTORIAL ******");
        System.out.println("Inserte un numero para calcular su factorial");
        numero = teclado.nextInt();
        teclado.nextLine();


        for(int i = numero; i>0; i--){
            factorial = factorial *i;

        }

        System.out.println("El factorial de " + numero + " es: "+ factorial);
        teclado.close();
     }
 }
