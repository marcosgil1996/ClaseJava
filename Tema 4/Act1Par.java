import java.util.Scanner;

public class Act1Par {

    public static void main(String[] args) {
        
        int numero; //Variables
        Scanner teclado = new Scanner(System.in); //Lectura de Scaner
        
        System.out.printf("Introduce el número que quieres averiguar si es par o impar"); //Se pide el dato al usuario
        numero = teclado.nextInt(); // La clase String no puede convertirse en un int ?
        teclado.nextLine();

        //Si el numero introduccido es par, es decir, divisible por 2 el resto será igual a 0.  Por tanto;
        if(numero %2 == 0) {
            System.out.println("El numero numero " + numero + " introducido es par");
        }else {
            System.out.println("El numero numero " + numero + " introducido es impar");
        }
        
        teclado.close();
           
        
        
    }
}