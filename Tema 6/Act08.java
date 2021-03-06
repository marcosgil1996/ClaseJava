/**
 * Act08
 * Escribe un método que reciba 4 parámetros de tipo entero y compruebe si la secuencia de números
*  recibida es capicua.
 */
import java.util.Scanner;


public class Act08 {

    public static void main(String Args[]) {

        int firstNumber = 0; //Primer número
        int secondNumber = 0; //Primer número
        int thirdNumber = 0; //Primer número
        int fourthNumber = 0; //Primer números
        boolean capicuaR= false; //Resultado
        
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introducer el primer numero: ");
        firstNumber = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Introducer el segundo numero): ");
        secondNumber = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Introducer el tercer numero): ");
        thirdNumber = teclado.nextInt();
        teclado.nextLine();
        System.out.print("Introducer el ultimo numero): ");
        fourthNumber = teclado.nextInt();
        teclado.nextLine();


        System.out.print("** RESULTADO ** ");
        capicuaR = capicua(firstNumber, secondNumber, thirdNumber, fourthNumber);

        if (capicuaR == true){
            System.out.println("El numero introducido es capicua");
        } else {
            System.out.println("El numero introducido no es capicua");
        }
        teclado.close();
    }

    
    /**
     * valua si es capicua los núsmeros introducidos 
     * @param 
     * @return boolean
     */


    public static boolean capicua(int first, int second, int third, int fourth){

        boolean firstAndFourth = false;
        boolean secondAndThird = false;
        
        if (first == fourth){
            firstAndFourth = true;
        }

        if (second == third) {
            secondAndThird = true;
        }
        if (firstAndFourth && secondAndThird == true) {
            return true;
        } else{
            return false;
        }

    }
}   