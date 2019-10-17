import java.util.Scanner;
/**
 * Escribe un programa que muestre la tabla de multiplicar del número [1-10] que indique el usuario. Validar la entrada.
 * @author SergiSvk
 */
public class Act13Tablas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Escaner 
        int n; //Variable que introduce el usuario
        boolean validado;

        do{
            System.out.print("Introduce un número entero: "); //Se pide un valor
            n = teclado.nextInt();
            validado = n >= 1 && n <= 10;
        
            if(validado){
                for(int i = 1; i<=10; i++){
                        System.out.println("Tabla del " + n);
                        System.out.println(n + " * " + i + " = " + n*i);
                }
            }else{
                System.out.print("Introduce un número entero entre el 1 y el 10: ");
            }
        }while (!validado);
        
        teclado.close(); //Se cierra el teclado
    }
}