import java.util.Scanner;

public class Resta {
	public static void main(String arg[]) {
		int n1, n2, resta;   // variables que vamos a necesitar
		Scanner teclado = new Scanner (System.in); //Scaner lectura
		
		System.out.print( "Introduce el primer número: " ); //Primer número insertado
		n1 = teclado.nextInt(); //primer n1
		teclado.nextLine();
		
		System.out.print( "Introduzce el segundo número: " ); //Primer número
        n2 = teclado.nextInt(); //segundo n2
        teclado.nextLine();
		
		resta = n1 - n2; //Procede a restarse 
		System.out.println("La resta de los valores " + n1 + " - " + n2 + " es igual a =  " + resta );	// Sale a pantalla la solución
		teclado.close();
	}
}
