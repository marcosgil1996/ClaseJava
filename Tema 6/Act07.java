import java.util.Scanner;

/**
 * Act07 Escribe un método que acepte un número entero y calcule su factorial
 */
public class Act07 {

    public static void main(String Args[]) {

        int factorialNumber = 0;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Introduce the number to n!(interger): ");
        factorialNumber = scan.nextInt();
        scan.nextLine();
        System.out.println("The n! of " + factorialNumber + " is: " + factorial(factorialNumber));
        scan.close();
    }

    
    /**
     * Calculo de factorial
     * @param factorial
     * @return int
     */


    public static int factorial(int factorial){

        for(int i = factorial; i > 0; i--){
            factorial = factorial * i;
        }

        return factorial;
    }
} 
