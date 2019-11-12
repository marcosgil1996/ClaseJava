/**
 * Act08
 * Escribe un método que reciba 4 parámetros de tipo entero y compruebe si la secuencia de números
*  recibida es capicua.
 */
import java.util.Scanner;


public class Act08 {

    public static void main(String Args[]) {

        int firstNumber = 0;
        int secondNumber = 0;
        int thirdNumber = 0;
        int fourthNumber = 0;
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


        System.out.print("** RESULTADO **): ");
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

        boolean firstAndSecond = false;
        boolean thirdAndFourth = false;
        
        if (first == second){
            firstAndSecond = true;
        }

        if (third == fourth) {
            thirdAndFourth = true;
        }

        if (firstAndSecond && thirdAndFourth == true) {
            return true;
        } else{
            return false;
        }

    }
}   