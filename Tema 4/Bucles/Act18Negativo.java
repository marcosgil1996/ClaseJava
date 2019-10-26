import java.util.Scanner;

/* Escribe un programa que solicite números hasta que se introduzca un negativo, y calcule la media
de todos números los introducidos. 
*/

public class Act18Negativo{

  public static void main(String[] args) {
   
    Scanner teclado = new Scanner(System.in);
    double numeros = 0;
    double numeroIntroducido = 0;
    double suma = 0;

    System.out.println("Este programa ira sumando mientras introducca numero positivos");
    System.out.println("Vaya introduciendo números, (puede parar introduciendo un número negativo):");

    while (numeroIntroducido >= 0) {
      numeroIntroducido = Double.parseDouble(System.console().readLine());
      numeros++;
      suma += numeroIntroducido;
      System.out.println("Introduzca un numero");
    }

    System.out.println("La media de los números  introducidos es: " + (suma - numeroIntroducido)/ (numeros - 1));
    teclado.close();
  }
}