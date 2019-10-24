import java.util.Random; // Importamos la clase Radom
import java.util.Scanner; //Importamos la clase Scanner
import java.io.*; //Importamos la clase IO

/** 
 * Black Jack
 */

 public class Act23Black{
     public static void main(String[] args) {

        Scanner teclado = new Scanner(system.in); // Declaro el scanner
        Random rd = new Random(system.in); // Declaro el radom

        int cara1, cara2, cara3, cara4, cara5, cara6; //caras del dado
        int player1, player2; //En este caso el jugador uno será el usuario y el jugador dos sera la máquina
        int dado; //dado
        int win = 22; //si llega a 22 ganas
        String seguir = "x"; // clase char para que el jugador pueda avanzar en el juego

        System.out.println("========BLACK JACK========");
        System.out.println("===BIENVENIDO AL JUEGO===");

        while("y".equals(seguir)){
            dado = rd.nextInt(10);

        }

     }
 }
 
