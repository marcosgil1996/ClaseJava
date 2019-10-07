import java.util.Scanner;

public class Resta {
	public static void main(String arg[]) {
		int n1, n2, divi, resto;   // variables que vamos a necesitar
		Scanner teclado = new Scanner (System.in); //Scaner lectura
		
		System.out.print( "Introduce el numero que quieres dividir: " ); //Primer número insertado
		n1 = teclado.nextInt(); //primer n1
		teclado.nextLine();
		
		System.out.print( "Introduzce el número por el cual quieres dividirlo: " ); //Primer número
        n2 = teclado.nextInt(); //segundo n2
		teclado.nextLine();
		
		rest = n1 % n2;
		divi = n1 / n2; //Procede a restarse 
		System.out.println("La división de los valores " + n1 + " - " + n2 + " es igual a =  " + divi + "con el resto: " + resto);	// Sale a pantalla la solución
		teclado.close(); // cerrar el teclado
	}
}