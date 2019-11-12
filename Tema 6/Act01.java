import java.util.Scanner;

/**
 * Act1
 */

public class Act01 {

     
    public static void main(String[] args) {
        int a,b;
        Scanner teclado = new Scanner(System.in);

        System.out.println("** SUMA **");
        System.out.println("Inserte el primer numero de la suma: ");
        a = teclado.nextInt();
        teclado.nextLine();
        System.out.println("Inserte el Segundo numero de la suma: ");
        b = teclado.nextInt();
        teclado.nextLine();
        System.out.println(getSuma(a,b));
        teclado.close();
    }
    
    public static int getSuma(int x, int y ) {
        return x + y;
        
    }
}