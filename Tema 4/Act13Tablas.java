import java.util.Scanner;
/**
 * Escribe un programa que muestre la tabla de multiplicar del número [1-10] que indique el usuario. Validar la entrada.
 * @author SergiSvk
 */
public class Act13Tablas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Escaner 
        int n; //Variable que introduce el usuario

        System.out.print("Introduce un número entero: ");
        n = teclado.nextInt();
        
        System.out.println("Tabla del " + n);
       
        for(int i = 1; i<=10; i++){
             System.out.println(n + " * " + i + " = " + n*i);
        }
        teclado.close(); //Se cierra el teclado
    }
}