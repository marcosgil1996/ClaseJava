import java.util.Scanner;

/**
 * Escribe un programa que solicite un número entero e indique si se trata de un número primo o no.
 * @author SergiSvk
 */

 public class Act16Par{
     public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
         int numero;

         system.out.println("Introduce el numero que quieres saber si es par");
         numero=teclado.nextInt();
         teclado.nextLine();

         
         boolean primo = true;
         
         /* OPCIÓN B    
         for(int i = 2; i<numero; i++){
             if((numero%i)==0){
                 primo = false;
                 break;
                }
             }
         */
        while(primo && i < numero){
             if(numero%1==0){
                 primo = false;
                 }
                i++;
             }
         if(primo){
             System.out.println("El numero" + numero + "es primo");
         }else{
             System.out.println("El numero" + numero + "no es primo");
         }
         teclado.close();
    }
     
}