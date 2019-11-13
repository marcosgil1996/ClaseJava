import java.util.Scanner;

/**
 * Act10 Escribe un método que imprima la tabla de multiplicar de un número. El programa pediránúmeros enteros hasta que el usuario introduzca un número negativo
 */
public class Act10 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int num;

        do {System.out.println("\n Porfavor ingresa el numero de su tabla de multiplicar");
            num = teclado.nextInt();
            teclado.nextLine();
        } while (num >0);
        
        teclado.close();   
    }
    static void tabla(int i, int n){
        if (i <= 10) {
            System.out.print(i +"*"+ n + "=" + i*n +"\n");
            tabla(i+1, n);
        }
    }


}