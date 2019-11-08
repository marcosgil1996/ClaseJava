import java.util.Scanner;

/**
 * Act3 Escribe un método que devuelva el mayor de dos números
 */
public class Act3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double l,n;
        System.out.println("** El mayor de los dos **");
        System.out.println("Inserte el primer numero de la suma: ");
        l = teclado.nextDouble();
        teclado.nextDouble();
        System.out.println("Inserte el Segundo numero de la suma: ");
        n = teclado.nextInt();
        teclado.nextLine();

        System.out.println("El máximo entre" + l +" y "+ n + " es " + maximo(x, y));
        teclado.close();

    }
    
    public static double maximo( double x, double y) {
        if (x>=b) {
            return x;
            
        } else{
            return y;
        } 
    }
}