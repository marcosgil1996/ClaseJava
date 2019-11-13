import java.util.Scanner;

/**
 * Act10
 */
public class Act10 {
    static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int num;
        System.out.println("\n Porfavor ingresa el numero de su tabla de multiplicar");
        num = teclado.next();
        teclado.nextLine();
        tabla(i, n);   

        
    }
    static void tabla(int i, int n){
        if (i <= 10) {
            System.out.print(i +"*"+ n + "=" + i*n +"\n");
            tabla(i+1, n);
            return tabla;
        }
    }

  
}