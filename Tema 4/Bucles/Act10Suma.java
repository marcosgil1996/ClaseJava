import java.util.Scanner;
 
/** 
 * La Multiplicación de dos numeros usando Sumas (Versión positiva)
 */

public class Act10Suma{
    
     public static void main(String[] args) {
        int numero1, numero2, producto = 0; //Variables
        Scanner teclado = new Scanner(System.in); //Lectura de Scaner
            
        System.out.println("Introduce introduce el primer numero que quieres que multiplique"); //Se pide el primer dato al usuario
        numero1 = teclado.nextInt(); // Guardamos el valor del numero
        teclado.nextLine();

        System.out.println("Introduce introduce el segundo numero que quieres que multiplique"); //Se pide el segundo dato al usuario
        numero2 = teclado.nextInt(); // Guardamos el valor del numero
        teclado.nextLine();

        /*Se repite la sentencia hasta que se cumpla la condición, opción con While

        while( numero2 != 0 )  {
            producto = producto + numero1;
            numero2 = numero2 - 1;
        } */

        for(int i = numero1; i <= numero1; i--){
            producto = producto + numero2;
        }

        System.out.println("El producto entre los numeros introducidos es: " + producto ); //Se enseña el resultado
        teclado.close(); // Cierre del teclado
    }

}