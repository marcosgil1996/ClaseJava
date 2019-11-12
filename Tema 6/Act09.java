import java.util.Scanner;

/**
 * Act09 Después desde el programa principal que solicite un
 * número al usuario, calcule el sumatorio y muestre su valor por pantalla.
 */
public class Act09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); //Invacamos un escaner
        int num; //declaramos la variable num para guardar los datos del usuario
        System.out.println("Inserte un numero");
        num = teclado.nextInt(); //se guarda el numero
        teclado.nextLine();
        System.out.println("El sumatorio de"+ num + "es: "+ sumatorio(num));

        teclado.close();
        
    }
    /**
     * Sumatorio
     * @param num
     * @return
     */
    public static int sumatorio(int num){
        int suma =0;
        for (int i = num; i >=1; i--){
            suma = suma + i;

        }
        return suma;

    }
}   