import java.util.Scanner;

/**
 * Escribe un programa que solicite un número entero e indique si se trata de un número primo o no.
 * @author SergiSvk
 */

 public class Act15Par{
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         int numero;

         system.out.println("Introduce el numero que quieres saber si es par");
         numero=teclado.nextInt();
         teclado.nextLine();

         boolean primo = true;
         for(int i = 2; i<n; i++){
             if((numero%i)==0){
                 primo = false;
                }
             }
         if(primo){
             System.out.println("El numero" +n+ "es primo");
         }else{
             System.out.println("El numero" +n+ "no es primo");
         }
     }
 }